import java.io.*;
import java.util.*;

public class CriaAquivo{
    private static Formatter arqSaida;
    private static Scanner arqEnt;

    public static void main(String[] args) {
        abreArqEscrita();
        adicionaRegistro();
        fechaArqEsc();
        abreArqLeitura();
        leRegistro();
        fecharArqLeit();
    }

    public static void abreArqEscrita(){
        try {
            arqSaida = new Formatter("clientes.txt");
        } catch (SecurityException securityException) {
            System.err.println("Permissão de escrita negado. Fechando...");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir o arquivo. Fechando...");
            System.exit(1);
        }
    }

    public static void abreArqLeitura(){
        try{
            arqEnt = new Scanner (new File ("clientes.txt"));
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir o arquivo. Fechando...");
            System.exit(1);
        }
    }

    public static void adicionaRegistro(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n ", 
        "Digite o número da conta, primeiro nome, sobrenome e saldo.",
        "Digite <CRTL> Z para finalizar.");

        while (input.hasNext()){
            try{
                arqSaida.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            }
            catch(FormatterClosedException formatterClosedException){
                System.out.println("Erro ao escrever no arquivo. Fechando...");
                break;
            }catch (NoSuchElementException elementException){
                System.err.println("Entrada inválida. Tente novamente.");
                input.nextLine();
            }
            System.out.println("? ");
        }
        input.close();
    }

    public static void leRegistro() {
        int conta;
        String nome, sobrenome;
        float saldo;
        System.out.printf("%-10s %-12s %-12s %10s\n", "Conta", "Nome", "Sobrenome", "Saldo");
        try{
            while (arqEnt.hasNext()){
                conta = arqEnt.nextInt();
                nome = arqEnt.next();
                sobrenome = arqEnt.next();
                saldo = arqEnt.nextFloat();
            }
        } catch (NoSuchElementException elementException){
            System.err.println("Arquivo corrompido.");
            arqEnt.close();
            System.exit(1);
        }
    }

    public static void fechaArqEsc(){
        if (arqSaida != null)
            arqSaida.close();
    }
    
    public static void fecharArqLeit(){
        if (arqEnt != null)
            arqEnt.close();
    }
}
