/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelurahansempajautara.Framework;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import kelurahansempajautara.Class.DataPegawai;
import kelurahansempajautara.Class.DataPenduduk;

public class Menu implements CrudMenu {
    static final String DB_URL = "jdbc:mysql://localhost/ db_kelurahan";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    Statement database() throws SQLException{
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        return stmt;
    }
    
    ArrayList<DataPenduduk> DataPenduduk;
    ArrayList<DataPegawai> DataPegawai;
    Scanner input = new Scanner(System.in);
    
    public void kembali() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }
    
    public void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }

    @Override
    public void tambahDataPenduduk(ArrayList<DataPenduduk> DataPenduduk) {
        clearScreen();
        try{
            database();
            String angka = "0123456789";
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int N = alphabet.length();
            int M = angka.length();

            Random r = new Random();
            String id = ("#"+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+"\n");

            System.out.print("Id Penduduk " + id);
            System.out.print("Masukkan Nama            : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Alamat          : ");
            String alamat = input.nextLine();
            System.out.print("Masukkan Jenis Kelamin   : ");
            String jenisKelamin = input.nextLine();
            System.out.print("Masukkan Tempat Lahir    : ");
            String tempatLahir = input.nextLine();
            System.out.print("Masukkan Tanggal Lahir   : ");
            String tanggalLahir = input.nextLine();
            System.out.print("Masukkan Agama           : ");
            String agama = input.nextLine();
            System.out.print("Masukkan pekerjaan       : ");
            String pekerjaan = input.nextLine();
            System.out.print("Masukkan Status          : ");
            String status = input.nextLine();
            System.out.print("Masukkan Kewarganegaraan : ");
            String kewarganegaraan = input.nextLine();
            System.out.print("Masukkan Nik             : ");
            String nik = input.nextLine();

            DataPenduduk dataPenduduk = new DataPenduduk(id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, pekerjaan, status, kewarganegaraan, nik);
            dataPenduduk.setId(id);
            dataPenduduk.setNama(nama);
            dataPenduduk.setAlamat(alamat);
            dataPenduduk.setJenisKelamin(jenisKelamin);
            dataPenduduk.setTempatLahir(tempatLahir);
            dataPenduduk.setTanggalLahir(tanggalLahir);
            dataPenduduk.setAgama(agama);
            dataPenduduk.setPekerjaan(pekerjaan);
            dataPenduduk.setStatus(status);
            dataPenduduk.setKewarganegaraan(kewarganegaraan);
            dataPenduduk.setNik(nik);

            System.out.println(" ");
            DataPenduduk.add(dataPenduduk);
            dataPenduduk.tambahData();
            
            String sql = "INSERT INTO tb_datapenduduk(Id, Nama, Alamat, Jenis_Kelamin, Tempat_Lahir, Tanggal_Lahir, Agama, Pekerjaan, Status, Kewarganegaraan, Nik) VALUE('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
            sql = String.format(sql, id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, pekerjaan, status, kewarganegaraan, nik);

            stmt.execute(sql);
        } catch(SQLException e){
            System.out.println("GAGAL INPUT NILAI !\nKarena " + e);
        }
    }

    @Override
    public void editDataPenduduk(ArrayList<DataPenduduk> DataPenduduk) {
        clearScreen();

        try {
            database();
            lihatDataPenduduk();
            System.out.println("\n\n");
            System.out.println("-----------------");
            System.out.print("Pilih Nomer Penduduk Ex : 2009106xxx >> ");
            int id = Integer.parseInt(input.nextLine());

                System.out.println("\n");
                System.out.print("Masukkan Nama            : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Alamat          : ");
                String alamat = input.nextLine();
                System.out.print("Masukkan Jenis Kelamin   : ");
                String jenisKelamin = input.nextLine();
                System.out.print("Masukkan Tempat Lahir    : ");
                String tempatLahir = input.nextLine();
                System.out.print("Masukkan Tanggal Lahir   : ");
                String tanggalLahir = input.nextLine();
                System.out.print("Masukkan Agama           : ");
                String agama = input.nextLine();
                System.out.print("Masukkan pekerjaan       : ");
                String pekerjaan = input.nextLine();
                System.out.print("Masukkan Status          : ");
                String status = input.nextLine();
                System.out.print("Masukkan Kewarganegaraan : ");
                String kewarganegaraan = input.nextLine();
                System.out.print("Masukkan Nik             : ");
                String nik = input.nextLine();
                
                String sql = "UPDATE tb_datapenduduk SET Nama='%s',Alamat='%s',Jenis_Kelamin='%s',Tempat_Lahir='%s',Tanggal_Lahir='%s',Agama='%s',Pekerjaan='%s',Status='%s',Kewarganegaraan='%s',Nik='%s' WHERE Id_Penduduk ='%d'";
                sql = String.format(sql, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, pekerjaan, status, kewarganegaraan, nik, id);
                
                stmt.execute(sql);

        } catch(IndexOutOfBoundsException | NumberFormatException e){
            System.out.println("SALAH  INPUT !");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hapusDataPenduduk(ArrayList<DataPenduduk> DataPenduduk) {
        clearScreen();
        try{
            database();
            lihatDataPenduduk();
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            String sql = String.format("DELETE FROM tb_datapenduduk WHERE Id_Penduduk=%d", index);
            stmt.execute(sql);
            DataPenduduk S1 = new DataPenduduk();
            S1.hapusData();
        } catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println("SALAH INPUT !");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lihatDataPenduduk() {
        clearScreen();
        try {
            database();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String sql = "SELECT * FROM tb_datapenduduk";
            rs = stmt.executeQuery(sql);
            
            System.out.println("\n=============================================================================================================================================================================================================================================================================================");
            System.out.println("NO\t\tID\t\tNAMA\t\t\tALAMAT\t\t\tJENIS KELAMIN\t\tTEMPAT LAHIR\t\tTANGGAL LAHIR\t\tAGAMA\t\tPEKERJAAN\t\tSTATUS\t\tKEWARGANEGARAAN\t\tNIK");
            System.out.println("\n=============================================================================================================================================================================================================================================================================================");
            while(rs.next()){
                int Id_Penduduk = rs.getInt("Id_Penduduk");
                String a = rs.getString("Id");
                String b = rs.getString("Nama");
                String c = rs.getString("Alamat");
                String d = rs.getString("Jenis_Kelamin");
                String e = rs.getString("Tempat_Lahir");
                String f = rs.getString("Tanggal_Lahir");
                String g = rs.getString("Agama");
                String h = rs.getString("Pekerjaan");
                String i = rs.getString("Status");
                String j = rs.getString("Kewarganegaraan");
                String k = rs.getString("Nik");

                System.out.println(String.format("%d\t%s\t\t\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t%s\t\t%s\t\t%s", Id_Penduduk, a, b, c, d, e, f, g, h, i, j, k));
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        } catch (SQLException e){
            System.out.println("GAGAL MELIHAT DATA");
        }
    }

    @Override
    public void tambahDataPegawai(ArrayList<DataPegawai> DataPegawai) {
        clearScreen();
        
        try {
            database();
            String angka = "0123456789";
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int N = alphabet.length();
            int M = angka.length();

            Random r = new Random();
            String id = ("#"+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+"\n");

            System.out.print("Id Pegawai " + id);
            System.out.print("Masukkan Nama            : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Alamat          : ");
            String alamat = input.nextLine();
            System.out.print("Masukkan Jenis Kelamin   : ");
            String jenisKelamin = input.nextLine();
            System.out.print("Masukkan Tempat Lahir    : ");
            String tempatLahir = input.nextLine();
            System.out.print("Masukkan Tanggal Lahir   : ");
            String tanggalLahir = input.nextLine();
            System.out.print("Masukkan Agama           : ");
            String agama = input.nextLine();
            System.out.print("Masukkan Jabatan         : ");
            String jabatan = input.nextLine();
            System.out.print("Masukkan Status          : ");
            String status = input.nextLine();
            System.out.print("Masukkan Kewarganegaraan : ");
            String kewarganegaraan = input.nextLine();
            System.out.print("Masukkan Nip             : ");
            String nip = input.nextLine();

            DataPegawai dataPegawai = new DataPegawai(id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, jabatan, status, kewarganegaraan, nip);
            dataPegawai.setId(id);
            dataPegawai.setNama(nama);
            dataPegawai.setAlamat(alamat);
            dataPegawai.setJenisKelamin(jenisKelamin);
            dataPegawai.setTempatLahir(tempatLahir);
            dataPegawai.setTanggalLahir(tanggalLahir);
            dataPegawai.setAgama(agama);
            dataPegawai.setJabatan(jabatan);
            dataPegawai.setStatus(status);
            dataPegawai.setKewarganegaraan(kewarganegaraan);
            dataPegawai.setNip(nip);

            System.out.println(" ");
            DataPegawai.add(dataPegawai);
            dataPegawai.tambahData();
            
            String sql = "INSERT INTO tb_datapegawai(Id, Nama, Alamat, Jenis_Kelamin, Tempat_Lahir, Tanggal_Lahir, Agama, jabatan, Status, Kewarganegaraan, Nip) VALUE('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
            sql = String.format(sql, id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, jabatan, status, kewarganegaraan,  nip);

            stmt.execute(sql);
            
        } catch(SQLException e){
            System.out.println("GAGAL INPUT NILAI !\nKarena " + e);
        }
    }

    @Override
    public void editDataPegawai(ArrayList<DataPegawai> DataPegawai) {
        clearScreen();

        try {
            database();
            lihatDataPegawai();
            System.out.println("\n\n");
            System.out.println("-----------------");
            System.out.print("Pilih Nomer Pegawai >> ");
            int id = Integer.parseInt(input.nextLine());

                System.out.println("\n");
                System.out.print("Masukkan Nama            : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Alamat          : ");
                String alamat = input.nextLine();
                System.out.print("Masukkan Jenis Kelamin   : ");
                String jenisKelamin = input.nextLine();
                System.out.print("Masukkan Tempat Lahir    : ");
                String tempatLahir = input.nextLine();
                System.out.print("Masukkan Tanggal Lahir   : ");
                String tanggalLahir = input.nextLine();
                System.out.print("Masukkan Agama           : ");
                String agama = input.nextLine();
                System.out.print("Masukkan Jabatan       : ");
                String jabatan = input.nextLine();
                System.out.print("Masukkan Status          : ");
                String status = input.nextLine();
                System.out.print("Masukkan Kewarganegaraan : ");
                String kewarganegaraan = input.nextLine();
                System.out.print("Masukkan Nip             : ");
                String nip = input.nextLine();
                
                String sql = "UPDATE tb_datapegawai SET Nama='%s',Alamat='%s',Jenis_Kelamin='%s',Tempat_Lahir='%s',Tanggal_Lahir='%s',Agama='%s',Jabatan='%s',Status='%s',Kewarganegaraan='%s',Nip='%s' WHERE Id_Penduduk ='%d'";
                sql = String.format(sql, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, jabatan, status, kewarganegaraan, nip, id);
                
                stmt.execute(sql);

        } catch(IndexOutOfBoundsException | NumberFormatException e){
            System.out.println("SALAH  INPUT !");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hapusDataPegawai(ArrayList<DataPegawai> DataPegawai) {
        clearScreen();
        try{
            database();
            lihatDataPegawai();
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            String sql = String.format("DELETE FROM tb_datapegawai WHERE Id_Pegawai=%d", index);
            stmt.execute(sql);
            DataPegawai S2 = new DataPegawai();
            S2.hapusData();
        } catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println("SALAH INPUT !");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lihatDataPegawai() {
        clearScreen();
        try {
            database();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String sql = "SELECT * FROM tb_datapegawai";
            rs = stmt.executeQuery(sql);
            
            System.out.println("\n=============================================================================================================================================================================================================================================================================================");
            System.out.println("NO\tID\t\tNAMA\t\t\tALAMAT\t\t\tJENIS KELAMIN\t\tTEMPAT LAHIR\t\tTANGGAL LAHIR\t\tAGAMA\t\tJABATAN\t\tSTATUS\t\tKEWARGANEGARAAN\t\tNIP");
            System.out.println("\n=============================================================================================================================================================================================================================================================================================");
            while(rs.next()){
                int Id_Penduduk = rs.getInt("Id_Pegawai");
                String a = rs.getString("Id");
                String b = rs.getString("Nama");
                String c = rs.getString("Alamat");
                String d = rs.getString("Jenis_Kelamin");
                String e = rs.getString("Tempat_Lahir");
                String f = rs.getString("Tanggal_Lahir");
                String g = rs.getString("Agama");
                String h = rs.getString("Jabatan");
                String i = rs.getString("Status");
                String j = rs.getString("Kewarganegaraan");
                String k = rs.getString("Nip");

                System.out.println(String.format("%d\t%s\t\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t%s\t\t%s\t\t%s", Id_Penduduk, a, b, c, d, e, f, g, h, i, j, k));
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        } catch (SQLException e){
            System.out.println("GAGAL MELIHAT DATA");
        }
    }
}