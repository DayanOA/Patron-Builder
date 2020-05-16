/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Director;

import Clase.Mensaje;
import builder.MensajeBuilder;

/**
 *
 * @author Tonny
 */
public class EnvioMenjase {

    private MensajeBuilder mensajeBuilder;

    public EnvioMenjase() {

    }

    public void setMensajeBuilder(MensajeBuilder mensajeBuilder) {
        this.mensajeBuilder = mensajeBuilder;
    }

    public Mensaje ImprimirMensaje() {
        return this.mensajeBuilder.getMenssaje();
    }

    public void crearMensaje() {
        this.mensajeBuilder.CrearMensajeBuilder();
        this.mensajeBuilder.BuilderEncabezado();
        this.mensajeBuilder.BuilderCuerpo();
        this.mensajeBuilder.BuilderPie();
    }

}
