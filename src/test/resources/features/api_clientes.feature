#language: es


Característica: : Validating Stripe Customer Create API


Esquema del escenario: Validate create customer api for multiple testdata
Dado que tengo una autenticacion valida
Cuando ingreso un <email> valido
Y ingreso una   <description> valida
Y envio una peticion post para "/customers"
Entonces se debe crear un nuevo usuario
Y y el estatus de respuesta debe ser <statusCode>

Ejemplos: :
| email                           | description                             | statusCode |
| rahul.jhaw2a@way2automation.com | This is a test customer for w2a         |        200 |
| javatrainer@way2automation.com  | This is a java trainer customer for w2a |        200 |