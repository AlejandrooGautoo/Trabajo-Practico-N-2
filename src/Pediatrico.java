public class Pediatrico extends Pacientes {
    private double peso;
    private String celular;
    private String tutor;

    public Pediatrico(double peso, String celular, String tutor, String dni, String nombre, String obraSocial) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    public void tipoDeDieta() {
        System.out.println("Tipo de dieta: libre de gluten");
    }
}