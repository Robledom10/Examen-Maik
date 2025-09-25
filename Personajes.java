public class Personajes {
    private Integer fuerza;
    private Integer inteligencia;
    private Integer resistencia;
    private Integer vida;

    public Personajes(Integer fuerza, Integer inteligencia, Integer resistencia, Integer vida) {
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.resistencia = resistencia;
        this.vida = vida;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer atacar() {
        Integer valorAtaque = getFuerza() * 2;

        if (getFuerza() > 7) {
            valorAtaque = getFuerza() * 3;
            setVida(vida - valorAtaque);
        } else if (getFuerza() <= getInteligencia()) {
            valorAtaque = getFuerza() * 5;
            setVida(vida - valorAtaque);
        }
        return getVida();
    }

    public Integer curarVida() {
        Integer valorCuracion;

        if (getInteligencia() > 5) {
            valorCuracion = getInteligencia() * 3;
            setVida(vida + valorCuracion);
        } else {
            valorCuracion = getInteligencia() * 2;
            setVida(vida + valorCuracion);
        }
        return getVida();
    }
}
