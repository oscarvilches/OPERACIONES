package javaoperationsgit;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionesBasicas calc = new OperacionesBasicas();
        calc.setA(8);
        calc.setB(4);
        System.out.println("Suma: " + calc.sumar(calc.getA(), calc.getB()));
        System.out.println("Resta: " + calc.restar(calc.getA(), calc.getB()));
        System.out.println("Multiplicacion: " + calc.multiplicar(calc.getA(), calc.getB()));
        System.out.println("Division: " + calc.dividir(calc.getA(), calc.getB()));
    }

}
