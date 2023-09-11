package org.example;

public class Main {
    public static void main(String[] args) {
        String palabra = "La tele letal";
        boolean esPalindromo = esPalindromo(palabra);
        System.out.println("¿Es palíndromo? " + esPalindromo);

    }
    public static boolean esPalindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();
        return palabraIngresada.equalsIgnoreCase(palabraInvertida); // "caddena.equalsIgnoreCase" sirve para comparara 2 cadenas de textos ingnorando las diferencai demayusculas y minusuclas
    }

}

