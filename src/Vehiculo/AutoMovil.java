package Vehiculo;

/**
 *
 * @author JoseManuelVicenteCheco
 */

public class AutoMovil {
    
    //Atributos privados de la clase.
    private String chasis;
    private String marca;
    private String modelo;
    private String color;
    
    //Constructor con parametros de la clase.
    public AutoMovil(String chasis, String marca,
            String modelo, String color, boolean presentar_mensaje) {

        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        
        /*Esto es un control para que este mensaje solo aparezca 
        en la clase AutoMovil y no en la heredada.*/
        if (presentar_mensaje) {
            System.out.println("Constructor de AutoMovil");
        }

    }
    
    
    //Metodos Getters y Setters.
    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    //Metodos.
    public void prenderAuto(int num) {
        if (num == 1) {
            System.out.println("El carro esta prendido");
        } else {
            System.out.println("Insertar la llave del AutoMovil");
        }
    }

    public void apagarAuto(int num2) {
        if (num2 == 0) {
            System.out.println("El carro esta apagado");
        } else {
            System.out.println("Favor de girar la llave en contra de las manecillas del reloj");
        }

    }

    public void lavarAuto() {

        System.out.println("Hoy toca lavar la maquina XD ");
    }

    public void conducirAuto() {

        System.out.println("Pasa un cambio y dale pa' lante...");
    }

}
