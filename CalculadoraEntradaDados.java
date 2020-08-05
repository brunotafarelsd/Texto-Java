import java.util.Scanner;

public class CalculadoraEntradaDados {

    public static void main (String[]args) {
        /* 
        Desenvolver as quatro operações com entrada de dados 
        com 2 numeros
         */
        double numeroUm;
        double numeroDois;
        
        double soma;
        double subtracao;
        double divisao;
        double multiplicacao;

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o primeiro valor");
        numeroUm = sc.nextDouble();

        System.out.println("Digite o segundo valor");
        numeroDois = sc.nextDouble();

        soma = numeroUm + numeroDois;
        subtracao = numeroUm - numeroDois;
        divisao = numeroUm / numeroDois;
        multiplicacao = numeroUm * numeroDois;

        System.out.println("O resultado da soma é : " + soma);
        System.out.println("O resultado da subtracao é : " + subtracao);
        System.out.println("O resultado da divisao é : " + divisao);
        System.out.println("O resultado da multiplicacao é : " + multiplicacao);


        sc.close();

    }
}