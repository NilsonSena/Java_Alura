import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double saldo = 2500.00;
        double receber = 0;
        double tranferir = 0;
        int operacao = 0;

        System.out.println(String.format("""
                *********************************
                Nome:             Nilson Sena
                Tipo conta:       Corrente
                Saldo inicial:    %.2f
                *********************************
                """, saldo));

        while (operacao != 4) {

            System.out.println("""
                    Operações
                                        
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir Valor
                    4- Sair
                    """);
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1 -> {
                    System.out.println("------Verificar Saldo------");
                    System.out.println("Seu saldo é: R$ " + saldo);
                }
                case 2 -> {
                    System.out.println("------Receber Valor------");
                    System.out.println("Digite o valor a ser recebido:");
                    receber = leitura.nextDouble();
                    saldo = saldo + receber;
                }
                case 3 -> {
                    System.out.println("------Transferir Valor------");
                    System.out.println("Digite o valor a ser transferido:");
                    tranferir = leitura.nextDouble();
                    if ((saldo - tranferir) < 0) {
                        System.out.println("Não foi possivel realizar a tranferencia, saldo insuficiente!");
                    } else {
                        System.out.println("Transferencia realizada com sucesso!");
                        saldo = saldo - tranferir;
                    }
                }
                case 4 -> System.out.println("Obrigado por utilizar nosso sistema bancário!");
                default -> System.out.println("Digite uma opção válida!");
            }
        }
    }
}
