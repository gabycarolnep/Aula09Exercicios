import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Digite o valor ganho por hora trabalhada: ");
        double salarioHora = entrada_do_usuario.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mês: ");
        double horasTrabalhoMensal = entrada_do_usuario.nextDouble();
        double calculoSalarioMensalBruto = ( salarioHora * horasTrabalhoMensal);
        System.out.println("Seu Salário Bruto Mensal é: " + calculoSalarioMensalBruto);
        double calculoINSS = (calculoSalarioMensalBruto * 0.10);
        System.out.println("Seu INSS é: " + calculoINSS);
        double calculoFGTS = (calculoSalarioMensalBruto * 0.11);
        System.out.println("Seu FGTS é: " + calculoFGTS);

        double salarioMenosIR = 0;

        if (calculoSalarioMensalBruto > 900 && calculoSalarioMensalBruto < 1500){
            salarioMenosIR = calculoSalarioMensalBruto * 0.05;
            System.out.println("Seu IR é: " + salarioMenosIR);
        } else if (calculoSalarioMensalBruto >= 1500 && calculoSalarioMensalBruto < 2500) {
            salarioMenosIR = calculoSalarioMensalBruto * 0.10;
            System.out.println("Seu IR é: " + salarioMenosIR);
        } else if (calculoSalarioMensalBruto >= 2500) {
            salarioMenosIR = calculoSalarioMensalBruto * 0.20;
            System.out.println("Seu IR é: " + salarioMenosIR);
        } else {
            salarioMenosIR = 0;
            System.out.println("Seu IR é: " + salarioMenosIR);
        }
        double totalDeDescontos = calculoINSS + salarioMenosIR;
        System.out.println("O total de descontos é: " + totalDeDescontos);
        double calculoSalarioMensalLiquido = calculoSalarioMensalBruto - (calculoINSS + salarioMenosIR);
        System.out.println("Seu Salário Líquido Mensal é: " + calculoSalarioMensalLiquido);




    }
}
