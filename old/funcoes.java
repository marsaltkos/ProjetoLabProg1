public class funcoes{
    public static float soma(float a, float b){
        return a + b;
    }

    public static float subtracao(float a, float b){
        return a - b;
    }

    public static float multiplicacao(float a, float b){
        return a * b;
    }

    public static float divisao (float a, float b){
        
        if (b == 0){
            System.out.println("ERROR: Dividiu por 0");
        }else{
            return a / b;
        }
        return a / b;
    }
    public static float resto (float a, float b){
        return a % b;
    }

}