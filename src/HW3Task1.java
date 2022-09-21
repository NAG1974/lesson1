import java.util.Arrays;

public class HW3Task1 {
    public static void main(String[] args) {

    }

    static void twoDimentsionalArrays() {
        // Давайте создадим двумерный массив int с 3 строками и 3 столбцами. Вот как это выглядит:
        int[][] twoDimArrayEmpty = {
                {0, 0, 0}, // first array of ints
                {0, 0, 0}, // second array of ints
                {0, 0, 0}  // third array of ints
        };

        // В приведенном ниже примере каждый новый встроенный массив имеет разную длину:
        int[][] twoDimArrayFilled = {
                {0, 0},       // the length is 2
                {1, 2, 3, 4}, // the length is 4
                {3, 3, 3}     // the length is 3
        };

        int[][] twoDimArray = {
                {3, 4, 5},  // [0]
                {6, 7, 8},  // [1]
        };

        // Создадим новую переменную int number и поместим в нее элемент первой строки и первого столбца нашего массива:
        int number = twoDimArray[0][0]; // it is 3

        //Следующий код покажет все элементы двумерного массива twoDimArray:
        System.out.println(twoDimArray[0][0]); // 3
        System.out.println(twoDimArray[0][1]); // 4
        System.out.println(twoDimArray[0][2]); // 5
        System.out.println(twoDimArray[1][0]); // 6
        System.out.println(twoDimArray[1][1]); // 7
        System.out.println(twoDimArray[1][2]); // 8
    }

   // static void iterationTwoDimArray() {
        // Первый for цикл выбирает вложенный массив, а второй for цикл перебирает все элементы вложенного массива.
     //   int[][] twoDimArray = new int[2][10];

       // for (int i = 0; i < twoDimArray.length; i++) {
        //    for (int j = 0; j < twoDimArray[i].length; j++) {
          //      twoDimArray[i][j] = 1;
            }

