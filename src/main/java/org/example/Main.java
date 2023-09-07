package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        System.out.println(esPalindromo(cadena));
    }

    public static String invertirCadena(String cadena) {
        StringBuilder cadena_invertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) { // Este bucle permite invertir el orden de la cadena
            cadena_invertida.append(cadena.charAt(i));
        }
        return cadena_invertida.toString();
    }

    public static boolean esPalindromo(String cadena){
        String cadena_invertida = invertirCadena(cadena);
        cadena = cadena.toLowerCase();
        cadena_invertida = cadena_invertida.toLowerCase();
        for(int i=0; i < cadena.length(); i++) {
            if(cadena.charAt(i) != cadena_invertida.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}