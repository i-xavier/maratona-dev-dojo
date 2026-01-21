package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03 {
    public static void main(String[] args) {
        String nome = "Igor Xavier";
        String endereco = "Rua dos bobos - Nª0 ";
        double salario = 2500.00;
        String dataRecebimentoSalario = "8/23/2025";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + "confirmo que recebi o salário de " + salario + " reais, na data " + dataRecebimentoSalario + ".";

        System.out.println(relatorio);

    }
}
