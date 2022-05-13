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
public class MenuPenyuratan {
    Scanner input = new Scanner(System.in);
    public void menuPenyuratan(){
        while(true){
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

                int pilihPenyuratan = Integer.parseInt(input.nextLine());

                switch(pilihPenyuratan){
                    case 1:
                        return;
                    case 2:
                        return;
                    case 3:
                        return;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Input Salah! Input dari 0 sampai 3\nTidak Ada Pilihan "+ pilihPenyuratan +"\n\n");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Input Salah ! Input harus berupa angka !\n\n");
            }
        }
    }
}
