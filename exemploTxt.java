import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class exemploTxt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Digite o texto que deseja escrever no arquivo:");
        
        String nomeArquivo = "meus_dados.txt";
        String dados = input.nextLine();
        while(!dados.equals("sair")){
            try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo, StandardCharsets.UTF_8, true))) {
                writer.println(dados);
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
            System.out.println("Digite o texto que deseja escrever no arquivo:");
            dados = input.nextLine();
        }
    }
}