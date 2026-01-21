package academy.devdojo.maratonajava.introducao;

public class Aula02 {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        long numeroGrande = 100000L;
        int age = 10;
        short idadeShort = 32000;
        byte idadeByte = 127;
        double salarioDouble = 2000.8;
        float salarioFloat = (float) 2500.0D; //ao forçar um double em um float você tem um casting!!
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Sugo ku"; /*String é uma classe, e por isso deve ser declarada utilizando letra maiúscula*/


        System.out.println("A idade é " + age +" anos.");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi eu " + nome);
    }
}
