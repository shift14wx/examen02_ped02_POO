/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author raulpenate
 */
public abstract class RolPersona {

    private String código;
    private String tipo;
    private String dirección;
    private String contacto;

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getCódigo(String código) {
        return this.código;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
}
