
package PBO_Praktikum_3.Modul4;

public class Tugas_Main_run {
    public static void main(String[] args) {
        Tugas_Array obj = new Tugas_Array();
        int[][] angka1 = {
            {1, 2},
            {3, 5},
            {6, 7}
        };
        
        int[][] angka2 = {
            {8, 9},
            {10, 11},
            {12, 13}
        };
        
        double c = 0.5;
        int[][] angka3 = {
            {9, 11},
            {13, 16},
            {18, 20}
        };
                
        double[][] angkaDouble = new double[3][2];
        for(int i=0; i<angka3.length; i++) {
            for(int j=0; j<angka3[i].length; j++) {
                angkaDouble[i][j] = angka3[i][j];
            }
        }

        obj.setAngka1(angka1);
        obj.setAngka2(angka2);
        obj.setAngka(angka3);

        System.out.println("Matriks A : ");
        obj.liatHasil(obj.getAngka1());
        System.out.println();

        System.out.println("Matriks B : ");
        obj.liatHasil(obj.getAngka2());
        System.out.println("\n================\n");
        
        System.out.println("Matriks (A + B) :  ");
        obj.setPertambahan(angka1, angka2);
        obj.liatHasil(obj.getPertambahan());
        
        System.out.println("Matrix C : ");
        obj.liatHasil(obj.getAngka3());
        System.out.println("\n================\n");
        
        System.out.println("Matriks C * 0.5 : ");
        obj.setPerkalian(angkaDouble, c);
        obj.liatHasil(obj.getPerkalian());

        obj.hapus();
    }
}
