import java.util.Scanner;

public class EntradaDados{ 
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double n1 = sc.nextDouble();
        //Aqui o usuário insere o número e o scanner identifica e salva na variável "n1"
        
        System.out.println("Digite o segundo numero");
        double n2 = sc.nextDouble();
        // Aqui o usuário insere o número e o scanner identifica e salva na variável "n2"

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;
        // aqui foi criada as variáveis das operações, que terá a função de guardar o resultado da operação

        System.out.println("O resultado da soma" + soma);
        System.out.println("O resultado da subtracao" + subtracao);
        System.out.println("O resultado da divisao: " + divisao); 
        System.out.println("O resultado da multiplicacao" + multiplicacao);
        //informado o resultado final para o usuário


        

        sc.close();

        
        

        
	}
}