
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arriu
 */
public class Main  {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        Inmobiliaria inmobiliaria=new Inmobiliaria("Arrendamos",41);
        Inmueble i1=new Local(1,"Soledad",3,5.0,10.0,true);
        Inmueble i2=new Oficina(3,"Galerias",6,7.0,100.0,"d");
        Inmueble i3=new Local(2,"Centro",4,3.0,20.0,false);
        inmobiliaria.agregarInmueble(i3);
        inmobiliaria.agregarInmueble(i1);
        inmobiliaria.agregarInmueble(i2);
        String mensaje=inmobiliaria.listarInmuebles();
        System.out.println(mensaje);
        try{
         File salida = new File("datos.txt");
         if(!salida.exists()){
           salida.createNewFile();
           }
           PrintStream flujoSalida = 
           new PrintStream(salida);
        }catch(FileNotFoundException e){
            System.out.println("No existe el archivo");
        }catch(IOException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
