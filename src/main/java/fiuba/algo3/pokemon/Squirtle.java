package fiuba.algo3.pokemon;

public class Squirtle extends Pokemon {
 
    protected double resistenciaFuego = 0.1;
    protected double resistenciaAgua = 0.0; // no asignado
    protected double resistenciaPlanta = 0.0; // no asignado
    
    private static final int DANIO_ATAQUE_BURBUJA = 50;
    
    public Squirtle() {
        this.puntos = 150;
    }

    public void burbuja(Pokemon unPokemon) {
        unPokemon.resistirDanioAgua(DANIO_ATAQUE_BURBUJA);
    }

    public void dormirse() {
    }

    public void despertarse() {
    }

    @Override 
    public void resistirDanioFuego(int danioFuego) {
        int danioTotal = (int)(danioFuego * this.resistenciaFuego);
        recibirDanio(danioTotal);
    }

    @Override 
    public void resistirDanioAgua(int danioAgua) {
        int danioTotal = (int)(danioAgua * this.resistenciaAgua);
        recibirDanio(danioTotal);
    }

    @Override 
    public void resistirDanioPlanta(int danioPlanta) {
        int danioTotal = (int)(danioPlanta * this.resistenciaPlanta);
        this.recibirDanio(danioTotal);
    }
}
