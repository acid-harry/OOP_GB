public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Пушистик", 1, "Рыжий"))
                .addAnimal(new Horse("Звездочка", 25))
                .addAnimal(new Duck("Дакки", 17))
                .addAnimal(new Pingwin("Шкипер", 33));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.voice());
        }

        System.out.println("-------------------");

        System.out.println("Звуки в зоопарке:");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.voice());

        }

        System.out.println("-------------------");

        for (Runable run : zoo1.getRunables()) {
            System.out.println("Скорость:" + run.speedofRun());
            
        }

        int max = zoo1.getMaxspeed();
        System.out.println(String.format("Максимальная скорость: %d", max));

        System.out.println("-------------------");

        for (Flyable flyable : zoo1.getFLyers()) {
            System.out.printf("Cкорость полета : %d", + flyable.speedofFly());
        }

        System.out.println("\n-------------------");

        for (Swimable swim : zoo1.getSwimables()) {
            System.out.println("Скорость плаванья: "  + swim.speedofSwim());
            
        }

        int maxs = zoo1.getMaxSwimspeed();
        System.out.printf("Максимальная скорость плаванья: % d", maxs);





    }

}