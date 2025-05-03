package VersionFa;
import java.util.*;
import java.time.*;
public class Principal {
    Servicio S;
    public Principal(){
        S = new Servicio("Juan",10,2,null,"Metal");
    }

    public void run(){
        System.out.println(S.toString());
    }


    public static void main(String[] args) {
        Principal interfaz = new Principal();
        interfaz.run();
    }
}
