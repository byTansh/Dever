import java.util.Scanner;

public class Principal {
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
                    // Adicionar Moeda
                    System.out.print("\n" + "Moedas:" + "\n" + "\n" +
                            "|1 -> Real" + "\n" +
                            "|2 -> Dolar" + "\n" +
                            "|3 -> Iene" + "\n" +
                            "|4 -> Euro" + "\n" +
                            "|" + "\n" +
                            "|0 -> Voltar" + "\n" +
                            "|>> ");
                    int tipoMoeda = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Digite o valor: ");
                    double valor = entrada.nextDouble();
                    entrada.nextLine();

                    Moeda moeda;
                    switch (tipoMoeda) {
                        case 1:
                            moeda = new Real(valor);
                            break;
                        case 2:
                            moeda = new Dolar(valor);
                            break;
                        case 3:
                            moeda = new Euro(valor);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            continue;
                    }

                    cofrinho.adicionarMoeda(moeda);
                    System.out.println("Moeda adicionada com sucesso!");
                    break;

                case 2: // Remover Moeda
                    System.out.println("\nLista de Moedas:");
                    for (Moeda m : cofrinho.listarMoedas()) {
                        System.out.println(m.info());
                    }

                    System.out.print("Digite o índice da moeda a ser removida: ");
                    int indice = entrada.nextInt();
                    entrada.nextLine();

                    if (indice >= 0 && indice < cofrinho.listarMoedas().size()) {
                        Moeda moedaRemover = cofrinho.listarMoedas().get(indice);
                        cofrinho.removerMoeda(moedaRemover);
                        System.out.println("Moeda removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
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

                case 0: // Encerrar
                    System.out.println("\nFinal do programa");
                    entrada.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            entrada.close();
        }
    }
}