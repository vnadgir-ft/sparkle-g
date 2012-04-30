/*
 *    Copyright 2007-2012 The sparkle-g Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * @author Simone Tripodi (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt (Juergen.Pfundt)
 * @version $Id: Sparql.g 523 2012-02-17 23:10:57Z Juergen.Pfundt@gmail.com $
 */
package com.googlecode.sparkleg;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import org.stringtemplate.v4.*;

public class IdentVisitor extends SparqlParserBaseVisitor<ST> implements SparqlParserVisitor<ST> {

    STGroup g = null;

    public void setSTGroup(STGroup g) {
        this.g = g;
    }

    @Override
    public ST visitQuery(SparqlParser.QueryContext ctx) {
        // query :
        //   prologue (selectQuery | constructQuery | describeQuery | askQuery) bindingsClause EOF
        // | update (SEMICOLON update?)* EOF

        ST query = g.getInstanceOf("query");

        if (ctx.prologue() != null) {
            query.add("prologue", visitPrologue(ctx.prologue()));

            if (ctx.selectQuery() != null) {
                query.add("selectQuery", visitSelectQuery(ctx.selectQuery()));
            } else if (ctx.constructQuery() != null) {
                query.add("constructQuery", visitConstructQuery(ctx.constructQuery()));
            } else if (ctx.describeQuery() != null) {
                query.add("describeQuery", visitDescribeQuery(ctx.describeQuery()));
            } else if (ctx.askQuery() != null) {
                query.add("askQuery", visitAskQuery(ctx.askQuery()));
            }

            query.add("bindingsClause", visitBindingsClause(ctx.bindingsClause()));
        } else {
            for (SparqlParser.UpdateContext update : ctx.update()) {
                query.add("update", visitUpdate(update));
            }
        }

        return query;
    }

    @Override
    public ST visitPrologue(SparqlParser.PrologueContext ctx) {
        // prologue :
        //   (baseDecl | prefixDecl)*

        ST prologue = g.getInstanceOf("prologue");

        if (ctx.children != null) {
            for (ParseTree c : ctx.children) {
                if (c instanceof SparqlParser.BaseDeclContext) {
                    prologue.add("baseDecl", visitBaseDecl((SparqlParser.BaseDeclContext) c));
                } else if (c instanceof SparqlParser.PrefixDeclContext) {
                    prologue.add("prefixDecl", visitPrefixDecl((SparqlParser.PrefixDeclContext) c));
                }
            }
        }

        return prologue;
    }

    @Override
    public ST visitBaseDecl(SparqlParser.BaseDeclContext ctx) {
        // baseDecl :
        //   BASE IRI_REF

        ST baseDecl = g.getInstanceOf("baseDecl");

        String s = ctx.IRI_REF().getSymbol().getText();
        baseDecl.add("iriRef", s.substring(1, s.length() - 1));

        return baseDecl;
    }

    @Override
    public ST visitPrefixDecl(SparqlParser.PrefixDeclContext ctx) {
        // prefixDecl :
        //   PREFIX PNAME_NS IRI_REF

        ST prefixDecl = g.getInstanceOf("prefixDecl");

        prefixDecl.add("pname", ctx.PNAME_NS().getSymbol().getText());
        
        String s = ctx.IRI_REF().getSymbol().getText();
        prefixDecl.add("iriRef", s.substring(1, s.length() - 1));

        return prefixDecl;
    }

    @Override
    public ST visitSelectQuery(SparqlParser.SelectQueryContext ctx) {
        // selectQuery :
        //   selectClause datasetClause* whereClause solutionModifier

        ST selectQuery = g.getInstanceOf("selectQuery");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.SelectClauseContext) {
                selectQuery.add("selectClause", visitSelectClause((SparqlParser.SelectClauseContext) c));
            } else if (c instanceof SparqlParser.DatasetClauseContext) {
                selectQuery.add("datasetClause", visitDatasetClause((SparqlParser.DatasetClauseContext) c));
            } else if (c instanceof SparqlParser.WhereClauseContext) {
                selectQuery.add("whereClause", visitWhereClause((SparqlParser.WhereClauseContext) c));
            } else if (c instanceof SparqlParser.SolutionModifierContext) {
                selectQuery.add("solutionModifier", visitSolutionModifier((SparqlParser.SolutionModifierContext) c));
            }
        }

        return selectQuery;
    }

    @Override
    public ST visitSubSelect(SparqlParser.SubSelectContext ctx) {
        // subSelect
        //   selectClause whereClause solutionModifier

        ST subSelect = g.getInstanceOf("subSelect");

        subSelect.add("selectClause", visitSelectClause(ctx.selectClause()));
        subSelect.add("whereClause", visitWhereClause(ctx.whereClause()));
        subSelect.add("solutionModifier", visitSolutionModifier(ctx.solutionModifier()));

        return subSelect;
    }

    @Override
    public ST visitSelectClause(SparqlParser.SelectClauseContext ctx) {
        // selectClause :
        //   SELECT (DISTINCT | REDUCED)? ((var| OPEN_BRACE expression AS var CLOSE_BRACE)+ | ASTERISK)

        final int EXPRESSION = 1;
        final int VAR = EXPRESSION + 1;

        int status = VAR;

        ST selectClause = g.getInstanceOf("selectClause");

        for (ParseTree c : ctx.children) {
            if (c instanceof ParseTree.TerminalNode) {
                ParseTree.TerminalNode t = (ParseTree.TerminalNode) c;
                Token to = (Token) (t.getSymbol());
                if (to.getType() == SparqlParser.ASTERISK) {
                    selectClause.add("ASTERISK", to.getText());
                } else if (to.getType() == SparqlParser.DISTINCT) {
                    selectClause.add("attribute", to.getText().toUpperCase());
                } else if (to.getType() == SparqlParser.REDUCED) {
                    selectClause.add("attribute", to.getText().toUpperCase());
                } else if (to.getType() == SparqlParser.OPEN_BRACE) {
                    status = EXPRESSION;
                } else if (to.getType() == SparqlParser.CLOSE_BRACE) {
                    status = VAR;
                }
            }

            if (c instanceof SparqlParser.VarContext) {
                if (status == VAR) {
                    selectClause.add("expression", (SparqlParser.ExpressionContext) null);
                }
                selectClause.add("var", visitVar((SparqlParser.VarContext) c));
            } else if (c instanceof SparqlParser.ExpressionContext) {
                selectClause.add("expression", visitExpression((SparqlParser.ExpressionContext) c));
            }
        }

        return selectClause;
    }

    @Override
    public ST visitConstructQuery(SparqlParser.ConstructQueryContext ctx) {
        // constructQuery
        //   CONSTRUCT (constructTemplate datasetClause* whereClause solutionModifier | datasetClause* WHERE OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE solutionModifier)

        ST constructQuery = g.getInstanceOf("constructQuery");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ConstructTemplateContext) {
                constructQuery.add("constructTemplate", visitConstructTemplate((SparqlParser.ConstructTemplateContext) c));
            } else if (c instanceof SparqlParser.DatasetClauseContext) {
                constructQuery.add("datasetClause", visitDatasetClause((SparqlParser.DatasetClauseContext) c));
            } else if (c instanceof SparqlParser.WhereClauseContext) {
                constructQuery.add("whereClause", visitWhereClause((SparqlParser.WhereClauseContext) c));
            } else if (c instanceof SparqlParser.TriplesTemplateContext) {
                constructQuery.add("triplesTemplate", visitTriplesTemplate((SparqlParser.TriplesTemplateContext) c));
            } else if (c instanceof SparqlParser.SolutionModifierContext) {
                constructQuery.add("solutionModifier", visitSolutionModifier((SparqlParser.SolutionModifierContext) c));
            }
        }

        return constructQuery;
    }

    @Override
    public ST visitDescribeQuery(SparqlParser.DescribeQueryContext ctx) {
        // describeQuery
        //   DESCRIBE (varOrIRIref+ | ASTERISK) datasetClause* whereClause? solutionModifier

        ST describeQuery = g.getInstanceOf("describeQuery");

        for (ParseTree c : ctx.children) {
            if (c instanceof ParseTree.TerminalNode) {
                ParseTree.TerminalNode t = (ParseTree.TerminalNode) c;
                Token to = (Token) (t.getSymbol());
                if (to.getType() == SparqlParser.ASTERISK) {
                    describeQuery.add("ASTERISK", to.getText());
                }
            } else if (c instanceof SparqlParser.VarOrIRIrefContext) {
                describeQuery.add("varOrIRIref", visitVarOrIRIref((SparqlParser.VarOrIRIrefContext) c));
            } else if (c instanceof SparqlParser.DatasetClauseContext) {
                describeQuery.add("datasetClause", visitDatasetClause((SparqlParser.DatasetClauseContext) c));
            } else if (c instanceof SparqlParser.WhereClauseContext) {
                describeQuery.add("whereClause", visitWhereClause((SparqlParser.WhereClauseContext) c));
            } else if (c instanceof SparqlParser.SolutionModifierContext) {
                describeQuery.add("solutionModifier", visitSolutionModifier((SparqlParser.SolutionModifierContext) c));
            }

        }

        return describeQuery;
    }

    @Override
    public ST visitAskQuery(SparqlParser.AskQueryContext ctx) {
        // askQuery
        //   ASK datasetClause* whereClause solutionModifier

        ST askQuery = g.getInstanceOf("askQuery");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.DatasetClauseContext) {
                askQuery.add("datasetClause", visitDatasetClause((SparqlParser.DatasetClauseContext) c));
            } else if (c instanceof SparqlParser.WhereClauseContext) {
                askQuery.add("whereClause", visitWhereClause((SparqlParser.WhereClauseContext) c));
            } else if (c instanceof SparqlParser.SolutionModifierContext) {
                askQuery.add("solutionModifier", visitSolutionModifier((SparqlParser.SolutionModifierContext) c));
            }
        }

        return askQuery;
    }

    @Override
    public ST visitDatasetClause(SparqlParser.DatasetClauseContext ctx) {
        // datasetClause
        //   FROM NAMED? iriRef

        ST datasetClause = g.getInstanceOf("datasetClause");

        if (ctx.NAMED() != null) {
            datasetClause.add("NAMED", ctx.NAMED().getSymbol().getText().toUpperCase());
        }

        datasetClause.add("iriRef", visitIriRef(ctx.iriRef()));

        return datasetClause;
    }

    @Override
    public ST visitWhereClause(SparqlParser.WhereClauseContext ctx) {
        // whereClause :
        //   WHERE? groupGraphPattern

        ST whereClause = g.getInstanceOf("whereClause");

        whereClause.add("groupGraphPattern", visitGroupGraphPattern(ctx.groupGraphPattern()));

        return whereClause;
    }

    @Override
    public ST visitSolutionModifier(SparqlParser.SolutionModifierContext ctx) {
        // solutionModifier :
        //   groupClause? havingClause? orderClause? limitOffsetClauses?

        ST solutionModifier = g.getInstanceOf("solutionModifier");

        if (ctx.groupClause() != null) {
            solutionModifier.add("groupClause", visitGroupClause(ctx.groupClause()));
        }

        if (ctx.havingClause() != null) {
            solutionModifier.add("havingClause", visitHavingClause(ctx.havingClause()));
        }

        if (ctx.orderClause() != null) {
            solutionModifier.add("orderClause", visitOrderClause(ctx.orderClause()));
        }

        if (ctx.limitOffsetClauses() != null) {
            solutionModifier.add("limitOffsetClauses", visitLimitOffsetClauses(ctx.limitOffsetClauses()));
        }

        return solutionModifier;
    }

    @Override
    public ST visitGroupClause(SparqlParser.GroupClauseContext ctx) {
        // groupClause
        //   GROUP BY groupCondition+

        ST groupClause = g.getInstanceOf("groupClause");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.GroupConditionContext) {
                groupClause.add("groupCondition", visitGroupCondition((SparqlParser.GroupConditionContext) c));
            }
        }

        return groupClause;
    }

    @Override
    public ST visitGroupCondition(SparqlParser.GroupConditionContext ctx) {
        // groupCondition
        //   builtInCall | functionCall | OPEN_BRACE expression (AS var)? CLOSE_BRACE | var

        ST groupCondition = g.getInstanceOf("groupCondition");

        if (ctx.builtInCall() != null) {
            groupCondition.add("builtInCall", visitBuiltInCall(ctx.builtInCall()));
        } else if (ctx.functionCall() != null) {
            groupCondition.add("functionCall", visitFunctionCall(ctx.functionCall()));
        } else if (ctx.expression() != null) {
            groupCondition.add("expression", visitExpression(ctx.expression()));
            if (ctx.var() != null) {
                groupCondition.add("var", visitVar(ctx.var()));
            }
        } else if (ctx.var() != null) {
            groupCondition.add("var", visitVar(ctx.var()));
        }

        return groupCondition;
    }

    @Override
    public ST visitHavingClause(SparqlParser.HavingClauseContext ctx) {
        // havingClause
        //   HAVING havingCondition+

        ST havingClause = g.getInstanceOf("havingClause");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.HavingConditionContext) {
                havingClause.add("havingCondition", visitHavingCondition((SparqlParser.HavingConditionContext) c));
            }
        }

        return havingClause;
    }

    @Override
    public ST visitHavingCondition(SparqlParser.HavingConditionContext ctx) {
        // havingCondition
        //   constraint

        ST havingCondition = g.getInstanceOf("havingCondition");

        havingCondition.add("constraint", visitConstraint(ctx.constraint()));

        return havingCondition;
    }

    @Override
    public ST visitOrderClause(SparqlParser.OrderClauseContext ctx) {
        // orderClause
        //   ORDER BY orderCondition+

        ST orderClause = g.getInstanceOf("orderClause");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.OrderConditionContext) {
                orderClause.add("orderCondition", visitOrderCondition((SparqlParser.OrderConditionContext) c));
            }
        }

        return orderClause;
    }

    @Override
    public ST visitOrderCondition(SparqlParser.OrderConditionContext ctx) {
        // orderCondition
        //   ASC brackettedExpression | DESC brackettedExpression | constraint | var

        ST orderCondition = g.getInstanceOf("orderCondition");

        if (ctx.ASC() != null) {
            orderCondition.add("ASC", ctx.ASC().getSymbol().getText().toUpperCase());
            orderCondition.add("brackettedExpression", visitBrackettedExpression(ctx.brackettedExpression()));
        } else if (ctx.DESC() != null) {
            orderCondition.add("DESC", ctx.DESC().getSymbol().getText().toUpperCase());
            orderCondition.add("brackettedExpression", visitBrackettedExpression(ctx.brackettedExpression()));
        } else if (ctx.constraint() != null) {
            orderCondition.add("constraint", visitConstraint(ctx.constraint()));
        } else if (ctx.var() != null) {
            orderCondition.add("var", visitVar(ctx.var()));
        }

        return orderCondition;
    }

    @Override
    public ST visitLimitOffsetClauses(SparqlParser.LimitOffsetClausesContext ctx) {
        // limitOffsetClauses
        //   limitClause offsetClause? | offsetClause limitClause?

        ST limitOffsetClauses = g.getInstanceOf("limitOffsetClauses");

        if (ctx.limitClause() != null) {
            limitOffsetClauses.add("limitClause", visitLimitClause(ctx.limitClause()));
        }

        if (ctx.offsetClause() != null) {
            limitOffsetClauses.add("offsetClause", visitOffsetClause(ctx.offsetClause()));
        }

        return limitOffsetClauses;
    }

    @Override
    public ST visitLimitClause(SparqlParser.LimitClauseContext ctx) {
        // limitClause
        //   LIMIT INTEGER

        ST limitClause = g.getInstanceOf("limitClause");

        limitClause.add("limit", ctx.INTEGER().getSymbol().getText());

        return limitClause;
    }

    @Override
    public ST visitOffsetClause(SparqlParser.OffsetClauseContext ctx) {
        // offsetClause
        //   OFFSET INTEGER

        ST offsetClause = g.getInstanceOf("offsetClause");

        offsetClause.add("offset", ctx.INTEGER().getSymbol().getText());

        return offsetClause;
    }

    @Override
    public ST visitBindingsClause(SparqlParser.BindingsClauseContext ctx) {
        // bindingsClause :
        //  (BINDINGS var* OPEN_CURLY_BRACE (OPEN_BRACE bindingsValueList CLOSE_BRACE | nil)* CLOSE_CURLY_BRACE)?

        ST bindingsClause = g.getInstanceOf("bindingsClause");

        if (ctx.children != null) {
            for (ParseTree c : ctx.children) {
                if (c instanceof SparqlParser.VarContext) {
                    bindingsClause.add("var", visitVar((SparqlParser.VarContext) c));
                } else if (c instanceof SparqlParser.BindingsValueListContext) {
                    bindingsClause.add("bindingsValueList", visitBindingsValueList((SparqlParser.BindingsValueListContext) c));
                } else if (c instanceof SparqlParser.NilContext) {
                    bindingsClause.add("bindingsValueList", visitNil((SparqlParser.NilContext) c));
                }
            }
        }

        return bindingsClause;
    }

    @Override
    public ST visitBindingsValueList(SparqlParser.BindingsValueListContext ctx) {
        // bindingsValueList :
        //    bindingValue+

        ST bindingsValueList = g.getInstanceOf("bindingsValueList");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.BindingValueContext) {
                bindingsValueList.add("bindingValue", visitBindingValue((SparqlParser.BindingValueContext) c));
            }
        }

        return bindingsValueList;
    }

    @Override
    public ST visitBindingValue(SparqlParser.BindingValueContext ctx) {
        // bindingValue
        //   iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF

        ST bindingValue = g.getInstanceOf("bindingValue");

        if (ctx.iriRef() != null) {
            bindingValue.add("iriRef", visitIriRef(ctx.iriRef()));
        } else if (ctx.rdfLiteral() != null) {
            bindingValue.add("rdfLiteral", visitRdfLiteral(ctx.rdfLiteral()));
        } else if (ctx.numericLiteral() != null) {
            bindingValue.add("numericLiteral", visitNumericLiteral(ctx.numericLiteral()));
        } else if (ctx.booleanLiteral() != null) {
            bindingValue.add("booleanLiteral", visitBooleanLiteral(ctx.booleanLiteral()));
        } else if (ctx.UNDEF() != null) {
            bindingValue.add("UNDEF", ctx.UNDEF().getSymbol().getText());
        }

        return bindingValue;
    }

    @Override
    public ST visitUpdate(SparqlParser.UpdateContext ctx) {
        // update :
        //   prologue (load | clear | drop | add | move | copy | create | insertData | deleteData | deleteWhere | modify)

        ST update = g.getInstanceOf("update");

        update.add("prologue", visitPrologue(ctx.prologue()));

        if (ctx.load() != null) {
            update.add("load", visitLoad(ctx.load()));
        } else if (ctx.clear() != null) {
            update.add("clear", visitClear(ctx.clear()));
        } else if (ctx.drop() != null) {
            update.add("drop", visitDrop(ctx.drop()));
        } else if (ctx.add() != null) {
            update.add("add", visitAdd(ctx.add()));
        } else if (ctx.move() != null) {
            update.add("move", visitMove(ctx.move()));
        } else if (ctx.copy() != null) {
            update.add("copy", visitCopy(ctx.copy()));
        } else if (ctx.create() != null) {
            update.add("create", visitCreate(ctx.create()));
        } else if (ctx.insertData() != null) {
            update.add("insertData", visitInsertData(ctx.insertData()));
        } else if (ctx.deleteData() != null) {
            update.add("deleteData", visitDeleteData(ctx.deleteData()));
        } else if (ctx.deleteWhere() != null) {
            update.add("deleteWhere", visitDeleteWhere(ctx.deleteWhere()));
        } else if (ctx.modify() != null) {
            update.add("modify", visitModify(ctx.modify()));
        }

        return update;
    }

    @Override
    public ST visitLoad(SparqlParser.LoadContext ctx) {
        // load :	  
        //   LOAD SILENT? iriRef (INTO graphRef)?

        ST load = g.getInstanceOf("load");

        if (ctx.SILENT() != null) {
            load.add("SILENT", ctx.SILENT().getSymbol().getText().toUpperCase());
        }

        load.add("iriRef", visitIriRef(ctx.iriRef()));

        if (ctx.graphRef() != null) {
            load.add("graphRef", visitGraphRef(ctx.graphRef()));
        }

        return load;
    }

    @Override
    public ST visitClear(SparqlParser.ClearContext ctx) {
        // clear :
        //   CLEAR  SILENT? graphRefAll

        ST clear = g.getInstanceOf("clear");

        if (ctx.SILENT() != null) {
            clear.add("SILENT", ctx.SILENT().getSymbol().getText().toUpperCase());
        }

        clear.add("graphRefAll", visitGraphRefAll(ctx.graphRefAll()));

        return clear;
    }

    @Override
    public ST visitDrop(SparqlParser.DropContext ctx) {
        // drop :
        //   DROP SILENT? graphRefAll

        ST drop = g.getInstanceOf("drop");

        if (ctx.SILENT() != null) {
            drop.add("SILENT", ctx.SILENT().getSymbol().getText().toUpperCase());
        }

        drop.add("graphRefAll", visitGraphRefAll(ctx.graphRefAll()));

        return drop;
    }

    @Override
    public ST visitCreate(SparqlParser.CreateContext ctx) {
        // create :
        //   CREATE SILENT? graphRef

        ST create = g.getInstanceOf("create");

        if (ctx.SILENT() != null) {
            create.add("SILENT", ctx.SILENT().getSymbol().getText().toUpperCase());
        }

        create.add("graphRef", visitGraphRef(ctx.graphRef()));

        return create;
    }

    @Override
    public ST visitAdd(SparqlParser.AddContext ctx) {
        // add :
        //   ADD SILENT? graphOrDefault TO graphOrDefault

        ST add = g.getInstanceOf("add");

        if (ctx.SILENT() != null) {
            add.add("SILENT", ctx.SILENT().getSymbol().getText().toUpperCase());
        }

        add.add("graphOrDefault1", visitGraphOrDefault(ctx.graphOrDefault(0)));
        add.add("graphOrDefault2", visitGraphOrDefault(ctx.graphOrDefault(1)));

        return add;
    }

    @Override
    public ST visitMove(SparqlParser.MoveContext ctx) {
        // move :
        //   MOVE SILENT? graphOrDefault TO graphOrDefault

        ST move = g.getInstanceOf("move");

        if (ctx.SILENT() != null) {
            move.add("SILENT", ctx.SILENT().getSymbol().getText().toUpperCase());
        }

        move.add("graphOrDefault1", visitGraphOrDefault(ctx.graphOrDefault(0)));
        move.add("graphOrDefault2", visitGraphOrDefault(ctx.graphOrDefault(1)));

        return move;
    }

    @Override
    public ST visitCopy(SparqlParser.CopyContext ctx) {
        // copy :
        //   COPY SILENT? graphOrDefault TO graphOrDefault

        ST copy = g.getInstanceOf("copy");

        if (ctx.SILENT() != null) {
            copy.add("SILENT", ctx.SILENT().getSymbol().getText().toUpperCase());
        }

        copy.add("graphOrDefault1", visitGraphOrDefault(ctx.graphOrDefault(0)));
        copy.add("graphOrDefault2", visitGraphOrDefault(ctx.graphOrDefault(1)));

        return copy;
    }

    @Override
    public ST visitInsertData(SparqlParser.InsertDataContext ctx) {
        // insertData :
        //   INSERT DATA quadData

        ST insertData = g.getInstanceOf("insertData");

        insertData.add("quadData", visitQuadData(ctx.quadData()));

        return insertData;
    }

    @Override
    public ST visitDeleteData(SparqlParser.DeleteDataContext ctx) {
        // deleteData :
        //   DELETE DATA quadData

        ST deleteData = g.getInstanceOf("deleteData");

        deleteData.add("quadData", visitQuadData(ctx.quadData()));

        return deleteData;
    }

    @Override
    public ST visitDeleteWhere(SparqlParser.DeleteWhereContext ctx) {
        // deleteWhere :
        //   DELETE WHERE quadData

        ST deleteWhere = g.getInstanceOf("deleteWhere");

        deleteWhere.add("quadData", visitQuadData(ctx.quadData()));

        return deleteWhere;
    }

    @Override
    public ST visitModify(SparqlParser.ModifyContext ctx) {
        // modify :
        //   (WITH iriRef)? (deleteClause insertClause? | insertClause) usingClause* WHERE groupGraphPattern

        ST modify = g.getInstanceOf("modify");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.IriRefContext) {
                modify.add("iriRef", visitIriRef((SparqlParser.IriRefContext) c));
            } else if (c instanceof SparqlParser.DeleteClauseContext) {
                modify.add("deleteClause", visitDeleteClause((SparqlParser.DeleteClauseContext) c));
            } else if (c instanceof SparqlParser.InsertClauseContext) {
                modify.add("insertClause", visitInsertClause((SparqlParser.InsertClauseContext) c));
            } else if (c instanceof SparqlParser.UsingClauseContext) {
                modify.add("usingClause", visitUsingClause((SparqlParser.UsingClauseContext) c));
            } else if (c instanceof SparqlParser.GroupGraphPatternContext) {
                modify.add("groupGraphPattern", visitGroupGraphPattern((SparqlParser.GroupGraphPatternContext) c));
            }
        }

        return modify;
    }

    @Override
    public ST visitDeleteClause(SparqlParser.DeleteClauseContext ctx) {
        // deleteClause :
        //   DELETE quadPattern

        ST deleteClause = g.getInstanceOf("deleteClause");

        deleteClause.add("quadPattern", visitQuadPattern(ctx.quadPattern()));

        return deleteClause;
    }

    @Override
    public ST visitInsertClause(SparqlParser.InsertClauseContext ctx) {
        // insertClause :
        //   INSERT quadPattern

        ST insertClause = g.getInstanceOf("insertClause");

        insertClause.add("quadPattern", visitQuadPattern(ctx.quadPattern()));

        return insertClause;
    }

    @Override
    public ST visitUsingClause(SparqlParser.UsingClauseContext ctx) {
        // usingClause :
        //   USING NAMED? iriRef

        ST usingClause = g.getInstanceOf("usingClause");

        if (ctx.NAMED() != null) {
            usingClause.add("NAMED", ctx.NAMED().getSymbol().getText().toUpperCase());
        }

        usingClause.add("iriRef", visitIriRef(ctx.iriRef()));

        return usingClause;
    }

    @Override
    public ST visitGraphOrDefault(SparqlParser.GraphOrDefaultContext ctx) {
        // graphOrDefault :	  
        //   DEFAULT | GRAPH? iriRef

        ST graphOrDefault = g.getInstanceOf("graphOrDefault");

        if (ctx.DEFAULT() != null) {
            graphOrDefault.add("DEFAULT", ctx.DEFAULT().getSymbol().getText().toUpperCase());
        } else {
            if (ctx.GRAPH() != null) {
                graphOrDefault.add("GRAPH", ctx.GRAPH().getSymbol().getText().toUpperCase());
            }
            graphOrDefault.add("iriRef", visitIriRef(ctx.iriRef()));
        }

        return graphOrDefault;
    }

    @Override
    public ST visitGraphRef(SparqlParser.GraphRefContext ctx) {
        // graphRef :	  
        //   GRAPH iriRef

        ST graphRef = g.getInstanceOf("graphRef");

        graphRef.add("iriRef", visitIriRef(ctx.iriRef()));

        return graphRef;
    }

    @Override
    public ST visitGraphRefAll(SparqlParser.GraphRefAllContext ctx) {
        // graphRefAll :
        //   graphRef | DEFAULT | NAMED | ALL

        ST graphRefAll = g.getInstanceOf("graphRefAll");

        if (ctx.graphRef() != null) {
            graphRefAll.add("graphRef", visitGraphRef(ctx.graphRef()));
        } else if (ctx.DEFAULT() != null) {
            graphRefAll.add("DEFAULT", ctx.DEFAULT().getSymbol().getText().toUpperCase());
        } else if (ctx.NAMED() != null) {
            graphRefAll.add("NAMED", ctx.NAMED().getSymbol().getText().toUpperCase());
        } else if (ctx.ALL() != null) {
            graphRefAll.add("ALL", ctx.ALL().getSymbol().getText().toUpperCase());
        }

        return graphRefAll;
    }

    @Override
    public ST visitQuadPattern(SparqlParser.QuadPatternContext ctx) {
        // quadPattern :
        //   OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE

        ST quadPattern = g.getInstanceOf("quadPattern");

        quadPattern.add("quads", visitQuads(ctx.quads()));

        return quadPattern;
    }

    @Override
    public ST visitQuadData(SparqlParser.QuadDataContext ctx) {
        // quadData :
        //   OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE

        ST quadData = g.getInstanceOf("quadData");

        quadData.add("quads", visitQuads(ctx.quads()));

        return quadData;
    }

    @Override
    public ST visitQuads(SparqlParser.QuadsContext ctx) {
        // quads :
        //   triplesTemplate? (quadsNotTriples DOT? triplesTemplate?)*

        ST quads = g.getInstanceOf("quads");

        int i = 0;

        if (ctx.triplesTemplate(0) != null) {
            quads.add("triplesTemplate", visitTriplesTemplate(ctx.triplesTemplate(0)));
            i = 1;
        }

        while (i < ctx.getChildCount()) {
            ParseTree c = ctx.getChild(i++);
            if (c instanceof SparqlParser.QuadsNotTriplesContext) {
                quads.add("quadsNotTriples", visitQuadsNotTriples((SparqlParser.QuadsNotTriplesContext) c));
                if (i < ctx.getChildCount()) {
                    c = ctx.getChild(i);
                    if (c instanceof SparqlParser.TriplesTemplateContext) {
                        quads.add("triplesTemplateTail", visitTriplesTemplate((SparqlParser.TriplesTemplateContext) c));
                        i++;
                    } else {
                        quads.add("triplesTemplateTail", null);
                    }
                } else {
                    quads.add("triplesTemplateTail", null);
                }
            }
        }

        return quads;
    }

    @Override
    public ST visitQuadsNotTriples(SparqlParser.QuadsNotTriplesContext ctx) {
        // quadsNotTriples :
        //   GRAPH varOrIRIref OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE

        ST quadsNotTriples = g.getInstanceOf("quadsNotTriples");

        quadsNotTriples.add("varOrIRIref", visitVarOrIRIref(ctx.varOrIRIref()));

        if (ctx.triplesTemplate() != null) {
            quadsNotTriples.add("triplesTemplate", visitTriplesTemplate(ctx.triplesTemplate()));
        }

        return quadsNotTriples;
    }

    @Override
    public ST visitTriplesTemplate(SparqlParser.TriplesTemplateContext ctx) {
        // triplesTemplate :
        //   triplesSameSubject (DOT triplesTemplate?)?

        ST triplesTemplate = g.getInstanceOf("triplesTemplate");

        triplesTemplate.add("triplesSameSubject", visitTriplesSameSubject(ctx.triplesSameSubject()));

        if (ctx.triplesTemplate() != null) {
            triplesTemplate.add("triplesTemplate", visitTriplesTemplate(ctx.triplesTemplate()));
        }

        return triplesTemplate;
    }

    @Override
    public ST visitGroupGraphPattern(SparqlParser.GroupGraphPatternContext ctx) {
        // groupGraphPattern :
        //   OPEN_CURLY_BRACE (subSelect | groupGraphPatternSub) CLOSE_CURLY_BRACE

        ST groupGraphPattern = g.getInstanceOf("groupGraphPattern");

        if (ctx.subSelect() != null) {
            groupGraphPattern.add("subSelect", visitSubSelect(ctx.subSelect()));
        } else if (ctx.groupGraphPatternSub() != null) {
            groupGraphPattern.add("groupGraphPatternSub", visitGroupGraphPatternSub(ctx.groupGraphPatternSub()));
        }

        return groupGraphPattern;
    }

    @Override
    public ST visitGroupGraphPatternSub(SparqlParser.GroupGraphPatternSubContext ctx) {
        // groupGraphPatternSub :
        //   triplesBlock? groupGraphPatternSubList*

        ST groupGraphPatternSub = g.getInstanceOf("groupGraphPatternSub");

        if (ctx.children != null) {
            for (ParseTree c : ctx.children) {
                if (c instanceof SparqlParser.GroupGraphPatternSubListContext) {
                    groupGraphPatternSub.add("groupGraphPatternSubList", visitGroupGraphPatternSubList((SparqlParser.GroupGraphPatternSubListContext) c));
                } else if (c instanceof SparqlParser.TriplesBlockContext) {
                    groupGraphPatternSub.add("triplesBlock", visitTriplesBlock((SparqlParser.TriplesBlockContext) c));
                }
            }
        }

        return groupGraphPatternSub;
    }

    @Override
    public ST visitGroupGraphPatternSubList(SparqlParser.GroupGraphPatternSubListContext ctx) {
        // groupGraphPatternSubList :
        //    graphPatternNotTriples DOT? triplesBlock?

        ST groupGraphPatternSubList = g.getInstanceOf("groupGraphPatternSubList");

        groupGraphPatternSubList.add("graphPatternNotTriples", visitGraphPatternNotTriples(ctx.graphPatternNotTriples()));

        if (ctx.triplesBlock() != null) {
            groupGraphPatternSubList.add("triplesBlock", visitTriplesBlock(ctx.triplesBlock()));
        }

        return groupGraphPatternSubList;
    }

    @Override
    public ST visitTriplesBlock(SparqlParser.TriplesBlockContext ctx) {
        // triplesBlock :
        //   triplesSameSubjectPath (DOT triplesBlock?)?

        ST triplesBlock = g.getInstanceOf("triplesBlock");

        triplesBlock.add("triplesSameSubjectPath", visitTriplesSameSubjectPath(ctx.triplesSameSubjectPath()));
        if (ctx.triplesBlock() != null) {
            triplesBlock.add("triplesBlock", visitTriplesBlock(ctx.triplesBlock()));
        }

        return triplesBlock;
    }

    @Override
    public ST visitGraphPatternNotTriples(SparqlParser.GraphPatternNotTriplesContext ctx) {
        // graphPatternNotTriples :
        //   groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind

        ST graphPatternNotTriples = g.getInstanceOf("graphPatternNotTriples");

        if (ctx.groupOrUnionGraphPattern() != null) {
            graphPatternNotTriples.add("groupOrUnionGraphPattern", visitGroupOrUnionGraphPattern(ctx.groupOrUnionGraphPattern()));
        } else if (ctx.optionalGraphPattern() != null) {
            graphPatternNotTriples.add("optionalGraphPattern", visitOptionalGraphPattern(ctx.optionalGraphPattern()));
        } else if (ctx.minusGraphPattern() != null) {
            graphPatternNotTriples.add("minusGraphPattern", visitMinusGraphPattern(ctx.minusGraphPattern()));
        } else if (ctx.graphGraphPattern() != null) {
            graphPatternNotTriples.add("graphGraphPattern", visitGraphGraphPattern(ctx.graphGraphPattern()));
        } else if (ctx.serviceGraphPattern() != null) {
            graphPatternNotTriples.add("serviceGraphPattern", visitServiceGraphPattern(ctx.serviceGraphPattern()));
        } else if (ctx.filter() != null) {
            graphPatternNotTriples.add("filter", visitFilter(ctx.filter()));
        } else if (ctx.bind() != null) {
            graphPatternNotTriples.add("bind", visitBind(ctx.bind()));
        }

        return graphPatternNotTriples;
    }

    @Override
    public ST visitOptionalGraphPattern(SparqlParser.OptionalGraphPatternContext ctx) {
        // optionalGraphPattern :
        //   OPTIONAL groupGraphPattern

        ST optionalGraphPattern = g.getInstanceOf("optionalGraphPattern");

        optionalGraphPattern.add("groupGraphPattern", visitGroupGraphPattern(ctx.groupGraphPattern()));

        return optionalGraphPattern;
    }

    @Override
    public ST visitGraphGraphPattern(SparqlParser.GraphGraphPatternContext ctx) {
        // graphGraphPattern :
        //   GRAPH varOrIRIref groupGraphPattern

        ST graphGraphPattern = g.getInstanceOf("graphGraphPattern");

        graphGraphPattern.add("varOrIRIref", visitVarOrIRIref(ctx.varOrIRIref()));

        graphGraphPattern.add("groupGraphPattern", visitGroupGraphPattern(ctx.groupGraphPattern()));

        return graphGraphPattern;
    }

    @Override
    public ST visitServiceGraphPattern(SparqlParser.ServiceGraphPatternContext ctx) {
        // serviceGraphPattern :
        //   SERVICE SILENT? varOrIRIref groupGraphPattern

        ST serviceGraphPattern = g.getInstanceOf("serviceGraphPattern");

        if (ctx.SILENT() != null) {
            serviceGraphPattern.add("SILENT", ctx.SILENT().getSymbol().getText());
        }

        serviceGraphPattern.add("varOrIRIref", visitVarOrIRIref(ctx.varOrIRIref()));

        serviceGraphPattern.add("groupGraphPattern", visitGroupGraphPattern(ctx.groupGraphPattern()));

        return serviceGraphPattern;
    }

    @Override
    public ST visitBind(SparqlParser.BindContext ctx) {
        // bind :
        //  BIND OPEN_BRACE expression AS var CLOSE_BRACE

        ST bind = g.getInstanceOf("bind");

        bind.add("expression", visitExpression(ctx.expression()));

        bind.add("var", visitVar(ctx.var()));

        return bind;
    }

    @Override
    public ST visitMinusGraphPattern(SparqlParser.MinusGraphPatternContext ctx) {
        // minusGraphPattern :
        //   MINUS_KEYWORD groupGraphPattern

        ST minusGraphPattern = g.getInstanceOf("minusGraphPattern");

        minusGraphPattern.add("groupGraphPattern", visitGroupGraphPattern(ctx.groupGraphPattern()));

        return minusGraphPattern;
    }

    @Override
    public ST visitGroupOrUnionGraphPattern(SparqlParser.GroupOrUnionGraphPatternContext ctx) {
        // groupOrUnionGraphPattern :
        //   groupGraphPattern (UNION groupGraphPattern)*

        ST groupOrUnionGraphPattern = g.getInstanceOf("groupOrUnionGraphPattern");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.GroupGraphPatternContext) {
                groupOrUnionGraphPattern.add("groupGraphPattern", visitGroupGraphPattern((SparqlParser.GroupGraphPatternContext) c));
            }
        }

        return groupOrUnionGraphPattern;
    }

    @Override
    public ST visitFilter(SparqlParser.FilterContext ctx) {
        // filter :
        //   FILTER constraint

        ST filter = g.getInstanceOf("filter");

        filter.add("constraint", visitConstraint(ctx.constraint()));

        return filter;
    }

    @Override
    public ST visitConstraint(SparqlParser.ConstraintContext ctx) {
        // constraint :
        //   brackettedExpression | builtInCall | functionCall

        ST constraint = g.getInstanceOf("constraint");

        if (ctx.brackettedExpression() != null) {
            constraint.add("brackettedExpression", visitBrackettedExpression(ctx.brackettedExpression()));
        } else if (ctx.builtInCall() != null) {
            constraint.add("builtInCall", visitBuiltInCall(ctx.builtInCall()));
        } else if (ctx.functionCall() != null) {
            constraint.add("functionCall", visitFunctionCall(ctx.functionCall()));
        }

        return constraint;
    }

    @Override
    public ST visitFunctionCall(SparqlParser.FunctionCallContext ctx) {
        // functionCall :
        //   iriRef argList

        ST functionCall = g.getInstanceOf("functionCall");

        functionCall.add("iriRef", visitIriRef(ctx.iriRef()));

        functionCall.add("argList", visitArgList(ctx.argList()));

        return functionCall;
    }

    @Override
    public ST visitArgList(SparqlParser.ArgListContext ctx) {
        // argList :
        //   nil | OPEN_BRACE DISTINCT? expression (COMMA expression)* CLOSE_BRACE

        ST argList = g.getInstanceOf("argList");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ExpressionContext) {
                argList.add("expression", visitExpression((SparqlParser.ExpressionContext) c));
            } else if (c instanceof SparqlParser.NilContext) {
                argList.add("nil", visitNil((SparqlParser.NilContext) c));
            } else if (c instanceof ParseTree.TerminalNode) {
                ParseTree.TerminalNode t = (ParseTree.TerminalNode) c;
                Token to = (Token) (t.getSymbol());
                if (to.getType() == SparqlParser.DISTINCT) {
                    argList.add("DISTINCT", to.getText().toUpperCase());
                }
            }
        }

        return argList;
    }

    @Override
    public ST visitExpressionList(SparqlParser.ExpressionListContext ctx) {
        // expressionList :
        //   nil | OPEN_BRACE expression (COMMA expression)* CLOSE_BRACE

        ST expressionList = g.getInstanceOf("expressionList");

        if (ctx.children != null) {
            for (ParseTree c : ctx.children) {
                if (c instanceof SparqlParser.ExpressionContext) {
                    expressionList.add("expression", visitExpression((SparqlParser.ExpressionContext) c));
                } else if (c instanceof SparqlParser.NilContext) {
                    expressionList.add("nil", visitNil((SparqlParser.NilContext) c));
                }
            }
        }

        return expressionList;
    }

    @Override
    public ST visitConstructTemplate(SparqlParser.ConstructTemplateContext ctx) {
        // constructTemplate :
        //   OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE

        ST constructTemplate = g.getInstanceOf("constructTemplate");

        if (ctx.constructTriples() != null) {
            constructTemplate.add("constructTriples", visitConstructTriples(ctx.constructTriples()));
        }

        return constructTemplate;
    }

    @Override
    public ST visitConstructTriples(SparqlParser.ConstructTriplesContext ctx) {
        // constructTriples :
        //   triplesSameSubject (DOT constructTriples?)* 

        ST constructTriples = g.getInstanceOf("constructTriples");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ConstructTriplesContext) {
                constructTriples.add("constructTriples", visitConstructTriples((SparqlParser.ConstructTriplesContext) c));
            } else if (c instanceof SparqlParser.TriplesSameSubjectContext) {
                constructTriples.add("triplesSameSubject", visitTriplesSameSubject((SparqlParser.TriplesSameSubjectContext) c));
            }
        }

        return constructTriples;
    }

    @Override
    public ST visitTriplesSameSubject(SparqlParser.TriplesSameSubjectContext ctx) {
        // triplesSameSubject :
        //   varOrTerm propertyListNotEmpty | triplesNode propertyList 

        ST triplesSameSubject = g.getInstanceOf("triplesSameSubject");

        if (ctx.varOrTerm() != null) {
            triplesSameSubject.add("varOrTerm", visitVarOrTerm(ctx.varOrTerm()));
            triplesSameSubject.add("propertyListNotEmpty", visitPropertyListNotEmpty(ctx.propertyListNotEmpty()));
        } else {
            triplesSameSubject.add("triplesNode", visitTriplesNode(ctx.triplesNode()));
            triplesSameSubject.add("propertyList", visitPropertyList(ctx.propertyList()));
        }

        return triplesSameSubject;
    }

    @Override
    public ST visitPropertyListNotEmpty(SparqlParser.PropertyListNotEmptyContext ctx) {
        // propertyListNotEmpty :
        //   verb objectList (SEMICOLON (verb objectList)?)* 

        ST propertyListNotEmpty = g.getInstanceOf("propertyListNotEmpty");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.VerbContext) {
                propertyListNotEmpty.add("verb", visitVerb((SparqlParser.VerbContext) c));
            } else if (c instanceof SparqlParser.ObjectListContext) {
                propertyListNotEmpty.add("objectList", visitObjectList((SparqlParser.ObjectListContext) c));
            }
        }

        return propertyListNotEmpty;
    }

    @Override
    public ST visitPropertyList(SparqlParser.PropertyListContext ctx) {
        // propertyList
        //   propertyListNotEmpty?

        ST propertyList = g.getInstanceOf("propertyList");

        if (ctx.propertyListNotEmpty() != null) {
            propertyList.add("propertyListNotEmpty", visitPropertyListNotEmpty(ctx.propertyListNotEmpty()));
        }

        return propertyList;
    }

    @Override
    public ST visitObjectList(SparqlParser.ObjectListContext ctx) {
        // objectList :
        //   object (COMMA object)*

        ST objectList = g.getInstanceOf("objectList");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ObjectContext) {
                objectList.add("object", visitObject((SparqlParser.ObjectContext) c));
            }
        }

        return objectList;
    }

    @Override
    public ST visitObject(SparqlParser.ObjectContext ctx) {
        // object :
        //   graphNode

        ST object = g.getInstanceOf("object");

        object.add("graphNode", visitGraphNode(ctx.graphNode()));

        return object;
    }

    @Override
    public ST visitVerb(SparqlParser.VerbContext ctx) {
        // verb :
        //   varOrIRIref | A

        ST verb = g.getInstanceOf("verb");

        if (ctx.varOrIRIref() != null) {
            verb.add("varOrIriRef", visitVarOrIRIref(ctx.varOrIRIref()));
        } else if (ctx.A() != null) {
            verb.add("A", ctx.A().getSymbol().getText());
        }

        return verb;
    }

    @Override
    public ST visitTriplesSameSubjectPath(SparqlParser.TriplesSameSubjectPathContext ctx) {
        // triplesSameSubjectPath :
        //   varOrTerm propertyListNotEmptyPath | triplesNode propertyListPath

        ST triplesSameSubjectPath = g.getInstanceOf("triplesSameSubjectPath");

        if (ctx.varOrTerm() != null) {
            triplesSameSubjectPath.add("varOrTerm", visitVarOrTerm(ctx.varOrTerm()));
            triplesSameSubjectPath.add("propertyListNotEmptyPath", visitPropertyListNotEmptyPath(ctx.propertyListNotEmptyPath()));
        } else {
            triplesSameSubjectPath.add("triplesNode", visitTriplesNode(ctx.triplesNode()));
            triplesSameSubjectPath.add("propertyListPath", visitPropertyListPath(ctx.propertyListPath()));
        }

        return triplesSameSubjectPath;
    }

    @Override
    public ST visitPropertyListNotEmptyPath(SparqlParser.PropertyListNotEmptyPathContext ctx) {
        // propertyListNotEmptyPath :
        //  (verbPath|verbSimple) objectList (SEMICOLON ((verbPath|verbSimple) objectList)?)*

        ST propertyListNotEmptyPath = g.getInstanceOf("propertyListNotEmptyPath");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.VerbPathContext) {
                propertyListNotEmptyPath.add("verb", visitVerbPath((SparqlParser.VerbPathContext) c));
            } else if (c instanceof SparqlParser.VerbSimpleContext) {
                propertyListNotEmptyPath.add("verb", visitVerbSimple((SparqlParser.VerbSimpleContext) c));
            } else if (c instanceof SparqlParser.ObjectListContext) {
                propertyListNotEmptyPath.add("objectList", visitObjectList((SparqlParser.ObjectListContext) c));
            }
        }

        return propertyListNotEmptyPath;
    }

    @Override
    public ST visitPropertyListPath(SparqlParser.PropertyListPathContext ctx) {
        // propertyListPath :
        //   propertyListNotEmpty?

        ST propertyListPath = g.getInstanceOf("propertyListPath");

        if (ctx.propertyListNotEmpty() != null) {
            propertyListPath.add("propertyListNotEmpty", visitPropertyListNotEmpty(ctx.propertyListNotEmpty()));
        }

        return propertyListPath;
    }

    @Override
    public ST visitVerbPath(SparqlParser.VerbPathContext ctx) {
        // verbPath :
        //   path

        ST verbPath = g.getInstanceOf("verbPath");

        verbPath.add("path", visitPath(ctx.path()));

        return verbPath;
    }

    @Override
    public ST visitVerbSimple(SparqlParser.VerbSimpleContext ctx) {
        // verbSimple :
        //   var

        ST verbSimple = g.getInstanceOf("verbSimple");

        verbSimple.add("var", visitVar(ctx.var()));

        return verbSimple;
    }

    @Override
    public ST visitPath(SparqlParser.PathContext ctx) {
        // path :
        //   pathAlternative

        ST path = g.getInstanceOf("path");

        path.add("pathAlternative", visitPathAlternative(ctx.pathAlternative()));

        return path;
    }

    @Override
    public ST visitPathAlternative(SparqlParser.PathAlternativeContext ctx) {
        // pathAlternative :
        //   pathSequence ( PIPE pathSequence)*

        ST pathAlternative = g.getInstanceOf("pathAlternative");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.PathSequenceContext) {
                pathAlternative.add("pathSequence", visitPathSequence((SparqlParser.PathSequenceContext) c));
            }
        }

        return pathAlternative;
    }

    @Override
    public ST visitPathSequence(SparqlParser.PathSequenceContext ctx) {
        // pathSequence :
        //   pathEltOrInverse (DIVIDE pathEltOrInverse)*

        ST pathSequence = g.getInstanceOf("pathSequence");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.PathEltOrInverseContext) {
                pathSequence.add("pathEltOrInverse", visitPathEltOrInverse((SparqlParser.PathEltOrInverseContext) c));
            }
        }

        return pathSequence;
    }

    @Override
    public ST visitPathElt(SparqlParser.PathEltContext ctx) {
        // pathElt :
        //   pathPrimary pathMod?

        ST pathElt = g.getInstanceOf("pathElt");

        pathElt.add("pathPrimary", visitPathPrimary(ctx.pathPrimary()));

        if (ctx.pathMod() != null) {
            pathElt.add("pathMod", visitPathMod(ctx.pathMod()));
        }

        return pathElt;
    }

    @Override
    public ST visitPathEltOrInverse(SparqlParser.PathEltOrInverseContext ctx) {
        // pathEltOrInverse :
        //   INVERSE? pathElt

        ST pathEltOrInverse = g.getInstanceOf("pathEltOrInverse");

        if (ctx.INVERSE() != null) {
            pathEltOrInverse.add("INVERSE", ctx.INVERSE().getSymbol().getText());
        }

        pathEltOrInverse.add("pathElt", visitPathElt(ctx.pathElt()));

        return pathEltOrInverse;
    }

    @Override
    public ST visitPathMod(SparqlParser.PathModContext ctx) {
        // pathMod :
        //   ASTERISK 
        // | QUESTION_MARK 
        // | PLUS 
        // | OPEN_CURLY_BRACE (integer (COMMA (CLOSE_CURLY_BRACE | integer CLOSE_CURLY_BRACE) | CLOSE_CURLY_BRACE) | COMMA integer CLOSE_CURLY_BRACE)

        ST pathMod = g.getInstanceOf("pathMod");

        if (ctx.ASTERISK() != null) {
            pathMod.add("ASTERISK", ctx.ASTERISK().getSymbol().getText());
        } else if (ctx.QUESTION_MARK() != null) {
            pathMod.add("QUESTION_MARK", ctx.QUESTION_MARK().getSymbol().getText());
        } else if (ctx.PLUS() != null) {
            pathMod.add("PLUS", ctx.PLUS().getSymbol().getText());
        } else if (ctx.OPEN_CURLY_BRACE() != null) {
            if (ctx.integer(0) != null) {
                pathMod.add("from", visitInteger(ctx.integer(0)));
            }
            if (ctx.COMMA(0) != null) {
                pathMod.add("COMMA", ctx.COMMA(0).getSymbol().getText());
            }
            if (ctx.integer(1) != null) {
                pathMod.add("to", visitInteger(ctx.integer(1)));
            }
            if (ctx.integer(2) != null) {
                pathMod.add("to", visitInteger(ctx.integer(2)));
            }
        }

        return pathMod;
    }

    @Override
    public ST visitPathPrimary(SparqlParser.PathPrimaryContext ctx) {
        // pathPrimary :
        //   iriRef | A | NEGATION pathNegatedPropertySet | OPEN_BRACE path CLOSE_BRACE

        ST pathPrimary = g.getInstanceOf("pathPrimary");

        if (ctx.iriRef() != null) {
            pathPrimary.add("iriRef", visitIriRef(ctx.iriRef()));
        } else if (ctx.A() != null) {
            pathPrimary.add("A", ctx.A().getSymbol().getText());
        } else if (ctx.pathNegatedPropertySet() != null) {
            pathPrimary.add("pathNegatedPropertySet", visitPathNegatedPropertySet(ctx.pathNegatedPropertySet()));
        } else if (ctx.path() != null) {
            pathPrimary.add("path", visitPath(ctx.path()));
        }

        return pathPrimary;
    }

    @Override
    public ST visitPathNegatedPropertySet(SparqlParser.PathNegatedPropertySetContext ctx) {
        // pathNegatedPropertySet
        //   pathOneInPropertySet | OPEN_BRACE (pathOneInPropertySet (PIPE pathOneInPropertySet)*)? CLOSE_BRACE

        ST pathNegatedPropertySet = g.getInstanceOf("pathNegatedPropertySet");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.PathOneInPropertySetContext) {
                pathNegatedPropertySet.add("pathOneInPropertySet", visitPathOneInPropertySet((SparqlParser.PathOneInPropertySetContext) c));
            }
        }

        return pathNegatedPropertySet;
    }

    @Override
    public ST visitPathOneInPropertySet(SparqlParser.PathOneInPropertySetContext ctx) {
        // pathOneInPropertySet :
        //   INVERSE? (iriRef | A)

        ST pathOneInPropertySet = g.getInstanceOf("pathOneInPropertySet");

        if (ctx.INVERSE() != null) {
            pathOneInPropertySet.add("INVERSE", ctx.INVERSE().getSymbol().getText());
        }

        if (ctx.iriRef() != null) {
            pathOneInPropertySet.add("iriRef", visitIriRef(ctx.iriRef()));
        } else if (ctx.A() != null) {
            pathOneInPropertySet.add("A", ctx.A().getSymbol().getText());
        }

        return pathOneInPropertySet;
    }

    @Override
    public ST visitInteger(SparqlParser.IntegerContext ctx) {
        // integer :
        //   INTEGER

        ST integer = g.getInstanceOf("integer");

        integer.add("INTEGER", ctx.INTEGER().getSymbol().getText());

        return integer;
    }

    @Override
    public ST visitTriplesNode(SparqlParser.TriplesNodeContext ctx) {
        // triplesNode :
        //   collection | blankNodePropertyList

        ST triplesNode = g.getInstanceOf("triplesNode");

        if (ctx.collection() != null) {
            triplesNode.add("collection", visitCollection(ctx.collection()));
        } else if (ctx.blankNodePropertyList() != null) {
            triplesNode.add("blankNodePropertyList", visitBlankNodePropertyList(ctx.blankNodePropertyList()));
        }

        return triplesNode;
    }

    @Override
    public ST visitBlankNodePropertyList(SparqlParser.BlankNodePropertyListContext ctx) {
        // blankNodePropertyList :
        //   OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET

        ST blankNodePropertyList = g.getInstanceOf("blankNodePropertyList");

        blankNodePropertyList.add("propertyListNotEmpty", visitPropertyListNotEmpty(ctx.propertyListNotEmpty()));

        return blankNodePropertyList;
    }

    @Override
    public ST visitCollection(SparqlParser.CollectionContext ctx) {
        // collection :
        //   OPEN_BRACE graphNode+ CLOSE_BRACE

        ST collection = g.getInstanceOf("collection");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.GraphNodeContext) {
                collection.add("graphNode", visitGraphNode((SparqlParser.GraphNodeContext) c));
            }
        }

        return collection;
    }

    @Override
    public ST visitGraphNode(SparqlParser.GraphNodeContext ctx) {
        // graphNode :
        //   varOrTerm | triplesNode

        ST graphNode = g.getInstanceOf("graphNode");

        if (ctx.varOrTerm() != null) {
            graphNode.add("varOrTerm", visitVarOrTerm(ctx.varOrTerm()));
        } else if (ctx.triplesNode() != null) {
            graphNode.add("triplesNode", visitTriplesNode(ctx.triplesNode()));
        }

        return graphNode;
    }

    @Override
    public ST visitVarOrTerm(SparqlParser.VarOrTermContext ctx) {
        // varOrTerm :
        //   var | graphTerm

        ST varOrTerm = g.getInstanceOf("varOrTerm");

        if (ctx.var() != null) {
            varOrTerm.add("var", visitVar(ctx.var()));
        } else if (ctx.graphTerm() != null) {
            varOrTerm.add("graphTerm", visitGraphTerm(ctx.graphTerm()));
        }

        return varOrTerm;
    }

    @Override
    public ST visitVarOrIRIref(SparqlParser.VarOrIRIrefContext ctx) {
        // varOrIRIref :
        //   var | iriRef

        ST varOrIRIref = g.getInstanceOf("varOrIRIref");

        if (ctx.var() != null) {
            varOrIRIref.add("var", visitVar(ctx.var()));
        } else if (ctx.iriRef() != null) {
            varOrIRIref.add("iriRef", visitIriRef(ctx.iriRef()));
        }

        return varOrIRIref;
    }

    @Override
    public ST visitVar(SparqlParser.VarContext ctx) {
        // var :
        //   VAR1 | VAR2

        ST var = g.getInstanceOf("var");

        if (ctx.VAR1() != null) {
            var.add("var", ctx.VAR1().getSymbol().getText());
        } else if (ctx.VAR2() != null) {
            var.add("var", ctx.VAR2().getSymbol().getText());
        }

        return var;
    }

    @Override
    public ST visitGraphTerm(SparqlParser.GraphTermContext ctx) {
        // graphTerm
        //   iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil

        ST graphTerm = g.getInstanceOf("graphTerm");

        if (ctx.iriRef() != null) {
            graphTerm.add("iriRef", visitIriRef(ctx.iriRef()));
        } else if (ctx.rdfLiteral() != null) {
            graphTerm.add("rdfLiteral", visitRdfLiteral(ctx.rdfLiteral()));
        } else if (ctx.numericLiteral() != null) {
            graphTerm.add("numericLiteral", visitNumericLiteral(ctx.numericLiteral()));
        } else if (ctx.booleanLiteral() != null) {
            graphTerm.add("booleanLiteral", visitBooleanLiteral(ctx.booleanLiteral()));
        } else if (ctx.blankNode() != null) {
            graphTerm.add("blankNode", visitBlankNode(ctx.blankNode()));
        } else if (ctx.nil() != null) {
            graphTerm.add("nil", visitNil(ctx.nil()));
        }

        return graphTerm;
    }

    @Override
    public ST visitNil(SparqlParser.NilContext ctx) {
        // nil :
        //   OPEN_BRACE CLOSE_BRACE

        ST nil = g.getInstanceOf("nil");

        return nil;
    }

    @Override
    public ST visitExpression(SparqlParser.ExpressionContext ctx) {
        // expression :
        //   conditionalOrExpression

        ST expression = g.getInstanceOf("expression");

        expression.add("conditionalOrExpression", visitConditionalOrExpression(ctx.conditionalOrExpression()));

        return expression;
    }

    @Override
    public ST visitConditionalOrExpression(SparqlParser.ConditionalOrExpressionContext ctx) {
        // conditionalOrExpression :
        //   conditionalAndExpression (OR conditionalAndExpression)*

        ST conditionalOrExpression = g.getInstanceOf("conditionalOrExpression");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ConditionalAndExpressionContext) {
                conditionalOrExpression.add("conditionalAndExpression", visitConditionalAndExpression((SparqlParser.ConditionalAndExpressionContext) c));
            }
        }

        return conditionalOrExpression;
    }

    @Override
    public ST visitConditionalAndExpression(SparqlParser.ConditionalAndExpressionContext ctx) {
        // conditionalAndExpression :
        //   valueLogical (AND valueLogical)*

        ST conditionalAndExpression = g.getInstanceOf("conditionalAndExpression");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ValueLogicalContext) {
                conditionalAndExpression.add("valueLogical", visitValueLogical((SparqlParser.ValueLogicalContext) c));
            }
        }

        return conditionalAndExpression;
    }

    @Override
    public ST visitValueLogical(SparqlParser.ValueLogicalContext ctx) {
        // valueLogical :
        //   relationalExpression

        ST valueLogical = g.getInstanceOf("valueLogical");

        valueLogical.add("relationalExpression", visitRelationalExpression(ctx.relationalExpression()));

        return valueLogical;
    }

    @Override
    public ST visitRelationalExpression(SparqlParser.RelationalExpressionContext ctx) {
        // relationalExpression :
        //   numericExpression (EQUAL numericExpression
        //                    | NOT_EQUAL numericExpression 
        //                    | LESS numericExpression 
        //                    | GREATER numericExpression
        //                    | LESS_EQUAL numericExpression
        //                    | GREATER_EQUAL numericExpression  
        //                    | IN el1=expressionList
        //                    | NOT IN el2=expressionList)?

        ST relationalExpression = g.getInstanceOf("relationalExpression");

        relationalExpression.add("numericExpression", visitNumericExpression(ctx.numericExpression(0)));

        if (ctx.EQUAL() != null) {
            relationalExpression.add("operator", ctx.EQUAL().getSymbol().getText());
            relationalExpression.add("operand", visitNumericExpression(ctx.numericExpression(1)));
        } else if (ctx.NOT_EQUAL() != null) {
            relationalExpression.add("operator", ctx.NOT_EQUAL().getSymbol().getText());
            relationalExpression.add("operand", visitNumericExpression(ctx.numericExpression(1)));
        } else if (ctx.LESS() != null) {
            relationalExpression.add("operator", ctx.LESS().getSymbol().getText());
            relationalExpression.add("operand", visitNumericExpression(ctx.numericExpression(1)));
        } else if (ctx.GREATER() != null) {
            relationalExpression.add("operator", ctx.GREATER().getSymbol().getText());
            relationalExpression.add("operand", visitNumericExpression(ctx.numericExpression(1)));
        } else if (ctx.LESS_EQUAL() != null) {
            relationalExpression.add("operator", ctx.LESS_EQUAL().getSymbol().getText());
            relationalExpression.add("operand", visitNumericExpression(ctx.numericExpression(1)));
        } else if (ctx.GREATER_EQUAL() != null) {
            relationalExpression.add("operator", ctx.GREATER_EQUAL().getSymbol().getText());
            relationalExpression.add("operand", visitNumericExpression(ctx.numericExpression(1)));
        } else if (ctx.el1 != null) {
            relationalExpression.add("operator", "IN");
            relationalExpression.add("operand", visitExpressionList(ctx.el1));
        } else if (ctx.el2 != null) {
            relationalExpression.add("operator", "NOT IN");
            relationalExpression.add("operand", visitExpressionList(ctx.el2));
        }

        return relationalExpression;
    }

    @Override
    public ST visitNumericExpression(SparqlParser.NumericExpressionContext ctx) {
        // numericExpression :
        //   additiveExpression

        ST numericExpression = g.getInstanceOf("numericExpression");

        numericExpression.add("additiveExpression", visitAdditiveExpression(ctx.additiveExpression()));

        return numericExpression;
    }

    @Override
    public ST visitAdditiveExpression(SparqlParser.AdditiveExpressionContext ctx) {
        // additiveExpression : 
        //   multiplicativeExpression (PLUS multiplicativeExpression | MINUS multiplicativeExpression | (numericLiteralPositive | numericLiteralNegative) 
        //                            (ASTERISK unaryExpression | DIVIDE unaryExpression)?)*

        boolean first = true;

        ST additiveExpression = g.getInstanceOf("additiveExpression");

        for (ParseTree c : ctx.children) {
            if (c instanceof ParseTree.TerminalNode) {
                ParseTree.TerminalNode t = (ParseTree.TerminalNode) c;
                Token to = (Token) (t.getSymbol());
                if (to.getType() == SparqlParser.PLUS || to.getType() == SparqlParser.MINUS) {
                    additiveExpression.add("additiveOperator", ((Token) (t.getSymbol())).getText());
                } else if (to.getType() == SparqlParser.ASTERISK || to.getType() == SparqlParser.DIVIDE) {
                    additiveExpression.add("multiplicativeOperator", ((Token) (t.getSymbol())).getText());
                }
            } else if (c instanceof SparqlParser.MultiplicativeExpressionContext) {
                if (first) {
                    first = false;
                    additiveExpression.add("multiplicativeExpression", visitMultiplicativeExpression((SparqlParser.MultiplicativeExpressionContext) c));
                } else {
                    additiveExpression.add("multiplicand", visitMultiplicativeExpression((SparqlParser.MultiplicativeExpressionContext) c));
                }
            } else if (c instanceof SparqlParser.NumericLiteralPositiveContext) {
                additiveExpression.add("numericLiteral", visitNumericLiteralPositive((SparqlParser.NumericLiteralPositiveContext) c));
            } else if (c instanceof SparqlParser.NumericLiteralNegativeContext) {
                additiveExpression.add("numericLiteral", visitNumericLiteralNegative((SparqlParser.NumericLiteralNegativeContext) c));
            } else if (c instanceof SparqlParser.UnaryExpressionContext) {
                additiveExpression.add("unaryExpression", visitUnaryExpression((SparqlParser.UnaryExpressionContext) c));
            }
        }

        return additiveExpression;
    }

    @Override
    public ST visitMultiplicativeExpression(SparqlParser.MultiplicativeExpressionContext ctx) {
        // multiplicativeExpression :
        //   unaryExpression (ASTERISK unaryExpression | DIVIDE unaryExpression)*        

        ST multiplicativeExpression = g.getInstanceOf("multiplicativeExpression");

        for (ParseTree c : ctx.children) {
            if (c instanceof ParseTree.TerminalNode) {
                ParseTree.TerminalNode t = (ParseTree.TerminalNode) c;
                multiplicativeExpression.add("operator", ((Token) (t.getSymbol())).getText());
            } else if (c instanceof SparqlParser.UnaryExpressionContext) {
                multiplicativeExpression.add("unaryExpression", visitUnaryExpression((SparqlParser.UnaryExpressionContext) c));
            }
        }

        return multiplicativeExpression;
    }

    @Override
    public ST visitUnaryExpression(SparqlParser.UnaryExpressionContext ctx) {
        // unaryExpression :
        //   NEGATION primaryExpression
        // | PLUS primaryExpression
        // | MINUS primaryExpression
        // | primaryExpression

        ST unaryExpression = g.getInstanceOf("unaryExpression");

        if (ctx.NEGATION() != null) {
            unaryExpression.add("operator", ctx.NEGATION().getSymbol().getText());
        } else if (ctx.PLUS() != null) {
            unaryExpression.add("operator", ctx.PLUS().getSymbol().getText());
        } else if (ctx.MINUS() != null) {
            unaryExpression.add("operator", ctx.MINUS().getSymbol().getText());
        }

        if (ctx.primaryExpression() != null) {
            unaryExpression.add("primaryExpression", visitPrimaryExpression(ctx.primaryExpression()));
        }

        return unaryExpression;
    }

    @Override
    public ST visitPrimaryExpression(SparqlParser.PrimaryExpressionContext ctx) {
        // primaryExpression :
        //   brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate

        ST primaryExpression = g.getInstanceOf("primaryExpression");

        if (ctx.brackettedExpression() != null) {
            primaryExpression.add("brackettedExpression", visitBrackettedExpression(ctx.brackettedExpression()));
        } else if (ctx.builtInCall() != null) {
            primaryExpression.add("builtInCall", visitBuiltInCall(ctx.builtInCall()));
        } else if (ctx.iriRefOrFunction() != null) {
            primaryExpression.add("iriRefOrFunction", visitIriRefOrFunction(ctx.iriRefOrFunction()));
        } else if (ctx.rdfLiteral() != null) {
            primaryExpression.add("rdfLiteral", visitRdfLiteral(ctx.rdfLiteral()));
        } else if (ctx.numericLiteral() != null) {
            primaryExpression.add("numericLiteral", visitNumericLiteral(ctx.numericLiteral()));
        } else if (ctx.booleanLiteral() != null) {
            primaryExpression.add("booleanLiteral", visitBooleanLiteral(ctx.booleanLiteral()));
        } else if (ctx.var() != null) {
            primaryExpression.add("var", visitVar(ctx.var()));
        } else if (ctx.aggregate() != null) {
            primaryExpression.add("aggregate", visitAggregate(ctx.aggregate()));
        }

        return primaryExpression;
    }

    @Override
    public ST visitBrackettedExpression(SparqlParser.BrackettedExpressionContext ctx) {
        // brackettedExpression :
        //   OPEN_BRACE expression CLOSE_BRACE

        ST brackettedExpression = g.getInstanceOf("brackettedExpression");

        brackettedExpression.add("expression", visitExpression(ctx.expression()));

        return brackettedExpression;
    }

    @Override
    public ST visitBuiltInCall(SparqlParser.BuiltInCallContext ctx) {
        // builtInCall :
        //   STR OPEN_BRACE expression CLOSE_BRACE
        //   | LANG OPEN_BRACE expression CLOSE_BRACE
        //   | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | DATATYPE OPEN_BRACE expression CLOSE_BRACE
        //   | BOUND OPEN_BRACE var CLOSE_BRACE
        //   | IRI OPEN_BRACE expression CLOSE_BRACE
        //   | URI OPEN_BRACE expression CLOSE_BRACE
        //   | BNODE OPEN_BRACE expression CLOSE_BRACE
        //   | BNODE nil
        //   | RAND nil
        //   | ABS OPEN_BRACE expression CLOSE_BRACE
        //   | CEIL OPEN_BRACE expression CLOSE_BRACE
        //   | FLOOR OPEN_BRACE expression CLOSE_BRACE
        //   | ROUND OPEN_BRACE expression CLOSE_BRACE
        //   | CONCAT expressionList
        //   | subStringExpression
        //   | strReplaceExpression
        //   | STRLEN OPEN_BRACE expression CLOSE_BRACE
        //   | UCASE OPEN_BRACE expression CLOSE_BRACE
        //   | LCASE OPEN_BRACE expression CLOSE_BRACE
        //   | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE
        //   | CONTAINS OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | STRSTARTS OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | STRENDS OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | STRBEFORE OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | STRAFTER OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | YEAR OPEN_BRACE expression CLOSE_BRACE
        //   | MONTH OPEN_BRACE expression CLOSE_BRACE
        //   | DAY OPEN_BRACE expression CLOSE_BRACE
        //   | HOURS OPEN_BRACE expression CLOSE_BRACE
        //   | MINUTES OPEN_BRACE expression CLOSE_BRACE
        //   | SECONDS OPEN_BRACE expression CLOSE_BRACE
        //   | TIMEZONE OPEN_BRACE expression CLOSE_BRACE
        //   | TZ OPEN_BRACE expression CLOSE_BRACE
        //   | NOW nil
        //   | MD5 OPEN_BRACE expression CLOSE_BRACE
        //   | SHA1 OPEN_BRACE expression CLOSE_BRACE
        //   | SHA256 OPEN_BRACE expression CLOSE_BRACE
        //   | SHA384 OPEN_BRACE expression CLOSE_BRACE
        //   | SHA512 OPEN_BRACE expression CLOSE_BRACE
        //   | COALESCE expressionList
        //   | IF OPEN_BRACE e1=expression COMMA e2=expression COMMA e3=expression CLOSE_BRACE
        //   | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE
        //   | ISIRI OPEN_BRACE expression CLOSE_BRACE
        //   | ISURI OPEN_BRACE expression CLOSE_BRACE
        //   | ISBLANK OPEN_BRACE expression CLOSE_BRACE
        //   | ISLITERAL OPEN_BRACE expression CLOSE_BRACE
        //   | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE
        //   | regexExpression
        //   | existsFunction
        //   | notExistsFunction

        ST builtInCall = g.getInstanceOf("builtInCall");

        if (ctx.STR() != null) {
            builtInCall.add("builtInFunction", ctx.STR().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.LANG() != null) {
            builtInCall.add("builtInFunction", ctx.LANG().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.LANGMATCHES() != null) {
            builtInCall.add("builtInFunction", ctx.LANGMATCHES().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.DATATYPE() != null) {
            builtInCall.add("builtInFunction", ctx.DATATYPE().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.BOUND() != null) {
            builtInCall.add("builtInFunction", ctx.BOUND().getSymbol().getText().toUpperCase());
            builtInCall.add("var", visitVar((SparqlParser.VarContext) ctx.var()));
        } else if (ctx.IRI() != null) {
            builtInCall.add("builtInFunction", ctx.IRI().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.URI() != null) {
            builtInCall.add("builtInFunction", ctx.URI().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.BNODE() != null) {
            builtInCall.add("builtInFunction", ctx.BNODE().getSymbol().getText().toUpperCase());
            if (ctx.expression(0) != null) {
                builtInCall.add("expression", visitExpression(ctx.expression(0)));
            }
        } else if (ctx.RAND() != null) {
            builtInCall.add("builtInFunction", ctx.RAND().getSymbol().getText().toUpperCase());
        } else if (ctx.ABS() != null) {
            builtInCall.add("builtInFunction", ctx.ABS().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.CEIL() != null) {
            builtInCall.add("builtInFunction", ctx.CEIL().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.FLOOR() != null) {
            builtInCall.add("builtInFunction", ctx.FLOOR().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.ROUND() != null) {
            builtInCall.add("builtInFunction", ctx.ROUND().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.CONCAT() != null) {
            builtInCall.add("builtInFunction", ctx.CONCAT().getSymbol().getText().toUpperCase());
            builtInCall.add("expressionList", visitExpressionList(ctx.expressionList()));
        } else if (ctx.STRLEN() != null) {
            builtInCall.add("builtInFunction", ctx.STRLEN().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.UCASE() != null) {
            builtInCall.add("builtInFunction", ctx.UCASE().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.LCASE() != null) {
            builtInCall.add("builtInFunction", ctx.LCASE().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.ENCODE_FOR_URI() != null) {
            builtInCall.add("builtInFunction", ctx.ENCODE_FOR_URI().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.CONTAINS() != null) {
            builtInCall.add("builtInFunction", ctx.CONTAINS().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.STRSTARTS() != null) {
            builtInCall.add("builtInFunction", ctx.STRSTARTS().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.STRENDS() != null) {
            builtInCall.add("builtInFunction", ctx.STRENDS().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.STRBEFORE() != null) {
            builtInCall.add("builtInFunction", ctx.STRBEFORE().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.STRAFTER() != null) {
            builtInCall.add("builtInFunction", ctx.STRAFTER().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.YEAR() != null) {
            builtInCall.add("builtInFunction", ctx.YEAR().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.MONTH() != null) {
            builtInCall.add("builtInFunction", ctx.MONTH().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.DAY() != null) {
            builtInCall.add("builtInFunction", ctx.DAY().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.HOURS() != null) {
            builtInCall.add("builtInFunction", ctx.HOURS().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.MINUTES() != null) {
            builtInCall.add("builtInFunction", ctx.MINUTES().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.SECONDS() != null) {
            builtInCall.add("builtInFunction", ctx.SECONDS().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.TIMEZONE() != null) {
            builtInCall.add("builtInFunction", ctx.TIMEZONE().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.TZ() != null) {
            builtInCall.add("builtInFunction", ctx.TZ().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.NOW() != null) {
            builtInCall.add("builtInFunction", ctx.NOW().getSymbol().getText().toUpperCase());
        } else if (ctx.MD5() != null) {
            builtInCall.add("builtInFunction", ctx.MD5().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.SHA1() != null) {
            builtInCall.add("builtInFunction", ctx.SHA1().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.SHA256() != null) {
            builtInCall.add("builtInFunction", ctx.SHA256().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.SHA384() != null) {
            builtInCall.add("builtInFunction", ctx.SHA384().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.SHA512() != null) {
            builtInCall.add("builtInFunction", ctx.SHA512().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.COALESCE() != null) {
            builtInCall.add("builtInFunction", ctx.COALESCE().getSymbol().getText().toUpperCase());
            builtInCall.add("expressionList", visitExpressionList(ctx.expressionList()));
        } else if (ctx.IF() != null) {
            builtInCall.add("builtInFunction", ctx.IF().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
            builtInCall.add("expression", visitExpression(ctx.expression(2)));
        } else if (ctx.STRLANG() != null) {
            builtInCall.add("builtInFunction", ctx.STRLANG().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.STRDT() != null) {
            builtInCall.add("builtInFunction", ctx.STRDT().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.SAMETERM() != null) {
            builtInCall.add("builtInFunction", ctx.SAMETERM().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
            builtInCall.add("expression", visitExpression(ctx.expression(1)));
        } else if (ctx.ISIRI() != null) {
            builtInCall.add("builtInFunction", ctx.ISIRI().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.ISURI() != null) {
            builtInCall.add("builtInFunction", ctx.ISURI().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.ISBLANK() != null) {
            builtInCall.add("builtInFunction", ctx.ISBLANK().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.ISLITERAL() != null) {
            builtInCall.add("builtInFunction", ctx.ISLITERAL().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.ISNUMERIC() != null) {
            builtInCall.add("builtInFunction", ctx.ISNUMERIC().getSymbol().getText().toUpperCase());
            builtInCall.add("expression", visitExpression(ctx.expression(0)));
        } else if (ctx.subStringExpression() != null) {
            builtInCall.add("subStringExpression", visitSubStringExpression(ctx.subStringExpression()));
        } else if (ctx.strReplaceExpression() != null) {
            builtInCall.add("strReplaceExpression", visitStrReplaceExpression(ctx.strReplaceExpression()));
        } else if (ctx.regexExpression() != null) {
            builtInCall.add("regexExpression", visitRegexExpression(ctx.regexExpression()));
        } else if (ctx.existsFunction() != null) {
            builtInCall.add("existsFunction", visitExistsFunction(ctx.existsFunction()));
        } else if (ctx.notExistsFunction() != null) {
            builtInCall.add("notExistsFunction", visitNotExistsFunction(ctx.notExistsFunction()));
        }

        return builtInCall;
    }

    @Override
    public ST visitRegexExpression(SparqlParser.RegexExpressionContext ctx) {
        // regexExpression :
        //   REGEX OPEN_BRACE expression COMMA expression (COMMA expression)? CLOSE_BRACE

        ST regexExpression = g.getInstanceOf("regexExpression");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ExpressionContext) {
                regexExpression.add("expression", visitExpression((SparqlParser.ExpressionContext) c));
            }
        }

        return regexExpression;
    }

    @Override
    public ST visitSubStringExpression(SparqlParser.SubStringExpressionContext ctx) {
        // subStringExpression :
        //   SUBSTR OPEN_BRACE expression COMMA expression (COMMA expression)? CLOSE_BRACE

        ST subStringExpression = g.getInstanceOf("subStringExpression");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ExpressionContext) {
                subStringExpression.add("expression", visitExpression((SparqlParser.ExpressionContext) c));
            }
        }

        return subStringExpression;
    }

    @Override
    public ST visitStrReplaceExpression(SparqlParser.StrReplaceExpressionContext ctx) {
        // strReplaceExpression :
        //   REPLACE OPEN_BRACE expression COMMA expression COMMA expression (COMMA expression)? CLOSE_BRACE

        ST strReplaceExpression = g.getInstanceOf("strReplaceExpression");

        for (ParseTree c : ctx.children) {
            if (c instanceof SparqlParser.ExpressionContext) {
                strReplaceExpression.add("expression", visitExpression((SparqlParser.ExpressionContext) c));
            }
        }

        return strReplaceExpression;
    }

    @Override
    public ST visitExistsFunction(SparqlParser.ExistsFunctionContext ctx) {
        // existsFunction :
        //   EXISTS groupGraphPattern

        ST existsFunction = g.getInstanceOf("existsFunction");

        existsFunction.add("groupGraphPattern", visitGroupGraphPattern(ctx.groupGraphPattern()));

        return existsFunction;
    }

    @Override
    public ST visitNotExistsFunction(SparqlParser.NotExistsFunctionContext ctx) {
        // notExistsFunction :
        //   NOT EXISTS groupGraphPattern

        ST notExistsFunction = g.getInstanceOf("notExistsFunction");

        notExistsFunction.add("groupGraphPattern", visitGroupGraphPattern(ctx.groupGraphPattern()));

        return notExistsFunction;
    }

    @Override
    public ST visitAggregate(SparqlParser.AggregateContext ctx) {
        // aggregate :
        //    COUNT OPEN_BRACE DISTINCT? (ASTERISK | expression) CLOSE_BRACE
        //  | SUM OPEN_BRACE DISTINCT? expression CLOSE_BRACE
        //  | MIN OPEN_BRACE DISTINCT? expression CLOSE_BRACE
        //  | MAX OPEN_BRACE DISTINCT? expression CLOSE_BRACE
        //  | AVG OPEN_BRACE DISTINCT? expression CLOSE_BRACE
        //  | SAMPLE OPEN_BRACE DISTINCT? expression CLOSE_BRACE
        //  | GROUP_CONCAT OPEN_BRACE DISTINCT? expression (SEMICOLON SEPARATOR EQUAL string)? CLOSE_BRACE

        ST aggregate = g.getInstanceOf("aggregate");

        if (ctx.COUNT() != null) {
            aggregate.add("operation", ctx.COUNT().getSymbol().getText().toUpperCase());
            if (ctx.DISTINCT() != null) {
                aggregate.add("attribute", ctx.DISTINCT().getSymbol().getText().toUpperCase());
            }
            if (ctx.ASTERISK() != null) {
                aggregate.add("whatever", ctx.ASTERISK().getSymbol().getText());
            } else if (ctx.expression() != null) {
                aggregate.add("expression", visitExpression(ctx.expression()));
            }
        } else if (ctx.SUM() != null) {
            aggregate.add("operation", ctx.SUM().getSymbol().getText().toUpperCase());
            if (ctx.DISTINCT() != null) {
                aggregate.add("attribute", ctx.DISTINCT().getSymbol().getText().toUpperCase());
            }
            aggregate.add("expression", visitExpression(ctx.expression()));
        } else if (ctx.MIN() != null) {
            aggregate.add("operation", ctx.MIN().getSymbol().getText().toUpperCase());
            if (ctx.DISTINCT() != null) {
                aggregate.add("attribute", ctx.DISTINCT().getSymbol().getText().toUpperCase());
            }
            aggregate.add("expression", visitExpression(ctx.expression()));
        } else if (ctx.MAX() != null) {
            aggregate.add("operation", ctx.MAX().getSymbol().getText().toUpperCase());
            if (ctx.DISTINCT() != null) {
                aggregate.add("attribute", ctx.DISTINCT().getSymbol().getText().toUpperCase());
            }
            aggregate.add("expression", visitExpression(ctx.expression()));
        } else if (ctx.AVG() != null) {
            aggregate.add("operation", ctx.AVG().getSymbol().getText().toUpperCase());
            if (ctx.DISTINCT() != null) {
                aggregate.add("attribute", ctx.DISTINCT().getSymbol().getText().toUpperCase());
            }
            aggregate.add("expression", visitExpression(ctx.expression()));
        } else if (ctx.SAMPLE() != null) {
            aggregate.add("operation", ctx.SAMPLE().getSymbol().getText().toUpperCase());
            if (ctx.DISTINCT() != null) {
                aggregate.add("attribute", ctx.DISTINCT().getSymbol().getText().toUpperCase());
            }
            aggregate.add("expression", visitExpression(ctx.expression()));
        } else if (ctx.GROUP_CONCAT() != null) {
            aggregate.add("operation", ctx.GROUP_CONCAT().getSymbol().getText().toUpperCase());
            if (ctx.DISTINCT() != null) {
                aggregate.add("attribute", ctx.DISTINCT().getSymbol().getText().toUpperCase());
            }
            aggregate.add("expression", visitExpression(ctx.expression()));
            if (ctx.string() != null) {
                aggregate.add("string", visitString(ctx.string()));
            }
        }

        return aggregate;
    }

    @Override
    public ST visitIriRefOrFunction(SparqlParser.IriRefOrFunctionContext ctx) {
        // iriRefOrFunction :
        //   iriRef argList?

        ST iriRefOrFunction = g.getInstanceOf("iriRefOrFunction");

        iriRefOrFunction.add("iriRef", visitIriRef(ctx.iriRef()));

        if (ctx.argList() != null) {
            iriRefOrFunction.add("argList", visitArgList(ctx.argList()));
        }

        return iriRefOrFunction;
    }

    @Override
    public ST visitRdfLiteral(SparqlParser.RdfLiteralContext ctx) {
        // rdfLiteral :
        //   string (LANGTAG | (REFERENCE iriRef))?

        ST rdfLiteral = g.getInstanceOf("rdfLiteral");

        rdfLiteral.add("string", visitString(ctx.string()));

        if (ctx.LANGTAG() != null) {
            rdfLiteral.add("langTag", ctx.LANGTAG().getSymbol().getText());
        } else if (ctx.iriRef() != null) {
            rdfLiteral.add("iriRef", visitIriRef(ctx.iriRef()));
        }

        return rdfLiteral;
    }

    @Override
    public ST visitNumericLiteral(SparqlParser.NumericLiteralContext ctx) {
        // numericLiteral :
        //   numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative

        ST numericLiteral = g.getInstanceOf("numericLiteral");

        if (ctx.numericLiteralUnsigned() != null) {
            numericLiteral.add("numericLiteralUnsigned", visitNumericLiteralUnsigned(ctx.numericLiteralUnsigned()));
        } else if (ctx.numericLiteralPositive() != null) {
            numericLiteral.add("numericLiteralPositive", visitNumericLiteralPositive(ctx.numericLiteralPositive()));
        } else if (ctx.numericLiteralNegative() != null) {
            numericLiteral.add("numericLiteralPositive", visitNumericLiteralNegative(ctx.numericLiteralNegative()));
        }

        return numericLiteral;
    }

    @Override
    public ST visitNumericLiteralUnsigned(SparqlParser.NumericLiteralUnsignedContext ctx) {
        // numericLiteralUnsigned :
        //  INTEGER | DECIMAL | DOUBLE

        ST numericLiteralUnsigned = g.getInstanceOf("numericLiteralUnsigned");

        if (ctx.INTEGER() != null) {
            numericLiteralUnsigned.add("value", ctx.INTEGER().getSymbol().getText());
        } else if (ctx.DECIMAL() != null) {
            numericLiteralUnsigned.add("value", ctx.DECIMAL().getSymbol().getText());
        } else if (ctx.DOUBLE() != null) {
            numericLiteralUnsigned.add("value", ctx.DOUBLE().getSymbol().getText());
        }

        return numericLiteralUnsigned;
    }

    @Override
    public ST visitNumericLiteralPositive(SparqlParser.NumericLiteralPositiveContext ctx) {
        // numericLiteralPositive :
        //   INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE

        ST numericLiteralPositive = g.getInstanceOf("numericLiteralPositive");

        if (ctx.INTEGER_POSITIVE() != null) {
            numericLiteralPositive.add("value", ctx.INTEGER_POSITIVE().getSymbol().getText());
        } else if (ctx.DECIMAL_POSITIVE() != null) {
            numericLiteralPositive.add("value", ctx.DECIMAL_POSITIVE().getSymbol().getText());
        } else if (ctx.DOUBLE_POSITIVE() != null) {
            numericLiteralPositive.add("value", ctx.DOUBLE_POSITIVE().getSymbol().getText());
        }

        return numericLiteralPositive;
    }

    @Override
    public ST visitNumericLiteralNegative(SparqlParser.NumericLiteralNegativeContext ctx) {
        // numericLiteralNegative :
        //   INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE

        ST numericLiteralNegative = g.getInstanceOf("numericLiteralNegative");

        if (ctx.INTEGER_NEGATIVE() != null) {
            numericLiteralNegative.add("value", ctx.INTEGER_NEGATIVE().getSymbol().getText());
        } else if (ctx.DECIMAL_NEGATIVE() != null) {
            numericLiteralNegative.add("value", ctx.DECIMAL_NEGATIVE().getSymbol().getText());
        } else if (ctx.DOUBLE_NEGATIVE() != null) {
            numericLiteralNegative.add("value", ctx.DOUBLE_NEGATIVE().getSymbol().getText());
        }

        return numericLiteralNegative;
    }

    @Override
    public ST visitBooleanLiteral(SparqlParser.BooleanLiteralContext ctx) {
        // booleanLiteral :
        //   TRUE | FALSE

        ST booleanLiteral = g.getInstanceOf("booleanLiteral");

        if (ctx.TRUE() != null) {
            booleanLiteral.add("value", ctx.TRUE().getSymbol().getText().toUpperCase());
        } else if (ctx.FALSE() != null) {
            booleanLiteral.add("value", ctx.FALSE().getSymbol().getText().toUpperCase());
        }

        return booleanLiteral;
    }

    @Override
    public ST visitString(SparqlParser.StringContext ctx) {
        // string :
        //   STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2

        ST string = g.getInstanceOf("string");

        if (ctx.STRING_LITERAL1() != null) {
            string.add("value", ctx.STRING_LITERAL1().getSymbol().getText());
        } else if (ctx.STRING_LITERAL2() != null) {
            string.add("value", ctx.STRING_LITERAL2().getSymbol().getText());
        } else if (ctx.STRING_LITERAL_LONG1() != null) {
            string.add("value", ctx.STRING_LITERAL_LONG1().getSymbol().getText());
        } else if (ctx.STRING_LITERAL_LONG2() != null) {
            string.add("value", ctx.STRING_LITERAL_LONG2().getSymbol().getText());
        }

        return string;
    }

    @Override
    public ST visitIriRef(SparqlParser.IriRefContext ctx) {
        // iriRef :
        //   IRI_REF | prefixedName

        ST iriRef = g.getInstanceOf("iriRef");

        if (ctx.IRI_REF() != null) {
            String s = ctx.IRI_REF().getSymbol().getText();
            iriRef.add("value", s.substring(1, s.length() - 1));
        } else if (ctx.prefixedName() != null) {
            iriRef.add("prefixedName", visitPrefixedName(ctx.prefixedName()));
        }

        return iriRef;
    }

    @Override
    public ST visitPrefixedName(SparqlParser.PrefixedNameContext ctx) {
        // prefixedName :
        //   PNAME_LN | PNAME_NS

        ST prefixedName = g.getInstanceOf("prefixedName");

        if (ctx.PNAME_LN() != null) {
            prefixedName.add("value", ctx.PNAME_LN().getSymbol().getText());
        } else if (ctx.PNAME_NS() != null) {
            prefixedName.add("value", ctx.PNAME_NS().getSymbol().getText());
        }

        return prefixedName;
    }

    @Override
    public ST visitBlankNode(SparqlParser.BlankNodeContext ctx) {
        // blankNode :
        //   BLANK_NODE_LABEL | anon

        ST blankNode = g.getInstanceOf("blankNode");

        if (ctx.BLANK_NODE_LABEL() != null) {
            blankNode.add("value", ctx.BLANK_NODE_LABEL().getSymbol().getText());
        } else if (ctx.anon() != null) {
            blankNode.add("anon", visitAnon(ctx.anon()));
        }

        return blankNode;
    }

    @Override
    public ST visitAnon(SparqlParser.AnonContext ctx) {
        // anon :
        //   OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET

        ST anon = g.getInstanceOf("anon");

        return anon;
    }
}
