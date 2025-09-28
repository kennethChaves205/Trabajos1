public class Suscripcion {
    private String Tipo;
    private double Precio;
    private String FrecuenciaPago;


    public Suscripcion(String tipoObjeto, double precioObjeto, String frequenciaPagoObjeto) {
        Tipo = tipoObjeto;
        Precio = precioObjeto;
        FrecuenciaPago = frequenciaPagoObjeto;
    }

    public String getTipo() {
        return Tipo;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getFrecuenciaPago() {
        return FrecuenciaPago;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setFrecuenciaPago(String frecuenciaPago) {
        FrecuenciaPago = frecuenciaPago;
    }

    // equals()
    public boolean equals(Suscripcion otraSuscripcion) {
        return Tipo.equals(otraSuscripcion.getTipo());
    }

    // toString()
    public String toString() {
        return "Categoría: " + Tipo +
                "\nPrecio: $" + Precio +
                "\nFrecuencia de pago: " + FrecuenciaPago;
    }
}