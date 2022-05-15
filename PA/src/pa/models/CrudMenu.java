package pa.models;
import pa.Class.dataPenduduk;
import pa.Class.dataPegawai;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class CrudMenu {
    ArrayList<dataPegawai> dp1;
    ArrayList<dataPenduduk> dp2;
    Scanner input = new Scanner(System.in);
    
    public void tambahDataPenduduk(ArrayList<dataPenduduk> dp2){
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
        String jk = input.nextLine();
        System.out.print("Masukkan Tempat Lahir    : ");
        String tempatlahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir   : ");
        String tanggallahir = input.nextLine();
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
        
        dataPenduduk p2 = new dataPenduduk();
        p2.setId(id);
        p2.setnamaPenduduk(nama);
        p2.setAlamat(alamat);
        p2.setJenisKelamin(jk);
        p2.setTempatLahir(tempatlahir);
        p2.setTanggalLahir(tanggallahir);
        p2.setAgama(agama);
        p2.setPekerjaan(pekerjaan);
        p2.setStatus(status);
        p2.setKewarganegaraan(kewarganegaraan);
        p2.setNik(nik);
        
        System.out.println(" ");
        dp2.add(p2);
        
        System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
        System.out.println("1. Id Penduduk             : " + p2.getId());
        System.out.println("2. Nama                   : " + p2.getnamaPenduduk());
        System.out.println("3. Alamat                 : " + p2.getAlamat());
        System.out.println("4. Jenis Kelamin          : " + p2.getJenisKelamin());
        System.out.println("1. Tempat, Tanggal Lahir  : " + p2.getTempatLahir() + ", " + p2.getTanggalLahir());
        System.out.println("2. Agama                  : " + p2.getAgama());
        System.out.println("3. Jabatan                : " + p2.getPekerjaan());
        System.out.println("4. Status                 : " + p2.getStatus());
        System.out.println("3. Kegawarganegaraan      : " + p2.getKewarganegaraan());
        System.out.println("4. NIP                    : " + p2.getNik());
    }
    public void editDataPenduduk(ArrayList<dataPenduduk> dp2){
        lihatDataPenduduk(dp2);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dp2.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                System.out.print("Masukkan Nama            : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Alamat          : ");
                String alamat = input.nextLine();
                System.out.print("Masukkan Jenis Kelamin   : ");
                String jk = input.nextLine();
                System.out.print("Masukkan Tempat Lahir    : ");
                String tempatlahir = input.nextLine();
                System.out.print("Masukkan Tanggal Lahir   : ");
                String tanggallahir = input.nextLine();
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

                dataPenduduk p2 = new dataPenduduk();
                p2.setnamaPenduduk(nama);
                p2.setAlamat(alamat);
                p2.setJenisKelamin(jk);
                p2.setTempatLahir(tempatlahir);
                p2.setTanggalLahir(tanggallahir);
                p2.setAgama(agama);
                p2.setPekerjaan(jabatan);
                p2.setStatus(status);
                p2.setKewarganegaraan(kewarganegaraan);
                p2.setNik(nip);
                
                System.out.println(" ");

                System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
                System.out.println("1. Id Pegawai             : " + p2.getId());
                System.out.println("2. Nama                   : " + p2.getnamaPenduduk());
                System.out.println("3. Alamat                 : " + p2.getAlamat());
                System.out.println("4. Jenis Kelamin          : " + p2.getJenisKelamin());
                System.out.println("1. Tempat, Tanggal Lahir  : " + p2.getTempatLahir() + ", " + p2.getTanggalLahir());
                System.out.println("2. Agama                  : " + p2.getAgama());
                System.out.println("3. Jabatan                : " + p2.getPekerjaan());
                System.out.println("4. Status                 : " + p2.getStatus());
                System.out.println("3. Kegawarganegaraan      : " + p2.getKewarganegaraan());
                System.out.println("4. NIP                    : " + p2.getNik());
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public void hapusDataPenduduk(ArrayList<dataPenduduk> dp2){
        lihatDataPenduduk(dp2);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dp2.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                dp2.remove(index);
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public void lihatDataPenduduk(ArrayList<dataPenduduk> dp2){
        try{
            if(dp2.size() > 0){
                System.out.println("\n===============================================================================================================================================================================");
                System.out.println("NO\tID PENDUDUK\t\tNAMA\t\tALAMAT PENDUDUK\t\tJENIS KELAMIN\t\tTEMPAT LAHIR\t\tTANGGAL LAHIR\t\tAGAMA\t\tPEKERJAAN\t\tSTATUS\t\tKEWARGANEGARAAN\t\tNIK");
                System.out.println("===============================================================================================================================================================================");
                
                for (int index = 0; index < dp2.size(); index++){
                    String id = dp2.get(index).getId();
                    String nama = dp2.get(index).getnamaPenduduk();
                    String alamat = dp2.get(index).getAlamat();
                    String jenisKelamin = dp2.get(index).getJenisKelamin();
                    String tempatLahir = dp2.get(index).getTempatLahir();
                    String tanggalLahir = dp2.get(index).getTanggalLahir();
                    String agama = dp2.get(index).getAgama();
                    String pekerjaan = dp2.get(index).getPekerjaan();
                    String status = dp2.get(index).getStatus();
                    String kewarganegaraan = dp2.get(index).getKewarganegaraan();
                    String nik = dp2.get(index).getNik();
                    
                    System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s", index, id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, pekerjaan, status, kewarganegaraan, nik));
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
            
            else {
                System.out.println("\nTidak ada data!");
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void tambahDataPegawai(ArrayList<dataPegawai> dp1){
        final String angka = "0123456789";
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N = alphabet.length();
        final int M = angka.length();
        
        Random r = new Random();
        String id = ("#"+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+alphabet.charAt(r.nextInt(N))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+angka.charAt(r.nextInt(M))+"\n");
        System.out.print("Id Pegawai " + id);
        id = input.nextLine();
        System.out.print("Masukkan Nama            : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat          : ");
        String alamat = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin   : ");
        String jk = input.nextLine();
        System.out.print("Masukkan Tempat Lahir    : ");
        String tempatlahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir   : ");
        String tanggallahir = input.nextLine();
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
        
        dataPegawai p = new dataPegawai();
        p.setId(id);
        p.setNamaPegawai(nama);
        p.setAlamat(alamat);
        p.setJenisKelamin(jk);
        p.setTempatLahir(tempatlahir);
        p.setTanggalLahir(tanggallahir);
        p.setAgama(agama);
        p.setJabatan(jabatan);
        p.setStatus(status);
        p.setKewarganegaraan(kewarganegaraan);
        p.setNip(nip);
        
        System.out.println(" ");
        dp1.add(p);
        
        System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
        System.out.println("1. Id Pegawai             : " + p.getId());
        System.out.println("2. Nama                   : " + p.getNamaPegawai());
        System.out.println("3. Alamat                 : " + p.getAlamat());
        System.out.println("4. Jenis Kelamin          : " + p.getJenisKelamin());
        System.out.println("1. Tempat, Tanggal Lahir  : " + p.getTempatLahir() + ", " + p.getTanggalLahir());
        System.out.println("2. Agama                  : " + p.getAgama());
        System.out.println("3. Jabatan                : " + p.getJabatan());
        System.out.println("4. Status                 : " + p.getStatus());
        System.out.println("3. Kegawarganegaraan      : " + p.getKewarganegaraan());
        System.out.println("4. NIP                    : " + p.getNip());
    }
    public void editDataPegawai(ArrayList<dataPegawai> dp1){
        lihatDataPegawai(dp1);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dp1.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                System.out.print("Masukkan Nama            : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Alamat          : ");
                String alamat = input.nextLine();
                System.out.print("Masukkan Jenis Kelamin   : ");
                String jk = input.nextLine();
                System.out.print("Masukkan Tempat Lahir    : ");
                String tempatlahir = input.nextLine();
                System.out.print("Masukkan Tanggal Lahir   : ");
                String tanggallahir = input.nextLine();
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

                dataPegawai p = new dataPegawai();
                p.setNamaPegawai(nama);
                p.setAlamat(alamat);
                p.setJenisKelamin(jk);
                p.setTempatLahir(tempatlahir);
                p.setTanggalLahir(tanggallahir);
                p.setAgama(agama);
                p.setJabatan(jabatan);
                p.setStatus(status);
                p.setKewarganegaraan(kewarganegaraan);
                p.setNip(nip);
                
                System.out.println(" ");

                System.out.println("DITAMBAHKAN DENGAN GETTER DAN SETTER");
                System.out.println("1. Id Pegawai             : " + p.getId());
                System.out.println("2. Nama                   : " + p.getNamaPegawai());
                System.out.println("3. Alamat                 : " + p.getAlamat());
                System.out.println("4. Jenis Kelamin          : " + p.getJenisKelamin());
                System.out.println("1. Tempat, Tanggal Lahir  : " + p.getTempatLahir() + ", " + p.getTanggalLahir());
                System.out.println("2. Agama                  : " + p.getAgama());
                System.out.println("3. Jabatan                : " + p.getJabatan());
                System.out.println("4. Status                 : " + p.getStatus());
                System.out.println("3. Kegawarganegaraan      : " + p.getKewarganegaraan());
                System.out.println("4. NIP                    : " + p.getNip());
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public void hapusDataPegawai(ArrayList<dataPegawai> dp1){
        lihatDataPegawai(dp1);
        try{
            System.out.println("-----------------");
            System.out.print("Pilih Index >> ");
            int index = Integer.parseInt(input.nextLine());
            
            if(index > dp1.size()){
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah !");
            }
            
            else {
                dp1.remove(index);
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public void lihatDataPegawai(ArrayList<dataPegawai> dp1){
        try{
            if(dp1.size() > 0){
                System.out.println("\n===============================================================================================================================================================================");
                System.out.println("NO\tID PEGAWAI\t\tNAMA\t\tALAMAT PEGAWAI\t\tJENIS KELAMIN\t\tTEMPAT LAHIR\t\tTANGGAL LAHIR\t\tAGAMA\t\tJABATAN\t\tSTATUS\t\tKEWARGANEGARAAN\t\tNIP");
                System.out.println("===============================================================================================================================================================================");
                
                for (int index = 0; index < dp1.size(); index++){
                    String id = dp1.get(index).getId();
                    String nama = dp1.get(index).getNamaPegawai();
                    String alamat = dp1.get(index).getAlamat();
                    String jenisKelamin = dp1.get(index).getJenisKelamin();
                    String tempatLahir = dp1.get(index).getTempatLahir();
                    String tanggalLahir = dp1.get(index).getTanggalLahir();
                    String agama = dp1.get(index).getAgama();
                    String pekerjaan = dp1.get(index).getJabatan();
                    String status = dp1.get(index).getStatus();
                    String kewarganegaraan = dp1.get(index).getKewarganegaraan();
                    String nik = dp1.get(index).getNip();
                    
                    System.out.println(String.format("%d\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s", index, id, nama, alamat, jenisKelamin, tempatLahir, tanggalLahir, agama, pekerjaan, status, kewarganegaraan, nik));
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
            
            else {
                System.out.println("\nTidak ada data!");
            }
        }
        
        catch (IndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
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
    public void kembali() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }
}
