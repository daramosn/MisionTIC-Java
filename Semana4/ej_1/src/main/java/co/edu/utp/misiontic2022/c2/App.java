package co.edu.utp.misiontic2022.c2;

import java.io.*;

import javax.management.NotCompliantMBeanException;

public class App {
    public static void main(String[] args) {

        // int numBytes = 0;
        // char caracter;

        // System.out.println("\nEscribe el texto: ");

        // try {
        // do {
        // caracter = (char) System.in.read();
        // System.out.print(caracter);
        // numBytes++;
        // } while (caracter != '\n');
        // System.out.print("La cantidad de bytes leídos: " + numBytes);
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // byte[] buffer = new byte[255];
        // System.out.println("\nEscribe el texto: ");
        // try {
        // System.in.read(buffer, 0, 255);
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // System.out.print("\nLa línea escrita es: ");
        // System.out.println(buffer);

        // String linea = null;
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader entrada = new BufferedReader(isr);
        // PrintWriter salida = new PrintWriter(System.out, true);

        // salida.println("\nEscriba el texto: ");

        // try {
        // linea = entrada.readLine();
        // } catch (Exception e) {
        // System.err.println(e);
        // }

        // salida.println("\nLa línea escrita es: ");
        // salida.println(linea);

        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // try {
        // System.out.print("Sumando 1: ");
        // int s1 = Integer.parseInt(br.readLine());
        // System.out.print("Sumando 2: ");
        // int s2 = Integer.parseInt(br.readLine());
        // int suma = s1 + s2;
        // System.out.println("La suma " + s1 + " + " + s2 + " = " + suma);
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        /////////////////////////////////////////////////////////

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Ya tenemos el lector

        System.out.println("Por favor ingrese su nombre: ");
        try {
            String nombre = br.readLine(); // Se lee el nombre con readLine que retorna un String
            System.out.println("Bienvenido " + nombre + ". Por favor ingrese pass: ");
            String contraseña = br.readLine();
            System.out.println("Su contraseña es XD --> " + contraseña);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
