public class Whale extends Cow {
    public void printAll(){
        coW("");
        cowSwim("");
        cowSleep("");
        blood();
        speedWhale(60);
        heart();
    }

    public void coW(String whale) {
        whale = "I Whale";
        System.out.println(whale);
    }
    public void cowSleep(String sleep) {
        sleep = "I am sleeping";
        System.out.println(sleep);
    }
    public void cowSwim(String fin) {
        fin = "I am swimming";
        System.out.println(fin);
    }

    @Override
    public void blood() {
        byte bd = 1;
        System.out.println("Группа крови: " + bd);
    }
}
