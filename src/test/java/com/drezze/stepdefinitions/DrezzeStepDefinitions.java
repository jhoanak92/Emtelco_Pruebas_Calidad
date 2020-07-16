package com.drezze.stepdefinitions;

import com.drezze.models.Credenciales;
import com.drezze.tasks.Autenticar;
import com.drezze.tasks.RegistrarCorreo;
import com.drezze.userinterface.InicioSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import java.time.Duration;
import java.util.List;

import static com.drezze.userinterface.ActualizarDireccion.LISTA_DIRECCIONES;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class DrezzeStepDefinitions {
    private InicioSesion page;

    @Dado("^el usuario ingresa a drezze$")
    public void elUsuarioIngresaADrezze(List<Credenciales> credenciales) {
        Credenciales credencial = credenciales.get(0);
        theActorCalled(credencial.getUsuario()).wasAbleTo(
                Open.browserOn(page),
                Autenticar.alUsuario(credencial)
        );
    }

    @Cuando("^el usuario realiza registro de una nueva direccion llamada (.*)$")
    public void elUsuarioRealizaRegistroDeUnaNuevaDireccionLlamada(String Direccion) {
        theActorInTheSpotlight().attemptsTo(
                RegistrarCorreo.nuevo(Direccion));

    }

    @Entonces("^al final vera un Resumen con la lista de direcciones acualizadas exitosamente$")
    public void alFinalVeraUnResumenConLaListaDeDireccionesAcualizadasExitosamente() {
        theActorInTheSpotlight().should(
                seeThat(the(LISTA_DIRECCIONES.waitingForNoMoreThan(Duration.ofSeconds(5))),isVisible())
        );
    }

    @Cuando("^el usuario intenta registrar una direccion ya existente$")
    public void elUsuarioIntentaRegistrarUnaDireccionYaExistente() {

    }

    @Entonces("^visualizara un mensaje indicando que la direccion ya se encuetra registrada$")
    public void visualizaraUnMensajeIndicandoQueLaDireccionYaSeEncuetraRegistrada() {

    }

}
