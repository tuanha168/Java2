package com.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "Test";
        readFiles(path);
        for (var s : files) {
            System.out.println(s);
        }
        readContent("test/tc1.txt");
    }

    static ArrayList<String> files = new ArrayList<>();

    public static void readFiles(String path) {
        File file = new File(path);
        var listFiles = file.listFiles();
        for (var f : listFiles) {
            if (f.isFile()) {
                files.add(f.getName());

            } else {
                readFiles(f.getPath());
            }
        }
    }

    public static void readContent(String file)  {
        try (FileInputStream fis = new FileInputStream(file);) {
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    long giaithua(int n) {
        //n!=1*2*3*....*n =(n-1)!*n
        if (n == 0) return 1;

        return giaithua(n - 1) * n;
    }
}
