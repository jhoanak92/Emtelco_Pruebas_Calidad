package com.drezze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class ActualizarDireccion {

    public static final Target DIRECCIONES = Target.the("Administrar direcciones").locatedBy("//i[@class='icon-building']");
    public static final Target ANIADIR_DIRECCION = Target.the("Añadir nueva direccion").locatedBy("//div[@class='clearfix main-page-indent']//span");
    public static final Target DOMICILIO = Target.the("agregar domicilio").located(By.id("address1"));
    public static final Target DIRECCCION = Target.the("agregar direccion").located(By.id("address2"));
    public static final Target CIUDAD = Target.the("agregar ciudad").located(By.id("city"));
    public static final Target ESTADO = Target.the("agregar estado").locatedBy("//*[@id=\"id_state\"]/option[2]");
    public static final Target COD_POSTAL = Target.the("agregar codigo postal").located(By.id("postcode"));
    public static final Target PAIS = Target.the("agregar codigo postal").locatedBy("//*[@id=\"id_country\"]/option/font/font");
    public static final Target TEL = Target.the("agregar telefono").located(By.id("phone"));
    public static final Target TEL_MOVIL = Target.the("agregar telefono movil").located(By.id("phone_mobile"));
    public static final Target REFERENCIA_DIRECCION = Target.the("agregar referencia direccion").located(By.id("alias"));
    public static final Target BOTON_GUARDAR = Target.the("guardar direccion").locatedBy("//button[@name='submitAddress']//span");

    public static final Target LISTA_DIRECCIONES = Target.the("Lista direccion").locatedBy("//div[@class='addresses']");



}

