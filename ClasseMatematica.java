import java.util.Scanner;

public class ClasseMatematica {

    public static void main (String[]args) {

        Double n1;
        Double n2;
        Double n3;
        Double n4;

        Double soma;
        Double divisao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo valor");
        n2 = sc.nextDouble();

        System.out.println("Digite o terceiro valor");
        n3 = sc.nextDouble();

        System.out.println("Digite o quarto valor");
        n4 = sc.nextDouble();

        soma = n1 + n2 + n3 + n4;
        divisao = soma / 4;

        System.out.println("A media da soma dos quatro valores e: " + divisao);


        //entrar com 4 valores e calcular a media desses valores 


        sc.close();

    }
}