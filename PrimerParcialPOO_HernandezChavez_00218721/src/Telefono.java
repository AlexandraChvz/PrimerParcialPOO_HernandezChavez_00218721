public class Telefono extends Articulo implements PrecioDescripcion{
    private String sistemaOperativo;
    private int capacidadMemoriaInterna;
    private int RAM;

    public Telefono (){

    }

    public Telefono(String sistemaOperativo, int capacidadMemoriaInterna, int RAM) {
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadMemoriaInterna = capacidadMemoriaInterna;
        this.RAM = RAM;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getCapacidadMemoriaInterna() {
        return capacidadMemoriaInterna;
    }

    public void setCapacidadMemoriaInterna(int capacidadMemoriaInterna) {
        this.capacidadMemoriaInterna = capacidadMemoriaInterna;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
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
