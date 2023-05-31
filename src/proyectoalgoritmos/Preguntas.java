/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

/**
 *
 * @author User
 */
public class Preguntas {

    String rutaImagen;
    String respuestaCorrecta;
    String monedas;

    public Preguntas(String rutaImagen, String respuestaCorrecta, String monedas) {
        this.rutaImagen = rutaImagen;
        this.respuestaCorrecta = respuestaCorrecta;
        this.monedas = monedas;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    public String getmonedas() {
        return monedas;
    }

    public void setmonedas(String monedas) {
        this.monedas = monedas;
    }
    
    void sumarmonedas(){
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
