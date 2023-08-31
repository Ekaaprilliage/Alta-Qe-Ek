public class Pengurangan extends Perhitungan{
    int angka1;
    int angka2;

    public Pengurangan(int angka1, int angka2){
        this.angka1 =angka1;
        this.angka2 =angka2;
    }

    @Override
    public int hitungPerhitungan(){
        System.out.println(" HASIL PENGURANGAN ADALAH : " + (angka1 - angka2));
        return 0;
    }
}
