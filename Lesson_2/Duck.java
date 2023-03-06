public class Duck extends Animal implements Runable, Flyable, Swimable {

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedofFly() {
        return 75;
    }

    @Override
    public String voice() {
        return "Крякает";
    }

    @Override
    public int speedofRun() {
        
        return 5;
    }

    @Override
    public int speedofSwim() {
        
        return 12;
    }
    
}