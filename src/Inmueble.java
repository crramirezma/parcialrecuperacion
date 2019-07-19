public abstract class Inmueble {
    protected int numero;
    protected String barrio;
    protected int estrato;
    protected double arriendo;
    protected double area;
    protected boolean alquilado;

    public Inmueble(int numero, String barrio, int estrato, double arriendo, double area) {
        this.numero=numero;
        this.barrio = barrio;
        this.estrato = estrato;
        this.arriendo = arriendo;
        this.area = area;
        this.alquilado = false;
    }
    
    public abstract String darInformacion();
    
    /*public String darInformacion(){
        String info="";
        if(this.alquilado==true){
            info=("El nombre del inmueble es "+this.nombre+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y se encuentra alquilado \n");
        }else{
            info=("El nombre del inmueble es "+this.nombre+"\n Se encuentra ubicado en el barrio "+this.barrio+"\n Tiene un estrato "+this.estrato+" \n Su costo de arriendo es de :"+this.arriendo+"\n Posee un area de "+this.area+" metros cuadrados \n  y no se encuentra alquilado \n");
        }
        
        return info;
    }*/

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getArriendo() {
        return arriendo;
    }

    public void setArriendo(double arriendo) {
        this.arriendo = arriendo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    
}
