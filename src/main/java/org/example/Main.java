package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Amo a melito");

        System.out.println(esPalindromo("Oso"));
        System.out.println(esPalindromo2("Oso"));
    }

    public static boolean esPalindromo(String cadena) {
        int largo = cadena.length();
        char [] reverso = new char[largo];
        char[] separada = cadena.toCharArray();
        for (int i=1; i<=largo; i++){
            reverso[i-1]=separada[largo-i];
        }
        String resultado = new String(reverso);
        return resultado.equalsIgnoreCase(cadena);
    }
    public static boolean esPalindromo2(String cadena) {
        StringBuilder builder = new StringBuilder(cadena);
        return builder.reverse().toString().equalsIgnoreCase(cadena);
    }

}