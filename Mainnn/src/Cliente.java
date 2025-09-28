public class Cliente {



    private String identificacion;
    private String Nombre;
    private String Apellidos;
    private String genero;
    private String ubicacion;
    private int edad;

    public Cliente(String identificacionObjeto, String nombreObjeto, String apellidosObjetos,
                   String generoObjeto, String ubicacionObjeto, int edadObjeto) {
        identificacion = identificacionObjeto;
        Nombre = nombreObjeto;
        Apellidos = apellidosObjetos;
        genero = generoObjeto;
        ubicacion = ubicacionObjeto;
        edad = edadObjeto;
    }

    public Cliente(String identificacionObjeto, String nombreObjeto, String apellidosObjetos,
                   String ubicacionObjeto, int edadObjeto) {
        identificacion = identificacionObjeto;
        Nombre = nombreObjeto;
        Apellidos = apellidosObjetos;

        ubicacion = ubicacionObjeto;
        edad = edadObjeto;
    }

    public Cliente() {
    }

    public void suscribirse(Suscripcion plan) {
        System.out.println(Nombre + " " + Apellidos +
                " contrató el plan " + plan.getTipo());
    }

    // Getters


    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getEdad() {
        return edad;
    }

    // Setters


    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // equals()
    public boolean equals(Cliente otroCliente) {
        return identificacion.equals(otroCliente.identificacion);
    }

    // toString()
    public String toString() {
        return "ID: " + identificacion +
                "\nNombre: " + Nombre +
                "\nApellidos: " + Apellidos +
                "\nGénero: " + genero +
                "\nCiudad: " + ubicacion+
                "\nEdad: " + edad + " años\n";
    }
}
