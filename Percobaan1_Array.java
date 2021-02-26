
package PBO_Praktikum_3.Modul3;

public class Percobaan1_Array {
    private String[] mhs;
    private int[] deret;
    private int hasilPenjumlahan;

    public String[] getMahasiswa() {
        return mhs;
    }

    public void setMahasiswa(String[] mhs) {
        this.mhs = mhs;
        mhs = null;
    }

    public int[] getDeret() {
        return deret;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
        deret = null;
    }

    public int getHasilPenjumlahan() {
        return hasilPenjumlahan;
    }

    public void setHasilPenjumlahan(int hasilPenjumlahan) {
        this.hasilPenjumlahan = hasilPenjumlahan;
    }

    public void setPenjumlahan(int[] deret){
        hasilPenjumlahan = 0;
        for(int i = 0; i < deret.length; i++){
            hasilPenjumlahan += deret[i];
        }
        deret = null;
    }

    public void tampil(String a){
        System.out.println(a);
        a = null;
    }

    public void tampil(String[] a){
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                data += a[i];
            }else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }

    public void tampil(int a){
        System.out.println(a);
    }

    public void tampil(int[] a){
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                data += a[i];
            }else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }

    public void hapus(){
        mhs = null;
        deret = null;
        hasilPenjumlahan = 0;
    } 
}
