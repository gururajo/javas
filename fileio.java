//this is useless #useless

import java.io.*;
import java.util.Scanner;

public class fileio {
    static Scanner sc;

    static void displayFile(RandomAccessFile r) throws IOException {
        int i;
        while ((i = r.read()) != -1) {
            System.out.print((char) i);
        }

    }

    static void copyFile(RandomAccessFile f1, RandomAccessFile f2) throws IOException {
        int i;
        while ((i = f1.read()) != -1) {
            f2.write((char) i);
        }

    }

    static void appendFile(RandomAccessFile f1) throws IOException {
        f1.seek(f1.length());
        sc = new Scanner(System.in);
        int i;
        while ((i = sc.nextByte()) != -1) {
            f1.write((char) i);
        }

    }

    static void appendFile(RandomAccessFile f1, RandomAccessFile f2) throws IOException {
        f2.seek(f2.length());
        f1.seek(0);
        int i;
        while ((i = f1.read()) != -1) {
            f2.write((char) i);
        }

    }

    static void writeFile(RandomAccessFile f) throws IOException {
        int i;

        while ((i = System.in.read()) != 4) {
            f.write((char) i);
        }
    }

    public static void main(String args[]) throws IOException {
        RandomAccessFile f0 = null;
        RandomAccessFile f1 = null;
        RandomAccessFile f2 = null;
        f0 = new RandomAccessFile("hello.txt", "rw");
        System.out.println("give the file data");
        f0.seek(0);
        writeFile(f0);
        f1 = new RandomAccessFile("hello2.txt", "rw");
        System.out.println("give the another file data");
        f1.seek(0);
        writeFile(f1);
        f2 = new RandomAccessFile("hello3", "rw");
        f0.seek(0);
        f1.seek(0);
        f2.seek(0);
        copyFile(f0, f2);
        f0.seek(0);
        f1.seek(0);
        f2.seek(0);
        appendFile(f1, f2);
        f0.seek(0);
        f1.seek(0);
        f2.seek(0);
        displayFile(f0);
        displayFile(f1);
        displayFile(f2);

    }
}