public class Euro extends Moeda {

    // Definindo o valor da moeda que será convertida
    private static final double conversao = 6.36;

    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    public String info() {
        return "Euro: " + valor;
    }

    @Override
    public double converterReal() {
        return valor * conversao;
    }
}
