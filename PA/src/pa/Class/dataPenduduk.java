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
public class dataPenduduk extends dataKelurahan {
    private String id;
    private String namaPenduduk;
    private String alamat;
    private String jenisKelamin;
    private String tempatLahir;
    private String tanggalLahir;
    private String agama;
    private String pekerjaan;
    private String status;
    private String kewarganegaraan;
    private String nik;

    public dataPenduduk(String id, String namaPenduduk, String alamat, String jenisKelamin, String tempatLahir, String tanggalLahir, String agama, String pekerjaan, String status, String kewarganegaraan, String nik, String namaKelurahan, String kodePos, String kecamatan, String kodeWilayah) {
//        super(namaKelurahan, kodePos, kecamatan, kodeWilayah);
        this.id = id;
        this.namaPenduduk = namaPenduduk;
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
    
    public dataPenduduk(){
        this.id = "";
        this.namaPenduduk = "";
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

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the namaPenduduk
     */
    public String getnamaPenduduk() {
        return namaPenduduk;
    }

    /**
     * @param namaPenduduk the namaPenduduk to set
     */
    public void setnamaPenduduk(String namaPenduduk) {
        this.namaPenduduk = namaPenduduk;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * @param tempatLahir the tempatLahir to set
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * @return the tanggalLahir
     */
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the agama
     */
    public String getAgama() {
        return agama;
    }

    /**
     * @param agama the agama to set
     */
    public void setAgama(String agama) {
        this.agama = agama;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the kewarganegaraan
     */
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    /**
     * @param kewarganegaraan the kewarganegaraan to set
     */
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */

    public void setNik(String nik) {
        this.nik = nik;
    }
    
    @Override
    void tambahData(){
        System.out.println("Data Berhasil Ditambahkan di Data Penduduk!");
    }
    
    @Override
    void ubahData(){
        System.out.println("Data Berhasil Diubah di Data Penduduk!");
    }
    
    @Override
    void hapusData(){
        System.out.println("Data Berhasil Dihapus di Data Penduduk!");
    }
}
