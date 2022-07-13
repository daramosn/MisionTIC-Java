package co.edu.utp.misiontic2022.c2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        // Listas
        ArrayList listaEnteros = new ArrayList<>();

        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(7);
        listaEnteros.add(2, 6);

        System.out.println("La lista tiene un tamaño de: " + listaEnteros.size());

        System.out.println("La lista está vacía?: " + listaEnteros.isEmpty());

        Integer numero = 9;
        System.out.println("El número " + numero + " está en el arreglo?: " + listaEnteros.contains(numero));
        System.out.println();

        // Conjuntos
        Set<Integer> conjuntoEntero = new HashSet<>();

        conjuntoEntero.add(4);
        conjuntoEntero.add(5);
        conjuntoEntero.add(7);
        conjuntoEntero.add(4); // No se acepta duplicado
        conjuntoEntero.add(2);

        for (Integer entero : conjuntoEntero) {
            System.out.println("Conjutno: " + entero);
        }
        System.out.println();

        // Colas

        Queue<Integer> cola = new LinkedList<>();

        cola.offer(3);
        cola.add(5);
        cola.offer(4);
        cola.add(8);

        System.out.println("La cola es: " + cola);
        System.out.println("El elemento es: " + cola.peek());

        while (cola.poll() != null) {
            System.out.println("El elemento de la cola es: " + cola.peek());
        }
        System.out.println();

        // Hashmap

        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(920, "Diego");
        hmap.put(220, "Alejandro");
        hmap.put(620, "Ramos");
        hmap.put(9820, "Nieto");

        System.out.println(hmap.entrySet());
    }
}
