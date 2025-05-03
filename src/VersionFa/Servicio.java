package VersionFa;
import java.util.Date;

public class Servicio {
    public static final int HPRECIOOBRA = 60;
    public static final int HPRECIODESPLAZAMIENTO = 20;
    protected String nCliente;
    protected int obrasH;
    protected int desplazamientoH;
    protected Date fInicio;
    protected String detalle;
    protected int prespuestado;

    public Servicio(String nCliente, int obrasH, int desplazamientoH, Date fInicio, String detalle) {
        this.nCliente = nCliente;
        this.obrasH = obrasH;
        this.desplazamientoH = desplazamientoH;
        this.fInicio = fInicio;
        this.detalle = detalle;
        prespuestado = gastarManoObraDesplazamiento();
    }

    public Servicio() {
        this(null, 0, 0, null, null);
    }

    public String getnCliente() {
        return nCliente;
    }

    public void setnCliente(String nCliente) {
        this.nCliente = nCliente;
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

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getPrespuestado() {
        return prespuestado;
    }

    public void setPrespuestado(int prespuestado) {
        this.prespuestado = prespuestado;
    }

    //Este metodo calcula para todos los ejercicios la cantidad de horas trabajadas y de desplazamiento pero no el total, este ulitmo dependera de cada servicio//
    public int gastarManoObraDesplazamiento(){
        return (obrasH * HPRECIOOBRA) + (desplazamientoH * HPRECIODESPLAZAMIENTO);
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nCliente='" + nCliente + '\'' +
                ", obrasH=" + obrasH +
                ", desplazamientoH=" + desplazamientoH +
                ", fInicio=" + fInicio +
                ", detalle='" + detalle + '\'' +
                ", prespuestado=" + prespuestado +
                '}';
    }
}
