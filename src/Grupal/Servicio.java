package Grupal;
import java.time.LocalDate;

public abstract class Servicio {
    public static final int HPRECIOOBRA = 60;
    public static final int HPRECIODESPLAZAMIENTO = 20;
    protected int obrasH;
    protected int desplazamientoH;
    protected LocalDate fInicio;
    double prespuestado;

    public Servicio(int obrasH, int desplazamientoH, LocalDate fInicio) {
        this.obrasH = obrasH;
        this.desplazamientoH = desplazamientoH;
        this.fInicio = fInicio;
        prespuestado = gastarManoObraDesplazamiento();
    }

    public Servicio() {
        this(0, 0, null);
    }

    public int getObrasH() {
        return obrasH;
    }

    public void setObrasH(int obrasH) {
        this.obrasH = obrasH;
    }

    public int getDesplazamientoH() {
        return desplazamientoH;
    }

    public void setDesplazamientoH(int desplazamientoH) {
        this.desplazamientoH = desplazamientoH;
    }

    public LocalDate getfInicio() {
        return fInicio;
    }

    public void setfInicio(LocalDate fInicio) {
        this.fInicio = fInicio;
    }

    public double getPrespuestado() {
        return prespuestado;
    }

    public void setPrespuestado(double prespuestado) {
        this.prespuestado = prespuestado;
    }

    //Este metodo calcula para todos los ejercicios la cantidad de horas trabajadas y de desplazamiento pero no el total, este ulitmo dependera de cada servicio//
    public double gastarManoObraDesplazamiento(){
        return (obrasH * HPRECIOOBRA) + (desplazamientoH * HPRECIODESPLAZAMIENTO);
    }

    public abstract double calcularTotalCliente();

    public String crearDetallesServicio(){
        return "Servicio{" +
                ", obrasH=" + obrasH +
                ", desplazamientoH=" + desplazamientoH +
                ", fInicio=" + fInicio +
                ", prespuestado=" + prespuestado +
                '}';
    }
}
