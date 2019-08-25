package com.javarush.task.task18.task1814;

import java.io.*;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    FileOutputStream original;

    public TxtInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public TxtInputStream(String fileName) throws Exception {


        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public TxtInputStream(FileDescriptor fdObj) {
        super(fdObj);
    }


    public static void main(String[] args) {
    }
}

