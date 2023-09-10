package org.example;
import java.text.Normalizer;
import java.util.*;

public class Palindromos {
    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine(); // Devuelve un String
        System.out.println(esPalindromo(cadena));
    }

    public static String invertirCadena(String cadena) {
        String cadena_invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) { // Este bucle permite invertir el orden de la cadena
            cadena_invertida += (cadena.charAt(i));
        }
        return cadena_invertida;
    }

    public static boolean esDigito(String cadena){
        for(int i=0; i < cadena.length(); i++) {
            if(Character.isDigit(cadena.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String eliminarEspacios(String cadena){
        String palabraSinEspacios = "";
        for(int i=0; i < cadena.length(); i++) {
            if(cadena.charAt(i) != ' ') {
                palabraSinEspacios+=cadena.charAt(i);
            }
        }
        return palabraSinEspacios;
    }

    public static boolean esPalindromo(String cadena){
        if(cadena.isEmpty() || esDigito(cadena)){return false;}
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD)
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase(); // Ignora caracteres especiales como ,!¿#%, tildes y se pasan todos los caracteres a minúsculas
        String cadena_invertida = eliminarEspacios(invertirCadena(cadena));
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != cadena_invertida.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}