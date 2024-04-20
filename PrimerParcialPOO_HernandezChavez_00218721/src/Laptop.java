public class Laptop extends Articulo implements PrecioDescripcion {
    private String procesador;
    private int capacidadMemoriaRam;
    private double capacidadDiscoDuro;


    public Laptop(String procesador, int capacidadMemoriaRam, double capacidadDiscoDuro) {
        this.procesador = procesador;
        this.capacidadMemoriaRam = capacidadMemoriaRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getCapacidadMemoriaRam() {
        return capacidadMemoriaRam;
    }

    public void setCapacidadMemoriaRam(int capacidadMemoriaRam) {
        this.capacidadMemoriaRam = capacidadMemoriaRam;
    }

    public double getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(double capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }


    @Override
    public String descripcionArticulo(String descripcion) {
        return null;
    }

    @Override
    public float precioArticulo(Float precio) {
        return 0;
    }
}
