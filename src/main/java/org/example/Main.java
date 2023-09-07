package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Amo a melito");

        System.out.println(esPalindromo("osos"));
    }

    public static boolean esPalindromo(String cadena) {
        int largo = cadena.length();
        char [] reverso = new char[largo];
        char[] separada = cadena.toCharArray();
        for (int i=1; i<=largo; i++){
            reverso[i-1]=separada[largo-i];
        }
        String resultado = new String(reverso);
        return resultado.equals(cadena);
    }

}