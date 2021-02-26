package PBO_Praktikum_3.Modul3;

public class Latihan1_Array {
    private int[] bilangan;
    private int a;
    private int max;
    private int min;
    private double total;
    private double mean;
    private int[] index;
    
    public int[] getBilangan() {
        return bilangan;
    }
    
    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getA() {
        return a;
    }
    
    public void setMax(int[] bilangan) {
        max = bilangan[0];
        for (int i = 0; i < bilangan.length; i++){
            if (max < bilangan[i]){
                max = bilangan[i];
            }
        }
    }
    
    public int getMax() {
        return max;
    }
    
    public void setMin(int[] bilangan) {
        min = bilangan[0];
        for (int i = 0; i < bilangan.length; i++) {
            if (min > bilangan[i]) {
                min = bilangan[i];
            }
        }
    }
    
    public int getMin() {
        return min;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setMean(int[] bilangan) {
        mean = 0;
        for (int i = 0; i < bilangan.length; i++) {
            total += bilangan[i];
            a++;
        }
        mean = total/a;
    }
    
    public double getMean() {
        return mean;
    }

    public void setIndex(int[] bilangan, int a){
        String data = "";
        for (int i = 0; i < bilangan.length; i++){
            if (a == bilangan[i]) {
                data += "Index Ke-"+i+"\n";
            }
        }
        System.out.println(data);
    }
    
    public int[] getIndex(){
        return index;
    }
    
    public void liat(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            }
            else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }
    
    public void liat(String a) {
        System.out.println(a);
        a = null;
    }
    
    public void liat(int a) {
        System.out.println(a);
    }
    
    public void liat(double a) {
        System.out.println(a);
    }
    
    public void clear(){
        bilangan = null;
        mean = 0;
        max = 0;
        min = 0;
        total = 0;
        a = 0;
    }
}
