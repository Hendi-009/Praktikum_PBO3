package PBO_Praktikum_3.Modul4;

public class Percobaan2_Array {
    private String[][] Mahasiswa;
    private int[][] data, hasil;

    public String[][] getMahasiswa() {
        return Mahasiswa;
    }

    public void setMahasiswa(String[][] mahasiswa) {
        Mahasiswa = mahasiswa;
        mahasiswa = null;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
        data = null;
    }

    public void setPerkalianSkalar(int[][] data, int a) {
        hasil = data;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                hasil[i][j] = a * data[i][j];
            }
        }
        data = null;
    }

    public int[][] getPerkalianSkalar() {
        return hasil;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "    ");
            }
            System.out.println();
        }
        data = null;
    }

    public void tampil(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "    ");
            }
            System.out.println();
        }
        data = null;
    }

    public void hapus() {
        Mahasiswa = null;
        data = null;
        hasil = null;
    }
}
