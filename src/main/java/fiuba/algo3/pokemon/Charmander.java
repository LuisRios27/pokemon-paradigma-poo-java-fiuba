package fiuba.algo3.pokemon;

public class Charmander extends Pokemon {

    public Charmander() {
        this.puntos = 120;
    }

    public void brasas(Pokemon uPokemon) {
        uPokemon.recibirDanio(10);
        return;
    }

    public void dormirse() {
    }

    public void despertarse() {
    }
}
