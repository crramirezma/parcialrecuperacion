import java.util.ArrayList;
public class PisoOficinas extends Inmueble{
    ArrayList<Oficina> oficinas;

    public PisoOficinas(int numero, String barrio, int estrato, double arriendo, double area) {
        super(numero, barrio, estrato, arriendo, area);
        this.oficinas=new ArrayList<>();
    }
    
    public void agregarOficina(Oficina oficina){
        this.oficinas.add(oficina);
    }
    
    public double sumarAreas(){
        double areatotal=0;
        for(int i=0;i<this.oficinas.size();i++){
            areatotal=areatotal+this.oficinas.get(i).getArea();
    }
        return areatotal;
    }
     @Override
    public String darInformacion(){
        String info="";
        if(this.alquilado==true){
            info=("El numero del piso de oficinas es "+this.numero+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y se encuentra alquilado \n");
        }else{
            info=("El numero del piso de oficinas es "+this.numero+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y no se encuentra alquilado \n");
        }
        String info1=("Y el piso posee un total de "+this.oficinas.size()+" oficinas, que suman un total de "+this.sumarAreas()+" metros cuadrados \n");
        String info2=info+info1;
        return info2;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }
    
    
}
