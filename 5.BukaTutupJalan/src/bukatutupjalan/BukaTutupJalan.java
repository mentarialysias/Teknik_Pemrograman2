package bukatutupjalan;

import java.util.Arrays;
import java.util.Scanner;


/**
 * <h1> Buka Tutup Jalan </h1>
 * <pre>	Buka tutup jalan merupakan hal yang lumrah ada di pengaturan jalan khususnya di Indonesia.
 * Buka tutup jalan kali ini memiliki aturan yang disempurnakan. Setiap empat mobil yang lewat
 * digabung setiap angkanya. Jika (gabungan angka tersebut dikurangi 999999) hasilnya dibagi 5
 * sisa bagi hasilnya 0 maka 4 mobil tersebut harus berhenti, dan memperbolehkan mobil lainnya
 * dari arah bersebrangan untuk jalan. Begitu terus sebaliknya. </pre>
 * 
 * <h2> Input Format </h2>
 * 	Satu baris berupa plat number untuk 4 mobil
 * 
 * <h2> Output Format </h2>
 * Berupa tulisan &#8221;Jalan&#8221; atau &#8221;Berhenti&#8221;
 * 
 * 
 * @author Mentari Ayu Alysia Sudrajat
 * @version 2.0
 * @since 18-02-2022 Revisi 20-02-2022
 */

public class BukaTutupJalan {
    
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in); //membaca data dari perangkat masukan
        String plat = data.nextLine(); //nilai plat adalah data dari perangkat masukan, bertipe string
		String temp = plat.replaceAll("\\s","" ); //menyimpan isi dari plat ke temp, data telah digabungkan
		Long gabungPlat = Long.parseLong(temp); //mengkonversi tipe data ke long
		
		//proses selection, bila hasilnya 0, maka "jalan". jika tidak maka "berhenti"
		if((gabungPlat - 999999)%5 == 0) { 
			System.out.println("Jalan");
		}else {
			System.out.println("Berhenti");
		}
	}
}