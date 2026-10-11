package fiuba.algo3.pokemon;

public class Pikachu extends Pokemon {

    private static final int PUNTOS_INICIALES = 100;
    private static final double RESISTENCIA_FUEGO = 0.0;
    private static final double RESISTENCIA_AGUA = 0.0;
    private static final double RESISTENCIA_PLANTA = 0.0;

    private EstadoPikachu estado = new EstadoPikachuNormal();

    public Pikachu() {
        super(PUNTOS_INICIALES, RESISTENCIA_FUEGO, RESISTENCIA_AGUA, RESISTENCIA_PLANTA);
    }

    public void impacTrueno(Pokemon otroPokemon) {
        estado.impacTrueno(this, otroPokemon);
    }

    @Override
    public void dormirse() {
        estado = new EstadoPikachuDormido();
    }

    @Override
    public void despertarse() {
        estado = new EstadoPikachuNormal();
    }

}
