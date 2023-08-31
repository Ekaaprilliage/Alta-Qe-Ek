public class Segitiga {

    int alas;
    int tinggi;

    int sideA;
    int sideB;
    int sideC;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int hitungLuasSegitiga (){
        return (this.alas * this.tinggi) / 2;
    }

    public int hitungKelilingSegitiga (){
        return this.sideA + this.sideB + this.sideC;
    }


}
