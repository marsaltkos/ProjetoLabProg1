import java.util.Scanner;
public class AcessoDocumentos
{
    public static void AcessoDocumentos(){
         //declaração de variáveis
         Scanner dado = new Scanner(System.in);
         String  opcao;
         int norma, ata, balancete;
 
         
         //entrada de dados
         
         System.out.println("\n Nessa sessão é possível solicitar o envio de normas, atas e balancetes. Digite qual deles gostaria de acessar ou fim para sair. ");
         opcao = dado.nextLine();
 
         while (!(opcao.equals("fim"))) {
         
             while ((!(opcao.equals("atas")))&&(!(opcao.equals("balancetes")))&&(!(opcao.equals("normas")))) {
                 System.out.println("ERRO. Digite apenas as palavras : normas ou atas ou balancetes");
                 opcao = dado.nextLine();
             }
             switch (opcao) {
                 case "atas":
                     System.out.println("As atas disponíveis são:");
                     System.out.println(" 1- Assembleia Geral Ordinaria 2022 \n 2- Assembleia Geral Ordinaria 2023 \n 3- Assembleia Geral Ordinária 2024 \n 4- Todos");
                     System.out.println("\nDigite o número de sua opção: ");
                     ata = dado.nextInt();
                     System.out.println( "O documento solicitado será enviado via e-mail");
                     break;
                 case "balancetes":  
                     System.out.println("Os balancetes disponíveis são:");
                     System.out.println(" 1- Balancete 2022 \n 2- Balancete 2023 \n 3- Balancete 2024 \n 4- Todos");
                     System.out.println("\nDigite o número de sua opção: ");
                     balancete = dado.nextInt();
                     System.out.println( "O documento solicitado será enviado via e-mail");
                     break;
                 case "normas":  
                     System.out.println("As normas do condomínio são:");
                     System.out.println(" 1- Regimento Interno \n 2- Convenção \n 3- Todos");
                     System.out.println("\nDigite o número de sua opção: ");
                     norma = dado.nextInt();
                     System.out.println( "O documento solicitado será enviado via e-mail");
                     break;    
 
                     
                 default:
                     break;
                
             }
             dado.nextLine();
             System.out.println("Nessa sessão é possível solicitar o envio de normas, atas e balancetes. Digite qual deles gostaria de acessar ou fim para sair. ");
             opcao = dado.nextLine();
         }
 
         
         //saída de dados
         System.out.println("Obrigado, fim de programa");
 
        }
    }
