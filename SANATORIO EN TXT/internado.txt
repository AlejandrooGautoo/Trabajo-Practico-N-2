public class Internado extends Pacientes {
    private boolean rhesus;
    private double presionArterial;
    private String habitacion;

    public Internado(double presionArterial, String habitacion, boolean rhesus, String dni, String nombre, String obraSocial) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.habitacion = habitacion;
        this.rhesus = rhesus;
    }

    public void tipoDeDieta() {
        System.out.println("Tipo de dieta: alta en proteínas y baja en carbohidratos");
    }

    public void estudiosRX() {
        System.out.println("Estudio RX: radiografía de tórax");
    }

    public void estudioSangre() {
        System.out.println("Estudio de sangre: grupo sanguíneo B+");
    }
}