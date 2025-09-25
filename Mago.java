public class Mago extends Personajes {
    public Mago(Integer fuerza, Integer inteligencia, Integer resistencia,Integer vida) {
        super(fuerza, inteligencia, resistencia,vida);
    }

    @Override
    public Integer atacar() {
         Integer valorAtaque = getFuerza() * 2;

        if (getFuerza() > 7) {
            valorAtaque = getFuerza() * 3;
            setVida(getVida() - valorAtaque);
        } else if (getFuerza() <= getInteligencia()) {
            valorAtaque = getFuerza() *4;
            setVida(getVida() - valorAtaque);
        } 

        if (getResistencia() > 5) {
            setVida(getVida() + 10);
        }
        return getVida();
    }
}
