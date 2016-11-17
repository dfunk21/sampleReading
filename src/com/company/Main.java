package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("myData.txt"));
        //opens file

        int maxIndex = -1;
        String text[] = new String[1000];

        while(sc.hasNext())
        {
            maxIndex++;
            text[maxIndex] = sc.nextLine();
        }
        sc.close();
        //closes file
        for (int j=0; j <= maxIndex; j++)
        {
            System.out.println(text[j]);
        }

        //Creates new file (output)
        FileWriter fw = new FileWriter("output.txt", true); //file already created, just append information
        PrintWriter pw = new PrintWriter(fw);

        pw.println("Yo what up!");
        pw.print(1);


        Scanner kb = new Scanner (System.in);
        System.out.println("What's your password");
        String password = kb.nextLine();
        pw.println(password);
        pw.close();
        fw.close();



    }
}
