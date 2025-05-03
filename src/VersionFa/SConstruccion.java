package VersionFa;

import java.util.Date;

public class SConstruccion extends Servicio implements GastosMaterial {
    private int MaterialGastadoP;
    public SConstruccion(String nCliente, int obrasH, int desplazamientoH, Date fInicio, String detalle, int MaterialGastadoP) {
        super(nCliente, obrasH, desplazamientoH, fInicio, detalle);
        this.MaterialGastadoP = MaterialGastadoP;
    }

    public SConstruccion() {
        this(null, 0, 0, null, null,0);
    }

    public int gastarMaterial(){
        return 0;
    }


}
