public class Main {
    public static void main(String[] args) {
        Internado internado = new Internado(120, "302", true, "45678901", "Luciano", "SWISS MEDICAL");
        Pediatrico pediatrico = new Pediatrico(35.5, "3794561234", "Madre", "50987412", "Camila", "OSDE");
        Adulto adulto = new Adulto(130, 1.65, 70, "37654896", "Gabriela", "GALENO");

        internado.estudioSangre();
        pediatrico.tipoDeDieta();
        adulto.verObraSocial();
    }
}