# language: es
Característica: Registrar direcciones
  Cada visitante ya identificado como usuario en la plataforma puede registrar
  direcciones adicionales a la que registró inicialmente

  Antecedentes: iniciar sesion en la pagina de drezze
    Dado el usuario ingresa a drezze
      | usuario  | contrasena      |
      | jhoana.rojas92@gmail.com | 12345678 |

  @tag-1
  Escenario:Registro exitoso de una nueva direcccion
    Cuando el usuario realiza registro de una nueva direccion llamada Direccion12345
    Entonces al final vera un Resumen con la lista de direcciones acualizadas exitosamente

  @tag-2
  Escenario:registro fallido por direccion ya exixtente
    Cuando el usuario intenta registrar una direccion ya existente
    Entonces visualizara un mensaje indicando que la direccion ya se encuetra registrada

