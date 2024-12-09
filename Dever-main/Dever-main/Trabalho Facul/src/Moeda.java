public abstract class Moeda {
    
    protected double valor;

    // Método abstrato para obter informações sobre a moeda
    public abstract String info();

    // Método abstrato para converter a moeda
    public abstract double converterReal();
}