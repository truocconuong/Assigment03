public class Main {
    public static void main(String[] args) {
        Dog bigbull = new Dog(1,"BigBull","Đen xì",52.5,8);
        Cat meoTom = new Cat(2,"Mèo Jerry","Vàng",30,2);
        if(bigbull.canNang > meoTom.canNang){
            System.out.println("Chó cắn mèo chạy mất người");
        }
        else {
            System.out.println("WOw chó bị mèo cắn kìa");
        }
    }
}
