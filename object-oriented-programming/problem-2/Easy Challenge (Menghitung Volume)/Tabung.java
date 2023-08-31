public class Tabung {
    int jari2;
    int tinggi;

    public Tabung(int jari2, int tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public int hitungVolumeTabung(){
        return (int) (Math.PI * this.jari2 * this.tinggi);
    }
}
