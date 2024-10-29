import java.util.ArrayList;
import java.util.Collections;

public class ExerciciosArrayList {
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        System.out.println("Fruta está na lista? " + exercicio3("Banana"));
        exercicio4();
        System.out.println("Quantidade de números pares: " + exercicio5());
    }

    public static void exercicio1() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Uva");

        System.out.println("Lista de frutas: " + frutas);
    }

    public static void exercicio2() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Uva");

        frutas.remove(2);

        System.out.println("Lista de frutas após remoção: " + frutas);
    }

    public static boolean exercicio3(String fruta) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Uva");

        return frutas.contains(fruta);
    }

    public static void exercicio4() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(4);

        Collections.sort(numeros);

        System.out.println("Lista de números ordenada: " + numeros);
    }

    public static int exercicio5() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(4);

        int contadorPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }
}
