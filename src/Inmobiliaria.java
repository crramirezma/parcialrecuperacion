import java.util.ArrayList;

public class Inmobiliaria {
    private String nombre;
    private int telefono;
    ArrayList<Inmueble> inmuebles;
    ArrayList<Alquiler> alquileres;
    ArrayList<Cliente> inquilinos;

    public Inmobiliaria(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.alquileres=new ArrayList<>();
        this.inmuebles=new ArrayList<>();
        this.inquilinos=new ArrayList<>();
    }
    
    public boolean agregarInmueble(Inmueble inmueble){
        boolean b=true;
        for(int i=0;i<this.inmuebles.size();i++){
            if(this.inmuebles.get(i).getNumero()==inmueble.getNumero()){
                b=false;
            }
        }
        if(b==true){
           this.inmuebles.add(inmueble); 
        }else{
            System.out.println("Dos inmuebles no pueden tener el mismo numero");
        }
        
        return b;
    }
    
    public void eliminarInmuebexNumero(int numero){
        for(int i=0;i<this.inmuebles.size();i++){
            if(this.inmuebles.get(i).getNumero()==numero){
                this.inmuebles.remove(i);
            }
        }
    }
    
     public String consultarInmueblexNumero(int numero){
        String mensaje="";
        Inmueble e=null;
        for(int i=0;i<this.inmuebles.size();i++){
            if(this.inmuebles.get(i).getNumero()==numero){
                e=this.inmuebles.get(i);
            }
        }
        mensaje=e.darInformacion();
        return mensaje;
    }
    
    public void alquilarInmueblexNumeroeId(int numero,int id){
        
        Inmueble e=null;
        Cliente f=null;
        
        for(Inmueble inmueble : inmuebles){
            if(inmueble.alquilado==false&&inmueble.getNumero()==numero){
                e=inmueble;
                break;
            }
        }
        
        for(Cliente cliente : inquilinos){
            if((cliente.isAvalBanco()==true||cliente.isAvalPersona()==true||cliente.isContratoTrabajo()==true||cliente.isNomina()==true)&&cliente.getId()==id){
                f=cliente;
                break;
            }
        }
        e.setAlquilado(true);
        Alquiler alquiler=new Alquiler(e,f);
        this.alquileres.add(alquiler);
    }
    
    public void eliminarInquilinoxId(int id){
        for(int i=0;i<this.inquilinos.size();i++){
            if(this.inquilinos.get(i).getId()==id){
                this.inquilinos.remove(i);
            }
        }
    }
    
    public void recibirInmueble(int numero,int id){
        for(int i=0;i<this.alquileres.size();i++){
            if(this.alquileres.get(i).getInmueble().getNumero()==numero){
                this.alquileres.get(i).getInmueble().setAlquilado(false);
                this.alquileres.remove(i);
                this.eliminarInquilinoxId(id);
            }
        }
    }
    
    public void nuevoInquilino(Cliente inquilino){
        this.inquilinos.add(inquilino);
    }
    
    public String consultarInquilinoxId(int id){
        String info="";
        for(int i=0;i<this.inquilinos.size();i++){
            if(this.inquilinos.get(i).getId()==id){
                info=("El nombre del inquilino es "+this.inquilinos.get(i).getNombre()+", su edad es de "+this.inquilinos.get(i).getEdad()+", y su sexo es "+this.inquilinos.get(i).getSexo());
            }
        }
        return info;
    }
    
    public String listarInmuebles(){
        
        String listado="";
        String tipo="";
        
        for(int i=0;i<this.inmuebles.size();i++){
            
            listado=listado+tipo;
            tipo=this.inmuebles.get(i).darInformacion();
            if(i==0){
                listado=tipo;
            }
        }
        return listado;
    
    
}
    
  
    
    
    
    
    
    
    
    
}
