package inputoutput;
import java.io.*;
import java.util.Scanner;

/**
 * <h1> Input &#038; Output </h1>
 * <pre><q>Program ini dibuat untuk menghitung banyak kata yang pengguna masukkan. Nantinya kata tersebut akan dikeluarkan secara terpisah perkata.</q>
 * Masukan untuk program ini berupa kalimat, ketentuannya adalah sebagai berikut : </pre>
 * <ol>
 * 		<li> 1 &#060;= length of s &#060;= 4.10<sup>5</sup>
 * 		<li> s is composed of any of the following:
 * 		  <ul>
 * 			<li>English alphabetic letters</li>
 * 			<li>blank spaces</li>
 * 			<li>exclamation points (!)</li>
 * 			<li>commas (,)</li>
 * 			<li>question marks (?)</li>
 * 			<li>periods (.)</li>
 * 			<li>underscores (_)</li>
 * 			<li>apostrophes (')</li>
 * 			<li>at symbols (@)</li>
 * 		  </ul>
 * 		</li>
 * </ol>
 *
 *
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 18-02-2022
 */

public class InputOutput {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in); //membaca data dari perangkat masukan
		String kalimat = data.nextLine();  //data dari perangkat masukan dimasukkan ke kalimat (string)
		
		String[] kata = kalimat.trim().split("[!,?._'@\\ ]"); //memisahkan kalimat menjadi kata perkata berdasarkan simbol tertentu
		int jumlahKata = kata.length; //memasukan nilai untuk variabel jumlahKata berdasakan jumlah kata dari kalimat
		System.out.println(jumlahKata); //menampilkan nilai dari variabel jumlahKata
		for(int i = 0; i < jumlahKata; i++) { //proses repetition untuk menampilkan kata perkata sebanyak jumlahKata
			System.out.println(kata[i]); //menampikan kata ke 1 sampai kata terakhir
		}
	}
}
