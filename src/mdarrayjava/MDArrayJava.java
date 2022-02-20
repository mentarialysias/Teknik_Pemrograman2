package mdarrayjava;

/**
 * <H1> Multi Dimensi Array </H1>
 * <pre> Program ini akan menampilkan isi dari masing-masing array yang ada
 * array 1 dimensi menampung 3 buah bilangan yang telah diinputkan (pada saat pembuatan program).
 * array 2 dimensi menampung nilai dari 3 array 1 dimensi
 * array 3 dimensi menampung nilai dari 3 array 2 dimensi
 * </pre>
 * <h2> Hasil Output </h2>
 * <pre> Output dari program ini adalah : </pre>
 * 	<ul>
 * 		<li>baris pertama adalah isi dari array 3 dimensi pertama </li>
 * 		<li>baris kedua adalah isi dari array 3 dimensi kedua </li>
 * 		<li>baris ketiga adalah isi dari array 3 dimensi ketiga </li>
 *  </ul>
 *  
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 20-02-2022
 */

public class MDArrayJava {

    public static void main(String[] args) {
        //One Dimensional Arrays
    int[] fisrtArray = {2, 5, 3};
    int[] secondArray = {9, 5, 3};
    int[] thirdArray = {2, 4, 9};
    int[] fourthArray = {10, 11, 12};
    int[] fifthArray = {13, 14, 15};
    int[] sixthArray = {16, 17, 18};
    int[] seventhArray = {19, 20, 21};
    int[] eighthArray = {22, 23, 24};
    int[] ninthArray = {25, 26, 27};
    
    //Two Dimensional Arrays
    int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
    int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
    int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
    
    //Three Dimensional Array
    int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
    
    //Perintah untuk menampilkan nilai array
    for(int i=0; i<threeDimensionalArray.length; i++){
        System.out.print("{");
        for(int j=0; j<threeDimensionalArray[i].length; j++){
            System.out.print("{");
            for(int k=0; k<threeDimensionalArray[i][j].length; k++){
                System.out.print(threeDimensionalArray[i][j][k] + " ");
            }
            System.out.print("} ");
        }
        System.out.print("} ");
        System.out.println();
    }
    }
    
}