import java.util.*;

public class math{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        float a;
        float b;
        float soma;
        float subtracao;
        float divisao;
        float multiplicacao;
        float resto;
        
        System.out.print("Digite o primeiro número: ");
        a = input.nextInt();
        System.out.print("Digite o segundo número: ");
        b = input.nextInt();

        System.out.println("---------- MENU DE OPÇÕES ----------");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Encontrar o resto da divisão");
        System.out.println("0 - Sair");
        opcao = input.nextInt();
        input.nextLine();

        while (opcao != 0){

            switch opcao{
                case 1:
                    soma = funcoes.adicionar(a,b);
                    System.out.println(a + " + " b + " = " + soma);
                break;

                case 2:
                    subtracao = funcoes.subtracao(a,b);
                    System.out.println(a + " - " b + " = " + subtracao);
                break;

                case 3:
                    multiplicacao = funcoes.multiplicacao(a,b);
                    System.out.println(a + " * " b + " = " + multiplicacao);
                break;

                case 4:
                    divisao = funcoes.divisao(a,b);
                    System.out.println(a + " / " b + " = " + divisao);
                break;

                case 5:
                    resto = funcoes.resto(a,b);
                    System.out.println(a + " % " b + " = " + resto);
                break;

                default:
                    System.out.print("Erro! Escolha uma opção válida: ");
                    opcao = input.nextInt();
                    input.nextLine();
            }
        }
        System.out.println("Obrigado!");
    }
}