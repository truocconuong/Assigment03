public class Cat {
    int id ;
    String chungLoai;
    String mauLong;
    double canNang;
    int tuoi;
    public void Cao(){
        System.out.println("Mèo đang cào cào");
    }
    public void Eat(){
        System.out.println("CHú mèo của chúng ta đang ăn");
    }
    public void Run(){
        System.out.println("Mèo đang chạy");
    }

    public Cat(int id, String chungLoai, String mauLong, double canNang, int tuoi) {
        this.id = id;
        this.chungLoai = chungLoai;
        this.mauLong = mauLong;
        this.canNang = canNang;
        this.tuoi = tuoi;
    }

    public Cat() {
    }
}
