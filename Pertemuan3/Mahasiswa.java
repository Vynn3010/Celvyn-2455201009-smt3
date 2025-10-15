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
    void tambahIpk(double tambahan) {
        ipk += tambahan;
        if (ipk > 4.0) {
            ipk = 4.0; 
        }
        predikat = tentukanPredikat(ipk);
        System.out.println("\nIPK berhasil ditambahkan!");
        System.out.println("IPK terbaru : " + ipk);
        System.out.println("Predikat baru: " + predikat + "\n");
    }
   //fungsi dgn parameter
    String tentukanPredikat(double nilaiIpk) {
        if (nilaiIpk >= 3.5) {
            return "Cumlaude";
        } else if (nilaiIpk >= 3.25) {
            return "Sangat Memuaskan";
        } else if (nilaiIpk >= 2.75) {
            return "Memuaskan";
        } else {
            return "Cukup";
        }
    }
}