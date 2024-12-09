public class Dolar extends Moeda {

    // Definindo o valor da moeda que será convertida
    private static final double conversao = 6.08; 

    public Dolar(double valor) {
        this.valor = valor;
    }

    @Override
    public String info() {
        return "Dólar: " + valor;
    }

    @Override
    public double converterReal() {
        return valor * conversao;
    }
}