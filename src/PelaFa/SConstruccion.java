package PelaFa;
import java.util.Date;

public class SConstruccion extends Servicio implements GastosMaterial {
    private double MaterialGastadoP;
    public SConstruccion(int obrasH, int desplazamientoH, Date fInicio, String detalle, int MaterialGastadoP) {
        super(obrasH, desplazamientoH, fInicio, detalle);
        this.MaterialGastadoP = MaterialGastadoP;
    }

    public SConstruccion() {
        this(0, 0, null, null,0);
    }

    @Override
    public double calcularTotalCliente() {
        prespuestado += MaterialGastadoP;
        return prespuestado;
    }

    public double gastarMaterial(){
        System.out.println("Ingresa el coste de los materiales");
        while (!Principal.sc.hasNextDouble()){  //El while sirve para verificar que los datos son un double
            System.out.println("Numero invalido, ingresa un valor valido");
            Principal.sc.next();
        }
        MaterialGastadoP = Principal.sc.nextDouble();
        return MaterialGastadoP;
    }


}
