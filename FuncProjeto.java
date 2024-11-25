import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FuncProjeto {

    public static void Cabecalho(){
    System.out.println("***** BEM VINDO *****");
    System.out.println("1 - Cadastro");
    System.out.println("2 - Login");
    System.out.println("3 - Sobre nós");
    System.out.println("4 - SAIR");
    System.out.println("*********************");      
    }

    public static void SobreNos(){
        System.out.println("+----------------------------------------+");
        System.out.println("|         ***** TEAM MAIA *****          |");
        System.out.println("| - André Luis Ferreira da Rosa Junior   |");
        System.out.println("| - Carlos Eduardo Magalhães Silva       |");
        System.out.println("| - Igor Cesar Caliman                   |");
        System.out.println("| - Marsal Brito Santos                  |");
        System.out.println("| - Rodrigo Pinheiro de Queiroz          |");
        System.out.println("+----------------------------------------+");
    }

    public static void Cadastro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome para cadastro:");
        String nome = input.nextLine();
        System.out.println("Digite o número do apartamento:");
        String aptNum = input.nextLine();
        System.out.println("Digite a senha:");
        String senha = input.nextLine();
        
        if (isAptNumUsed(aptNum)) {
            System.out.println("Número do apartamento já está em uso. Tente novamente.");
        } else {
            adicionaRegistro(nome, aptNum, senha);
        }
    }

    public static boolean isAptNumUsed(String aptNum) {
        String nomeArquivo = "registros.txt";
        try (Scanner scanner = new Scanner(new File(nomeArquivo))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length > 1 && parts[1].trim().equals(aptNum)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return false;
    }

    public static void adicionaRegistro(String nome, String aptNum, String senha) {
        String nomeArquivo = "registros.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo, true))) {
            writer.println(nome + "," + aptNum + "," + senha);
            System.out.println("Registro cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
