public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Juan", "Perez", "123ABC");
        Velero velero1 = new Velero(capitan1, 1000, 2022, 10, 5);
        Yate yate1 = new Yate(capitan1, 1500, 2023, 15, 8);

        System.out.println("Monto de alquiler del velero: $" + velero1.calcularMontoAlquiler());
        System.out.println("El velero es grande: " + velero1.esGrande());
        System.out.println(velero1.obtenerInfoCapitan()); // Información del capitán del velero

        System.out.println("Monto de alquiler del yate: $" + yate1.calcularMontoAlquiler());
        System.out.println("El yate es de lujo: " + yate1.esDeLujo());
        System.out.println(yate1.obtenerInfoCapitan()); // Información del capitán del yate

        yate1.comprarYate();

    }
}