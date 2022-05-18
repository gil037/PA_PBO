/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelurahansempajautara.Framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import kelurahansempajautara.Class.DataPegawai;
import kelurahansempajautara.Class.DataPenduduk;

//public class Menu implements CrudMenu {
//    ArrayList<DataPenduduk> DataPenduduk;
//    ArrayList<DataPegawai> DataPegawai;
//    Scanner input = new Scanner(System.in);
//    
//    @Override
//    public void tambahDataPenduduk(ArrayList<DataPenduduk> DataPenduduk){
//        clearScreen();
//        
//        String angka = "0123456789";
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        int N = alphabet.length();
//        int M = angka.length();
//        
//        Random r = new Random();
//        String id = ("#"+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+"\n");
//        
//        System.out.print("Id Penduduk " + id);
//        System.out.print("Masukkan Nama            : ");
//        String nama = input.nextLine();
//        System.out.print("Masukkan Alamat          : ");
//        String alamat = input.nextLine();
//        System.out.print("Masukkan Jenis Kelamin   : ");
//        String jenisKelamin = input.nextLine();
//        System.out.print("Masukkan Tempat Lahir    : ");
//        String tempatLahir = input.nextLine();
//        System.out.print("Masukkan Tanggal Lahir   : ");
//        String tanggalLahir = input.nextLine();
//        System.out.print("Masukkan Agama           : ");
//        String agama = input.nextLine();
//        System.out.print("Masukkan pekerjaan       : ");
//        String pekerjaan = input.nextLine();
//        System.out.print("Masukkan Status          : ");
//        String status = input.nextLine();
//        System.out.print("Masukkan Kewarganegaraan : ");
//        String kewarganegaraan = input.nextLine();
//        System.out.print("Masukkan Nik             : ");
//        String nik = input.nextLine();
//        
//        DataPenduduk S1 = new DataPenduduk(id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, pekerjaan, status, kewarganegaraan, nik);
//        S1.setId(id);
//        S1.setNama(nama);
//        S1.setAlamat(alamat);
//        S1.setJenisKelamin(jenisKelamin);
//        S1.setTempatLahir(tempatLahir);
//        S1.setTanggalLahir(tanggalLahir);
//        S1.setAgama(agama);
//        S1.setPekerjaan(pekerjaan);
//        S1.setStatus(status);
//        S1.setKewarganegaraan(kewarganegaraan);
//        S1.setNik(nik);
//        
//        System.out.println(" ");
//        S1.tambahData();
//        DataPenduduk.add(S1);
//        
//        System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
//        System.out.println("1. Id Penduduk             : " + S1.getId());
//        System.out.println("2. Nama                   : " + S1.getNama());
//        System.out.println("3. Alamat                 : " + S1.getAlamat());
//        System.out.println("4. Jenis Kelamin          : " + S1.getJenisKelamin());
//        System.out.println("1. Tempat, Tanggal Lahir  : " + S1.getTempatLahir() + ", " + S1.getTanggalLahir());
//        System.out.println("2. Agama                  : " + S1.getAgama());
//        System.out.println("3. Jabatan                : " + S1.getPekerjaan());
//        System.out.println("4. Status                 : " + S1.getStatus());
//        System.out.println("3. Kegawarganegaraan      : " + S1.getKewarganegaraan());
//        System.out.println("4. NIP                    : " + S1.getNik());
//        
//    }
//    @Override
//    public void tambahDataPegawai(ArrayList<DataPegawai> DataPegawai){
//        clearScreen();
//        
//        final String angka = "0123456789";
//        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        final int N = alphabet.length();
//        final int M = angka.length();
//        
//        Random r = new Random();
//        String id = ("#"+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+"\n");
//        System.out.print("Id Pegawai " + id);
//        System.out.print("Masukkan Nama            : ");
//        String nama = input.nextLine();
//        System.out.print("Masukkan Alamat          : ");
//        String alamat = input.nextLine();
//        System.out.print("Masukkan Jenis Kelamin   : ");
//        String jk = input.nextLine();
//        System.out.print("Masukkan Tempat Lahir    : ");
//        String tempatlahir = input.nextLine();
//        System.out.print("Masukkan Tanggal Lahir   : ");
//        String tanggallahir = input.nextLine();
//        System.out.print("Masukkan Agama           : ");
//        String agama = input.nextLine();
//        System.out.print("Masukkan Jabatan         : ");
//        String jabatan = input.nextLine();
//        System.out.print("Masukkan Status          : ");
//        String status = input.nextLine();
//        System.out.print("Masukkan Kewarganegaraan : ");
//        String kewarganegaraan = input.nextLine();
//        System.out.print("Masukkan Nip             : ");
//        String nip = input.nextLine();
//        
//        DataPegawai S2 = new DataPegawai();
//        S2.setId(id);
//        S2.setNama(nama);
//        S2.setAlamat(alamat);
//        S2.setJenisKelamin(jk);
//        S2.setTempatLahir(tempatlahir);
//        S2.setTanggalLahir(tanggallahir);
//        S2.setAgama(agama);
//        S2.setJabatan(jabatan);
//        S2.setStatus(status);
//        S2.setKewarganegaraan(kewarganegaraan);
//        S2.setNip(nip);
//        
//        System.out.println(" ");
//        S2.tambahData();
//        DataPegawai.add(S2);
//        
//        System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
//        System.out.println("1. Id Pegawai             : " + S2.getId());
//        System.out.println("2. Nama                   : " + S2.getNama());
//        System.out.println("3. Alamat                 : " + S2.getAlamat());
//        System.out.println("4. Jenis Kelamin          : " + S2.getJenisKelamin());
//        System.out.println("1. Tempat, Tanggal Lahir  : " + S2.getTempatLahir() + ", " + S2.getTanggalLahir());
//        System.out.println("2. Agama                  : " + S2.getAgama());
//        System.out.println("3. Jabatan                : " + S2.getJabatan());
//        System.out.println("4. Status                 : " + S2.getStatus());
//        System.out.println("3. Kegawarganegaraan      : " + S2.getKewarganegaraan());
//        System.out.println("4. NIP                    : " + S2.getNip());
//
//    }
//    @Override
//    public void editDataPenduduk(ArrayList<DataPenduduk> DataPenduduk){
//        clearScreen();
//        lihatDataPenduduk(DataPenduduk);
//        try{
//            System.out.println("-----------------");
//            System.out.print("Pilih Index >> ");
//            int index = Integer.parseInt(input.nextLine());
//            
//            if(index > DataPenduduk.size()){
//                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
//            }
//            
//            else {
//                System.out.print("Masukkan Nama            : ");
//                String nama = input.nextLine();
//                System.out.print("Masukkan Alamat          : ");
//                String alamat = input.nextLine();
//                System.out.print("Masukkan Jenis Kelamin   : ");
//                String jenisKelamin = input.nextLine();
//                System.out.print("Masukkan Tempat Lahir    : ");
//                String tempatLahir = input.nextLine();
//                System.out.print("Masukkan Tanggal Lahir   : ");
//                String tanggalLahir = input.nextLine();
//                System.out.print("Masukkan Agama           : ");
//                String agama = input.nextLine();
//                System.out.print("Masukkan Pekerjaan         : ");
//                String pekerjaan = input.nextLine();
//                System.out.print("Masukkan Status          : ");
//                String status = input.nextLine();
//                System.out.print("Masukkan Kewarganegaraan : ");
//                String kewarganegaraan = input.nextLine();
//                System.out.print("Masukkan Nip             : ");
//                String nik = input.nextLine();
//                
//                DataPenduduk S1 = new DataPenduduk();
//                DataPenduduk.get(index).setNama(nama);
//                DataPenduduk.get(index).setAlamat(alamat);
//                DataPenduduk.get(index).setJenisKelamin(jenisKelamin);
//                DataPenduduk.get(index).setTempatLahir(tempatLahir);
//                DataPenduduk.get(index).setTanggalLahir(tanggalLahir);
//                DataPenduduk.get(index).setAgama(agama);
//                DataPenduduk.get(index).setPekerjaan(pekerjaan);
//                DataPenduduk.get(index).setStatus(status);
//                DataPenduduk.get(index).setKewarganegaraan(kewarganegaraan);
//                DataPenduduk.get(index).setNik(nik);
//                
//                System.out.println(" ");
//                S1.ubahData(); // Overriding
//                
//                System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
//                System.out.println("1. Id Penduduk             : " + S1.getId());
//                System.out.println("2. Nama                   : " + S1.getNama());
//                System.out.println("3. Alamat                 : " + S1.getAlamat());
//                System.out.println("4. Jenis Kelamin          : " + S1.getJenisKelamin());
//                System.out.println("1. Tempat, Tanggal Lahir  : " + S1.getTempatLahir() + ", " + S1.getTanggalLahir());
//                System.out.println("2. Agama                  : " + S1.getAgama());
//                System.out.println("3. Jabatan                : " + S1.getPekerjaan());
//                System.out.println("4. Status                 : " + S1.getStatus());
//                System.out.println("3. Kegawarganegaraan      : " + S1.getKewarganegaraan());
//                System.out.println("4. NIP                    : " + S1.getNik());
//            }
//        }
//        
//        catch (IndexOutOfBoundsException | NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//    @Override
//    public void editDataPegawai(ArrayList<DataPegawai> DataPegawai){
//        clearScreen();
//        lihatDataPegawai(DataPegawai);
//        try{
//            System.out.println("-----------------");
//            System.out.print("Pilih Index >> ");
//            int index = Integer.parseInt(input.nextLine());
//            
//            if(index > DataPegawai.size()){
//                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
//            }
//            
//            else {
//                System.out.print("Masukkan Nama            : ");
//                String nama = input.nextLine();
//                System.out.print("Masukkan Alamat          : ");
//                String alamat = input.nextLine();
//                System.out.print("Masukkan Jenis Kelamin   : ");
//                String jenisKelamin = input.nextLine();
//                System.out.print("Masukkan Tempat Lahir    : ");
//                String tempatLahir = input.nextLine();
//                System.out.print("Masukkan Tanggal Lahir   : ");
//                String tanggalLahir = input.nextLine();
//                System.out.print("Masukkan Agama           : ");
//                String agama = input.nextLine();
//                System.out.print("Masukkan Jabatan         : ");
//                String jabatan = input.nextLine();
//                System.out.print("Masukkan Status          : ");
//                String status = input.nextLine();
//                System.out.print("Masukkan Kewarganegaraan : ");
//                String kewarganegaraan = input.nextLine();
//                System.out.print("Masukkan Nip             : ");
//                String nip = input.nextLine();
//                
//                DataPegawai S2 = new DataPegawai();
//                DataPegawai.get(index).setNama(nama);
//                DataPegawai.get(index).setAlamat(alamat);
//                DataPegawai.get(index).setJenisKelamin(jenisKelamin);
//                DataPegawai.get(index).setTempatLahir(tempatLahir);
//                DataPegawai.get(index).setTanggalLahir(tanggalLahir);
//                DataPegawai.get(index).setAgama(agama);
//                DataPegawai.get(index).setJabatan(jabatan);
//                DataPegawai.get(index).setStatus(status);
//                DataPegawai.get(index).setKewarganegaraan(kewarganegaraan);
//                DataPegawai.get(index).setNip(nip);
//                
//                System.out.println(" ");
//                S2.ubahData(); // Overriding
//                
//                System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
//                System.out.println("1. Id Pegawai             : " + S2.getId());
//                System.out.println("2. Nama                   : " + S2.getNama());
//                System.out.println("3. Alamat                 : " + S2.getAlamat());
//                System.out.println("4. Jenis Kelamin          : " + S2.getJenisKelamin());
//                System.out.println("1. Tempat, Tanggal Lahir  : " + S2.getTempatLahir() + ", " + S2.getTanggalLahir());
//                System.out.println("2. Agama                  : " + S2.getAgama());
//                System.out.println("3. Jabatan                : " + S2.getJabatan());
//                System.out.println("4. Status                 : " + S2.getStatus());
//                System.out.println("3. Kegawarganegaraan      : " + S2.getKewarganegaraan());
//                System.out.println("4. NIP                    : " + S2.getNip());
//            }
//        }
//        
//        catch (IndexOutOfBoundsException | NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//    @Override
//    public void hapusDataPenduduk(ArrayList<DataPenduduk> DataPenduduk){
//        clearScreen();
//        lihatDataPenduduk(DataPenduduk);
//        try{
//            System.out.println("-----------------");
//            System.out.print("Pilih Index >> ");
//            int index = Integer.parseInt(input.nextLine());
//            
//            if(index > DataPenduduk.size()){
//                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
//            }
//            
//            else {
//                DataPenduduk.remove(index);
//                DataPenduduk S1 = new DataPenduduk();
//                S1.hapusData();
//            }
//        }
//        
//        catch (IndexOutOfBoundsException | NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//    @Override
//    public void hapusDataPegawai(ArrayList<DataPegawai> DataPegawai){
//        clearScreen();
//        lihatDataPegawai(DataPegawai);
//        try{
//            System.out.println("-----------------");
//            System.out.print("Pilih Index >> ");
//            int index = Integer.parseInt(input.nextLine());
//            
//            if(index > DataPegawai.size()){
//                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
//            }
//            
//            else {
//                DataPegawai.remove(index);
//                DataPegawai S2 = new DataPegawai();
//                S2.hapusData();
//            }
//        }
//        
//        catch (IndexOutOfBoundsException | NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//    @Override
//    public void lihatDataPenduduk(ArrayList<DataPenduduk> DataPenduduk){
//        clearScreen();
//        try{
//            if(DataPenduduk.size() > 0){
//                System.out.println("NO\tID PENDUDUK\t\tNAMA\t\tALAMAT PENDUDUK\t\tJENIS KELAMIN\t\tTEMPAT LAHIR\t\tTANGGAL LAHIR\t\tAGAMA\t\tPEKERJAAN\t\tSTATUS\t\tKEWARGANEGARAAN\t\tNIK");
//                
//                for (int index = 0; index < DataPenduduk.size(); index++){
//                    String id = DataPenduduk.get(index).getId();
//                    String nama = DataPenduduk.get(index).getNama();
//                    String alamat = DataPenduduk.get(index).getAlamat();
//                    String jenisKelamin = DataPenduduk.get(index).getJenisKelamin();
//                    String tempatLahir = DataPenduduk.get(index).getTempatLahir();
//                    String tanggalLahir = DataPenduduk.get(index).getTanggalLahir();
//                    String agama = DataPenduduk.get(index).getAgama();
//                    String pekerjaan = DataPenduduk.get(index).getPekerjaan();
//                    String status = DataPenduduk.get(index).getStatus();
//                    String kewarganegaraan = DataPenduduk.get(index).getKewarganegaraan();
//                    String nik = DataPenduduk.get(index).getNik();
//                    
//                    System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s", id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, pekerjaan, status, kewarganegaraan, nik));
//                    System.out.println("-------------------------------------------------------------");
//                }
//            }
//            
//            else {
//                System.out.println("\nTidak ada data!");
//            }
//        }
//        
//        catch (IndexOutOfBoundsException | NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//    }
//    @Override
//    public final void lihatDataPegawai(ArrayList<DataPegawai> DataPegawai){
//        clearScreen();
//        try{
//            if(DataPegawai.size() > 0){
//                System.out.println("\n=============================================================");
//                System.out.println("NO\tARTIKEL\t\tWARNA\t\tHARGA\t\tTOTAL");
//                System.out.println("=============================================================");
//                
//                for (int index = 0; index < DataPegawai.size(); index++){
//                    String id = DataPegawai.get(index).getId();
//                    String nama = DataPegawai.get(index).getNama();
//                    String alamat = DataPegawai.get(index).getAlamat();
//                    String jenisKelamin = DataPegawai.get(index).getJenisKelamin();
//                    String tempatLahir = DataPegawai.get(index).getTempatLahir();
//                    String tanggalLahir = DataPegawai.get(index).getTanggalLahir();
//                    String agama = DataPegawai.get(index).getAgama();
//                    String jabatan = DataPegawai.get(index).getJabatan();
//                    String status = DataPegawai.get(index).getStatus();
//                    String kewarganegaraan = DataPegawai.get(index).getKewarganegaraan();
//                    String nip = DataPegawai.get(index).getNip();
//                    
//                    System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s", id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, jabatan, status, kewarganegaraan, nip));
//                    System.out.println("-------------------------------------------------------------");
//                }
//            }
//            
//            else {
//                System.out.println("\nTidak ada data!");
//            }
//        }
//        
//        catch (IndexOutOfBoundsException | NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void kembali() {
//        System.out.println("");
//        System.out.print("Tekan [Enter] untuk kembali..");
//        input.nextLine();
//        clearScreen();
//    }
//    
//    public void clearScreen() {
//        try {
//            final String os = System.getProperty("os.name");
//            if (os.contains("Windows")) {
//                // clear screen untuk windows
//                new ProcessBuilder("cmd", "/c", "cls")
//                        .inheritIO()
//                        .start()
//                        .waitFor();
//            } else {
//                // clear screen untuk Linux, Unix, Mac
//                Runtime.getRuntime().exec("clear");
//                System.out.print("\033[H\033[2J");
//                System.out.flush();
//            }
//        } catch (final IOException | InterruptedException e) {
//            System.out.println("Error karena: " + e.getMessage());
//        }
//
//    }
//}
public class Menu implements CrudMenu {
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
        
    }

    @Override
    public void editDataPenduduk(ArrayList<DataPenduduk> DataPenduduk) {
        clearScreen();
        lihatDataPenduduk(DataPenduduk);
        try {
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > DataPenduduk.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            else {
                String id = DataPenduduk.get(index).getId();
                System.out.print("Id Penduduk #" + id);
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
                DataPenduduk.get(index).setId(id);
                DataPenduduk.get(index).setNama(nama);
                DataPenduduk.get(index).setAlamat(alamat);
                DataPenduduk.get(index).setJenisKelamin(jenisKelamin);
                DataPenduduk.get(index).setTempatLahir(tempatLahir);
                DataPenduduk.get(index).setTanggalLahir(tanggalLahir);
                DataPenduduk.get(index).setAgama(agama);
                DataPenduduk.get(index).setPekerjaan(pekerjaan);
                DataPenduduk.get(index).setStatus(status);
                DataPenduduk.get(index).setKewarganegaraan(kewarganegaraan);
                DataPenduduk.get(index).setNik(nik);
                
                System.out.println(" ");
                dataPenduduk.ubahData();
            }
        } catch(IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void hapusDataPenduduk(ArrayList<DataPenduduk> DataPenduduk) {
        clearScreen();
        lihatDataPenduduk(DataPenduduk);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > DataPenduduk.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                DataPenduduk.remove(index);
                DataPenduduk S1 = new DataPenduduk();
                S1.hapusData();
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void lihatDataPenduduk(ArrayList<DataPenduduk> DataPenduduk) {
        clearScreen();
        try {
            if(DataPenduduk.size() > 0){
                System.out.println("\n=============================================================================================================================================================================================================================================================================================");
                System.out.println("NO\tID\t\tNAMA\t\t\tALAMAT\t\t\tJENIS KELAMIN\t\tTEMPAT LAHIR\t\tTANGGAL LAHIR\t\tAGAMA\t\tPEKERJAAN\t\tSTATUS\t\tKEWARGANEGARAAN\t\tNIK");
                System.out.println("\n=============================================================================================================================================================================================================================================================================================");
                for (int index = 0; index < DataPenduduk.size(); index++){
                    String a = DataPenduduk.get(index).getId();
                    String b = DataPenduduk.get(index).getNama();
                    String c = DataPenduduk.get(index).getAlamat();
                    String d = DataPenduduk.get(index).getJenisKelamin();
                    String e = DataPenduduk.get(index).getTempatLahir();
                    String f = DataPenduduk.get(index).getTanggalLahir();
                    String g = DataPenduduk.get(index).getAgama();
                    String h = DataPenduduk.get(index).getPekerjaan();
                    String i = DataPenduduk.get(index).getStatus();
                    String j = DataPenduduk.get(index).getKewarganegaraan();
                    String k = DataPenduduk.get(index).getNik();
                    
                    System.out.println(String.format("%d\t%s\t\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t%s\t\t%s\t\t%s", index, a, b, c, d, e, f, g, h, i, j, k));
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
            else {
                System.out.println("\nTidak ada data !");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void tambahDataPegawai(ArrayList<DataPegawai> DataPegawai) {
        clearScreen();
        
        String angka = "0123456789";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int N = alphabet.length();
        int M = angka.length();
        
        Random r = new Random();
        String id = (alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+"\n");
        
        System.out.print("Id Penduduk #" + id);
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
    }

    @Override
    public void editDataPegawai(ArrayList<DataPegawai> DataPegawai) {
        clearScreen();
        lihatDataPegawai(DataPegawai);
        try {
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > DataPegawai.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            else {
                String id = DataPegawai.get(index).getId();
                System.out.print("Id Penduduk #" + id);
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
                
                DataPegawai dataPegawai = new DataPegawai(id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, jabatan, status, kewarganegaraan, nip);
                DataPegawai.get(index).setId(id);
                DataPegawai.get(index).setNama(nama);
                DataPegawai.get(index).setAlamat(alamat);
                DataPegawai.get(index).setJenisKelamin(jenisKelamin);
                DataPegawai.get(index).setTempatLahir(tempatLahir);
                DataPegawai.get(index).setTanggalLahir(tanggalLahir);
                DataPegawai.get(index).setAgama(agama);
                DataPegawai.get(index).setJabatan(jabatan);
                DataPegawai.get(index).setStatus(status);
                DataPegawai.get(index).setKewarganegaraan(kewarganegaraan);
                DataPegawai.get(index).setNip(nip);
                
                System.out.println(" ");
                dataPegawai.ubahData();
            }
        } catch(IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void hapusDataPegawai(ArrayList<DataPegawai> DataPegawai) {
        clearScreen();
        lihatDataPegawai(DataPegawai);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > DataPegawai.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                DataPegawai.remove(index);
                DataPegawai S2 = new DataPegawai();
                S2.hapusData();
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void lihatDataPegawai(ArrayList<DataPegawai> DataPegawai) {
        clearScreen();
        try {
            if(DataPegawai.size() > 0){
                System.out.println("\n=============================================================================================================================================================================================================================================================================================");
                System.out.println("NO\tID\t\tNAMA\t\t\t\tALAMAT\t\t\t\tJENIS KELAMIN\t\tTEMPAT LAHIR\t\t\tTANGGAL LAHIR\t\t\tAGAMA\t\t\tJABATAN\t\tSTATUS\t\t\tKEWARGANEGARAAN\t\tNIP");
                System.out.println("=============================================================================================================================================================================================================================================================================================");
                for (int index = 0; index < DataPegawai.size(); index++){
                    String a = DataPegawai.get(index).getId();
                    String b = DataPegawai.get(index).getNama();
                    String c = DataPegawai.get(index).getAlamat();
                    String d = DataPegawai.get(index).getJenisKelamin();
                    String e = DataPegawai.get(index).getTempatLahir();
                    String f = DataPegawai.get(index).getTanggalLahir();
                    String g = DataPegawai.get(index).getAgama();
                    String h = DataPegawai.get(index).getJabatan();
                    String i = DataPegawai.get(index).getStatus();
                    String j = DataPegawai.get(index).getKewarganegaraan();
                    String k = DataPegawai.get(index).getNip();
                    
                    System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t%s\t\t%s\t\t%s", 1, a, b, c, d, e, f, g, h, i, j, k));
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
            else {
                System.out.println("\nTidak ada data !");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}