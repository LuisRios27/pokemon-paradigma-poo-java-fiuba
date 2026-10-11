package fiuba.algo3.pokemon;

public class Squirtle extends Pokemon {

    private static final int PUNTOS_INICIALES = 150;
    private static final double RESISTENCIA_FUEGO = 0.1;
    private static final double RESISTENCIA_AGUA = 0.0;
    private static final double RESISTENCIA_PLANTA = 0.48;

    private static final int DANIO_ATAQUE_BURBUJA = 50;

    public Squirtle() {
        super(PUNTOS_INICIALES, RESISTENCIA_FUEGO, RESISTENCIA_AGUA, RESISTENCIA_PLANTA);
    }

    public void burbuja(Pokemon otroPokemon) {
        otroPokemon.recibirDanioDeAgua(DANIO_ATAQUE_BURBUJA);
    }

    @Override
    public void dormirse() {
    }

    @Override
    public void despertarse() {
    }

}
