import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static InputStreamReader lector = new InputStreamReader(System.in);
    static BufferedReader entrada = new BufferedReader(lector);

    public static void main(String[] args) throws IOException {
        // Ahora que la clase Perro ha sido definido, es posoble instanciar objetos de esa clase



        Perro miMascota = new Perro("Firulais",
                "Salchicha",
                (byte)3,
                true,
                "Negro",
                'M');



        // Cada miembro( i.e., atributo o rutina) de una clase se puede referenciar utilizando el operador punto

        //System.out.println(miMascota.getEdad());

       // System.out.println("Ingrese el nombre de la otra mascota:  ");
       // String otroNombre = entrada.readLine();

        Perro miOtraMascota = new Perro("Firulais",
                "Salchicha",
                (byte)3,
                true,
                "Negro",
                'M');


       // miOtraMascota.setNombre ("Bruno");

      //  System.out.println((byte)miOtraMascota.getSexo());

        //System.out.println(miOtraMascota);

        if(miMascota.equals(miOtraMascota)){
            System.out.println("Son el mismo perro;");
        } else {
            System.out.println("Son perros diferentes:");
        }

        System.out.println(miMascota);

    }
}

// Tipos de datos primirtivos en Java
//Numero enteros; byte(1) short (2) int(4) long(8)
//Numeros reales float(4), double (8)
//carácteres(1)
//Valores logicos; boolean(1)
