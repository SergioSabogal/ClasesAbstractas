package org.ssabogal.clasesabstractas.form.validador;

public class EmailValidador extends Validador{

    private final static String EAMIL_REGENX = "^(.+)@(.+)$";
    protected String mensaje = "Formato de e-mail incorrecto";

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
        return valor.matches(EAMIL_REGENX);
    }
}
