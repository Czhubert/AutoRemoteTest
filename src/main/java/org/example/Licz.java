package org.example;

public class Licz {

        public static String Policz(String liczba) {
            System.out.println("Liczymy");
            System.out.println(liczba);
            liczba =  String.valueOf((Integer.valueOf(liczba)*2));
            System.out.println(liczba);

            return liczba;


    }
}
