import java.util.ArrayList;
import java.util.List;

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


    public Carta cartaMayor(List cartas){
    }
    public int parCarta(List Cartas){
    }

}
