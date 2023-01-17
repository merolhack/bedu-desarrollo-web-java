package org.bedu;

public class CadenasDeTexto {
    public static void main(String[] args) {
        String str = new String("Hola! ¿Cómo estás?");

        System.out.println("" + str.length());
        System.out.println("" + str.charAt(0));
        System.out.println("" + str.substring(2));
        System.out.println("" + str.indexOf("Hola"));
        System.out.println("" + str.lastIndexOf('o'));
        System.out.println("" + str.equals("Hola! ¿Cómo estás?"));
        System.out.println("" + str.compareTo("Hola! ¿Cómo estás?"));
        System.out.println("" + str.toLowerCase());
        System.out.println("" + str.toUpperCase());
        System.out.println("" + str.trim());
        System.out.println("" + str.replace('o', 'i'));
        // Java 11
        // int count = 3;
        // System.out.println("Repetir: " + str.repeat(count));
    }
}
