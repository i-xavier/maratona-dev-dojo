package academy.devdojo.maratonajava.introducao;

public class Aula04 {
    public static void main(String[] args) {
        // + - * /
        int nmr1 = 10;
        int nmr2 = 20;
        int resultado = nmr1 * nmr2;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("\nisDezMaiorQueVinte? " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte? " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte? " +isDezIgualVinte);
        System.out.println("isDezIgualDez? " +isDezIgualDez);
        System.out.println("isDezDiferenteDez? " +isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("\nisDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlayStaion5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("\nisPlayStaion5Compravel? " +isPlayStaion5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //
        int i = 0;
        i += 1;
        i++;
        i--;
        ++i;
        --i;

        System.out.println(i);
    }
}
