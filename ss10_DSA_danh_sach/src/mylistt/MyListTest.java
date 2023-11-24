package mylistt;

public class MyListTest {
        public static void main(String[] args) {
            MyList list = new MyList();
            list.add(6);
            list.add(3);
            list.add(2);
            list.add(1);
            list.getAll();
            list.add(9,4);
            list.remove(2);
            System.out.println(list.get(1));
            list.getAll();
            System.out.println(list.contains(0));
            System.out.println(list.indexOf(4));
        }
}
