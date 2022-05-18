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
public class DataPenduduk extends DataKelurahan {
    private String id;
    private String nama;
    private String alamat;
    private String jenisKelamin;
    private String tempatLahir;
    private String tanggalLahir;
    private String agama;
    private String pekerjaan;
    private String status;
    private String kewarganegaraan;
    private String nik;
    
    public DataPenduduk(String id, String nama, String alamat, String jenisKelamin, String tempatLahir, String tanggalLahir, String agama, String pekerjaan, String status, String kewarganegaraan, String nik){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
        this.status = status;
        this.kewarganegaraan = kewarganegaraan;
        this.nik = nik;
    }
    
    public DataPenduduk(){
        this.id = "";
        this.nama = "";
        this.alamat = "";
        this.jenisKelamin = "";
        this.tempatLahir = "";
        this.tanggalLahir = "";
        this.agama = "";
        this.pekerjaan = "";
        this.status = "";
        this.kewarganegaraan = "";
        this.nik = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
    @Override
    public void tambahData(){
        System.out.println("Data Berhasil Ditambahkan !\nSebagai Data Penduduk !");
    }
    
    @Override
    public void ubahData(){
        System.out.println("Data Berhasil Diubah !\nSebagai Data Penduduk !");
    }
    
    @Override
    public void hapusData(){
        System.out.println("Data Berhasil Dihapus !\nSebagai Data Penduduk !");
    }
    
    @Override
    public void lihatData(){
        System.out.println("Data Berhasil Dilihat !\nSebagai Data Penduduk !");
    }
    
    
}
