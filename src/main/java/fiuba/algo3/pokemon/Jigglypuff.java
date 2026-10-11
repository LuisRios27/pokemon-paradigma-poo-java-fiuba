package fiuba.algo3.pokemon;

public class Jigglypuff extends Pokemon {

    protected double resistenciaFuego = 0.2;
    protected double resistenciaAgua = 0.3;
    protected double resistenciaPlanta = 0.24;

    public Jigglypuff() {
        puntos = 60;
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
