/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;

import pa.Class.dataPegawai;
import pa.Class.dataPenduduk;
import java.util.ArrayList;
import java.util.Scanner;
import pa.models.CrudMenu;

/**
 *
 * @author MSi-GAMING
 */
public class Main {
    public static void main(String[] args) {
        pilihanUtama();
        
    }

    public static void pilihanSurat(){
        CrudMenu obj = new CrudMenu();
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("|    WEBSITE SURAT MENYURAT    |");
        System.out.println("|    KELURAHAN SEMPAJA UTARA   |");
        System.out.println("|        KOTA SAMARINDA        |");
        System.out.println("================================");
        System.out.println("[1] Surat Pindah");
        System.out.println("[2] Surat Ijin Acara");
        System.out.println("[3] Surat Keterangan");
        System.out.println("[0] kembali");
        System.out.println("--------------------------------");
        System.out.print("Pilih menu :  ");

        int pilihPenyuratan = Integer.parseInt(input.nextLine());

        switch(pilihPenyuratan){
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 0:
                pilihanUtama();
                break;
            default:
                System.out.println("Input Salah! Input dari 0 sampai 3\nTidak Ada Pilihan "+ pilihPenyuratan +"\n\n");
                obj.kembali();
                pilihanSurat();
                break;
        }
    }
    public static void pilihanPegawai(){
        CrudMenu obj = new CrudMenu();
        ArrayList<dataPegawai> dp1 = new ArrayList();
        ArrayList<dataPenduduk> dp2 = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("| WEBSITE PENDATAAN KELURAHAN  |");
        System.out.println("| SEMPAJA UTARA KOTA SAMARINDA |");
        System.out.println("================================");
        System.out.println("[1] Lihat Data Pegawai");
        System.out.println("[2] Tambah Data Pegawai");
        System.out.println("[3] Edit Data Pegawai");
        System.out.println("[4] Hapus Data Pegawai");
        System.out.println("[0] Keluar");
        System.out.println("--------------------------------");
        System.out.print("Pilih menu :  ");

        int pilihPegawai = Integer.parseInt(input.nextLine());

        switch(pilihPegawai){
            case 1:
                obj.lihatDataPegawai(dp1);
                obj.kembali();
                pilihanPegawai();
                break;
            case 2:
                obj.tambahDataPegawai(dp1);
                obj.kembali();
                break;
            case 3:
                obj.editDataPegawai(dp1);
                obj.kembali();
                break;
            case 4:
                obj.hapusDataPegawai(dp1);
                obj.kembali();
                break;
            case 0:
                obj.kembali();
                pilihanPendataan();
                break;
            default:
                System.out.println("Input Salah! Input dari 0 sampai 4\nTidak Ada Pilihan "+ pilihPegawai +"\n\n");
                pilihanPegawai();
        }
    }
    public static void pilihanPenduduk(){
        CrudMenu obj = new CrudMenu();
        ArrayList<dataPegawai> dp1 = new ArrayList();
        ArrayList<dataPenduduk> dp2 = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("| WEBSITE PENDATAAN KELURAHAN  |");
        System.out.println("| SEMPAJA UTARA KOTA SAMARINDA |");
        System.out.println("================================");
        System.out.println("[1] Lihat Data Penduduk");
        System.out.println("[2] Tambah Data Penduduk");
        System.out.println("[3] Edit Data Penduduk");
        System.out.println("[4] Hapus Data Penduduk");
        System.out.println("[0] Keluar");
        System.out.println("--------------------------------");
        System.out.print("Pilih menu :  ");

        int pilihPenduduk = Integer.parseInt(input.nextLine());

        switch(pilihPenduduk){
            case 1:
                obj.lihatDataPenduduk(dp2);
                obj.kembali();
                pilihanPenduduk();
                break;
            case 2:
                obj.tambahDataPenduduk(dp2);
                obj.kembali();
                break;
            case 3:
                obj.editDataPenduduk(dp2);
                obj.kembali();
                break;
            case 4:
                obj.hapusDataPenduduk(dp2);
                obj.kembali();
                break;
            case 0:
                obj.kembali();
                pilihanPendataan();
                break;
            default:
                System.out.println("Input Salah! Input dari 0 sampai 4\nTidak Ada Pilihan "+ pilihPenduduk +"\n\n");
                pilihanPenduduk();
                break;
        }
    }
    public static void pilihanPendataan(){
        CrudMenu obj = new CrudMenu();
        ArrayList<dataPegawai> dp1 = new ArrayList();
        ArrayList<dataPenduduk> dp2 = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("| WEBSITE PENDATAAN KELURAHAN  |");
        System.out.println("| SEMPAJA UTARA KOTA SAMARINDA |");
        System.out.println("================================");
        System.out.println("[1] Data Penduduk");
        System.out.println("[2] Data Pegawai");
        System.out.println("[0] Kembali");
        System.out.println("--------------------------------");
        System.out.print("Pilih menu :  ");

        int pilihPendataan = Integer.parseInt(input.nextLine());

        switch(pilihPendataan){
            case 1:
                pilihanPenduduk();
            case 2:
                pilihanPegawai();
            case 0:
                obj.kembali();
                pilihanUtama();
                break;
            default:
                System.out.println("Input Salah! Input dari 0 sampai 4\nTidak Ada Pilihan "+ pilihPendataan +"\n\n");
                pilihanPendataan();
                break;
        }
    }
    public static void pilihanUtama(){
        
        CrudMenu obj = new CrudMenu();
        ArrayList<dataPegawai> dp1 = new ArrayList();
        ArrayList<dataPenduduk> dp2 = new ArrayList();
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("==========================================");
            System.out.println("| WEBSITE PENDATAAN DAN SURAT - MENYURAT |");
            System.out.println("|        KELURAHAN SEMPAJA UTARA         |");
            System.out.println("|             KOTA SAMARINDA             |");
            System.out.println("==========================================");
            System.out.println("[1] Pendataan");
            System.out.println("[2] Surat Menyurat");
            System.out.println("[0] Keluar");
            System.out.println("------------------------------------------");
            System.out.print("Pilih menu :  ");

            int pilihUtama = Integer.parseInt(input.nextLine());
            
            switch(pilihUtama){
                case 1:
                    pilihanPendataan();
                case 2:
                    pilihanSurat();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Input Salah! Input dari 0 sampai 2\nTidak Ada Pilihan "+ pilihUtama +"\n\n");
                    obj.kembali();
                    break;
            }
        }
    }
}


