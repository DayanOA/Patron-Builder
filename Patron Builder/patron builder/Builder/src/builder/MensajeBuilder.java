/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import Clase.Mensaje;

/**
 *
 * @author Tonny
 */
public abstract class MensajeBuilder {

    protected Mensaje mensaje;

    public Mensaje getMenssaje() {
        return mensaje;
    }

    public void CrearMensajeBuilder() {
        this.mensaje = new Mensaje();
    }

    public abstract void BuilderEncabezado();

    public abstract void BuilderCuerpo();

    public abstract void BuilderPie();
}
