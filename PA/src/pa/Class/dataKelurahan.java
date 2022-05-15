/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.Class;

/**
 *
 * @author MSi-GAMING
 */
abstract public class dataKelurahan {
    private String namaKelurahan = "Kelurahan Sempaja Utara Samarinda";
    private int kodePos = 75119;
    private String kecamatan = "Samarinda Utara";
    private String kodeWilayah = "64.72.09.1003";
    
    public dataKelurahan(String namaKelurahan, int kodePos, String kecamatan, String kodeWilayah){
        this.namaKelurahan = namaKelurahan;
        this.kodePos = kodePos;
        this.kecamatan = kecamatan;
        this.kodeWilayah = kodeWilayah;
    }
    
    public dataKelurahan(){
        this.namaKelurahan = "";
        this.kodePos = 0;
        this.kecamatan = "";
        this.kodeWilayah = "";
    }
    
    void KelurahanBuka(){
        System.out.println("Kelurahan Buka pukul 07.30 - 16.00\nSetiap Hari Kerja");
    }
    void KelurahanTutup(){
        System.out.println("Kelurahan Tutup pukul 16.01\nSabtu dan Minggu Tutup");
    }
    
    void tambahData(){
        System.out.println("Data Berhasil Ditambahkan !");
    }
    
    void ubahData(){
        System.out.println("Data Berhasil Diubah !");
    }
    
    void hapusData(){
        System.out.println("Data Berhasil Dihapus !");
    }
}
