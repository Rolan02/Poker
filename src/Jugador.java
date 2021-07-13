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
    public List<Carta> generarMano(){
        //Debe retornar una lista de  5 cartas aleatorias. ///BRYAN
    }
    public Carta cartaMayor(List cartas){
        //Debe devolder la carta mas alta de la lista. ///SERGIO
    }
    public int parCarta(List Cartas){
      //  aqui entrara mi tranajo
    }

}
