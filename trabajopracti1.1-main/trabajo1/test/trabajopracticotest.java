package test;


import entities.Autoclasico;
import entities.Autonuevo;
import entities.Colectivo;
import entities.Vehiculo;

public class trabajopracticotest {

    public static void main(String[] args) {
        System.out.println("auto clasico");
       Autoclasico autoclasico1=new Autoclasico("rojo", "ford", "gt40", "aiwa");
       System.out.println(autoclasico1);
       
       
       


       System.out.println("auto nuevo");
       Autonuevo autonuevo1=new Autonuevo("negro", "Volkswagen", "taos", "panasonic");
       System.out.println(autonuevo1);


       System.out.println("colectivo");
       Colectivo colectivo1=new Colectivo("blanco", "Mercedes benz", "Colectivo", "casio");
        System.out.println(colectivo1);
        
       
    }
    
}
