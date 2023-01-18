package Ejercicio13;
public class Cilindro extends Circulo {
    private double Altura;

    public Cilindro(double Altura , double radio){
        super(radio);

        this.Altura= Altura;
        if (Altura < 0){
            Altura=0;
        }
    }
    public double getAltura(){
        return Altura;
    }
    public double getVolume(){
        return getArea() * Altura;
    }
}
