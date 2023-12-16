package validate_ten_lop_hoc;

import javax.imageio.spi.ServiceRegistry;

public class Main {
    private static ClassName className;
    private static final String[] validate = {"C0223G, A0323K"};
    private static final String[] invalidate = {"M0318G, P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validate) {
            boolean check = className.validate(name);
            System.out.println(name + " : " + check);
        }
        for (String name : invalidate) {
            boolean check = className.validate(name);
            System.out.println(name + " : " +check);
        }
    }
}
