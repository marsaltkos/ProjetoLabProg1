import java.util.Random;
import java.util.Scanner;
public class Financeiro{
	public static void financeiro() {
		Scanner dado = new Scanner(System.in);
		Random numRamd = new Random();
		int opcao, resposta;
		do {
			System.out.println("***** PORTAL FINANCEIRO *****");
		    System.out.println("1 - Consultar Débitos:");
		    System.out.println("2 - 2ª Via de Boletos:");
		    System.out.println("0 - VOLTAR");
		    System.out.println("*********************\n");
		    opcao = dado.nextInt();
		    dado.nextLine();
		    switch (opcao){
		    	case 1:
		    		System.out.println("\nConsta débitos em seu nome.");
		    		System.out.println("Por favor, imprima a 2ª Via do Boleto");
		    		System.out.println("e regularize sua situação com");
		    		System.out.println("o Departamento financeiro.\n");
		    		break;
		    	case 2:
		    		System.out.println("\nAguarde... Boleto sendo gerado.\n\n");
		    		System.out.print(numRamd.nextInt(100000) + "." + numRamd.nextInt(100000) + " ");
		    		System.out.print(numRamd.nextInt(100000) + "." + numRamd.nextInt(100000) + " ");
		    		System.out.print(numRamd.nextInt(100000) + "." + numRamd.nextInt(100000) + " ");
		    		System.out.print(numRamd.nextInt(10) + " " + numRamd.nextInt(10000) + "\n\n");
		    		System.out.print("Deseja enviar o boleto para: (1) WhatsApp ou (2) E-mail:");
		    		resposta = dado.nextInt();
		    		while ((resposta < 1) || (resposta > 2)){
		    			System.out.print("\nOpção inválida! Digite (1) WhatsApp ou (2) E-mail: ");
		    			resposta = dado.nextInt();
		    		}
		    		if (resposta == 1){
		    			System.out.println("\nBoleto enviado ao WhasApp cadastrado.");
		    		}
		    		else {
		    			System.out.println("\nBoleto enviado ao E-mail cadastrado.");
		    		}
		    		break;
		    	case 0:
		    		break;
		    	default:
		    	System.out.println("\nOpção inválida!\n");
		    }
	    }while (opcao != 0);
    }
}