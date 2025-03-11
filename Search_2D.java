public class Search_2D {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5; 
        boolean found = false;
        int rowPos = -1, colPos = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    found = true;
                    rowPos = i;
                    colPos = j;
                    break;
                }
            }
            if (found) break;
        }
        if (found) {
            System.out.println("Element found at position: (" + rowPos + ", " + colPos + ")");
        } else {
            System.out.println("Element not found.");
        }
    }
}