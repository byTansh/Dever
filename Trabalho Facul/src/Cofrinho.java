import java.util.ArrayList;
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
    public void removerQuantidade(int quantidade) {
        
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