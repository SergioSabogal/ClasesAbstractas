package org.ssabogal.clasesabstractas.form.elementos;

import org.ssabogal.clasesabstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm(){
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador (Validador validador){
        this.validadores.add(validador);
        return this;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setErrores(List<String> errores) {
        this.errores = errores;
    }

    public boolean esValido() {
        for (Validador v : validadores) {
            if (!v.esValido(this.valor)) {
                this.errores.add(v.getMensaje());
            }
        }
        return this.errores.isEmpty();
    }
    abstract public String dibujarHtml();
}
