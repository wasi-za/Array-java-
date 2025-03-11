public class Spiral_Order {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int topRow = 0, bottomRow = array.length - 1;
        int leftCol = 0, rightCol = array[0].length - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
           
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(array[topRow][i] + " ");
            }
            topRow++;
          
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(array[i][rightCol] + " ");
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(array[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(array[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
    }
}
