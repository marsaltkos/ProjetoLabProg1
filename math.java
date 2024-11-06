import java.util.Scanner;

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
        int opcao;
        
        System.out.print("Digite o primeiro número: ");
        a = input.nextFloat();
        System.out.print("Digite o segundo número: ");
        b = input.nextFloat();

        System.out.println("---------- MENU DE OPÇÕES ----------");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Encontrar o resto da divisão");
        System.out.println("6 - Escolher outros dois números");
        System.out.println("0 - Sair");
        opcao = input.nextInt();
        input.nextLine();

        while (opcao != 0){

            switch (opcao){
                case 1:
                    soma = funcoes.soma(a,b);
                    System.out.println("---------- RESULTADO ---------------");
                    System.out.println(a + " + " + b + " = " + soma);
                    System.out.println("------------------------------------");
                break;

                case 2:
                    subtracao = funcoes.subtracao(a,b);
                    System.out.println("---------- RESULTADO ---------------");
                    System.out.println(a + " - " + b + " = " + subtracao);
                    System.out.println("------------------------------------");
                break;

                case 3:
                    multiplicacao = funcoes.multiplicacao(a,b);
                    System.out.println("---------- RESULTADO ---------------");
                    System.out.println(a + " * " + b + " = " + multiplicacao);
                    System.out.println("------------------------------------");
                break;

                case 4:
                    divisao = funcoes.divisao(a,b);
                    System.out.println("---------- RESULTADO ---------------");
                    System.out.println(a + " / " + b + " = " + divisao);
                    System.out.println("------------------------------------");
                break;

                case 5:
                    resto = funcoes.resto(a,b);
                    System.out.println("---------- RESULTADO ---------------");
                    System.out.println(a + " % " + b + " = " + resto);
                    System.out.println("------------------------------------");
                break;

                case 6:
                    System.out.print("Digite o primeiro número: ");
                    a = input.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    b = input.nextFloat();
                break;

                default:
                    System.out.print("Erro! Escolha uma opção válida: ");
                    opcao = input.nextInt();
                    input.nextLine();
            }

            System.out.println("\n");
            System.out.println("Seus números são:");
            System.out.println("número A " + a);
            System.out.println("número B " + b);
            System.out.println("---------- MENU DE OPÇÕES ----------");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Encontrar o resto da divisão");
            System.out.println("6 - Escolher outros dois números");
            System.out.println("0 - Sair");
            opcao = input.nextInt();
            input.nextLine();  
        }
        System.out.println("Obrigado!");
    }
}