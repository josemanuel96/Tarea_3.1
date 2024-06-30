package Vehiculo;

/**
 *
 * @author JoseManuelVicenteCheco
 */

//Clase HondaCivic hereda de la clase AutoMovil.
public class HondaCivic extends AutoMovil {

    //Declarando atributos propios de la clase Honda Civic.
    private int year;
    private int puertas;

    //Constructor con parametros y atributos heredados de la clase AutoMovil.
    public HondaCivic(String chasis, String marca, String modelo, String color, int year, int puertas) {

        super(chasis, marca, modelo, color, false);
        this.year = year;
        this.puertas = puertas;

        System.out.println("Constructor de Honda Civic");

    }

    
    //Metodos Getters y Setters de atributos propios de la clase Honda Civic.
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    
    //Metodos sobreescritos.
    
    @Override
    public void conducirAuto() {

        System.out.println("Este carro Honda es automatico, pon la [D] y dale pa' ya.");
    }

    @Override
    public void lavarAuto() {

        System.out.println("Este carro necesita ser encerado luego de ser lavado.");
    }

}
