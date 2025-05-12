public class Adulto extends Pacientes {
    private double presionArterial;
    private double altura;
    private double peso;

    public Adulto(double presionArterial, double altura, double peso, String dni, String nombre, String obraSocial) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    public void estudiosRX() {
        System.out.println("Estudios RX: pierna");
    }

    public void estudioDeSangre() {
        System.out.println("Estudios de sangre: B-");
    }
}