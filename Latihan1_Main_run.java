
package PBO_Praktikum_3.Modul3;

public class Latihan1_Main_run {
   public static void main(String args[]) {
       Latihan1_Array obj = new Latihan1_Array();
        int bilangan[] = {-5, -3, -6, -3, -4};
        
        obj.liat("Bilangan: ");
        obj.setBilangan(bilangan);
        obj.liat(obj.getBilangan());
       
        obj.liat("Maksimum:");
        obj.setMax(bilangan);
        System.out.println(obj.getMax());
        
        obj.liat("Minimum:");
        obj.setMin(bilangan);
        obj.liat(obj.getMin());
        
        obj.liat("Mean:");
        obj.setMean(bilangan);
        obj.liat(obj.getMean());
        
        obj.liat("Angka -3 terletak di index:");
        obj.setIndex(bilangan, -3);
        
        obj.clear();
        bilangan = null;
        obj = null;
    }
}
   