package PBO_Praktikum_3.Modul3;


public class Latihan2_Main_run {
    public static void main(String args[]) {
        Latihan2_Array ob = new Latihan2_Array();
        int list[] = {2,5,3,5,9,5};
        ob.tampil("==============================");
        ob.tampil("List : ");
        ob.setList(list);
        ob.tampil(ob.getList());
        ob.tampil("==============================");
        ob.tampil("Ubah 5 menjadi 1 : ");
        ob.setUpdate(5, 1);
        ob.tampil(ob.getList());
        ob.tampil("==============================");
        ob.tampil("List No.1 dikalikan 0.5 : ");
        ob.setPerkalian(list, 0.5);
        ob.tampil(ob.getPerkalian());
        ob.tampil("==============================");

        // menghapus variable dari memory untuk optimasi program
        ob.hapus();
        list = null;
        ob = null;
    }
}