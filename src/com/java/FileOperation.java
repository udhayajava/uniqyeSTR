package com.java;

import java.io.*;
import java.io.IOException;
import java.util.*;

 public class FileOperation implements Run {
    public java.io.File file1,file2; //attribute
    public String filename1,filename2;
    public String lines1,lines2;
    @Override
    public void FileWrite() {
        System.out.println("Enter the file content " +
                "\n(Press1)====>Automatically Generate The character and copied it in the file " +
               "\n(Press2)====>For Manually Type The string and find the unique ");
            Scanner input1=new Scanner(System.in);
            int button= input1.nextInt();
            switch (button){
                case 1:{

                    this.filename1 = "";
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Name Your File2");
                    this.filename1 = scan.nextLine();
                    String directory = System.getProperty("user.dir");
                    String path;
                    path = directory + File.separator + filename1;
                    System.out.println("Filepath is " + path);
                    this.file1 = new File(path);
                    boolean result1;
                  try{  result1=file1.createNewFile();
                      if(result1) {
                          System.out.println("File Generated Successfully" + file1.getCanonicalPath());
                      }
                      UniqueString uqStr =new UniqueString();
                      uqStr.FileHandling();uqStr.uniqueStr();
                  }catch(IOException exception) {
                      System.out.println("File Not Created!!!");
                  }

                  }


                case 2:
                {{
                        this.filename2 = "";
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Name Your File2");
                        this.filename2 = scan.nextLine();
                        String directory = System.getProperty("user.dir");
                        String path;
                        path = directory + File.separator + filename1;
                        System.out.println("Filepath is " + path);
                        this.file2 = new File(path);
                        boolean result2;
                        try {
                            result2 = file2.createNewFile();//*creates a new file....
                            if (result2)                   //test if successfully created a new file
                            {
                                System.out.println("file created" + file2.getCanonicalPath());
                            } else {
                                System.out.println("file already exist at location:" + file2.getCanonicalPath());
                            }
                        } catch (IOException file_creation) {
                            file_creation.printStackTrace();
                        }}
                    try {
                    FileWriter fileWriter = new FileWriter(file2);
                    BufferedWriter bw = new BufferedWriter(fileWriter);
                    Scanner input = new Scanner(System.in);
                    this.lines2 = "";
                    System.out.println("Enter the content");
                    {
                        for(int count=0;count<10;count++)
                    {
                        lines2 = input.nextLine();
                        bw.write(lines2);
                        bw.newLine();}
                    bw.flush();
                    bw.close();
                    }
                }catch (Exception exception) {
                        System.out.println("!!!Can't write");
                    }}
                break;
                default:
                    System.out.println("Invalid key run it again");}
            }


    @Override
    public void FileRead() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(this.file1));
            Iterator iterator = reader.lines().iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();}}

     @Override
     public void printUnique() {
         {
             System.out.println("Enter the sentence");
             if(lines1.matches("^[a-zA-Z ]*$"))
             {
                 int flag=0;
                 char c[]=lines1.toLowerCase().toCharArray();

                 for(int i=0;i<lines1.length();i++)
                 {
                     int count=0;

                     if(c[i]==' ')
                     {
                         continue;
                     }
                     for(int j=0;j<lines1.length();j++) {
                         if(c[i]==c[j]) {
                             count++;
                         }}
                     if(count<2) {
                         flag=1;
                     }}
                 if(flag==0) {
                     System.out.println("No unique characters");
                 }
                 if(flag==1) {
                     System.out.println("Unique characters are");
                     for(int i=0;i<lines1.length();i++) {
                         int count=0;
                         if(c[i]==' ') {

                             continue;}
                         for(int j=0;j<lines1.length();j++)
                         {
                             if(c[i]==c[j]) {
                                 count++;
                             }
                         }
                         if(count<2) {
                             System.out.println("The unique characters are  =====>  "+c[i]);
                         }
                     }
                 }
             }
         }
     }}