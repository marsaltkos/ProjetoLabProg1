import java.util.Scanner;
public class AtualizarCadastro
{
    public static void main (String[] args)
    {
        //declaração de variáveis
        Scanner dado = new Scanner(System.in);
        int opcao;
        String nome, cpf, telefone, carro, placa, excluir, repetir;
        
        //entrada de dados



        
            System.out.println("\nVamos atualizar os dados de cadastro?\n");

            System.out.println(" Opção 1: cadastrar dados completos de novo morador \n Opção 2: cadastrar apenas novo veículo \n Opção 3: Excluir morador do sistema \n Escolha uma opção de 1 a 3: ");
            opcao = dado.nextInt();
            dado.nextLine();
            
            while((opcao!=1)&&(opcao!=2)&&(opcao!=3)) {
                System.out.println("ERRO. Digite 1, 2 ou 3:");
                opcao = dado.nextInt();
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do novo morador a ser cadastrado");
                    nome = dado.nextLine();
                    System.out.println("Digite o cpf do novo morador a ser cadastrado");
                    cpf = dado.nextLine();
                    System.out.println("Digite o telefone do novo morador a ser cadastrado");
                    telefone = dado.nextLine();
                    System.out.println("Digite o modelo do veículo a ser cadastrado");
                    nome = dado.nextLine();
                    System.out.println("Digite a placa do veículo a ser cadastrado");
                    placa = dado.nextLine();
                    System.out.println("\n concluído, informações enviadas com sucesso ");
                    break;
                case 2:
                    System.out.println("Digite o modelo do veículo a ser cadastrado");
                    carro = dado.nextLine();
                    System.out.println("Digite a placa do veículo a ser cadastrado");
                    placa = dado.nextLine();
                    System.out.println("\n ok, o veículo foi cadastrado");
                    break;
                case 3:
                    System.out.println("Digite apenas o nome do morador a ser excluído do sistema");
                    excluir = dado.nextLine();
                    System.out.println(" \n A solicitação foi enviada ");
                    break;
                
            
                default:
                    break;
            }
            
           
        
        System.out.println(" Obrigado, fim de programa");

       
    } 

}
