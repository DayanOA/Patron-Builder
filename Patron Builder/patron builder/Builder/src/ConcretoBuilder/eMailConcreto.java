/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcretoBuilder;

import builder.MensajeBuilder;

/**
 *
 * @author Tonny
 */
public class eMailConcreto extends MensajeBuilder {

    @Override
    public void BuilderEncabezado() {
        mensaje.setEncabezado("email");

    }

    @Override
    public void BuilderCuerpo() {
        mensaje.setCuerpo("Soy un email");
    }

    @Override
    public void BuilderPie() {
        mensaje.setPie("pie email");
    }

}
