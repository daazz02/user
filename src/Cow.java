import java.util.Date;

public class Cow implements organs{
    private int speed;
    public void speedWhale(int speed){
        System.out.print("Скорость км.ч: ");
        this.speed = speed;
        System.out.println(speed);

    }
    public void printAll(){
        Day();
        coW("");
        cowEat("");
        cowWalking("");
        cowBell("");
        cowSleep("");
        blood();
        heart();
    }

    public void coW(String cow) {
        cow = "I Cow";
        System.out.println(cow);
    }
    public void cowWalking(String go) {
        go = "I went";
        System.out.println(go);
    }
    public void cowSleep(String sleep) {
        sleep = "I am sleeping";
        System.out.println(sleep);
    }
    public void cowEat(String eat) {
        eat = "I am eating";
        System.out.println(eat);
    }
    public void cowBell(String bell) {
        bell = "When i walk my bell rings";
        System.out.println(bell);
    }


    @Override
    public void heart() {
       String ht = "Сердце в полном порядке";
        System.out.println(ht);
    }

    @Override
    public void blood() {
        byte bd = 2;
        System.out.println("Группа крови: " + bd);
    }
    public void Day(){
        Date current = new Date();
        System.out.println(current);
    }
}
