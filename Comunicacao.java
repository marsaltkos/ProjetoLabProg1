import java.util.Scanner;
import java.util.Random;
public class Comunicacao{
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		Random numRamd = new Random();
		int opcao, protocolo;
		String texto;
		do{
			System.out.println("***** PORTAL DE COMUNICAÇÃO *****");
		    System.out.println("1 - Dúvidas:");
		    System.out.println("2 - Sugestões:");
		    System.out.println("3 - Reclamações:");
		    System.out.println("4 - Denúncias:");
		    System.out.println("0 - VOLTAR");
		    System.out.println("*********************\n");
		    opcao = dado.nextInt();
		    dado.nextLine();
		    switch (opcao){
		    	case 1:
		    		protocolo = numRamd.nextInt(10000);
		    		System.out.println("\nDigite a seguir e sua Dúvida:\n");
		    		texto = dado.nextLine();
		    		System.out.println("\nSua dúvida foi registrada.");
		    		System.out.println("Número do Protocolo: " + protocolo + "\n");
		    		break;
		    	case 2:
		    		protocolo = numRamd.nextInt(10000);
		    		System.out.println("\nDigite a seguir e sua Sugestão:\n");
		    		texto = dado.nextLine();
		    		System.out.println("\nSua sugestão foi registrada.");
		    		System.out.println("Número do Protocolo: " + protocolo + "\n");
		    		break;
		    	case 3:
		    		protocolo = numRamd.nextInt(10000);
		    		System.out.println("\nDigite a seguir e sua Reclamação:\n");
		    		texto = dado.nextLine();
		    		System.out.println("\nSua reclamação foi registrada.");
		    		System.out.println("Número do Protocolo: " + protocolo + "\n");
		    		break;
		    	case 4:
		    		protocolo = numRamd.nextInt(10000);
		    		System.out.println("\nDigite a seguir e sua Denúncia:\n");
		    		texto = dado.nextLine();
		    		System.out.println("\nSua denúncia foi registrada.");
		    		System.out.println("Número do Protocolo: " + protocolo + "\n");
		    		break;
		    	case 0:
		    		break;

		    	default:
		    	System.out.println("\nOpção inválida!\n");
		    }
		}while (opcao != 0);
	}
}