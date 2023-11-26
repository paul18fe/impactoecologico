public class Auto implements ImpactoEcologico {
    private double emisionesProduccion;
    private String tipoCombustible;
    private double eficienciaCombustible;
    private double kilometrajeAnual;
    private int duracion;
    private double emisionesReciclaje;

    public Auto(double emisionesProduccion, String tipoCombustible, double eficienciaCombustible, double kilometrajeAnual, int duracion, double emisionesReciclaje) {
        this.emisionesProduccion = emisionesProduccion;
        this.tipoCombustible = tipoCombustible;
        this.eficienciaCombustible = eficienciaCombustible;
        this.kilometrajeAnual = kilometrajeAnual;
        this.duracion = duracion;
        this.emisionesReciclaje = emisionesReciclaje;
    }

    @Override
    public double calcularImpactoEcologico() {

        return emisionesProduccion + (eficienciaCombustible * kilometrajeAnual) + (emisionesReciclaje / duracion);
    }
}
