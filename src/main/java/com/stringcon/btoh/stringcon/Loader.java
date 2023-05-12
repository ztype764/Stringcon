package com.stringcon.btoh.stringcon;

import java.util.Scanner;

public class Loader{
    public static void main(String[] args) {
        out();
    }
    private static void out(){
        Scanner s = new Scanner(System.in);
        System.out.print("Input String to be converted:");
        String c = s.next();
        worker lod=new worker();    //String Conversion by worker class
        String d=lod.convert(c);
        printer(d);
    }
    private static void printer(String cals){
        System.out.print("\nConverted String:"+cals+"\n");
        out();        //Recursion to keep program going
    }
}
