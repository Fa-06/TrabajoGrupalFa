package VersionFa;
import java.util.Date;

public class Servicio {
    public static final int HPRECIOOBRA = 60;
    public static final int HPRECIODESPLAZAMIENTO = 20;
    protected String nCliente;
    protected int obrasH;
    protected int desplazamientoH;
    protected int presupuestadoH;
    protected int prespuestadoTotal;
    protected Date fInicio;
    protected String detalle;

    public Servicio(String nCliente, int obrasH, int desplazamientoH, int presupuestadoH, Date fInicio, String detalle) {
        this.nCliente = nCliente;
        this.obrasH = obrasH;
        this.desplazamientoH = desplazamientoH;
        this.presupuestadoH = presupuestadoH;
        this.fInicio = fInicio;
        this.detalle = detalle;
    }

    public Servicio(String nCliente, int obrasH, int desplazamientoH, Date fInicio, String detalle) {
        this.nCliente = nCliente;
        this.obrasH = obrasH;
        this.desplazamientoH = desplazamientoH;
        this.fInicio = fInicio;
        this.detalle = detalle;
    }

    public Servicio() {
        this(null, 0, 0, 0, null, null);
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

    public int getPrespuestadoTotal() {
        return prespuestadoTotal;
    }

    public void setPrespuestadoTotal(int prespuestadoTotal) {
        this.prespuestadoTotal = prespuestadoTotal;
    }

    public int getPresupuestadoH() {
        return presupuestadoH;
    }

    public void setPresupuestadoH(int presupuestadoH) {
        this.presupuestadoH = presupuestadoH;
    }

    //Este metodo calcula para todos los ejercicios la cantidad de horas trabajadas y de desplazamiento pero no el total, este ulitmo dependera de cada servicio//
    public void gastarManoObraDesplazamiento(){
        presupuestadoH = (obrasH * HPRECIOOBRA) + (desplazamientoH * HPRECIODESPLAZAMIENTO);
    }







}
