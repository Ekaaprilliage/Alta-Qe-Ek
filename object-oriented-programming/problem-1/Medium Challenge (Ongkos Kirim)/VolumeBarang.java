public class VolumeBarang extends OngkosKirim{
    int panjang;
    int lebar;
    int tinggi;
    int berat;

    public VolumeBarang(int panjang, int lebar, int tinggi, int berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    public int hitungHargaBarang() {
        int varvol = (panjang * lebar * tinggi / 50) * 1000;
        int hitberat = (berat) * 5000;

        int hitungSemua = varvol + hitberat;

        System.out.println(" HARGA BARANG : " + (hitungSemua));
        return 0;
    }
    

}
