package aprendendo.java.introducao;


public class AprendendoEstruturadeRepeticao01 {
    // dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 5000;
        for (int parcela =1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                break;
            }
                System.out.println("parcela"+ parcela+ "R$" +valorParcela);
        }
    }
}