package aprendendo.java.javacore.introducaometodos.test;

import aprendendo.java.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(20,50);
        calculadora.multiplicaDoisNumeros(10,20.5f);

    }
}
