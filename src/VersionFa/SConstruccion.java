package VersionFa;

import java.util.Date;

public class SConstruccion extends Servicio implements GastosMaterial {
    private int MaterialGastadoP;
    public SConstruccion(int obrasH, int desplazamientoH, Date fInicio, String detalle, int MaterialGastadoP) {
        super(obrasH, desplazamientoH, fInicio, detalle);
        this.MaterialGastadoP = MaterialGastadoP;
    }

    public SConstruccion() {
        this(0, 0, null, null,0);
    }

    @Override
    public double calcularTotalCliente() {

        return 0;
    }

    public int gastarMaterial(){
        return 0;
    }


}
