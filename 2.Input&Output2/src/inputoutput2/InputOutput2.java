package inputoutput;
import java.util.Scanner;

/**
 * <h1> Input &#038; Output (2) </h1>
 * <pre> Java's System.out.printf function can be used to print formatted output. The purpose of this
 * exercise is to test your understanding of formatting output using printf.
 * To get you started, a portion of the solution is provided for you in the editor; you must format
 * and print the input to complete the solution.
 * </pre>
 * 
 * <h2> Input Format </h2>
 * <pre>Every line of input will contain a String followed by an integer.
 *Each String will have a maximum of 10 alphabetic characters, and each integer will be in the in lusive range from 0 to 999. </pre>
 * 
 * <h2> Output Format </h2>
 * <pre>In each line of output there should be two columns: </pre>
 * <ul>
 * 		<li>The first column contains the String and is left justified using exactly 15 characters.</li>
 * 		<li> The second column contains the integer, expressed in exactly 3 digits; if the original input 
 * 			 has less than three digits, you must pad your output's leading digits with zeroes.</li>
 * </ul>
 * 
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 18-02-2022
 */

public class InputOutput2 {
	public static void main(String[] args) {
		//deklarasi variable
		String kata[] = new String[3]; //kata merupakan array of string 
		Short angka[] = new Short[3];  //angka merupakan array of short

		Scanner data = new Scanner(System.in); //membaca data dari perangkat masukan
		for (byte i = 0; i <3; i++) { //proses repetition sebanyak 3x, byte digunakan karena nilai i tidak besar
			kata[i]=data.next(); //proses memasukkan nilai ke kata ke-i
			angka[i] = data.nextShort(); //proses memasukkan nilai ke angka ke-i
		}
		
		//Menampilkan output sesuai format
		System.out.println("=================================================="); //bingkai atas
		for (byte i = 0; i <3; i++) { //proses perulagan sebanyak 3x
			System.out.printf("%-15s%03d %n",kata[i], angka[i] ); //menampilkan nilai dari teks ke-i dan angka ke-i
							  //karakter maksimal yang dapat ditampilkan maksimal 15
							  //angka yang ditampilkan sebanyak 3 digit, jika kurang dari 3 maka akan diawali dengan angka 0
		}
		System.out.println("=================================================="); //bingkai bawah
	}

}