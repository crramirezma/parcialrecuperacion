public class Persona {
    protected String nombre;
    protected int id;
    protected int edad;
    protected String sexo;
   

    public Persona(String nombre, int id, int edad, String sexo) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.sexo = sexo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
