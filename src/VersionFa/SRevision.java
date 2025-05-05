package VersionFa;

import java.util.Date;

public class SRevision extends Servicio{
    private String revision;

    public SRevision(int obrasH, int desplazamientoH, Date fInicio, String detalle, String revision) {
        super(obrasH, desplazamientoH, fInicio, detalle);
        this.revision = revision;
    }

    public SRevision() {
        this(0, 0, null, null,null);
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }



}
