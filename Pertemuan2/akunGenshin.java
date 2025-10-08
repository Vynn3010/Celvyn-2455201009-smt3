/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author calvi
 */
public class akunGenshin {
    // Deklarasi variabel
    String uid = "";
    String namaUser = "";
    String adventureRank = "";
    String charLimit = "";
    String login = "";
    String minus = "";
    String harga = "";
    
    // Konstruktor
    public akunGenshin(String uid, String namaUser, String adventureRank, String charLimit , String login , String minus , String harga) {
        this.uid = uid;
        this.namaUser = namaUser;
        this.adventureRank = adventureRank;
        this.charLimit = charLimit;
        this.login = login;
        this.minus = minus;
        this.harga = harga;
    }

    // Method untuk menampilkan data
    public void tampilData() {
        System.out.println("=STOK AKUN GENSHIN BAYYY_STORE=");
        System.out.println("UID             : " + uid);
        System.out.println("Nama User       : " + namaUser);
        System.out.println("Adventure Rank  : " + adventureRank);
        System.out.println("Character Limit : " + charLimit);
        System.out.println("Login           : " + login);
        System.out.println("Minus           : " + minus);
        System.out.println("Harga           : " + harga);
        System.out.println("===============================");
    }
}
