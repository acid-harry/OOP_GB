public class Pingwin extends Animal implements Swimable, Runable {

    public Pingwin(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedofRun() {
        return 5;
    }

    @Override
    public String voice() {
        return "Пингвинькает";
    }

    @Override
    public int speedofSwim() {
        return 23;
    }
    
}
