public class Penjumlahan extends Perhitungan {
    int angka1;
    int angka2;

    public Penjumlahan(int angka1, int angka2){
    this.angka1 =angka1;
    this.angka2 =angka2;
    }

    @Override
    public int hitungPerhitungan(){
        System.out.println(" HASIL PENJUMLAHAN ADALAH : " + (angka1 + angka2));
        return 0;
    }

}
