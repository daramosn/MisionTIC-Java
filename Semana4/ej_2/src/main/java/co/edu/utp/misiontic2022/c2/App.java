package co.edu.utp.misiontic2022.c2;

import static java.nio.file.StandardOpenOption.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Files
 *
 */
public class App {
    public static void main(String[] args) {

        // var f = new File("prueba.txt");

        // System.out.println("pathSeparator: " + File.pathSeparator);
        // System.out.println("separator: " + File.separator);
        // System.out.println("separatorChar: " + File.separatorChar);

        // try {
        // System.out.println("canRead: " + f.canRead());
        // System.out.println("canWrite: " + f.canWrite());
        // System.out.println("exist: " + f.exists());
        // System.out.println("getName: " + f.getName());
        // System.out.println("getParent: " + f.getParent());
        // System.out.println("isDirectory: " + f.isDirectory());
        // System.out.println("isFile: " + f.isFile());
        // System.out.println("lenght: " + f.length());

        // } catch (Exception e) {
        // System.out.print(e);
        // }

        ////////////////////////////////////////////////////////////////
        // try {
        // File archivo = new File("numeros.txt");
        // if (archivo.createNewFile()) {
        // System.out.println("El archivo creado: " + archivo.getName());
        // } else {
        // System.out.println("El archivo ya existe");
        // }
        // } catch (IOException e) {
        // System.out.println("Errores encontrados del fichero: ");
        // e.printStackTrace();
        // }

        ///////////////////////////////////////////////////////////////////////////////
        // Abre un archivo de registro. Si no existe, se crea. Si existe, se abre para
        /////////////////////////////////////////////////////////////////////////////// agregar.

        // String s = "grupo 48";
        // byte datos[] = s.getBytes();

        // Path p = Paths.get("./prueba_2.txt");

        // // Un archivo bytes a bytes desdeel bufferedOutputStream quien los convierte
        // de
        // // carateres a bytes

        // try (OutputStream out = new BufferedOutputStream(

        // // anexar un archivo existente, o crearlo
        // Files.newOutputStream(p, CREATE, APPEND))) {
        // out.write(datos, 0, datos.length);
        // System.out.println("Archivo creado");
        // } catch (Exception e) {
        // System.err.println(e);
        // }

        int[][] numeros = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        try {
            File numArchivo = new File("Numeros.txt");
            PrintWriter salida = new PrintWriter(numArchivo);

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    salida.print(numeros[i][j] + ",");
                }
                salida.println("");
            }
            System.out.println("Archivo escrito: ");
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
