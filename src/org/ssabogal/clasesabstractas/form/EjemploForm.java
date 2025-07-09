package org.ssabogal.clasesabstractas.form;

import org.ssabogal.clasesabstractas.form.elementos.ElementoForm;
import org.ssabogal.clasesabstractas.form.elementos.InputForm;
import org.ssabogal.clasesabstractas.form.elementos.SelectForm;
import org.ssabogal.clasesabstractas.form.elementos.TextAreaForm;
import org.ssabogal.clasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        /*
        ElementoForm el = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return null;
            }
        };

// Clase anonima, se crea para poder usar el objeto
    }
*/

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "java");
        lenguaje.addOpciones(java);
        lenguaje.addOpciones(new Opcion("2", "python"));

        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("prueba@correo.co");
        edad.setValor("24");
        experiencia.setValor("......Mas de 10 años de experiencia");
        java.setSelected(true);


        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos


    }

}
