package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;

/*
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream original;

    public AmigoOutputStream(FileOutputStream original) throws Exception {
        super(fileName);
        this.original = original;

    }
    public AmigoOutputStream(FileOutputStream original, String name) throws FileNotFoundException {
        super(name);
        this.original = original;
    }

    public AmigoOutputStream( FileOutputStream original, String name, boolean append) throws FileNotFoundException {
        super(name, append);
        this.original = original;
    }

    public AmigoOutputStream(FileOutputStream original, File file) throws FileNotFoundException {
        super(file);
        this.original = original;
    }

    public AmigoOutputStream(FileOutputStream original, File file, boolean append) throws FileNotFoundException {
        super(file, append);
        this.original = original;
    }

    public AmigoOutputStream(FileOutputStream original,FileDescriptor fdObj) {
        super(fdObj);
        this.original = original;
    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public FileChannel getChannel() {
        return original.getChannel();
    }

    @Override
    public void close() throws IOException {
        flush();
        String str = "JavaRush © All rights reserved.";
        byte[] bytes = str.getBytes();
        original.write(bytes);
        original.close();

    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public int hashCode() {
        return original.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return original.equals(obj);
    }

    @Override
    public String toString() {
        return original.toString();
    }

    public static void main(String[] args) throws Exception {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
