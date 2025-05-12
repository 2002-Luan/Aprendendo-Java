package aprendendo.java.javacore.introducaoclasses.test;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Onix");
        Carro carro1 = new Carro("Toro");
        Carro carro2 = new Carro("HB20");

       String result = carro.acelerar();
        carro1.acelerar();
        carro2.acelerar();
        System.out.println(result);

    }
}

class Carro{
    String model;

    public Carro(String model){
        this.model = model;

    }
    public String acelerar(){
        System.out.println("acelerando meu carro" + model);
        return"Velocidade diferentes";
    }
}
