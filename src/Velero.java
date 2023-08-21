public class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, int añoFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, añoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public double calcularMontoAlquiler() {
        double montoAlquiler = getPrecioBase();
        if (getAñoFabricacion() > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }

    public boolean esGrande() {
        return cantidadMastiles > 4;
    }

    public String obtenerInfoCapitan() {
        Capitan capitan = getCapitan();
        return "Capitán: " + capitan.getNombre() + " " + capitan.getApellido() + " (Matrícula: " + capitan.getMatriculaNavegacion() + ")";
    }
}
