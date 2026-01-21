package academy.devdojo.maratonajava.introducao;

public class Teste {
    public static void main(String[] args) {
        int[] vet = {8,2,10,30,1};
        int i, j, aux = 0, fim, min;

        fim = 5;

        for (i = 0; i < fim-1; i++) {

            min = i;

            for(j=i+1; j < fim; j++) {

                if (vet[j] < vet[min]) {
                    min = j;
                }

                if(min != i) {
                    aux = vet[min]; // aux = 8
                    vet[min] = vet[i];// i = 2
                    vet[i] = aux; //j = aux (8)
                }



            }
        }

        for (i = 0; i < 5; i++) {

            System.out.println(vet[i]);

        }
    }
}
