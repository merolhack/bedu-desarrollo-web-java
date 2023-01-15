package org.bedu;

public class TiposDeDatos {
    public static void main(String[] args) {
        // Números enteros
        printMaxMin("byte");
        printMaxMin("short");
        printMaxMin("int");
        printMaxMin("long");
        // Punto flotante / Punto decimal
        printMaxMin("float");
        printMaxMin("double");
        // Texto
        printMaxMin("char");
        // Lógicos
        printMaxMin("boolean");
        // Texto
        printMaxMin("String");
        printMaxMin("array[]");
    }

    private static void printSeparator(String type) {
        System.out.println("==[" + type + "]========================");
    }

    private static void printMaxMin(String type) {
        printSeparator("Tipo de dato: " + type);
        switch (type) {
            case "byte":
                byte valorByte = Byte.MAX_VALUE;
                System.out.println("* Valor máximo: " + valorByte);
                valorByte += 1;
                System.out.println("* Valor máximo + 1: " + valorByte);
                valorByte = Byte.MIN_VALUE;
                System.out.println("* Valor mínimo: " + valorByte);
                valorByte -= 1;
                System.out.println("* Valor mínimo - 1: " + valorByte);
                break;
            case "short":
                short valorShort = Short.MAX_VALUE;
                System.out.println("* Valor máximo: " + valorShort);
                valorShort += 1;
                System.out.println("* Valor máximo + 1: " + valorShort);
                valorShort = Short.MIN_VALUE;
                System.out.println("* Valor mínimo: " + valorShort);
                valorShort -= 1;
                System.out.println("* Valor mínimo - 1: " + valorShort);
                break;
            case "int":
                int valorInt = Integer.MAX_VALUE;
                System.out.println("* Valor máximo: " + valorInt);
                valorInt += 1;
                System.out.println("* Valor máximo + 1: " + valorInt);
                valorInt = Integer.MIN_VALUE;
                System.out.println("* Valor mínimo: " + valorInt);
                valorInt -= 1;
                System.out.println("* Valor mínimo - 1: " + valorInt);
                break;
            case "long":
                long valorLong = Long.MAX_VALUE;
                System.out.println("* Valor máximo: " + valorLong);
                valorLong += 1;
                System.out.println("* Valor máximo + 1: " + valorLong);
                valorLong = Long.MIN_VALUE;
                System.out.println("* Valor mínimo: " + valorLong);
                valorLong -= 1;
                System.out.println("* Valor mínimo - 1: " + valorLong);
                break;
            case "float":
                float valorFloat = Float.MAX_VALUE;
                System.out.println("* Valor máximo: " + valorFloat);
                valorFloat += 1;
                System.out.println("* Valor máximo + 1: " + valorFloat);
                valorFloat = Float.MIN_VALUE;
                System.out.println("* Valor mínimo: " + valorFloat);
                valorFloat -= 1;
                System.out.println("* Valor mínimo - 1: " + valorFloat);
                break;
            case "double":
                double valorDouble = Double.MAX_VALUE;
                System.out.println("* Valor máximo: " + valorDouble);
                valorDouble += 1;
                System.out.println("* Valor máximo + 1: " + valorDouble);
                valorDouble = Double.MIN_VALUE;
                System.out.println("* Valor mínimo: " + valorDouble);
                valorDouble -= 1;
                System.out.println("* Valor mínimo - 1: " + valorDouble);
                break;
            case "char":
                char valorChar = Character.MAX_VALUE;
                System.out.println("* Valor máximo: " + (valorChar + 0));
                valorChar += 1;
                System.out.println("* Valor máximo + 1: " + (valorChar + 1));
                valorChar = Character.MIN_VALUE;
                System.out.println("* Valor mínimo: " + (valorChar - 0));
                valorChar -= 1;
                System.out.println("* Valor mínimo - 1: " + (valorChar + 1));
                break;
            case "boolean":
                boolean valorBoolean = Boolean.FALSE;
                System.out.println("* Valor falso: " + valorBoolean);
                valorBoolean = Boolean.TRUE;
                System.out.println("* Valor verdadero: " + valorBoolean);
                break;
            case "String":
                String valorString = new String();
                System.out.println("* Valor mínimo:" + valorString.length());

                String nuevoValorString = "Hola Mundo";
                System.out
                        .println("* Cantidad de caracteres \"" + nuevoValorString + "\": " + nuevoValorString.length());
                break;
            case "array[]":
                String[] cars = {"Volkswagen", "BMW", "Ford", "Nissan"};
                System.out.println("* Cantidad de elementos en el arreglo \"cars\": " + cars.length);
                System.out.println("* Primer elemento en el arreglo \"cars\": " + cars[0]);
                System.out.println("* Último elemento en el arreglo \"cars\": " + cars[cars.length - 1]);
                int[] numbers = {10, 20, 30, 40};
                System.out.println("* Cantidad de elementos en el arreglo \"numbers\": " + numbers.length);
                System.out.println("* Primer elemento en el arreglo \"numbers\": " + numbers[0]);
                System.out.println("* Último elemento en el arreglo \"numbers\": " + numbers[numbers.length - 1]);
                break;
        }

    }
}
