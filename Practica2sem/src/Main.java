//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Cliente con todos los datos
        Cliente cliente1 = new Cliente("Kenneth", "chaves", "121212121", "M", "Moravia");

        // Cliente sin sexo
        Cliente cliente2 = new Cliente("Juan", "peres", "321321321", "Heredia");

        // Cliente con constructor por defecto y atributos asignados después
        Cliente cliente3 = new Cliente();
        cliente3.nombre = "Pedro";
        cliente3.apellidos = "Salas";
        cliente3.cedula = "123123123";
        cliente3.sexo = "M";
        cliente3.ubicacion = "Limon";

        // Crear suscripciones
        Suscripcion s1 = new Suscripcion("Premium", (byte)100, (byte)1);
        Suscripcion s2 = new Suscripcion("Básica", (byte)50, (byte)1);
        Suscripcion s3 = new Suscripcion("Estudiante", (byte)20, (byte)3);

        // Invocar método suscribirse
        cliente1.suscribirse(s1);
        cliente2.suscribirse(s2);

        // Suscripción anónima
        cliente3.suscribirse(new Suscripcion("Anual", (byte)120, (byte)12));
    }
}
