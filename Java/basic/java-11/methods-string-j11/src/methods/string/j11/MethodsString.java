/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods.string.j11;

/**
 *
 * @author Carlos H. Rueda C.
 */
public class MethodsString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // strip() 
        /*Este método elimina los espacios en blanco al principio y al final de 
        una cadena. Es similar a trim(), pero también considera caracteres 
        Unicode de espacio en blanco*/
        String texto = "   Hola, mundo!   ";
        String resultado = texto.strip();
        System.out.println(resultado); // Imprime "Hola, mundo!"

        // stripLeading() y stripTrailing()
        //Estos métodos eliminan los espacios en blanco solo al principio o al final de la cadena, respectivamente.
        texto = "   Hola, mundo!   ";
        String resultadoInicio = texto.stripLeading();
        String resultadoFin = texto.stripTrailing();
        System.out.println(resultadoInicio); // Imprime "Hola, mundo!   "
        System.out.println(resultadoFin); // Imprime "   Hola, mundo!"

        // isBlank()
        // Devuelve true si la cadena está vacía o contiene solo espacios en blanco.
        String cadenaVacia = "";
        String cadenaEspacios = "    ";
        System.out.println(cadenaVacia.isBlank()); // Imprime true
        System.out.println(cadenaEspacios.isBlank()); // Imprime true
        cadenaEspacios = "    a";
        System.out.println(cadenaEspacios.isBlank()); // Imprime false

        // lines()
        // Divide la cadena en líneas y devuelve un Stream<String> con cada línea
        String poema = "Roses are red,\nViolets are blue,\nSugar is sweet,\nAnd so are you.";
        System.out.println(poema.lines());
        poema.lines().forEach(System.out::println);
// Imprime cada línea del poema

        // repeat()
        // Repite la cadena un número especificado de veces.
        String asteriscos = "*".repeat(5);
        System.out.println(asteriscos); // Imprime "*****"

        // formatted(Object... args)
        // Permite formatear la cadena utilizando argumentos proporcionados.
        String nombre = "Juan";
        int edad = 30;
        String mensaje = "Hola, mi nombre es %s y tengo %d años.";
        System.out.println(String.format(mensaje, nombre, edad));
// Imprime "Hola, mi nombre es Juan y tengo 30 años."

        // transform(Function<? super String, ? extends R> f)
        // Aplica una función de transformación a la cadena.
        String original = "Java 11 es genial!";
        resultado = original.transform(String::toUpperCase);
        System.out.println(resultado); // Imprime "JAVA 11 ES GENIAL!"

        // compareToIgnoreCase(String other)
        // Realiza una comparación de cadenas sin tener en cuenta las diferencias de mayúsculas y minúsculas.
        String a = "Manzana";
        String b = "manzana";
        int comparacion = a.compareToIgnoreCase(b);
        System.out.println(comparacion); // Imprime 0 (son iguales sin importar mayúsculas/minúsculas)
        
        /*
        describeConstable(): Proporciona información sobre la constante de cadena (si es una).
resolveConstantDesc​(MethodHandles.Lookup lookup): Resuelve la constante de cadena en un descriptor constante.
        */

    }

}
