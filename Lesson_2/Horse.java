public class Horse extends Animal implements Runable {

    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String voice() {
        return "Игогокает";
    }
    
    @Override
    public String toString() {
        return  "Конь " + super.toString();
    }

    @Override
    public int speedofRun() {
        
        return 60;
    }
}