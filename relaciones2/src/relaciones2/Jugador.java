package relaciones2;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(boolean mojado) {
        this.mojado = false;
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    public void cargarJugador (List<Jugador> jugadores, int cantidadJugadores){
        if (cantidadJugadores >=1 &&cantidadJugadores <= 6) {
            for (int i = 1; i <= cantidadJugadores; i++) {
                Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
               
                
                
            }
        }
    }
    
}