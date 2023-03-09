public class Main{
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(17);
        list.add(159);
        list.add(23);
        list.add(99);
        list.add(1);
        list.add(140);
        list.add(2);

        list.forEach(System.out::println);

        System.out.println("\n---------------\n");
        System.out.println(String.format("Size: %d", list.size()));
        System.out.println("\n---------------\n");
        System.out.println(list.getPreviousByIndex(5));
        System.out.println(list.getByIndex(5));
        System.out.println(list.getNextByIndex(5));
        list.replaceByIndex(5, 100500);
        System.out.println(list.getByIndex(5));
    }
}