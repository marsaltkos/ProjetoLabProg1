import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        input.nextLine();
        int b = input.nextInt();
        input.nextLine();

        float soma = funcoes.soma(a,b);
        System.out.println(soma);

    }
}
