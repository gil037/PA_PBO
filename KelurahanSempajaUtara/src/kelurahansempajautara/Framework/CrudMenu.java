/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelurahansempajautara.Framework;

import java.util.ArrayList;
import kelurahansempajautara.Class.DataPenduduk;
import kelurahansempajautara.Class.DataPegawai;
/**
 *
 * @author MSi-GAMING
 */
public interface CrudMenu {
    public void tambahDataPenduduk(ArrayList<DataPenduduk> DataPenduduk);
    public void editDataPenduduk(ArrayList<DataPenduduk> DataPenduduk);
    public void hapusDataPenduduk(ArrayList<DataPenduduk> DataPenduduk);
    public void lihatDataPenduduk();
    public void tambahDataPegawai(ArrayList<DataPegawai> DataPegawai);
    public void editDataPegawai(ArrayList<DataPegawai> DataPegawai);
    public void hapusDataPegawai(ArrayList<DataPegawai> DataPegawai);
    public void lihatDataPegawai();
}
