package com.drezze.tasks;


import com.drezze.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.drezze.userinterface.InicioSesion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Autenticar implements Task {

    private Credenciales credenciales;

    public Autenticar(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().window().maximize();
        actor.attemptsTo(WaitUntil.the(REGISTRARSE, isClickable()),
                SendKeys.of(credenciales.getUsuario()).into(CORREO),
                SendKeys.of(credenciales.getContrasena()).into(CONTRASENA).thenHit(Keys.ENTER)
        );
    }
    public static com.drezze.tasks.Autenticar alUsuario(Credenciales credenciales) {
        return Tasks.instrumented(com.drezze.tasks.Autenticar.class, credenciales);
    }
}
