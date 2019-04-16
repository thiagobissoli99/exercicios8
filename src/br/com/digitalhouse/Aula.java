package br.com.digitalhouse;

public class Aula extends materia {
    private float horarioInicio;
    private float horarioTermino;

    public float getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(float horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public float getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(float horarioTermino) {
        this.horarioTermino = horarioTermino;

        setHorarioInicio(5);
        setHorarioTermino(9);

    }



}
