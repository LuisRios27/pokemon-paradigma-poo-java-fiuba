package fiuba.algo3.pokemon;

public abstract class Pokemon {

    protected int puntos;
    protected double resistenciaFuego;

    public int getPuntos() {
        return puntos;
    }

    public void recibirDanio(int danio) {
        if (puntos <= 0) {
            throw new PokemonEstaMuertoException();
        }
        puntos -= danio;
    }

    public abstract void dormirse();

    public abstract void despertarse();

    public abstract void resistirDanioFuego(int danioFuego);

}
