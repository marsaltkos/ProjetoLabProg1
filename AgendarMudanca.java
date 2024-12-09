import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgendarMudanca {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner dado = new Scanner(System.in);
        int mes, ano;

        // Entrada do mês e ano
        System.out.println("Escolha um mês (1-12): ");
        mes = dado.nextInt();
        System.out.println("Escolha um ano (ex: 2023): ");
        ano = dado.nextInt();

        // Imprime o calendário do mês escolhido
        imprimirCalendario(mes, ano);

        // Entrada de dados
        String dataa;
        int horario;

        while (true) {
            System.out.println("Escolha uma data para realizar sua mudança (formato: dd/MM/yyyy). \nImportante: As mudanças só podem ser agendadas entre os dias de segunda-feira a sexta-feira");
            dataa = dado.next();

            // Verifica se a data é válida
            LocalDate data;
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                data = LocalDate.parse(dataa, formatter);

                // Verifica se a data é um dia da semana (segunda a sexta)
                if (data.getDayOfWeek().getValue() >= 6) { // 6 = Sábado, 7 = Domingo
                    System.out.println("ERRO. As mudanças só podem ser agendadas de segunda a sexta-feira.");
                    continue; // Volta para o início do loop
                }
            } catch (DateTimeParseException e) {
                System.out.println("ERRO. Data inválida. Por favor, use o formato dd/MM/yyyy.");
                continue; // Volta para o início do loop
            }

            // Entrada do horário
            System.out.println("Escolha um horário entre 8:00 e 18:00. Digite apenas os primeiros dígitos. Por exemplo, se quiser agendar para as 14:00, digite apenas 14");
            while (true) {
                try {
                    horario = dado.nextInt();
                    if (horario < 8 || horario > 18) {
                        System.out.println("ERRO. Escolha um horário entre 8 e 18");
                    } else {
                        break; // Horário válido, sai do loop
                    }
                } catch (InputMismatchException e) {
                    System.out.println("ERRO. Entrada inválida. Por favor, insira um número.");
                    dado.next(); // Limpa a entrada inválida
                }
            }

            // Saída de dados
            System.out.println("Seu agendamento foi solicitado para a data " + dataa + ", às " + horario + ":00 horas");
            System.out.println("Aguarde a confirmação por e-mail, após verificarmos se não há agendamento prévio. Obrigado.");
            break; // Sai do loop principal após um agendamento bem-sucedido
        }

        dado.close();
    }

    // Método para imprimir o calendário do mês escolhido
    private static void imprimirCalendario(int mes, int ano) {
        Month month = Month.of(mes);
        System.out.println("Calendário de " + month + " de " + ano + ":");
        System.out.println("Segunda   Terça     Quarta    Quinta    Sexta     Sábado    Domingo");
        System.out.println("---------------------------------------------------------------");

        // Cria um LocalDate para o primeiro dia do mês
        LocalDate primeiroDia = LocalDate.of(ano, mes, 1);
        int diaDoMes = primeiroDia.lengthOfMonth(); // Total de dias no mês

        // Ajusta o dia da semana do primeiro dia do mês
        int diaDaSemana = primeiroDia.getDayOfWeek().getValue(); // 1 = Segunda, 7 = Domingo

        // Imprime espaços em branco até o primeiro dia do mês
        for (int i = 1; i < diaDaSemana; i++) {
            System.out.print("          |");
        }

            // Imprime os dias do mês
            for (int dia = 1; dia <= diaDoMes; dia++) {
                System.out.printf("%-10s", dia);
                if ((dia + diaDaSemana - 1) % 7 == 0) { // Nova linha a cada 7 dias
                    System.out.println(); // Pula para a próxima linha
                }
            }

            // Se o último dia do mês não cair em um domingo, imprime linhas em branco
            if ((diaDoMes + diaDaSemana - 1) % 7 != 0) {
                System.out.println(); // Pula para a próxima linha
            }
            System.out.println("---------------------------------------------------------------");
        }
    }
