package org.example.entidades;

public class Validador {

    public static void procesar(String valor) {
        if (valor == null) {
            throw new IllegalArgumentException("El valor no puede ser nulo");
        }
        System.out.println("Procesando...");
    }
}