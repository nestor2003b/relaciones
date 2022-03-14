///////////// CONSIGNA ////////////////////
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*
* */


package relaciones1;

public class Example {


    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();



        perro1.setNombre("Firulais");
        perro1.setEdad(2);
        perro1.setRaza("Caniche");
        perro1.setTamaño(0.4);
        perro1.setPersona(persona1);

        perro2.setNombre("Bonnie");
        perro2.setEdad(1);
        perro2.setRaza("Pincher");
        perro2.setTamaño(0.3);
        perro2.setPersona(persona2);


        persona1.setNombre("Marta");
        persona1.setApellido("Báez");
        persona1.setDocumento(39506201);
        persona1.setEdad(30);
        persona1.setPerro(perro1);

        persona2.setNombre("José");
        persona2.setApellido("Rivas");
        persona2.setDocumento(39556501);
        persona2.setEdad(25);
        persona2.setPerro(perro2);

        persona1.visualizarPersonaYPerro(persona1);
        persona2.visualizarPersonaYPerro(persona2);


    }


}
