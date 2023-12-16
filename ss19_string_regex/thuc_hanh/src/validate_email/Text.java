package validate_email;

public class Text {
    private static EmailExample emailExample;
    public static final String[] valiEmail = new String[] {"a@gamil.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invaliEmail = new String[] {"@gamil.com", "ab@gamil.", "@abc@mail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : valiEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid " + isvalid);
        }
        for (String email : invaliEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid " + isvalid);
        }
    }
}
