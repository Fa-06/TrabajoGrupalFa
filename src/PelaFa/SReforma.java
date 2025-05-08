package PelaFa;
import java.util.ArrayList;
import java.util.Date;

public class SReforma extends Servicio implements GastosMaterial{
    private ArrayList<String> materiales = new ArrayList<>();
    private double materialGastadoP;

    public SReforma(int obrasH, int desplazamientoH, Date fInicio, String detalle, ArrayList<String> materiales) {
        super( obrasH, desplazamientoH, fInicio, detalle);
        this.materiales = materiales;
    }

    public SReforma() {
        this(0, 0, null, null,null);
    }

    @Override
    public double calcularTotalCliente() {
        return prespuestado += materialGastadoP;
    }

    public ArrayList<String> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<String> materiales) {
        this.materiales = materiales;
    }

    /*Implementar gastar material*/
    public double gastarMaterial(){
        double materialesCosto = 0.0f; //Se inicia una variable local para ingresar el coste para no estar llamando a la variable de instancia
        String respuesta = null;
        do {
            System.out.println("Ingresa el material usado, en caso de no ingresar nada mas, escribe 'no'");
            respuesta = Principal.sc.next();

            if (!respuesta.equalsIgnoreCase("no")){ //lee si la respuesta es distinta de no para saber si se va a ingresar la respuesta al array
                System.out.println("Ingresa el coste del material usado");
                this.materiales.add(respuesta);

                while (!Principal.sc.hasNextDouble()){ //has next double lee si es un numero, en caso de que no sea uno pide al usuario ingresar uno (funciona como un try and catch)
                    System.out.println("Ingresa un numero valido para el programa");
                    Principal.sc.next();
                }
                materialesCosto += Principal.sc.nextDouble();
            }
        }while ((!respuesta.equalsIgnoreCase("no")));

        materialGastadoP = materialesCosto;
        return materialGastadoP;
    }

}
