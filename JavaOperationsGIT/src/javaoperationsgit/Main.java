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
        calc.sumar(calc.getA(),calc.getB());
        calc.restar(calc.getA(),calc.getB());
        calc.multiplicar(calc.getA(),calc.getB());
        calc.dividir(calc.getA(),calc.getB());
    }
    
}
