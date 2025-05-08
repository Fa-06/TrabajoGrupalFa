package Grupal;

import java.time.LocalDate;
import java.util.Date;

public class SRevision extends Servicio {
    public static final double descuentoCliente = 0.90;
    private String revisable;
    private Cliente tipoCliente;

    public SRevision(int obrasH, int desplazamientoH, LocalDate fInicio, Cliente tipoCliente) {
        super(obrasH, desplazamientoH, fInicio);
        this.tipoCliente = tipoCliente;

    }

    public SRevision() {
        this(0, 0, null, null);
    }

    public String getRevisable() {
        return revisable;
    }

    public void setRevisable(String revisable) {
        this.revisable = revisable;
    }

    public Cliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Cliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public double calcularTotalCliente() {
        if (tipoCliente instanceof ClienteHabitual){
            prespuestado = prespuestado * descuentoCliente;
        }
        return prespuestado;
    }

    @Override
    public String crearDetallesServicio() {
        return "SRevision{" +
                "revisable='" + revisable + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", obrasH=" + obrasH +
                ", desplazamientoH=" + desplazamientoH +
                ", fInicio=" + fInicio +
                ", prespuestado=" + prespuestado +
                '}';
    }
}
