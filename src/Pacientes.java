public class Pacientes {
    private String dni;
    private String nombre;
    private String obraSocial;

    public Pacientes(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public void verObraSocial() {
        System.out.println("obra Social: " +obraSocial);
    }

    public void verDescuentos() {
        System.out.println("Tiene un descuento del 40%");
    }

    public void verVademecum() {
        System.out.println("ibuprofeno 600 comprimidos");
    }
}