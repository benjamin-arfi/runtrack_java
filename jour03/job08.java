
import java.util.Arrays;
public class job08 {
  public static void main(String[] args) {
      // Déclaration de la matrice initiale
int[][] tableau = {{5,9,3},{7,2,8},{1,6,4}};

// Récupération des dimensions de la matrice
int n = tableau.length;
int m = tableau[0].length;

// Création d'un tableau à une dimension pour stocker tous les éléments de la matrice
int[] tab1D = new int[n * m];
int k = 0;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        tab1D[k++] = tableau[i][j];
    }
}

// Tri du tableau à une dimension
Arrays.sort(tab1D);

// Recréation d'une matrice triée à partir du tableau trié
int[][] matriceTrie = new int[n][m];
k = 0;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        matriceTrie[i][j] = tab1D[k++];
    }
}

// Affichage de la matrice triée
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.print(matriceTrie[i][j] + " ");
    }
    System.out.println();
}
  }
}