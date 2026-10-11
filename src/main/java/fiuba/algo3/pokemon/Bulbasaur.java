package fiuba.algo3.pokemon;

public class Bulbasaur extends Pokemon{
    
    protected double resistenciaFuego = 0.4;
    protected double resistenciaAgua = 0.14;
    protected double resistenciaPlanta = 0.0; // no asignado

    private static final int DANIO_ATAQUE_LATIGO_CEPA = 50;

    public Bulbasaur() {
        this.puntos = 140;
    }

    public void latigoCepa(Pokemon unPokemon) {
        unPokemon.resistirDanioPlanta(DANIO_ATAQUE_LATIGO_CEPA);
        return;
    }

    public void dormirse() {
    }

    public void despertarse() {
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