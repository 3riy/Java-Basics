// -- Initialize Multi-Dimensional Array -- //

public class Initialize_MultiDimensional_Array {
    int array1[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };++
    // Print elements
    for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < array1[i].length; j++) {
            System.out.print(array1[i][j] + " ");
        }
        System.out.println();
    }

    int[][] array2 = new int[4][5];
    
    // Print elements
    for (int a = 0; a < array2.length; a++) {
        for (int b = 0; b < array2[a].length; b++)
            System.out.print(array2[a][b] + " ");
        System.out.println();
    }
}
