
package PBO_Praktikum_3.Modul3;

public class Percobaan1_Main_run {
    public static void main(String[] args) {
        Percobaan1_Array ob = new Percobaan1_Array();
        String[] mahasiswa = {"Dono", "Danu", "Dana", "Dini", "Doni"};
        int[] deret = {2,5,6,9,7};
        ob.tampil("Daftar Mahasiswa : ");
        ob.setMahasiswa(mahasiswa);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("==================================");
        ob.tampil("Deret : ");
        ob.setDeret(deret);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil Penjumlahan Deret : ");
        ob.setPenjumlahan(deret);
        ob.tampil(ob.getHasilPenjumlahan());
        ob.hapus();
        mahasiswa=null;
        deret=null;
        ob=null;
    }
}
