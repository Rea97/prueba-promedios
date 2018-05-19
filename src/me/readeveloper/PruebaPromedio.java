package me.readeveloper;

public class PruebaPromedio {
    private double[] numerosAleatorios;

    public PruebaPromedio(double[] numerosAleatorios) {
        this.numerosAleatorios = numerosAleatorios;
    }

    private double calcularPromedio() {
        double suma = 0.0;

        for (double numero : this.numerosAleatorios) {
            suma += numero;
        }

        return suma / this.numerosAleatorios.length;
    }

    public void resolver() {
        double promedio = this.calcularPromedio();
    }
}
