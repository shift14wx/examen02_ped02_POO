/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author raulh
 */
public class Proveedor extends RolPersona implements Persona {

    public String nombre;
    public String contacto;
    public String tipo;

    public Proveedor() {
    }

    public Proveedor(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipo() {
        return super.getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContacto() {
        return super.getContacto(); //To change body of generated methods, choose Tools | Templates.
    }
}
