package fiuba.algo3.pokemon;

public class Charmander extends Pokemon {

    protected double resistenciaFuego = 0.0; // no asignado
    protected double resistenciaAgua = 0.6;

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
        int danioTotal = (int)(danioFuego * resistenciaFuego);
        recibirDanio(danioTotal);
    }

    @Override 
    public void resistirDanioAgua(int danioAgua) {
        int danioTotal = (int)(danioAgua * resistenciaAgua);
        recibirDanio(danioTotal);
    }
}
