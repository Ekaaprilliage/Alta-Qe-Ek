public class PersegiPanjang {
        int panjang;
        int lebar;

        public PersegiPanjang(int panjang, int lebar) {
                this.panjang = panjang;
                this.lebar = lebar;
        }

        public int hitungPersegiPanjang(){
                return this.panjang * this.lebar;
        }

        public int hitungKelilingPersegiPanjang(){
                return 2 * (this.panjang + this.lebar);
        }

}
