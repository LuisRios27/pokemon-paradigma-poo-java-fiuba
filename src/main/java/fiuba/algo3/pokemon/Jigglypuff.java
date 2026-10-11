package fiuba.algo3.pokemon;

public class Jigglypuff extends Pokemon {

    protected double resistenciaFuego = 0.2;

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
        int danioTotal = (int)(danioFuego * resistenciaFuego);
        recibirDanio(danioTotal);
    }

}
