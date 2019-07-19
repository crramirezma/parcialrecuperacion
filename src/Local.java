public class Local extends Inmueble {
    private boolean viaprincipal;
    
    public Local(int numero, String barrio, int estrato, double arriendo, double area, boolean viaprincipal) {
        super(numero, barrio, estrato, arriendo, area);
        this.viaprincipal=viaprincipal;
    }
    
    @Override
    public String darInformacion(){
        String info="";
        if(this.alquilado==true){
            info=("El numero del local es "+this.numero+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y se encuentra alquilado \n");
        }else{
            info=("El numero del local es "+this.numero+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y no se encuentra alquilado \n");
        }
        if(this.viaprincipal==true){
            String info1=("Y el local se encuentra en una via principal \n");
        }
        String info1=("Y el local no se encuentra en una via principal \n");
        String info2=info+info1;
        return info2;
    }

    public boolean isViaprincipal() {
        return viaprincipal;
    }

    public void setViaprincipal(boolean viaprincipal) {
        this.viaprincipal = viaprincipal;
    }
    
    
    
    
}
