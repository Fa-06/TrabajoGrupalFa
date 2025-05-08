package Grupal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;


public class GestorEmpresa {
    public static final int NCLIENTES = 4;
    public static final int GDETALLLE = 90;

    String[] detalles = new String[NCLIENTES];
    Cliente[] clientes = new Cliente[NCLIENTES];
    Servicio[] servicios = new Servicio[NCLIENTES];
    int indexC = 0; //Controla el index de los clientes
    int indexS = 0; //Controla el index de los servicios
    Cliente cli;
    Servicio ser;

    public void atenderClientes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\fabri\\IdeaProjects\\TrabajoGrupal\\src\\Grupal\\clientes"))) {
            String nombreCliente;
            while ((nombreCliente = reader.readLine()) != null) {
                System.out.println("Cliente: " + nombreCliente);
                System.out.println("El cliente es habitual, para afirmarlo escribe 'si', caso contrario escribe 'no'");
                String tipoCliente = null;
                do {
                    System.out.print("¿El cliente es habitual? (si / no): ");
                    tipoCliente = Principal.sc.next();
                } while (!tipoCliente.equalsIgnoreCase("si") && !tipoCliente.equalsIgnoreCase("no"));

                if (tipoCliente.equalsIgnoreCase("si")) {
                    clientes[indexC] = new ClienteHabitual(nombreCliente);
                }else{
                    clientes[indexC] = new Cliente(nombreCliente);
                }
                indexC++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Cliente asignarCliente() {
        if (clientes.length == 0 || clientes[0] == null) {
            System.out.println("No hay clientes registrados todavía.");
            return null;
        }else{
            System.out.println("Clientes disponibles:");
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] != null) {
                    System.out.println((i + 1) + ". " + clientes[i].getNombre());
                }
            }

            int seleccion = -1;
            boolean valido = false;

            while (!valido) {
                System.out.print("Seleccione el número del cliente que desea asignar: ");
                if (Principal.sc.hasNextInt()) {
                    seleccion = Principal.sc.nextInt();
                    Principal.sc.nextLine(); // limpiar buffer

                    if (seleccion >= 1 && seleccion <= clientes.length && clientes[seleccion - 1] != null) {
                        cli = clientes[seleccion - 1];
                        System.out.println("Cliente asignado: " + cli.getNombre());
                        valido = true;
                    } else {
                        System.out.println("Selección fuera de rango o cliente no válido.");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número.");
                    Principal.sc.next(); // limpia entrada errónea
                }
            }
            return clientes[seleccion];
        }
    }


    public void introducirServicio(){
        if (indexC > 0){
            int hObras = 0;
            int hDesplazamiento = 0;
            LocalDate fInicio = null;
            Cliente cliA = asignarCliente();
            boolean hValida = false; //Controla que el usuario ingrese el input correcto, torna en true cuando los valores son validos
            while(!hValida){
                try {
                    System.out.print("Ingrese número de horas de las obras: ");
                    hObras = Principal.sc.nextInt();
                    System.out.println("Ingresa las horas de desplazamiento de la obra: ");
                    hDesplazamiento = Principal.sc.nextInt();
                    hValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error al leer el número de horas.");
                    System.out.print("Ingrese número de horas de las obras: ");
                    hObras = Principal.sc.nextInt();
                    System.out.println("Ingresa las horas de desplazamiento de la obra: ");
                    hDesplazamiento = Principal.sc.nextInt();
                }
            }

            boolean fechaValida = false; //Controla que el usuario ingrese el input correcto, torna en true cuando los valores son validos
            while (!fechaValida){
                try {
                    int dia = 0;
                    int mes = 0;
                    int ano = 0;
                    System.out.println("Ingresa el numero de dia de inicio: ");
                    dia = Principal.sc.nextInt();
                    System.out.println("Ingresa el mes de inicio: ");
                    mes = Principal.sc.nextInt();
                    System.out.println("Ingresa el de año de inicio: ");
                    ano = Principal.sc.nextInt();
                    fInicio = LocalDate.of(ano,mes,dia);
                    fechaValida = true;
                } catch (Exception e) {
                    System.out.println("Error al leer la fecha.");
                }
            }

            System.out.print("Ingrese tipo de servicio (reforma, revision, construccion): ");
            Principal.sc.nextLine(); //Limpiar Buffer de Memoria
            String tipo = Principal.sc.next().toLowerCase();
            switch (tipo) {
                case "reforma":
                    ser = new SReforma(hObras,hDesplazamiento,fInicio);
                    servicios[indexS] = ser;
                    introducirServicioReforma();
                    break;
                case "revision":
                    ser = new SRevision(hObras,hDesplazamiento,fInicio,cli);
                    servicios[indexS] = ser;
                    introducirServicioRevision();
                    break;
                case "construccion":
                    ser = new SConstruccion(hObras,hDesplazamiento,fInicio);
                    servicios[indexS] = ser;
                    introducirServicioConstruccion();
                    break;
                default:
                    System.out.println("Tipo no válido.");
            }
        }else{
            System.out.println("No hay clientes todavia");
        }


    }

    public void gestionarDetallesServicio() {
        if (indexS == 0){
            System.out.println("No hay servicios ingresados");
        }else{
            for (int i = 0; i < indexS; i++) {
                if (servicios[i].getPrespuestado() > GDETALLLE) {
                    System.out.println("Ingresa los detalles del servicio");
                    detalles[i] = Principal.sc.next();
                }
            }
        }
    }

    public void visualizarDetallesServicio() {
        if (indexS == 0){
            System.out.println("No hay servicios ingresados");
        }else{
            for (String det : detalles) {
                System.out.println(det);
            }
        }
    }

   public void introducirServicioReforma() {
       ((SReforma) ser).gastarMaterial();
       ((SReforma) ser).calcularTotalCliente();
   }

    public void introducirServicioRevision() {
        System.out.println("Ingrese el objeto a revisar");
        String revisable = Principal.sc.next();
        ((SRevision)ser).setRevisable(revisable);
        ((SRevision)ser).calcularTotalCliente();
    }

    public void introducirServicioConstruccion() {
        ((SConstruccion) ser).gastarMaterial();
        ((SConstruccion) ser).calcularTotalCliente();
    }


}

