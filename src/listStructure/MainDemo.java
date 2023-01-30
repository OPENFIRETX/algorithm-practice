package listStructure;

public class MainDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(1);
        list.addFrom(6, 2);


        list.display();
        list.first = list.reverseList(list.first);
        list.display();

    }

}
