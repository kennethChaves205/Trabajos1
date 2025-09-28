public class Cliente {
    String nombre;
    String apellidos;
    String cedula;
    String sexo;
    String ubicacion;

    // Constructor completo
    public Cliente(String n, String a, String c, String s, String u) {
        nombre = n;
        apellidos = a;
        cedula = c;
        sexo = s;
        ubicacion = u;
    }

    // Constructor sin sexo
    public Cliente(String n, String a, String c, String u) {
        nombre = n;
        apellidos = a;
        cedula = c;
        ubicacion = u;
    }

    // Constructor por defecto
    public Cliente() {
    }

    // Método para suscribirse
    public void suscribirse(Suscripcion sub) {
        System.out.println(nombre + " " + apellidos + " adquirió una suscripción " + sub.tipo + ".");
    }
}
