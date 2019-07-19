/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arriu
 */
public class Cliente extends Persona{
    
    private boolean nomina;
    private boolean avalBanco;
    private boolean contratoTrabajo;
    private boolean avalPersona;

    public Cliente( String nombre, int id, int edad, String sexo,boolean nomina, boolean avalBanco, boolean contratoTrabajo, boolean avalPersona) {
        super(nombre, id, edad, sexo);
        this.nomina = nomina;
        this.avalBanco = avalBanco;
        this.contratoTrabajo = contratoTrabajo;
        this.avalPersona = avalPersona;
    }

    public boolean isNomina() {
        return nomina;
    }

    public void setNomina(boolean nomina) {
        this.nomina = nomina;
    }

    public boolean isAvalBanco() {
        return avalBanco;
    }

    public void setAvalBanco(boolean avalBanco) {
        this.avalBanco = avalBanco;
    }

    public boolean isContratoTrabajo() {
        return contratoTrabajo;
    }

    public void setContratoTrabajo(boolean contratoTrabajo) {
        this.contratoTrabajo = contratoTrabajo;
    }

    public boolean isAvalPersona() {
        return avalPersona;
    }

    public void setAvalPersona(boolean avalPersona) {
        this.avalPersona = avalPersona;
    }

    
    
    
}
