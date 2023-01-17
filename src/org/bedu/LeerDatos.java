package org.bedu;

import java.util.Scanner;
import java.io.Console;

public class LeerDatos {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int i = sc.nextInt();
        System.out.println("Tu edad es: " + i);
        // Console
        String user;
        char pass[];
        String password;
        Console c = System.console();
        System.out.println("Ingresa tu nombre de usuario:");
        user = c.readLine();
        System.out.println("Ingresa tu contraseña:");
        pass = c.readPassword();
        password = String.valueOf(pass);
        System.out.println("Tu \"nombre de usuario\" es: " + user);
        System.out.println("Tu \"contraseña\" es: " + password);
    }
}
