package academy.devdojo.maratonajava.introducao;

public class Aula07 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        /*int[] idades = new int[3]{1,2,3}; dá pra fazer isso tb*/

        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;

        for(int i: idades)
            System.out.println(i);
    }
}
