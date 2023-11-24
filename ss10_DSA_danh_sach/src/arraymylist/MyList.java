package arraymylist;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACCITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACCITY];
    }
}
