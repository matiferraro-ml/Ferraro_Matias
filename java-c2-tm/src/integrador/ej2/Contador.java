package integrador.ej2;

public class Contador {

    private long valor;

    public Contador() { }

    public Contador(long valor) {
        this.valor = valor;
    }

    public Contador(Contador unContador) {
        this.valor = unContador.getValor();
    }

    public void incrementar(long cantidad) {
        valor += cantidad;
    }

    public void decrementar(long cantidad) {
        valor -= cantidad;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

}
