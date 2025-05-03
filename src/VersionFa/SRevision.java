package VersionFa;

import java.util.Date;

public class SRevision extends Servicio{
    private String revision;
    private boolean clienteHabitual;//True significa que si es un cliente habitual

    public SRevision(String nCliente, int obrasH, int desplazamientoH, Date fInicio, String detalle, String revision, boolean clienteHabitual) {
        super(nCliente, obrasH, desplazamientoH, fInicio, detalle);
        this.revision = revision;
        this.clienteHabitual = clienteHabitual;
    }

    public SRevision() {
        this(null, 0, 0, null, null,null,false);
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public boolean isClienteHabitual() {
        return clienteHabitual;
    }

    public void setClienteHabitual(boolean clienteHabitual) {
        this.clienteHabitual = clienteHabitual;
    }


}
