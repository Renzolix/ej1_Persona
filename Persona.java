public class Persona {
    String nombre;
    int edad;

    public static void main(String[] args) {
        // Instanciación de dos objetos distintos en el Heap
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // Asignación directa mediante el operador punto (.)
        persona1.nombre = "Carlos";
        persona1.edad = 28;

        persona2.nombre = "María";
        persona2.edad = 22;

        // Impresión de datos
        System.out.println("--- Persona 1 ---");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);

        System.out.println("\n--- Persona 2 ---");
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " + persona2.edad);
    }
}