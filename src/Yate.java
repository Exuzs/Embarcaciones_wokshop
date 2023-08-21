public class Yate extends Embarcacion {
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, int añoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, añoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public double calcularMontoAlquiler() {
        double montoAlquiler = getPrecioBase();
        if (getAñoFabricacion() > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }

    public boolean esDeLujo() {
        return cantidadCamarotes > 7;
    }

    public String obtenerInfoCapitan() {
        Capitan capitan = getCapitan();
        return "Capitán: " + capitan.getNombre() + " " + capitan.getApellido() + " (Matrícula: " + capitan.getMatriculaNavegacion() + ")";
    }

    public void comprarYate() {
        System.out.println("El yate ha sido comprado");
    }
}