package fiuba.algo3.pokemon;

public class Squirtle extends Pokemon {
 
    protected double resistenciaFuego = 0.1;
    
    public Squirtle() {
        this.puntos = 150;
    }

    public void burbuja(Pokemon unPokemon) {
        unPokemon.recibirDanio(15);
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
