package fiuba.algo3.pokemon;

public class Charmander extends Pokemon {

    private static final int PUNTOS_INICIALES = 120;
    private static final double RESISTENCIA_FUEGO = 0.0;
    private static final double RESISTENCIA_AGUA = 0.6;
    private static final double RESISTENCIA_PLANTA = 0.12;

    private static final int DANIO_ATAQUE_BRASAS = 50;

    public Charmander() {
        super(PUNTOS_INICIALES, RESISTENCIA_FUEGO, RESISTENCIA_AGUA, RESISTENCIA_PLANTA);
    }

    public void brasas(Pokemon otroPokemon) {
        otroPokemon.recibirDanioDeFuego(DANIO_ATAQUE_BRASAS);
    }

    @Override
    public void dormirse() {
    }

    @Override
    public void despertarse() {
    }

}
