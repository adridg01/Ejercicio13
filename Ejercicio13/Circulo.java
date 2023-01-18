package Ejercicio13;

public class Circulo {
    private double radio;
    /*private double Area = radio * radio* Math.PI;*/

    public Circulo(double radio){
        this.radio=radio;
        if (radio < 0){
            radio = 0;
        }
    }
    public double getRadio(){
        return radio;
    }
    public double getArea(){
        return radio * radio * Math.PI;
    }

    public static void main(String[] arg){
        Circulo o= new Circulo(6);
        Cilindro u= new Cilindro(2,3);
        System.out.println("Area= "+o.getArea());
        System.out.println("Radio= "+o.getRadio());
        System.out.println("Altura= "+u.getAltura());
        System.out.println("Volumen="+u.getVolume());
        System.out.println("Area= "+u.getArea());

    }
}

