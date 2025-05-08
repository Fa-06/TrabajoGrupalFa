package PelaFa;
/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

    public class GestorEmpresa {
        public void introducirServicio() {
            try (BufferedReader reader = new BufferedReader(new FileReader("clientes.txt"))) {
                String nombreCliente;
                while ((nombreCliente = reader.readLine()) != null) {
                    System.out.println("Cliente: " + nombreCliente);

                    try {
                        System.out.print("Ingrese número de horas de las obras: ");
                        Servicio.obrasH = Integer.parseInt(Principal.sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Error al leer el número de horas.");
                        continue;
                    }

                    try {
                        System.out.print("Ingrese número de horas de desplazamiento: ");
                        Servicio.desplazamientoH = Integer.parseInt(Principal.sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Error al leer el número de horas.");
                        continue;
                    }

                    try {
                        System.out.print("Ingrese la fecha del servicio (AAAA-MM-DD): ");
                        Servicio.fInicio = LocalDate.parse(Principal.sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Error al leer la fecha. Se usará la fecha actual.");
                        continue;
                    }

                    System.out.print("Ingrese tipo de servicio (reforma, revision, construccion): ");
                    String tipo = Principal.sc.nextLine().toLowerCase();

                    switch (tipo) {
                        case "reforma":
                            SReforma reforma = new SReforma(cliente);
                            SReforma.gastarMaterial();
                            Servicio.add(reforma);
                            break;
                        case "revision":
                            SRevision revision = new SRevision(cliente);
                            Servicio.add(revision);
                            break;
                        case "construccion":
                            SConstruccion construccion = new SConstruccion(cliente);
                            Servicio.add(construccion);
                            break;
                        default:
                            System.out.println("Tipo no válido.");
                    }
                }

                public void atenderClientes() {
                    String continuar;
                    do {
                        introducirServicio();
                        System.out.print("¿Desea introducir otro cliente? (si/no): ");
                        continuar = Principal.sc.nextLine().toLowerCase();
                    } while (continuar.equals("si"));
                }

                public void gestionarServicio() {
                    for (Servicio s : serviciosClientes) {
                        s.crearDetallesServicio();
                        if (s.getPrespuestado() > 90) {
                            detalles.add(s);
                        }
                    }
                }

                public void visualizarDetallesServicio() {
                    for (Servicio s : detalles) {
                        System.out.println(s);
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
*/