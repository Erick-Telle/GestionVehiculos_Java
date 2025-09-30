package Clases;

public class SistemaVehiculos {
    public static void main(String[] args) {
        // Crear instancias de vehículos
        Vehiculo auto = new Automovil("Toyota", "Corolla", 2020, 40.0);
        Vehiculo bici = new Bicicleta("Trek", "Mountain", 2022, 21);
        Vehiculo moto = new Motocicleta("Honda", "CBR500R", 2021, 500, 10.0);

        Vehiculo[] vehiculos =  {auto, bici, moto};
        // Probar polimorfismo
        auto.mover();
        System.out.println(auto.obtenerDetalles());
        ((Combustible) auto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) auto).obtenerNivelCombustible());

        bici.mover();
        System.out.println(bici.obtenerDetalles());

        moto.mover();
        System.out.println(moto.obtenerDetalles());
        ((Combustible) moto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) moto).obtenerNivelCombustible());

        System.out.println("\n--- Mantenimiento de vehículos ---");
        ((Combustible) auto).realizarMantenimiento();
        System.out.println("La bicicleta " + bici.marca + " " + bici.modelo + " no requiere mantenimiento especializado.");
        ((Combustible) moto).realizarMantenimiento();

        procesarVehiculos(vehiculos);
    }
    public static void procesarVehiculos(Vehiculo[] vehiculos) {
        for (Vehiculo v : vehiculos) {
            v.mover();
            System.out.println(v.obtenerDetalles());
            if (v instanceof Combustible) {
                Combustible c = (Combustible) v;
                System.out.println("Nivel de combustible antes de recargar: " + c.obtenerNivelCombustible() + " litros");
                c.recargarCombustible();
                System.out.println("Nivel de combustible después de recargar: " + c.obtenerNivelCombustible() + " litros");
            }
            System.out.println(); // Línea en blanco para separar la salida de cada vehículo
        }
    }

}


