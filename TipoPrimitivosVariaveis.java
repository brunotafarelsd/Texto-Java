import java.util.Scanner;

public class TipoPrimitivosVariaveis {

    public static void main (String[]args) {
        /* 
        Trabalhando com variaves do tipo primitivo        
        */

        int n1;
        double n2;

        double divisao; 

        scanner sc = new Scanner(system.in);

        System.out.println("Digite o primeiro valor");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo valor");
        n2 = sc.nextInt();

        divisao = n1 / n2;

        System.out.println("O resultado da divisao e: " + divisao);

        sc.close();

        }
    }