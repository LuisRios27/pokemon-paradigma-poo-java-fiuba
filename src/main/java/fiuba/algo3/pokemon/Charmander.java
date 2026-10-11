package fiuba.algo3.pokemon;

public class Charmander extends Pokemon {

    protected double resistenciaFuego = 0.0; // no asignado
    protected double resistenciaAgua = 0.6;
    protected double resistenciaPlanta = 0.0; // no asignado

    private static final int DANIO_ATAQUE_BRASAS = 50;
    
    public Charmander() {
        this.puntos = 120;
    }

    public void brasas(Pokemon uPokemon) {
        uPokemon.resistirDanioFuego(DANIO_ATAQUE_BRASAS);
        return;
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
