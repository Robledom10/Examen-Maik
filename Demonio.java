public class Demonio extends Personajes {
    public Demonio(Integer fuerza, Integer inteligencia, Integer resistencia,Integer vida) {
        super(fuerza, inteligencia, resistencia,vida);
    }

    public Integer aumentoResistencia() {
        return getResistencia() + 2;
    }

    @Override
    public Integer atacar() {
        Integer valorAtaque = getFuerza() * 2;

        if (getFuerza() > 7) {
            valorAtaque = getFuerza() * 3;
            setVida(getVida() - valorAtaque);
        } else if (getFuerza() <= getInteligencia()) {
            valorAtaque = getFuerza() * 5;
            setVida(getVida() - valorAtaque);
        }
        return getVida();
    }

}
