package fiuba.algo3.pokemon;

public abstract class Pokemon {

    private int puntos;
    private final double resistenciaFuego;
    private final double resistenciaAgua;
    private final double resistenciaPlanta;

    protected Pokemon(int puntos, double resistenciaFuego, double resistenciaAgua, double resistenciaPlanta) {
        this.puntos = puntos;
        this.resistenciaFuego = resistenciaFuego;
        this.resistenciaAgua = resistenciaAgua;
        this.resistenciaPlanta = resistenciaPlanta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void recibirDanio(int danio) {
        if (puntos <= 0) {
            throw new PokemonEstaMuertoException();
        }
        puntos = Math.max(0, puntos - danio);
    }

    public void recibirDanioDeFuego(int danioBase) {
        recibirDanio(aplicarResistencia(danioBase, resistenciaFuego));
    }

    public void recibirDanioDeAgua(int danioBase) {
        recibirDanio(aplicarResistencia(danioBase, resistenciaAgua));
    }

    public void recibirDanioDePlanta(int danioBase) {
        recibirDanio(aplicarResistencia(danioBase, resistenciaPlanta));
    }

    private int aplicarResistencia(int danioBase, double resistencia) {
        return (int) Math.round(danioBase * resistencia);
    }

    public abstract void dormirse();

    public abstract void despertarse();

}
