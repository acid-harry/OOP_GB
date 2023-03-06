import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;
    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal (Animal a) {
        animals.add(a);
        return this;
    }

    public List<Speakable> getSpeakables(){
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an  : animals) {
            answer.add(an);
        }
        answer. add(radio);
        return answer;

    }
    public List<Runable> getRunables(){
        List<Runable> result = new ArrayList<Runable>();
        for(Animal an : animals) {
            if (an instanceof Runable){
                result.add((Runable)an);
            }
            
        }
        return result;
        
    }

    public int getMaxspeed() {
        int max = 0;
        for (Runable runner : getRunables()) {
            if(max < runner.speedofRun()){
                max = runner.speedofRun();
            }
        }
        return max;
    }

    public List<Flyable> getFLyers(){
        List<Flyable> result = new ArrayList<Flyable>();
        for(Animal an : animals) {
            if (an instanceof Flyable){
                result.add((Flyable)an);
            }
            
        }
        return result;
        
    }

    public List<Swimable> getSwimables(){
        List<Swimable> result = new ArrayList<Swimable>();
        for(Animal an : animals) {
            if (an instanceof Swimable){
                result.add((Swimable)an);
            }
            
        }
        return result;
    }

    public int getMaxSwimspeed() {
        int max = 0;
        for (Swimable runner : getSwimables()) {
            if(max < runner.speedofSwim()){
                max = runner.speedofSwim();
            }
        }
        return max;
    }


    public ArrayList<Animal> getAnimals() {
            return animals;
        }

    

}