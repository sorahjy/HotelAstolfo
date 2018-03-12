package com.sorahjy.kotlintest;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void f() throws IOException {


        try (Scanner s = new Scanner(System.in)){
            s.nextInt();
        }
    }//main

}
