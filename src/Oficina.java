public class Oficina extends Inmueble{
    private String tipo;
    public Oficina(int numero, String barrio, int estrato, double arriendo, double area,String tipo) {
        super(numero, barrio, estrato, arriendo, area);
        this.tipo=tipo;
    }
    
     @Override
    public String darInformacion(){
        String info="";
        String info1="";
        if(this.alquilado==true){
            info=("El numero de la oficina es "+this.numero+"\n Se encuentra ubicada en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y se encuentra alquilado \n");
        }else{
            info=("El numero del inmueble es "+this.numero+"\n Se encuentra ubicada en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y no se encuentra alquilado \n");
        }
        if("casa".equals(this.tipo)||"Casa".equals(this.tipo)){
             info1=("Y la oficina se encuentra en una casa \n");
        }else{
              info1=("Y la oficina se encuentra en un edificio \n");
        }
       
        String info2=info+info1;
        return info2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
