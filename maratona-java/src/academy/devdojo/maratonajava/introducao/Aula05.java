package academy.devdojo.maratonajava.introducao;

public class Aula05 {
    public static void main (String[] args) {
        int idade = 21;
        boolean isMaiorDeIdade = idade < 21;

        if (!(isMaiorDeIdade)) {
            System.out.println("Pode beber");
        }

        if (isMaiorDeIdade) {
            System.out.println("Pode beber");
        } else System.out.println("Não pode");

    }
}
