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
        // aqui foi criada a variável soma, que terá a função de guardar o resultado da soma do n1 + n2

        System.out.println("O resultado da soma: " + soma); 

        //informado o resultado final para o usuário
        

        sc.close();

        
        

        
	}
}