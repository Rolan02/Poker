import java.util.ArrayList;
import java.util.Collections;
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

    /**
     *
     * @return retornara una mano con 5 valores aleatorios
     */
    public List<Carta> generarMano(){
        List mano = new ArrayList();
        for (int i = 0; i < 4; i++) {
            mano.add(array.get((int)math.randow()*5),(int)Math.random()*14));

            System. out. println(mano);
            //print
        }
        return mano;
        // nose si estoy usando bien los arreglos
        int Array[] = {corazon,trebol,diamante,espada};
        for (int i = 1; i < 3; i++) {

        }

        // Borrar el la clase tipo
        // Array[corazon,espada......] 1 - 3
        //array.get(math.randow()*5)
      //  CORAZON 4
        //
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

    /**
     * 
     * @param mano  que se va a ordenar
     * @param orden que se va a aplicar true ascendente, false descendiente
     * @return mano con el orden establecido
     */
    public List<Carta> ordenarMano(List<Carta> mano, Boolean orden) {

        Comparator<Carta> compararPorNumero = (Carta c1, Carta c2) -> Integer.valueOf(c1.getValor())
                .compareTo(c2.getValor());
        Collections.sort(mano, (orden) ? compararPorNumero : compararPorNumero.reversed());
        return mano;
    }

}
