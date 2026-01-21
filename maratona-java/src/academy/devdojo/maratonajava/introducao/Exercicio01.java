package academy.devdojo.maratonajava.introducao;

public class Exercicio01 {
    public static void main (String[] args) {
        double salarioRecebido = 700000, salarioFinal = 0;


        if(salarioRecebido < 34713) {
            salarioFinal = salarioRecebido * 0.0970;
        }
        else if(salarioRecebido >= 34713 && salarioRecebido < 68508) {
            salarioFinal = salarioRecebido * 0.3735;
        }
        else if(salarioRecebido >= 68508) {
            salarioFinal = salarioRecebido * 0.495;
        }
        System.out.println("Você terá que pagar: " + salarioFinal);
    }
}
