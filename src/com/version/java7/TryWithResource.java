package com.version.java7;

import java.io.*;

public class TryWithResource {
    public static void main(String[] args)   {
        try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
            String st;
            while((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (IOException fe){
            fe.printStackTrace();
        }
    }
}
