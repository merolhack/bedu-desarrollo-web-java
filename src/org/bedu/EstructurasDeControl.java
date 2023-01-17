package org.bedu;

public class EstructurasDeControl {
    public static void main(String[] args) {
        int incrementar = 1;
        int decrementar = 1;
        incrementar++;
        System.out.println("* Valor incrementado (++): " + incrementar);
        decrementar--;
        System.out.println("* Valor decrementado (--): " + decrementar);
        // IF
        if (incrementar > 1) {
            System.out.println("* Valor de \"incrementar\" es mayor que 1: " + Boolean.TRUE);
        }
        if (decrementar < 1) {
            System.out.println("* Valor de \"decrementar\" es menor que 1: " + Boolean.TRUE);
        }
        // Switch
        int dia = 7;
        suma(dia);
        // For
        int iterador = 0;
        iterarFor(iterador);
        iterarWhile(iterador);
        iterarDoWhile(iterador);
    }

    public static void suma(int dia) {
        String diaString;
        switch (dia) {
            case 1:
                diaString = "lunes";
                break;
            case 2:
                diaString = "martes";
                break;
            case 3:
                diaString = "miércoles";
                break;
            case 4:
                diaString = "jueves";
                break;
            case 5:
                diaString = "viernes";
                break;
            case 6:
                diaString = "sábado";
                break;
            case 7:
                diaString = "domingo";
                break;
            default:
                diaString = "Día no válido";
                break;
        }
        System.out.println(diaString);
    }

    public static void iterarFor(int i) {
        for (; i < 3; i++) {
            System.out.println("Iterar FOR - valor de \"i\": " + i);
        }
    }

    public static void iterarWhile(int i) {
        while (i < 3) {
            System.out.println("Iterar While - valor de \"i\": " + i);
            i++;
        }
    }

    public static void iterarDoWhile(int i) {
        do {
            System.out.println("Iterar Do While - valor de \"i\": " + i);
            i++;
        } while (i < 3);
    }
}
