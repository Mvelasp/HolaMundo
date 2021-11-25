package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
       // System.out.println("Hola Mundo!!");
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribre tu nombre: ");
        msg.saludar(nombre);

    }

}
