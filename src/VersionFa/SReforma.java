package VersionFa;
import java.util.ArrayList;
import java.util.Date;

public class SReforma extends Servicio implements GastosMaterial{
    private ArrayList<String> materiales = new ArrayList<>();
    private int MaterialGastadoP;

    public SReforma(int obrasH, int desplazamientoH, Date fInicio, String detalle, ArrayList<String> materiales) {
        super( obrasH, desplazamientoH, fInicio, detalle);
        this.materiales = materiales;
    }

    public SReforma() {
        this(0, 0, null, null,null);
    }

    @Override
    public double calcularTotalCliente() {

        return 0;
    }

    public ArrayList<String> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<String> materiales) {
        this.materiales = materiales;
    }

    /*Implementar gastar material*/
    public int gastarMaterial(){
        return MaterialGastadoP;
    }


}
