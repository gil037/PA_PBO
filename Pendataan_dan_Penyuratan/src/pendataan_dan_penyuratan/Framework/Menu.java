/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataan_dan_penyuratan.Framework;

import java.util.Scanner;

/**
 *
 * @author MSi-GAMING
 */
public class Menu {
    Scanner input = new Scanner(System.in);
    MenuPendataan mp = new MenuPendataan();
    MenuPenyuratan ms = new MenuPenyuratan();
    public void menu(){
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
                        mp.menuPendataan();
                    case 2:
                        ms.menuPenyuratan();
                    case 0:
                        System.out.println("\n\n\nProgram Selesai !!!");
                        System.exit(0);
                    default:
                        System.out.println("Input Salah! Input dari 0 sampai 2\nTidak Ada Pilihan "+ pilihUtama +"\n\n");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Input Salah ! Input harus berupa angka !\n\n");
            }
        }
    }
}
