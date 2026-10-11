package fiuba.algo3.pokemon;

public class Bulbasaur extends Pokemon {

    private static final int PUNTOS_INICIALES = 140;
    private static final double RESISTENCIA_FUEGO = 0.4;
    private static final double RESISTENCIA_AGUA = 0.14;
    private static final double RESISTENCIA_PLANTA = 0.0;

    private static final int DANIO_ATAQUE_LATIGO_CEPA = 50;

    public Bulbasaur() {
        super(PUNTOS_INICIALES, RESISTENCIA_FUEGO, RESISTENCIA_AGUA, RESISTENCIA_PLANTA);
    }

    public void latigoCepa(Pokemon otroPokemon) {
        otroPokemon.recibirDanioDePlanta(DANIO_ATAQUE_LATIGO_CEPA);
    }

    @Override
    public void dormirse() {
    }

    @Override
    public void despertarse() {
    }

}
