package Grupal;

import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    GestorEmpresa gestion;
    boolean sw = false; //Controla el final del programa

    public Principal(){
        gestion = new GestorEmpresa();
    }

    public void run(){
        int opcion = -1;


        while (!sw) {
            mostrarMenu();
            if (Principal.sc.hasNextInt()) {
                opcion = Principal.sc.nextInt();
                if (opcion >= 0 && opcion <= 3) {
                    elegirOpcion(opcion);
                } else {
                    System.out.println("Opción fuera de rango. Intenta nuevamente.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ser un número entero.");
                Principal.sc.next(); // limpia entrada incorrecta
            }
        }
    }

    public void elegirOpcion(int opcion){
        switch (opcion) {
            case 1:
                gestion.atenderClientes();
                break;
            case 2:
                gestion.introducirServicio();
                gestion.gestionarDetallesServicio();
                break;
            case 3:
                gestion.visualizarDetallesServicio();
                break;
            case 0:
                System.out.println("Saliendo del sistema");
                sw = true;
                break;
        }
    }

    public void mostrarMenu() {
        System.out.println("1. Atender Clientes");
        System.out.println("2. Introducir Servicio y Gestionar Detalles");
        System.out.println("3. Visualizar Detalles del Servicio");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }



    public static void main(String[] args) {
        Principal interfaz = new Principal();
        interfaz.run();
    }
}
