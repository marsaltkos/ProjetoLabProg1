public class EmSala04 {

    public static void main(String[] args) {

        int numeroReverso = 0;
        int contPalindromo = 0;
        int numero = 10000;

        System.out.println("TODOS OS NÚMEROS PALÍNDROMOS DE 5 ALGARISMOS: ");


        while(numero <= 99999){

            numeroReverso = numero % 10;
            numeroReverso = numeroReverso * 10;
            numero = numero / 10;

            for (int i = 1; i < 5; i++) {

                numeroReverso = numeroReverso + (numero % 10);
                numeroReverso = numeroReverso * 10;
                numero = numero / 10;

                if (numeroReverso == numero){
                    contPalindromo++;
                    System.out.println(contPalindromo + "º número palíndromo: " + numero);
                }
            }
            numero++;

        }
        System.out.println("No total, existem " + contPalindromo + " números palíndromos de 5 algarismos.");

    }

}
