
package jeopardy;

public class Pregunta {
    private String texto;
    private String[] respuestas;
    private int respuestaCorrecta;
    private int valorRespuesta;

    public Pregunta(String texto, String[] respuestas, int respuestaCorrecta, int valorRespuesta) {
        this.texto = texto;
        this.respuestas = respuestas;
        this.respuestaCorrecta = respuestaCorrecta;
        this.valorRespuesta = valorRespuesta;
    }

    Pregunta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
