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
public class Mahasiswa {
    String nim ="";
    String nama = "";
    Double ipk = 0.0;
    String predikat ="";
    
  public Mahasiswa ( String nim, String nama, Double ipk) {
      this.nim = nim;
      this.nama = nama;
      this.ipk = ipk;
  }
  void tampilData () {
            System.out.println("nim       : " + nim);
            System.out.println("nama      : " + nama);
            System.out.println("ipk       : " + ipk);
}
   String predikat() {
        if (ipk >= 3.5) {
            predikat = "Cumlaude";
        }
        else if (ipk >= 3.25) {
            predikat = "Sangat Memuaskan";
  }
      return predikat;
}
   //tambah prosedur
   void ubahData(String nimBaru, String namaBaru, double ipkBaru) {
        nim = nimBaru;
        nama = namaBaru;
        ipk = ipkBaru;
        System.out.println("Data mahasiswa berhasil diubah!\n");
    }
   //fungsi dgn parameter
   String hitungPredikat(double nilaiIpk) {
        if (nilaiIpk >= 3.5) {
            return "Cumlaude";
        } else if (nilaiIpk >= 3.25) {
            return "Sangat Memuaskan";
        } else {
            return "Cukup";
        }
    }
}