package fiuba.algo3.pokemon;

public class Charmander extends Pokemon {

    protected double resistenciaFuego = 0.0; // no asignado

    private int danioAtaqueBrasas = 50;

    public Charmander() {
        this.puntos = 120;
    }

    public void brasas(Pokemon uPokemon) {
        uPokemon.resistirDanioFuego(50);
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
}
