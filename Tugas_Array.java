
package PBO_Praktikum_3.Modul4;

public class Tugas_Array {
    private int[][] angka1, angka2, angka3, hasil, cetak;
    private double [][] angkaDouble;
    private double [][] hasil2;
    
    public void setAngka1(int[][] angka1) {
        this.angka1 = angka1;
        angka1 = null;
    }

    public int[][] getAngka1() {
        return angka1;
    }

    public void setAngka2(int[][] angka2) {
        this.angka2 = angka2;
        angka2 = null;
    }

    public int[][] getAngka2() {
        return angka2;
    }


    public void setPertambahan(int[][] angka1, int[][] angka2) {
        hasil = angka1;
        int i, j;
        for (i = 0; i < angka1.length; i++) {
            for (j = 0; j < angka1[i].length; j++) {
            hasil [i][j] = angka1[i][j] + angka2[i][j];
            }
        }
        angka1 = null;
        angka2 = null;
    }
    public int[][] getPertambahan() {
        return hasil;
    }

    public void liatHasil(int cetak[][]) {
        int i, j;
        for (i = 0; i < cetak.length; i++) {
            for (j = 0; j < cetak[i].length; j++) {
                System.out.print(cetak[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public void setAngka(int [][] angka3) {
        this.angka3 = angka3;
        angka3 = null;
    };

    public int [][] getAngka3() {
        return angka3;
    }

    public void setAngkaDouble(double [][] angkaDouble) {
        this.angkaDouble = angkaDouble;
        angkaDouble = null;
    }

    public double [][] getAngkaDouble() {
        return angkaDouble;
    }

    public void setPerkalian(double [][] angkaDouble, double  c) {
        hasil2 = angkaDouble;
        int i, j;
        for (i = 0; i < angkaDouble.length; i++) {
            for (j = 0; j < angkaDouble[i].length; j++) {
            hasil2 [i][j] = c * angkaDouble[i][j];
            }
        }
        angkaDouble = null;
    }
    public double[][] getPerkalian() {
        return hasil2;
    }
    
    public void liatHasil(double cetak[][]) {
        int i, j;
        for (i = 0; i < cetak.length; i++) {
            for (j = 0; j < cetak[i].length; j++) {
                System.out.print(cetak[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public void liatHasil2(int cetak[][]) {
        int i, j;
        for (i = 0; i < cetak.length; i++) {
            for (j = 0; j < cetak[i].length; j++) {
                System.out.print(cetak[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public void hapus() {
        angka1 = null;
        angka2 = null;
        hasil = null;
        angkaDouble = null;
        hasil2 = null;
    }
}
