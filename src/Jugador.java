import java.util.List;
import java.util.Comparator;

public class Jugador {
    private String jugador;
    private List cartas;

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public List getCartas() {
        return cartas;
    }

    public void setCartas(List cartas) {
        this.cartas = cartas;
    }

    public List<Carta> generarMano() {
        // Debe retornar una lista de 5 cartas aleatorias. ///BRYAN
    }

    /**
     * 
     * @param List cartas
     * @return carta de valor mayor en la lista
     */
    public Carta cartaMayor(List<Carta> cartas) {
        // Debe devolder la carta mas alta de la lista. ///SERGIO
        Carta tempCarta = cartas.get(0);
        for (var carta : cartas) {
            if (carta.getValor() > tempCarta.getValor()) {
                tempCarta = carta;
            }
        }
        return tempCarta;
    }

    public int parCarta(List Cartas) {
        // Buscar si hay un par en la Lista de cartas y devuleve el valor. ///ROLANDO
    }

}
