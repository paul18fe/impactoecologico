public class Bicicleta implements ImpactoEcologico {
    private double emisionesProduccion;
    private String tipoBateria; // Solo para bicicletas eléctricas
    private double eficienciaEnergia;
    private double mantenimientoAnual;
    private int vidaUtil;
    private double impactoReciclaje;

    public Bicicleta(double emisionesProduccion, String tipoBateria, double eficienciaEnergia, double mantenimientoAnual, int vidaUtil, double impactoReciclaje) {
        this.emisionesProduccion = emisionesProduccion;
        this.tipoBateria = tipoBateria;
        this.eficienciaEnergia = eficienciaEnergia;
        this.mantenimientoAnual = mantenimientoAnual;
        this.vidaUtil = vidaUtil;
        this.impactoReciclaje = impactoReciclaje;
    }

    @Override
    public double calcularImpactoEcologico() {

        return emisionesProduccion + (eficienciaEnergia * mantenimientoAnual) + (impactoReciclaje / vidaUtil);
    }

}

