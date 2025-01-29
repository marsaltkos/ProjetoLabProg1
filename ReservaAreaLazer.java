import java.util.Scanner;

public class ReservaAreaLazer {
    public static void reservarAreaLazer(Scanner input) {
        String[] areasDeLazer = {"Piscina", "Churrasqueira", "Quadra de Esportes", "Salão de Festas"};
        int escolha;
        String nome;
        String data;

        System.out.println("\nEscolha uma área de lazer para reservar:");
        for (int i = 0; i < areasDeLazer.length; i++) {
            System.out.println((i + 1) + ". " + areasDeLazer[i]);
        }

        System.out.print("Digite o número da área de lazer desejada: ");
        escolha = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha

        if (escolha < 1 || escolha > areasDeLazer.length) {
            System.out.println("Opção inválida. Reserva cancelada.");
            return;
        }

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite a data da reserva (dd/mm/aaaa): ");
        data = input.nextLine();

        System.out.println("\n✅ Reserva confirmada!");
        System.out.println("Área de lazer: " + areasDeLazer[escolha - 1]);
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
    }
}



