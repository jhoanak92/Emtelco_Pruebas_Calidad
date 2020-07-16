package com.drezze.models;

public class Credenciales {

    private String usuario;
    private String contrasena;

    public Credenciales() {
    }

    public Credenciales(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
}
