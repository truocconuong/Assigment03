public class Dog {
    int id ;
    String chungLoai;
    String mauLong;
    double canNang;
    int tuoi;
    public void GauGau(){
        System.out.println("Cờ hó đang sủa meo meo");
    }
    public void Eat(){
        System.out.println("Cờ hó đang ăn với tốc độ bàn thờ");
    }
    public void Run(){
        System.out.println("Dog run run run");
    }

    public Dog(int id, String chungLoai, String mauLong, double canNang, int tuoi) {
        this.id = id;
        this.chungLoai = chungLoai;
        this.mauLong = mauLong;
        this.canNang = canNang;
        this.tuoi = tuoi;
    }

    public Dog() {
    }
}
