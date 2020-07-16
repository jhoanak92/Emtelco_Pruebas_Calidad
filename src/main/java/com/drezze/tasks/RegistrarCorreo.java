package com.drezze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.drezze.userinterface.ActualizarDireccion.*;

public class RegistrarCorreo implements Task {

    public static RegistrarCorreo nuevo(String direccion) {

        return Tasks.instrumented(RegistrarCorreo.class, direccion);
    }

    private final String direccion;

    public RegistrarCorreo(String direccion){
        this.direccion= direccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DIRECCIONES),
                Scroll.to(ANIADIR_DIRECCION),
                Click.on(DIRECCIONES),
                Enter.theValue("Mi domicilio").into(DOMICILIO),
                Enter.theValue("direccio 123").into(DIRECCCION),
                Enter.theValue("Medellin").into(CIUDAD),
                Click.on(ESTADO),
                Enter.theValue("18992").into(COD_POSTAL),
                Click.on(PAIS),
                Enter.theValue("123456789").into(TEL),
                Enter.theValue("9876543212").into(TEL_MOVIL),
                Enter.theValue(direccion).into(REFERENCIA_DIRECCION),
                Click.on(BOTON_GUARDAR)
        );
    }
}
