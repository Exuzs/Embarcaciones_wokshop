abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private int añoFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, int añoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public abstract double calcularMontoAlquiler();
}
