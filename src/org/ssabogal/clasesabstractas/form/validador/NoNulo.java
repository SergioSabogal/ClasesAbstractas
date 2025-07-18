package org.ssabogal.clasesabstractas.form.validador;

public class NoNulo extends Validador {

    protected String mensaje = "El campo no puede ser nulo";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor !=  null);
    }
}
