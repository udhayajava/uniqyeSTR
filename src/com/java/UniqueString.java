package com.java;

import java.io.*;
import java.security.SecureRandom;
import java.util.*;

public class UniqueString extends FileOperation {
    static final String SOURCE = "0123456789"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
    static SecureRandom secureRnd = new SecureRandom();
    public void FileHandling(){

         try {
            FileWriter fileWriter = new FileWriter(file2);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            Scanner input = new Scanner(System.in);
            this.lines2 = "";
        } catch (IOException exception) {
            System.out.println("File not Found exception ");
        }
    }

    public void uniqueStr() {
        System.out.println("5 random alphanumeric string with length 10");
        for (int i = 0; i < 5; i++) {
            String alpha = randomString(10);
            System.out.println(alpha); }
        System.out.println("5 random alphanumeric string with length 12");
        for (int i = 0; i < 5; i++) {
            String beta = randomString(10);
            System.out.println(beta); }
        System.out.println("5 random alphanumeric string with length 20" + " generated using Apache Commons lang");
        for (int i = 0; i < 5; i++) {
            String random = randomString(120).toUpperCase();
            System.out.println(random); }
    } public static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length())));
        return sb.toString(); }

    }
