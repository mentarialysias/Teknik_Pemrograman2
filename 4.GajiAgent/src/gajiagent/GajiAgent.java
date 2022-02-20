package gajiagent;
import java.util.Scanner;

/**
 * <h1> Gaji Agent </h1>
 * <pre><q>Program ini dibuat untuk menghitung gaji agent sesuai dengan jumlah barang yang dijual agent tersebut. </q>
 * gaji pokok semua agent adalah sebesar Rp. 500.000,00. Namun, seorang Agent akan mendapat bonus atau denda jika menjual barang dengan kriteria berikut :</pre>
 * <ul>
 * 		<li> lebih dari 80 barang : mendapat bonus sebesar 35% dari total penjualan item. </li>
 *		<li> lebih dari 39 barang : mendapat bonus sebesar 25% dari total penjualan item. </li>
 * 		<li> 15 sampai 39 barang : mendapat bonus sebesar 10% dari total penjualan item. </li>
 *		<li> kurang dari 15 barang : mendapat denda sebesar 15% dari total penjualan item. </li>
 * </ul><br>
 * 
 * <pre><b><i> *harga setiap item adalah Rp. 50.000,00.</i></b></pre>
 * 
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 18-02-2022
 */

public class GajiAgent {
    public static void main(String[] args) {
    	int gajiPokok = 500000;
        int harga = 50000;
        double gajiTotal;
        
        Scanner data = new Scanner(System.in); //membaca data dari perangkat masukan
        int itemTerjual = data.nextInt(); //memasukkan nilai untuk variabel itemTerjual
        
        // proses selection berdasarkan nilai pada variabel itemTerjual
        if(itemTerjual > 80){
            gajiTotal = (gajiPokok + ((0.35)*(itemTerjual*harga)));
        }else if(itemTerjual >= 40){
            gajiTotal = (gajiPokok + ((0.25)*(itemTerjual*harga)));
        }else if(itemTerjual < 15){
            gajiTotal = (gajiPokok - ((0.15)*((15-itemTerjual)*harga)));
        }else{
        	gajiTotal = (gajiPokok + ((0.10)*(itemTerjual*harga)));
        }
        System.out.println((int)gajiTotal); //menampilkan nilai dari variabel gajiTotal
    }
    
}