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
public class dataPegawai extends dataKelurahan {
    private String id;
    private String namaPegawai;
    private String alamat;
    private String jenisKelamin;
    private String tempatLahir;
    private String tanggalLahir;
    private String agama;
    private String jabatan;
    private String status;
    private String kewarganegaraan;
    private String nip;
    
    public dataPegawai(String id, String namaPegawai, String alamat, String jenisKelamin, String tempatLahir, String tanggalLahir, String agama, String jabatan, String status, String kewarganegaraan, String nip, String namaKelurahan, int kodePos, String kecamatan, String kodeWilayah) {
        super(namaKelurahan, kodePos, kecamatan, kodeWilayah);
        this.id = id;
        this.namaPegawai = namaPegawai;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.jabatan = jabatan;
        this.status = status;
        this.kewarganegaraan = kewarganegaraan;
        this.nip = nip;
    }
    
    public dataPegawai(){
        this.id = "";
        this.namaPegawai = "";
        this.alamat = "";
        this.jenisKelamin = "";
        this.tempatLahir = "";
        this.tanggalLahir = "";
        this.agama = "";
        this.jabatan = "";
        this.status = "";
        this.kewarganegaraan = "";
        this.nip = "";
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
     * @return the namaPegawai
     */
    public String getNamaPegawai() {
        return namaPegawai;
    }

    /**
     * @param namaPegawai the namaPegawai to set
     */
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
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
     * @return the jabatan
     */
    public String getJabatan() {
        return jabatan;
    }

    /**
     * @param jabatan the jabatan to set
     */
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
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
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    @Override
    void tambahData(){
        System.out.println("Data Berhasil Ditambahkan di Data Pegawai !");
    }
    
    @Override
    void ubahData(){
        System.out.println("Data Berhasil Diubah di Data Pegawai !");
    }
    
    @Override
    void hapusData(){
        System.out.println("Data Berhasil Dihapus !di Data Pegawai ");
    }
}

