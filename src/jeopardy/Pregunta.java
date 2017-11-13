/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeopardy;

import java.util.ArrayList;

/**
 *
 * @author Noreen
 */
public class Pregunta {
    protected String texto;
    protected String[] respuestas;
    protected int respuestaCorrecta;
    protected int valorRespuesta;

    public Pregunta(String texto, String[] respuestas, int respuestaCorrecta, int valorRespuesta) {
        this.texto = texto;
        this.respuestas = respuestas;
        this.respuestaCorrecta = respuestaCorrecta;
        this.valorRespuesta = valorRespuesta;
    }

    Pregunta() {
    }

    public String getTexto() {
        return texto;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public int getValorRespuesta() {
        return valorRespuesta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "texto=" + texto + ", respuestas=" + respuestas + ", respuestaCorrecta=" + respuestaCorrecta + ", valorRespuesta=" + valorRespuesta + '}';
    }
    
}
