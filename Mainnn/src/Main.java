
public class Main {
    public static void main(String[] args) {
        Cliente usuario1 = new Cliente("119580239", "Kenneth", "Chaves Coto",
                "Masculino", "Moravia", 23);

        Cliente usuario2 = new Cliente("119580549", "Carlos", "Rodríguez Martinez",
                "Uruca", 35);

        Cliente usuario3 = new Cliente();

        Suscripcion plan1 = new Suscripcion("Básico", 15.99, "Mensual");
        Suscripcion plan2 = new Suscripcion("Premium", 42.50, "Trimestral");
        Suscripcion plan3 = new Suscripcion("VIP", 150.00, "Anual");

        usuario1.suscribirse(plan1);
        usuario2.suscribirse(plan2);
        usuario3.suscribirse(new Suscripcion("Empresarial", 199.99, "Semestral"));

        System.out.println("=== INFORMACIÓN DE USUARIOS ===");
        System.out.println(usuario1);
        System.out.println(usuario2);

        System.out.println("¿Los usuarios tienen la misma identificación? " +
                usuario1.equals(usuario2));

        System.out.println("=== DETALLES DE MEMBRESÍAS ===");
        System.out.println(plan1);
        System.out.println(plan2);

        System.out.println("¿Las membresías son equivalentes? " +
                plan1.equals(plan2));
    }

}