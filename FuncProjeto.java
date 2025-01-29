import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        adicionaRegistro(nome, aptNum, senha);
    }

    public static void adicionaRegistro(String nome, String aptNum, String senha) {
        String nomeArquivo = "registros.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo, true))) {
            writer.println(nome);
            writer.println(aptNum);
            writer.println(senha);
            System.out.println("Registro cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static void condomino() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Acesso a Documentos");
        System.out.println("2 - Agendar Mudança");
        System.out.println("3 - Comunicação");
        System.out.println("4 - Financeiro");
        System.out.println("5 - Reserva de Área de Lazer"); // Nova opção adicionada
        System.out.println("6 - Sair");
        System.out.print("Digite sua opção: ");
    }

    

    public static boolean usuarioExiste(String usuario) {
        try (BufferedReader br = new BufferedReader(new FileReader("registros.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().equals(usuario)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return false;
    }
    public static boolean senhaExiste(String senha) {
        try (BufferedReader br = new BufferedReader(new FileReader("registros.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().equals(senha)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return false;
    }
}
