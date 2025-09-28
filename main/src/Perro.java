public class Perro {
    // atriubutos
    // Las cariables que definen el estado de cada objeto de la clase

   private String nombre;
   private String raza;
   private  byte edad;
    private boolean estaVacunado;
    private String color;
  private  char sexo;

    //Metodos.

    //Constructor
   public Perro(String nombreObjeto,
          String razaObjeto,
          byte edadObjeto,
          boolean estaVacunadoObjeto,
          String colorObjeto,
          char sexoObjeto) {
        nombre = nombreObjeto;
        raza = razaObjeto;
        edad = edadObjeto;
        estaVacunado = estaVacunadoObjeto;
        color = colorObjeto;
        sexo = sexoObjeto;
    }

        public Perro(String nombreObjeto,
                String razaObjeto){
            nombre = nombreObjeto;
            raza = razaObjeto;
        }


    public Perro(String nombreObjeto,
          String razaObjeto,
          String colorObjeto){
        nombre = nombreObjeto;
        raza = razaObjeto;
        color = colorObjeto;

    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public byte getEdad() {
        return edad;
    }

    public boolean isEstaVacunado() {
        return estaVacunado;
    }

    public String getColor() {
        return color;
    }

    public char getSexo() {
        return sexo;
    }
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setEstaVacunado(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // equals
    public boolean equals(Perro perroComparar){
       return nombre.equals(perroComparar.nombre) &&
               raza.equals(perroComparar.raza)&&
               edad == perroComparar.edad &&
               estaVacunado == perroComparar.estaVacunado &&
               color.equals(perroComparar.color)&&
               sexo== perroComparar.sexo;
    }

    // toString

    public String toString(){
       return "nombre"+ nombre+ "\nRaza" + "\nEdad"+ edad+ "\nEstado de vacunacion:" + estaVacunado+
               "\nColor" + color + "\nSexo" +sexo+ "\n";
    }
}


