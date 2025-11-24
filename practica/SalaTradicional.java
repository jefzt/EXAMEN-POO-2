public class SalaTradicional extends Reserva {
    private int duracionMin;

    public SalaTradicional(String codigo, String nombrePelicula, double costoBase, int duracionMin) {
        super(codigo, nombrePelicula, costoBase);
        this.duracionMin = duracionMin;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) { 
        this.duracionMin = duracionMin; 
    }

    @Override
public String obtenerDetalles() {
    String resultado = super.obtenerDetalles();
    resultado += " - Duración: " + duracionMin + " min";
    return resultado;
}
}