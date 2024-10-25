public class funcoes{
    public static int soma(int a, int b){
        return a + b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    public static int multiplicacao(int a, int b){
        return a * b;
    }

    public static int divisao (int a, int b){
        if (b == 0){
            System.out.println("ERROR: Dividiu por 0");
        }else{
            return a / b;
        }
    }
    public static int resto (int a, int b){
        return a % b;
    }

}