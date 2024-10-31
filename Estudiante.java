public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Estudiante genérico";
        this.edad = 0;
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}
