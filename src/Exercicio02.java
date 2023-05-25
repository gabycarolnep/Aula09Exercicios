import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        double precoGasolina = 2.50;
        double precoAlcool = 1.90;

        System.out.println("Quantos litros de combustível deseja colocar no veículo? ");
        double litrosVendidos = entrada.nextDouble();

        System.out.println("Qual o tipo de combustível? " +
                "(Coloque A para Alcool e G para Gasolina)");
        String combustivelAbastecido = entrada.next();

        System.out.println("Foram vendidos " + litrosVendidos + " litros de combustível");


        if (combustivelAbastecido.equalsIgnoreCase("a")){
            if (litrosVendidos <= 20){
                double descontoAlcool = (litrosVendidos * precoAlcool) * 0.03;
                double precoNormal = litrosVendidos * precoAlcool;
                System.out.println("O valor sem desconto em reais é " + formatador.format(precoNormal));
                double precoFinalComDesconto = (litrosVendidos * precoAlcool) - descontoAlcool;
                System.out.println("Você recebeu 3% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            } else {
                double descontoAlcool = (litrosVendidos * precoAlcool) * 0.05;
                double precoNormal = litrosVendidos * precoAlcool;
                System.out.println("O valor sem desconto em reais é " + formatador.format(precoNormal));
                double precoFinalComDesconto = (litrosVendidos * precoAlcool) - descontoAlcool;
                System.out.println("Você recebeu 5% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            }

        } else if (combustivelAbastecido.equalsIgnoreCase("g")) {
            if (litrosVendidos <= 20){
                double descontoGasolina = (litrosVendidos * precoGasolina) * 0.04;
                double precoNormal = litrosVendidos * precoGasolina;
                System.out.println("O valor sem desconto em reais é " + formatador.format(precoNormal));
                double precoFinalComDesconto = (litrosVendidos * precoGasolina) - descontoGasolina;
                System.out.println("Você recebeu 4% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            } else {
                double descontoGasolina = (litrosVendidos * precoGasolina) * 0.06;
                double precoNormal = litrosVendidos * precoGasolina;
                System.out.println("O valor sem desconto em reais é " + formatador.format(precoNormal));
                double precoFinalComDesconto = (litrosVendidos * precoGasolina) - descontoGasolina;
                System.out.println("Você recebeu 6% de desconto, ficando o total de: R$ " + formatador.format(precoFinalComDesconto));
            }
        }


    }

}
