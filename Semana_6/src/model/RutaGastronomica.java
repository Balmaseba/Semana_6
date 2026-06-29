package model;

public class RutaGastronomica extends ServicioTuristico{

    private int numeroParadas;

    public RutaGastronomica(){
    }

    public RutaGastronomica(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public RutaGastronomica(String nombre, int duracionHoras, int numeroParadas) {
        super(nombre, duracionHoras);
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public String toString() {
        return "|| Ruta Gastronómica -> " +
                nombre + "| Duración: " +
                duracionHoras + " horas| Numero de paradas: " +
                numeroParadas + " ||";
    }
}
