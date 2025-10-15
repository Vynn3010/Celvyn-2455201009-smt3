/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author calvi
 */
public class Utama_Mahasiswa {
    public static void main(String[] args) {
        System.out.println("======= MAHASISWA KE-1 =======");
        Mahasiswa m1 = new Mahasiswa("24552010", "Adi", 3.51);
        m1.tampilData();
        System.out.println( m1.predikat());
        
        System.out.println("======= MAHASISWA KE-2 =======");
        Mahasiswa m2 = new Mahasiswa ("24552011","Ali",3.25);
        m2.tampilData();
        System.out.println(m2.predikat());
        
        System.out.println("Predikat berdasarkan IPK 3.1: " + m2.hitungPredikat(3.1));
        System.out.println();
        m2.ubahData("24552012", "Budi", 3.6);
        System.out.println("===== DATA SETELAH DIUBAH =====");
        m2.tampilData();
        System.out.println(m2.predikat());
    }
}
