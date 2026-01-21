package academy.devdojo.maratonajava.introducao;

public class Aula06_1 {
    public static void main(String[] args) {
        int i = 0, parcela = 0;
        double valorCarro = 35000;

        //FOR

        /*for (i = 0; i <= 1000000; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }*/

        //BREAK
        /*for (i = 0; i <= 50; i++) {

            if(i > 25){
                break;
            }

            System.out.println(i);

        }*/

        for (i = 0;  i <= valorCarro ; i++) {

            if(valorCarro/i < 1000) {

                break;
            }

            System.out.println(i);
        }

    }
}
