public class Perkalian extends Perhitungan{

        int angka1;
        int angka2;

        public Perkalian(int angka1, int angka2){
            this.angka1 =angka1;
            this.angka2 =angka2;
        }

        @Override
        public int hitungPerhitungan(){
            System.out.println(" HASIL PERKALIAN ADALAH : " + (angka1 * angka2));
            return 0;
        }
}
