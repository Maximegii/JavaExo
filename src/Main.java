import java.util.ArrayList;
import java.util.List;

public class Main {

    // Méthode principale
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9; // Change la valeur cible selon tes besoins
        List<List<Integer>> result = findPairsThatSumToTarget(array, target);

        // Affichage des résultats
        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }

    // Méthode pour trouver toutes les paires d'indices qui additionnés atteignent la valeur cible
    public static List<List<Integer>> findPairsThatSumToTarget(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    result.add(pair);
                }
            }
        }

        return result;
    }
}
