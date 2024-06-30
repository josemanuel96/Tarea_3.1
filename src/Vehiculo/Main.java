package Vehiculo;

/**
 *
 * @author JoseManuelVicenteCheco
 */
public class Main {

    public static void main(String[] args) {

        //Objeto de la clase AutoMovil.
        //Aqui se llenan los parametros del constructor.
        AutoMovil auto1 = new AutoMovil("JUDM152487AZX", "NISSAN", "FRONTIER", "NEGRA", true);

        //Invocando los metodos.
        System.out.println("---------------------------------------------");
        auto1.apagarAuto(0);
        auto1.conducirAuto();
        auto1.prenderAuto(1);
        auto1.lavarAuto();

        //Probando el metodo Get.
        System.out.println("---------------------------------------------");
        System.out.println("Chasis: " + auto1.getChasis());
        System.out.println("Marca : " + auto1.getMarca());
        System.out.println("Modelo : " + auto1.getModelo());
        System.out.println("Color :" + auto1.getColor());

        //Probando el metodo Set.
        auto1.setColor("VERDE");
        auto1.setMarca("MERCEDES BENZ");
        auto1.setModelo("GLE");

        //Segunda impresion.
        System.out.println("");
        System.out.println("ACTUALIZACION DE DATOS.");
        System.out.println("---------------------------------------------");
        System.out.println("Chasis: " + auto1.getChasis());
        System.out.println("Marca : " + auto1.getMarca());
        System.out.println("Modelo : " + auto1.getModelo());
        System.out.println("Color :" + auto1.getColor());

        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------------");

        //Clase HondaCivic heredada de la clase AutoMovil.
        //Aqui se llenan los parametros del constructor.
        HondaCivic auto2 = new HondaCivic("WER4787984SDF125F", "HONDA", "CIVIC", "BLANCA", 2022, 4);

        //Invoncado los metodos de la clase HondaCivic.
        System.out.println("---------------------------------------------");
        auto2.apagarAuto(0);
        auto2.conducirAuto();
        auto2.prenderAuto(1);
        auto2.lavarAuto();

        //Probando el metodo Get.
        System.out.println("---------------------------------------------");
        System.out.println("Chasis: " + auto2.getChasis());
        System.out.println("Marca : " + auto2.getMarca());
        System.out.println("Modelo : " + auto2.getModelo());
        System.out.println("Color :" + auto2.getColor());
        System.out.println("Year :" + auto2.getYear());
        System.out.println("Puerta :" + auto2.getPuertas());

        //Probando el metodo Set.
        auto2.setColor("NARANJA");
        auto2.setMarca("AUDI");
        auto2.setModelo("R8");

        //Segunda impresion.
        System.out.println("");
        System.out.println("ACTUALIZACION DE DATOS.");
        System.out.println("---------------------------------------------");
        System.out.println("Chasis: " + auto2.getChasis());
        System.out.println("Marca : " + auto2.getMarca());
        System.out.println("Modelo : " + auto2.getModelo());
        System.out.println("Color :" + auto2.getColor());
        System.out.println("Year :" + auto2.getYear());
        System.out.println("Puerta :" + auto2.getPuertas());

    }

}
