import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(500, "Solar", 0.8, 100, 50, 300);
        Auto auto = new Auto(2000, "Gasolina", 0.05, 15000, 10, 1000);
        Bicicleta bicicleta = new Bicicleta(50, "Li-ion", 0.01, 10, 5, 30);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.getClass().getSimpleName() + " Impacto Ecológico: " + objeto.calcularImpactoEcologico());
        }
    }
}

