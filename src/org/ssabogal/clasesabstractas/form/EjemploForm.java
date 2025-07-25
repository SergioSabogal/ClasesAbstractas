package org.ssabogal.clasesabstractas.form;

import org.ssabogal.clasesabstractas.form.elementos.ElementoForm;
import org.ssabogal.clasesabstractas.form.elementos.InputForm;
import org.ssabogal.clasesabstractas.form.elementos.SelectForm;
import org.ssabogal.clasesabstractas.form.elementos.TextAreaForm;
import org.ssabogal.clasesabstractas.form.elementos.select.Opcion;
import org.ssabogal.clasesabstractas.form.validador.EmailValidador;
import org.ssabogal.clasesabstractas.form.validador.NoNulo;
import org.ssabogal.clasesabstractas.form.validador.NumeroValidador;
import org.ssabogal.clasesabstractas.form.validador.RequeridoValidador;

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
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador());

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);


        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNulo());

        Opcion java = new Opcion("1", "java");
        lenguaje.addOpciones(java);
        lenguaje.addOpciones(new Opcion("2", "python"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disable name='" + this.nombre + "' value=\"" + this.valor +"\">";
            }
        };

        saludar.setValor("Hola, esto es un campo deshabilitado");
        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("prueba@correo.co");
        edad.setValor("24");
        experiencia.setValor("......Mas de 10 años de experiencia");
        java.setSelected(true);


        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);





        for(ElementoForm e : elementos){
            System.out.println(e.dibujarHtml());
        }

        elementos.forEach( e -> {
            if(!edad.esValido()){
                e.getErrores().forEach(err -> System.out.println(err)
                );
            }
        });


    }

}
