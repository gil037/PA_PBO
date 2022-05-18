/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelurahansempajautara.Class;

/**
 *
 * @author MSi-GAMING
 */
abstract public class DataKelurahan {
    private final String namaKelurahan = "Kelurahan Sempaja Utara Kecamatan Samarinda Utara Kota Samarinda";
    private final int kodePos = 75119;
    private final String kodeWilayah = "64.72.09.1003";

    public String getNamaKelurahan() {
        return namaKelurahan;
    }

    public int getKodePos() {
        return kodePos;
    }

    public String getKodeWilayah() {
        return kodeWilayah;
    }
    
    public static void KelurahanBuka(){
        System.out.println("Kelurahan Buka pukul 07.30 - 16.00\nSetiap Hari Kerja");
    }
    public static void KelurahanTutup(){
        System.out.println("Kelurahan Tutup pukul 16.01\nSabtu dan Minggu Tutup");
    }
    
    public abstract void tambahData();
    public abstract void ubahData();
    public abstract void hapusData();
    public abstract void lihatData();
}
