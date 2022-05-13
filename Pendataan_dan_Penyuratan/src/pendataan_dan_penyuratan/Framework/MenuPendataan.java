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
public class MenuPendataan implements ProcessingMenu {
    Scanner input = new Scanner(System.in);
    public void menuPendataan(){
        while(true){
            try {
                System.out.println("================================");
                System.out.println("| WEBSITE PENDATAAN KELURAHAN  |");
                System.out.println("| SEMPAJA UTARA KOTA SAMARINDA |");
                System.out.println("================================");
                System.out.println("[1] Data Penduduk");
                System.out.println("[2] Data Pegawai");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------------");
                System.out.print("Pilih menu :  ");
                
                int pilihPendataan = Integer.parseInt(input.nextLine());

                switch(pilihPendataan){
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

                            int pilihPenduduk = Integer.parseInt(input.nextLine());

                            switch(pilihPenduduk){
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
                                    System.out.println("Input Salah! Input dari 0 sampai 4\nTidak Ada Pilihan "+ pilihPenduduk +"\n\n");
                            }
                        }
                        catch(NumberFormatException e){
                            System.out.println("Input Salah ! Input harus berupa angka !\n\n");
                        }
                    case 2:
                        try {
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
                                    System.out.println("Input Salah! Input dari 0 sampai 4\nTidak Ada Pilihan "+ pilihPegawai +"\n\n");
                            }
                        }
                        catch(NumberFormatException e){
                            System.out.println("Input Salah ! Input harus berupa angka !\n\n");
                        }
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Input Salah! Input dari 0 sampai 2\nTidak Ada Pilihan "+ pilihPendataan +"\n\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input Salah ! Input harus berupa angka !\n\n");
            }
        }
    }

    @Override
    public void tambahDataPegawai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editDataPegawai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapusDataPegawai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lihatDataPegawai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tambahDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapusDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lihatDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
