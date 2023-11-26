public class Edificio implements ImpactoEcologico {
    private double emisionesConstruccion;
    private String tipoEnergia;
    private double eficienciaEnergia;
    private double mantenimientoAnual;
    private int vidaUtil;
    private double impactoDemolicion;

    public Edificio(double emisionesConstruccion, String tipoEnergia, 
            double eficienciaEnergia, double mantenimientoAnual, 
            int vidaUtil, double impactoDemolicion) {
        this.emisionesConstruccion = emisionesConstruccion;
        this.tipoEnergia = tipoEnergia;
        this.eficienciaEnergia = eficienciaEnergia;
        this.mantenimientoAnual = mantenimientoAnual;
        this.vidaUtil = vidaUtil;
        this.impactoDemolicion = impactoDemolicion;
    }

    @Override
    public double calcularImpactoEcologico() {
      
        return emisionesConstruccion + (eficienciaEnergia * mantenimientoAnual)
                + (impactoDemolicion / vidaUtil);
    }

  
}

