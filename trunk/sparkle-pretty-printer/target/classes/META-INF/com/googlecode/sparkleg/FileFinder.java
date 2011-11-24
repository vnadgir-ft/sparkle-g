package com.googlecode.sparkleg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FileFinder {
   public static void main(String[] args) {
        String path = new File(args[0]).getAbsolutePath();
        System.out.println("Looking in path: " + path);
        FileFinder ff = new FileFinder();
        List<File> files = ff.find(path, ".rq", ".ru");
        System.out.printf( "Found %d file%s%n", files.size(), (files.size() == 1 ? "." : "s.") );
        for (File f : files) {
            System.out.printf(f.getAbsolutePath());
        }
    }

    public List<File> find(String start, String... extensions) {
        final List<File> files = new ArrayList<File>(1024);
        final Stack<File> dirs = new Stack<File>();
        final File startdir = new File(start);
        if (startdir.isDirectory()) {
            dirs.push(startdir);
        }
        while (dirs.size() > 0) {
            for (File file : dirs.pop().listFiles()) {
                if (file.isDirectory()) {
                    dirs.push(file);
                } else if (match(file.getName(), extensions)) {
                    files.add(file);
                }
            }
        }
        return files;
    }

    private static boolean match(String s, String... suffixes) {
        for (String suffix : suffixes) {
            if (s.length() >= suffix.length() && s.substring(s.length()-suffix.length(), s.length()).equalsIgnoreCase(suffix) ) {
            	return (!s.matches("(?i).*-fail.*") && !s.matches("(?i).*-bad.*"));
            }
        }
        return false;
    }
}