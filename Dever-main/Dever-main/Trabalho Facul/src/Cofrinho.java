import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    // Método para remover uma moeda
        public void removerMoeda(Moeda moeda, double valorRemover) {
        Iterator<Moeda> iterator = moedas.iterator();
        double valorRemovido = 0;

        while (iterator.hasNext()) {
            Moeda m = iterator.next();

            if (m.getClass() == moeda.getClass()) {
                if (m.valor <= valorRemover - valorRemovido) {
                    valorRemovido += m.valor;
                    iterator.remove();
                } else {
                    m.valor -= (valorRemover - valorRemovido);
                    break;
                }

                if (valorRemovido >= valorRemover) {
                    break;
                }
            }
        }
    }

    // Método para listar todas as moedas
    public List<Moeda> listarMoedas() {
        return moedas;
    }

    // Método para calcular o valor total convertido para Real
    public double totalConvertidoParaReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterReal();
        }
        return total;
    }
}