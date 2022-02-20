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
 * @version 1.0
 * @since 18-02-2022
 */

public class BukaTutupJalan {
    
    public static void main(String[] args) {
        // Membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // Membuat array int 
        int[] array = new int[4];
        
        // Memasukkan scanner ke dalam array int
        for(int i=0; i<4; i++ ){
            array[i] = input.nextInt();
        }
        
        //Membuat string untuk menampung hasil convert array int menjadi string
        //replaceAll() digunakan untuk menghapus karakter "[", ",", dan "]" dari output toString()
        String str = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
        
        //Untuk mengconvert string ke tipe data long
        long angka = Long.parseLong(str);
        
        //Pengecekan kondisi apabila gabungan angka dikurangi 999999 kemudian sisa hasil baginya adalah 0
        //Maka output akan mencetak "berhenti" dan apabila sisa hasil bagi adalah 1 maka akan mencetak "jalan"
        if((angka-999999)%5==0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
    }
    
}