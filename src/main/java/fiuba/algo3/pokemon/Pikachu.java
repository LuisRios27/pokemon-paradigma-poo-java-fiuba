package fiuba.algo3.pokemon;

public class Pikachu extends Pokemon {

    protected double resistenciaFuego = 0.0; // no asignado
    protected double resistenciaAgua = 0.0; // no asignado
    protected double resistenciaPlanta = 0.0; // no asignado

    private EstadoPikachu estado = new EstadoPikachuNormal();

    public Pikachu() {
        puntos = 100;
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

    @Override 
    public void resistirDanioFuego(int danioFuego) {
        int danioTotal = (int)(danioFuego * this.resistenciaFuego);
        recibirDanio(danioTotal);
    }

    @Override 
    public void resistirDanioAgua(int danioAgua) {
        int danioTotal = (int)(danioAgua * this.resistenciaAgua);
        recibirDanio(danioTotal);
    }

    @Override 
    public void resistirDanioPlanta(int danioPlanta) {
        int danioTotal = (int)(danioPlanta * this.resistenciaPlanta);
        this.recibirDanio(danioTotal);
    }
}