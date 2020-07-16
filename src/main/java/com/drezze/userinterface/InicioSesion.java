package com.drezze.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.com/index.php")
public class InicioSesion extends PageObject {

    public static final Target REGISTRARSE = Target.the("Usuario").locatedBy("//a[@class='login']//font//font[contains(text(),'Registrarse')]");
    public static final Target CORREO = Target.the("Correo").located(By.id("email"));
    public static final Target CONTRASENA = Target.the("Contrasena").located(By.id("passwd"));
   // public static final Target BOTON_INICIO_SESION = Target.the("Sistema no disponible").locatedBy("//button[@name='SubmitLogin']//span//font//font[contains(text(),'Registrarse')]");

}
