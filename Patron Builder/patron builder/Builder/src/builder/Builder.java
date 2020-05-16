/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import Clase.Mensaje;
import ConcretoBuilder.JsonConcreto;
import ConcretoBuilder.XmlConcreto;
import ConcretoBuilder.eMailConcreto;
import Director.EnvioMenjase;
import java.util.Scanner;

/**
 *
 * @author Tonny
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    private static EnvioMenjase envioMensaje = new EnvioMenjase();
    private static Scanner scanner = new Scanner(System.in);
    public static boolean inicio = true;

    public static void main(String[] args) {
        while (inicio) {
            System.out.print(
                    "Menu de opciones\n"
                    + "1. Json\n"
                    + "2. XML\n"
                    + "3. E-mail\n"
                    + "4. desea salir\n"
            );
            switch (scanner.next()) {
                case "1": {
                    MensajeBuilder json = new JsonConcreto();
                    envioMensaje.setMensajeBuilder(json);
                    CreacionMensaje();
                    break;
                }
                case "2": {
                    MensajeBuilder xml = new XmlConcreto();
                    envioMensaje.setMensajeBuilder(xml);
                    CreacionMensaje();
                    break;
                }
                case "3": {
                    MensajeBuilder email = new eMailConcreto();
                    envioMensaje.setMensajeBuilder(email);
                    CreacionMensaje();
                    break;
                }
                case "4": {
                    inicio = false;
                    break;
                }
                default: {
                    System.out.println("Numero no encontrado");
                }
            }
        }

    }

    public static void CreacionMensaje() {
        envioMensaje.crearMensaje();
        Mensaje mensaje = envioMensaje.ImprimirMensaje();
        System.out.println(mensaje.toString());
    }
}
