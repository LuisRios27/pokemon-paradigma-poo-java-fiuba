package fiuba.algo3.pokemon;

public class Jigglypuff extends Pokemon {

    private static final int PUNTOS_INICIALES = 60;
    private static final double RESISTENCIA_FUEGO = 0.2;
    private static final double RESISTENCIA_AGUA = 0.3;
    private static final double RESISTENCIA_PLANTA = 0.24;

    public Jigglypuff() {
        super(PUNTOS_INICIALES, RESISTENCIA_FUEGO, RESISTENCIA_AGUA, RESISTENCIA_PLANTA);
    }

    public void cachetazo(Pokemon otroPokemon) {
        otroPokemon.recibirDanio(10);
    }

    public void cantar(Pokemon otroPokemon) {
        otroPokemon.dormirse();
    }

    @Override
    public void dormirse() {
        throw new JigglypuffNoPuedeDormirseException();
    }

    @Override
    public void despertarse() {
    }

}
