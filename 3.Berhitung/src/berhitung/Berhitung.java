package berhitung;
import java.util.Scanner;
/**
 * <H1> Berhitung </H1>
 * <pre><q> Program ini dibuat untuk menghitung 2 buah bilangan yang dimasukkan oleh pengguna. 
 * bilangan yang dapat masukkan dalam program ini hanyalah <b> bilangan bulat</b></q>
 * operator matematika yang dapat digunakan dalam program ini adalah sebagai berikut : </pre>
 * <ol>
 * 		<li> Penjumlahan (+) </li>
 * 		<li> Pengurangan (-) </li>
 * 		<li> Perkalian (*) </li>
 *		<li> Pembagian (/) </li>
 *		<li> Modululs (%) </li>
 *</ol><br>
 *<pre> Aturan peng-<i>input</i>-an data dalam program ini adalah : bilangan (spasi) operator (spasi) bilangan </pre>
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 18-02-2022
 */

public class Berhitung {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int A = data.nextInt(); //membaca data dari inputan, lalu disimpan di variabel A (integer)
		char operator = data.next().charAt(0); //membaca data dari inputan, lalu disimpan di variabel operator (karakter) 
		int B = data.nextInt(); //membaca data dari inputan, lalu disimpan di variabel B (integer)
		
		
		switch(operator) { //proses selection menggunakan switch case berdasarkan operator
		case '+': System.out.printf("%d", A+B);break;
		case '-': System.out.printf("%d", A-B);break;
		case '*': System.out.printf("%d", A*B);break;
		case '/': System.out.printf("%d", A/B);break;
		case '%': System.out.printf("%d", A%B);break;
		default:System.out.println("tidak dapat melakukan operasi"); //output yang muncul jika operator yang dimasukkan bukan operator yang ditentukan
		}
	}
}