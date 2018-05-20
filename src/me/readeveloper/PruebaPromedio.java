package me.readeveloper;

import java.util.Scanner;

public class PruebaPromedio {
    private double[] numerosAleatorios;
    private double alfa;

    public PruebaPromedio(double[] numerosAleatorios, double alfa) {
        this.numerosAleatorios = numerosAleatorios;
        this.alfa = alfa;
    }

    private double calcularPromedio() {
        double suma = 0.0;

        for (double numero : this.numerosAleatorios) {
            suma += numero;
        }

        return suma / this.numerosAleatorios.length;
    }

    private double calcularEstadistico(double promedio) {
        return Math.abs(
                ((promedio - 0.5) * Math.sqrt(this.numerosAleatorios.length)) / Math.sqrt((1.0 / 12.0))
        );
    }

    private double getEstadisticoTablas() {
        double alfaReal = (100 - this.alfa) / 100;
        double zABuscar = alfaReal / 2;
        System.out.println(String.format("Ingresa estadistico de tablas Z %.5f/2", zABuscar));
        return new Scanner(System.in).nextDouble();
    }

    public void resolver() {
        double promedio = this.calcularPromedio();
        double estadistico = this.calcularEstadistico(promedio);
        double estadisticoTablas = this.getEstadisticoTablas();

        System.out.println(estadistico);
        System.out.println(estadisticoTablas);

        if (estadistico < estadisticoTablas) {
            System.out.println(
                String.format("%.5f < %.5f | verdadero", estadistico, estadisticoTablas)
            );
            System.out.println("Los numeros son aceptados.");
        } else {
            System.out.println(
                String.format("%.5f < %.5f | falso", estadistico, estadisticoTablas)
            );
            System.out.println("Los numeros son rechazados.");
        }
    }
}
