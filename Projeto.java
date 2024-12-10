import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Projeto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;
        int opcaoApto;
        String senha;
        String senhaRep = " ";
        String usuario;

        FuncProjeto.Cabecalho();
        opcao = input.nextInt();

        do {
            switch (opcao) {
                case 1:
                    FuncProjeto.Cadastro();
                    FuncProjeto.Cabecalho();
                    opcao = input.nextInt();
                    break;

                case 2:
                    System.out.print("Digite seu usuário: ");
                    usuario = input.next();

                    if (!usuarioExiste(usuario)) {
                        System.out.println("Usuário não encontrado!");
                        break;
                    }

                    System.out.print("Digite sua senha: ");
                    senha = input.next();

                    while (!senhaExiste(senha)) {
                        System.out.println("Senha incorreta!");
                        senha = input.next();
                    }
                    System.out.print("Repita sua senha: ");
                    senhaRep = input.next();

                    if (senha.equals(senhaRep)) {
                        System.out.println("Usuário validado com sucesso! Seja bem vindo.");

                        FuncProjeto.condomino();
                        opcaoApto = input.nextInt();

                        while (opcaoApto != 5) {
                            switch (opcaoApto) {
                                case 1:
                                    AcessoDocumentos.AcessoDocumentos();
                                    FuncProjeto.condomino();
                                    opcaoApto = input.nextInt();
                                    break;
                                case 2:
                                    AgendarMudanca.agendarMudanca();
                                    FuncProjeto.condomino();
                                    opcaoApto = input.nextInt();
                                    break;
                                case 3:
                                    Comunicacao.comunicacao();
                                    FuncProjeto.condomino();
                                    opcaoApto = input.nextInt();
                                    break;
                                case 4:
                                    Financeiro.financeiro();
                                    FuncProjeto.condomino();
                                    opcaoApto = input.nextInt();
                                    break;
                                case 5:

                                break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        }
                        System.out.println("Você saiu da área do condômino.");
                    } else {
                        System.out.println("As senhas não coincidem!");
                    }
                    FuncProjeto.Cabecalho();
                    opcao = input.nextInt();
                    break;
                case 3:
                    FuncProjeto.SobreNos();
                    FuncProjeto.Cabecalho();
                    opcao = input.nextInt();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    FuncProjeto.Cabecalho();
                    opcao = input.nextInt();
            }
        } while (opcao != 4);
        System.out.println("Muito obrigado!");
        System.out.println("Saindo...");
        input.close();
    }

    private static boolean usuarioExiste(String usuario) {
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
    private static boolean senhaExiste(String senha) {
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