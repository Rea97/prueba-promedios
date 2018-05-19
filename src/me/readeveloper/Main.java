package me.readeveloper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int cantidad;
        double[] numerosAleatorios;
        PruebaPromedio pruebaPromedio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa cantidad de numeros aleatorios a generar: ");
        cantidad = sc.nextInt();
        numerosAleatorios = new RandomNumberGenerator(cantidad, 5).make();
        pruebaPromedio = new PruebaPromedio(numerosAleatorios);
        pruebaPromedio.resolver();
    }
}
