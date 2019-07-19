import java.util.ArrayList;
public class Edificio extends Inmueble{
    
    private Propietario propietario;
    ArrayList <Inmueble> pisosylocales;
    
    public Edificio(int numero, String barrio, int estrato, double arriendo, double area,Propietario propietario) {
        super(numero, barrio, estrato, arriendo, area);
        this.propietario=propietario;
        this.pisosylocales=new ArrayList<>();
        
    }
    
   public void agregarPisoLocal(Inmueble inmueble){
       this.pisosylocales.add(inmueble);
   }
   
   public String pisosyLocalesLibres(){
       String info="";
       String info1="";
       for(int i=0;i<this.pisosylocales.size();i++){
           info1=info1+info;
           if(this.pisosylocales.get(i).alquilado==false){
               if(this.pisosylocales.get(i) instanceof Oficina){
                   info=("La oficina numero "+this.pisosylocales.get(i).getNumero()+" esta libre, ");
                   
               }else{
                   info=("El local numero "+this.pisosylocales.get(i).getNumero()+" esta libre, ");
               }
           }
       }
       return info;
   }

    @Override
    public String darInformacion() {
        String info="";
        if(this.alquilado==true){
            info=("El numero del edificio es "+this.numero+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y se encuentra alquilado \n");
        }else{
            info=("El numero del edificio es "+this.numero+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y no se encuentra alquilado \n");
        }
        
        return info;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Inmueble> getPisosylocales() {
        return pisosylocales;
    }

    public void setPisosylocales(ArrayList<Inmueble> pisosylocales) {
        this.pisosylocales = pisosylocales;
    }
    
    
    
}
