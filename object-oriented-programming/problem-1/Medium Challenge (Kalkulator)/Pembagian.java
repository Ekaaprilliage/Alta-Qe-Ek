public class Pembagian extends Perhitungan {
    int angka1;
    int angka2;

    public Pembagian(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public int hitungPerhitungan() {
        if (angka2 != 0) {
            System.out.println(" HASIL PEMBAGIAN ADALAH : "  + (angka1 / angka2));
        }
        return 0;
    }
}

