import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Por favor, responda as perguntas seguintes com sinceridade, assinalando S para Sim e N para Não. " +
                "Sabendo, mediante aviso previo, que se mentir ou der falso testemunho," +
                " estará sujeita a cumprir sentença pela pena de perjurio :) ");

        System.out.println("Você telefonou para a vítima? (S ou N) ");
        String resposta1 = entrada_do_usuario.next();
        System.out.println("Você esteve no local do crime? (S ou N) ");
        String resposta2 = entrada_do_usuario.next();
        System.out.println("Você mora perto da vítima? (S ou N) ");
        String resposta3 = entrada_do_usuario.next();
        System.out.println("Você devia dinheiro à vítima? (S ou N) ");
        String resposta4 = entrada_do_usuario.next();
        System.out.println("Você já trabalhou com/para a vítima? (S ou N) ");
        String resposta5 = entrada_do_usuario.next();

        int qtdsDeSim = 0;

        if (resposta1.equalsIgnoreCase("s")) {
            qtdsDeSim++;
        }
        if (resposta2.equalsIgnoreCase("s")) {
            qtdsDeSim++;
        }
        if (resposta3.equalsIgnoreCase("s")) {
            qtdsDeSim++;
        }
        if (resposta4.equalsIgnoreCase("s")) {
            qtdsDeSim++;
        }
        if (resposta5.equalsIgnoreCase("s")) {
            qtdsDeSim++;
        }

        System.out.println("Obrigada pela sinceridade");
        System.out.println("Você respondeu positivo a " + qtdsDeSim + " perguntas");

        if (qtdsDeSim == 2) {
            System.out.println("Temos um suspeito. Senhor(a), por favor, nos acompanhe");
        } else if (qtdsDeSim == 3 || qtdsDeSim == 4) {
            System.out.println("Ele(a) é culmplice!. Algemem-o(a)");
        } else if (qtdsDeSim == 5) {
            System.out.println("Você é o assassino(a)!!! Mãos para o alto senhor(a). Você está preso(a) em nome da lei!");
        } else {
            System.out.println("Ele(a) é inocente. Chamem a próxima testemunha, por favor");

        }
    }


}
