/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan_dan_penyuratan;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author MSi-GAMING
 */
public final class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            try {
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
                        try {
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
                            
                            int pilihPendataan = Integer.parseInt(input.nextLine());
                            
                            switch(pilihPendataan){
                                case 1:
                                    return;
                                case 2:
                                    return;
                                case 3:
                                    return;
                                case 4:
                                    return;
                                case 0:
                                    System.exit(0);
                                default:
                                    System.out.println("Input Salah! Input dari 0 sampai 4\n\n");
                            }
                        }
                        catch(NumberFormatException e){
                            System.out.println("Input Salah ! Input harus berupa angka !\n\n");
                        }
                    case 2:
                        try {
                            System.out.println("================================");
                            System.out.println("|    WEBSITE SURAT MENYURAT    |");
                            System.out.println("|    KELURAHAN SEMPAJA UTARA   |");
                            System.out.println("|        KOTA SAMARINDA        |");
                            System.out.println("================================");
                            System.out.println("[1] Surat Pindah");
                            System.out.println("[2] Surat Ijin Acara");
                            System.out.println("[3] Surat Keterangan");
                            System.out.println("[0] Keluar");
                            System.out.println("--------------------------------");
                            System.out.print("Pilih menu :  ");
                            
                            int pilihPendataan = Integer.parseInt(input.nextLine());
                            
                            switch(pilihPendataan){
                                case 1:
                                    return;
                                case 2:
                                    return;
                                case 3:
                                    return;
                                case 0:
                                    System.exit(0);
                                default:
                                    System.out.println("Input Salah! Input dari 0 sampai 3\n\n");
                            }
                        }
                        catch(NumberFormatException e){
                            System.out.println("Input Salah ! Input harus berupa angka !\n\n");
                        }
                    case 0:
                        System.out.println("\n\n\nProgram Selesai !!!");
                        System.exit(0);
                    default:
                        System.out.println("Input Salah! Input dari 0 sampai 2\n\n");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Input Salah ! Input harus berupa angka !\n\n");
            }
        }
    }
}
