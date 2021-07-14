public class Carta {


    private int valor;

    public Carta(Tipo tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }


    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
