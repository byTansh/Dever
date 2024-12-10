public class Real extends Moeda {
    
    public Real(double valor) {
        this.valor = valor;
    }

    @Override
    public String info() {
        return "Real: " + valor;
    }

    @Override
    public double converterReal() {
        // Conversão do Real para Real (retorna o próprio valor)
        return valor;
    }
}