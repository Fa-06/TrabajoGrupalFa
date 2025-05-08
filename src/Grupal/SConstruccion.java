package Grupal;

import java.time.LocalDate;
import java.util.Date;

public class SConstruccion extends Servicio implements GastosMaterial {
    private double MaterialGastadoP;
    public SConstruccion(int obrasH, int desplazamientoH, LocalDate fInicio) {
        super(obrasH, desplazamientoH, fInicio);
        this.MaterialGastadoP = MaterialGastadoP;
    }

    public SConstruccion() {
        this(0, 0, null);
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
