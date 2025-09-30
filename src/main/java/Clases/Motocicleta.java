package Clases;

class Motocicleta extends Vehiculo implements Combustible {
    private int cilindrada;
    private double nivelCombustible;
    private final double capacidadTanque = 20.0;

    public Motocicleta(String marca, String modelo, int anio, int cilindrada, double nivelCombustible) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("La motocicleta "+ marca + " "+ modelo + "esta acelerando con "+ cilindrada+ " cc.");
            nivelCombustible -= 0.3;
        }
        else {
            System.out.println("La motocicleta " + marca + " "+ modelo + "No tiene combustible");
        }
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Cilindrada: " + cilindrada + " cc, Combustible: " + nivelCombustible + " litros";
    }

    @Override
    public void recargarCombustible() {
        nivelCombustible = capacidadTanque;
        System.out.println("La motocicleta " + marca + " " + modelo + " ha sido recargado con combustible.");
    }

    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Cambiando aceite de la motocicleta " + marca + " " + modelo + ".");
    }

}
