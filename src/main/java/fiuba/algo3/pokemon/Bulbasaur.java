package fiuba.algo3.pokemon;

public class Bulbasaur extends Pokemon{
    
    protected double resistenciaFuego = 0.4;
    protected double resistenciaAgua = 0.14;


    public Bulbasaur() {
        this.puntos = 140;
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

    @Override 
    public void resistirDanioAgua(int danioAgua) {
        int danioTotal = (int)(danioAgua * resistenciaAgua);
        recibirDanio(danioTotal);
    }
}