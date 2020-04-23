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
public class Vendedor extends RolPersona implements Persona {

    public String código;
    public String nombre;
    public String dirección;
    public String contacto;

    public Vendedor() {
    }

    public Vendedor(String código, String nombre, String dirección, String contacto) {
        this.código = código;
        this.nombre = nombre;
        this.dirección = dirección;
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
    public void setDirección(String dirección) {
        super.setDirección(dirección); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDirección() {
        return super.getDirección(); //To change body of generated methods, choose Tools | Templates.
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
    public String getCódigo(String código) {
        return super.getCódigo(código); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCódigo(String código) {
        super.setCódigo(código); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContacto(String contacto) {
        super.setContacto(contacto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContacto() {
        return super.getContacto(); //To change body of generated methods, choose Tools | Templates.
    }

}
