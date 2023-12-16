package validate_so_dien_thoai;

public class Text {
    private static PhoneNumber phoneNumber;
    private static final String[] validate = {"(84)-(0919147214)"};
    private static final String[] invalidate = {"(84)-(09191b7214), (84)-(2222222222),(84)-(29191b7214)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String phone : validate) {
            boolean check = phoneNumber.validate(phone);
            System.out.println(phone + " : " + check);
        }
        for (String phone : invalidate) {
            boolean check = phoneNumber.validate(phone);
            System.out.println(phone + " : " + check);
        }
    }
}
