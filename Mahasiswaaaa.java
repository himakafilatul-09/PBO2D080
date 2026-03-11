/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Mahasiswaaaa {

    
    private String nim;
    private String nama;
    private double nilai;

    
    public Mahasiswaaaa(String nim, String nama, double nilai) {
        
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    
    public void tampilkanData() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai: " + nilai);
    }

    
    public static void main(String[] args) {

        
        Mahasiswaaaa mhs1 = new Mahasiswaaaa("210631100080", "Kafilatul Hima", 90);

        
        mhs1.tampilkanData();
    }
}