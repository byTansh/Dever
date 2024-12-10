import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cofrinho cofrinho = new Cofrinho();

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n---- Bem vindo ao banco Uninter ----\n");

        while (true) {
            // Exibir opções do cofrinho
            System.out.print("\n" + "Cofrinho:" + "\n" + "\n" +
                    "|1 -> Adicionar moeda" + "\n" +
                    "|2 -> Remover Moeda" + "\n" +
                    "|3 -> Listar Moeda" + "\n" +
                    "|4 -> Calcular total convertido para real" + "\n" +
                    "|" + "\n" +
                    "|0 -> Encerrar" + "\n" +
                    "|>> ");
            int opcao = entrada.nextInt();
            entrada.nextLine(); // Limpar o buffer do entrada
            switch (opcao) {
                case 1:
                    // Submenu para adicionar moeda
                    while (true) {
                        System.out.print("\n" + "Moedas:" + "\n" + "\n" +
                                "|1 -> Real" + "\n" +
                                "|2 -> Dolar" + "\n" +
                                "|3 -> Euro" + "\n" +
                                "|" + "\n" +
                                "|0 -> Voltar" + "\n" +
                                "|>> ");
                        int tipoDeMoeda = entrada.nextInt();
                        entrada.nextLine();

                        // Verificação para sair do submenu
                        if (tipoDeMoeda == 0) {
                            break; // Isso vai sair do while interno e voltar ao menu principal
                        }

                        System.out.print("\n" + "Digite o valor: ");
                        double valor = entrada.nextDouble();
                        entrada.nextLine();

                        Moeda moeda;
                        switch (tipoDeMoeda) {
                            case 1:
                                moeda = new Real(valor);
                                cofrinho.adicionarMoeda(moeda);
                                System.out.println("\n" +"Moeda adicionada com sucesso!");
                                break;
                            case 2:
                                moeda = new Dolar(valor);
                                cofrinho.adicionarMoeda(moeda);
                                System.out.println("\n" +"Moeda adicionada com sucesso!");
                                break;
                            case 3:
                                moeda = new Euro(valor);
                                cofrinho.adicionarMoeda(moeda);
                                System.out.println("\n" + "Moeda adicionada com sucesso!");
                                break;
                            default:
                                System.out.println("\n" +"Opção inválida!");
                        }
                    }
                    break;

                case 2: // Remover Moeda
                    
                    break;

                case 3: // Listar Moedas
                    System.out.println("\nLista de Moedas:");
                    for (Moeda m : cofrinho.listarMoedas()) {
                        System.out.println(m.info());
                    }
                    break;

                case 4: // Calcular total convertido para Real
                    double totalConvertido = cofrinho.totalConvertidoParaReal();
                    System.out
                            .println("\nO total convertido para real é: R$ " + String.format("%.2f", totalConvertido));
                    break;

                case 0:
                    // Código para encerrar o programa
                    System.out.println("\nFinal do programa");
                    entrada.close(); // Fecha o Scanner após sair do loop
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}