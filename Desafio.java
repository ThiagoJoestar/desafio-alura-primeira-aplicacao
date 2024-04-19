import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dadosIniciais = """
                ==========================
                -------Banco Alura--------
                ==========================
                Cliente:     Thiago Piassi
                Tipo de conta:    Corrente
                Saldo Inicial:   R$2500.00
                ==========================""";

        String menuOperaçoes = """
                
                SELECIONE UMA OPERAÇÃO:
                [1] - SALDO
                [2] - RECEBER DINHEIRO
                [3] - ENVIAR DINHEIRO
                [4] - ENCERRAR
                """;

        String msgSaldoInsulficiente = "SALDO INSULFICIENTE PARA REALIZAR A OPERAÇÃO!";

        String msgEncerramento = """
                ==================================================
                                ENCERRANDO SESSÃO...
                Obrigado por ultilizar os serviços do Banco Alura!
                ==================================================""";

        int opcao;

        double saldo = 2500.00;
        double transferencia;
        double recebido;

        System.out.println(dadosIniciais);

        while (true){
            System.out.println(menuOperaçoes);
            opcao = sc.nextInt();

            if (opcao !=1 && opcao !=2 && opcao !=3 && opcao !=4) {
                System.out.println("Opção invalida!");
            }
            if (opcao == 1){
                System.out.println(String.format("Saldo R$%.2f", saldo));
            }
            if (opcao == 2) {
                System.out.println("Informe o valor que irá receber: R$ ");
                recebido = sc.nextDouble();
                System.out.println(String.format("R$%.2f Recebido com sucesso!", recebido));
                saldo += recebido;
                System.out.println(String.format("Saldo R$%.2f", saldo));
            }
            if (opcao == 3) {
                System.out.println("Informe o valor a ser transferido R$: ");
                transferencia = sc.nextDouble();
                if (transferencia < saldo){
                    System.out.println(String.format("Transferência de R$%.2f feita com sucesso!", transferencia));
                    saldo -= transferencia;
                    System.out.println(String.format("Saldo R$%.2f", saldo));
                } else {
                    System.out.println(msgSaldoInsulficiente);
                    System.out.println(String.format("Saldo R$%.2f", saldo));
                }
            }
            if (opcao ==4) {
                System.out.println(msgEncerramento);
                break;
            }
        }

    }
}
