package bignumber;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * <H1> Big Number </h1>
 * <pre>Program ini dibuat untuk menjumlahkan dan mengalikan 2 buah bilangan yang pengguna masukkan </pre>
 * 
 * <h2> input Format </h2>
 * <pre> masukan dari program ini adalah 2 buah bilangan positif, bilangan pertama disimpan di variabel a dan bilangan kedua disimpan di variabel b</pre>
 * 
 * <h2> Output Format</h2>
 * <pre> baris pertama merupakan hasil dari a + b 
 * baris kedua merupakan hasil dari a * b</pre>
 * 
 * 
 * 
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 18-02-2022
 */

public class BigNumber {

    public static void main(String[] args) {
        // Membuat scanner baru
        Scanner data = new Scanner(System.in);
        
        // Membuat var dengan tipe data BigInteger dan memasukkan scanner ke dalamnya
        BigInteger a = data.nextBigInteger();
        BigInteger b = data.nextBigInteger();

        System.out.println(a.add(b)); //menampilkan hasil dari a + b
        System.out.println(a.multiply(b)); //menampilkan hasil dari a*b
    }
    
}