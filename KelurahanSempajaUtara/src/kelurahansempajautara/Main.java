/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelurahansempajautara;

import java.util.ArrayList;
import java.util.Scanner;
import kelurahansempajautara.Class.DataKelurahan;
import kelurahansempajautara.Class.DataPegawai;
import kelurahansempajautara.Class.DataPenduduk;
import kelurahansempajautara.Framework.Menu;
import kelurahansempajautara.Framework.MenuPegawai;
import kelurahansempajautara.Framework.MenuPenduduk;

/**
 *
 * @author MSi-GAMING
 */
public final class Main {
    
    public static void main(String[] args){
        Menu obj = new Menu();
        MenuPenduduk mp1 = new MenuPenduduk();
        MenuPegawai mp2 = new MenuPegawai();
        ArrayList<DataPegawai> DataPegawai = new ArrayList();
        ArrayList<DataPenduduk> DataPenduduk = new ArrayList();
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                System.out.println("==========================================");
                System.out.println("| WEBSITE PENDATAAN DAN SURAT - MENYURAT |");
                System.out.println("|        KELURAHAN SEMPAJA UTARA         |");
                System.out.println("|             KOTA SAMARINDA             |");
                System.out.println("==========================================");
                System.out.println("[1] Pendataan");
                System.out.println("[2] Surat Menyurat");
                System.out.println("[3] Tentang Program");
                System.out.println("[0] Keluar");
                System.out.println("------------------------------------------");
                System.out.print("Pilih menu :  ");

                int pilih = Integer.parseInt(input.nextLine());

                switch (pilih){
                    case 1:
                        System.out.println("==========================================");
                        System.out.println("|            WEBSITE PENDATAAN           |");
                        System.out.println("|         KELURAHAN SEMPAJA UTARA        |");
                        System.out.println("|              KOTA SAMARINDA            |");
                        System.out.println("==========================================");
                        mp1.penduduk();
                        mp2.pegawai();
                        System.out.println("[9] Keluar");
                        System.out.println("------------------------------------------");
                        System.out.print("Pilih menu :  ");

                        String p1 = input.nextLine();

                        switch(p1){
                            case "1":
                                obj.lihatDataPenduduk();
                                obj.kembali();
                                break;
                            case "2":
                                obj.tambahDataPenduduk(DataPenduduk);
                                obj.kembali();
                                break;
                            case "3":
                                obj.editDataPenduduk(DataPenduduk);
                                obj.kembali();
                                break;
                            case "4":
                                obj.hapusDataPenduduk(DataPenduduk);
                                obj.kembali();
                                break;
                            case "5":
                                obj.lihatDataPegawai();
                                obj.kembali();
                                break;
                            case "6":
                                obj.tambahDataPegawai(DataPegawai);
                                obj.kembali();
                                break;
                            case "7":
                                obj.editDataPegawai(DataPegawai);
                                obj.kembali();
                                break;
                            case "8":
                                obj.hapusDataPegawai(DataPegawai);
                                obj.kembali();
                                break;
                            case "9":
                                obj.kembali();
                                break;
                            default:
                                System.out.println("Kamu salah pilih menu!");
                                obj.kembali();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("==========================================");
                        System.out.println("|            WEBSITE PENDATAAN           |");
                        System.out.println("|         KELURAHAN SEMPAJA UTARA        |");
                        System.out.println("|              KOTA SAMARINDA            |");
                        System.out.println("==========================================");
                        System.out.println("[1] Surat Ijin Menyelenggaran Acara");
                        System.out.println("[2] Surat Keterangan");
                        System.out.println("[3] Surat Pindah");
                        System.out.println("[4] Keluar");
                        System.out.println("------------------------------------------");
                        System.out.print("Pilih menu :  ");

                        String p2 = input.nextLine();

                        switch(p2){
                            case "1":
                                obj.lihatDataPenduduk();
                                obj.kembali();
                                break;
                            case "2":
                                obj.tambahDataPenduduk(DataPenduduk);
                                obj.kembali();
                                break;
                            case "3":
                                obj.editDataPenduduk(DataPenduduk);
                                obj.kembali();
                                break;
                            case "4":
                                obj.kembali();
                                break;
                            default:
                                System.out.println("Kamu salah pilih menu!");
                                obj.kembali();
                                break;
                        }
                        break;
                    case 3:
                        DataKelurahan.KelurahanBuka();
                        DataKelurahan.KelurahanTutup();
                        obj.kembali();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Kamu salah pilih menu !");
                        obj.kembali();
                        break;
                }
            } catch (NumberFormatException e){
                System.out.println("Anda memasukkan huruf bukan angka !");
                obj.clearScreen();
            }
        }
    }
}