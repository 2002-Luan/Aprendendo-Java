package aprendendo.java.javacore.introducaometodos.test;

import aprendendo.java.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        //Métodos

        Calculadora calculadora = new Calculadora();
        calculadora.SomaDoisNumeros();
        System.out.println("Finalizando");
        calculadora.SomaDoisNumeros();

    }

}
