package PBO_Praktikum_3.Modul3;

public class Latihan2_Array {
    private int[] list;
    private double[] kali;

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public void setUpdate(int a, int b) {
        for(int i = 0; i < list.length; i++) {
            if(a == list[i]) {
                list[i] = b;
            }
        }
    }

    public void setKali(double[] kali) {
        this.kali = kali;
    }

    public double[] getKali() {
        return kali;
    }
    
    public void setPerkalian(int[] deret, double a) {
        double[] array = new double[deret.length];
        for(int i = 0; i < deret.length; i++) {
            array[i]  = (double)deret[i] * a;
        }
        this.kali = array;
    }

    public double[] getPerkalian() {
        return kali;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null; // menghapus variable dari memory
    }

    public void tampil(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null; // menghapus variable dari memory
        data = null;
    }

    public void tampil(double a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null; // menghapus variable dari memory
        data = null;
    }

    public void hapus() {
        // menghapus variable dari memory untuk optimasi program
        list = null;
    }
}
