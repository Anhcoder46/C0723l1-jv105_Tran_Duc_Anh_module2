package validate_so_dien_thoai;

import validate_ten_lop_hoc.Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONENUMBER_REGEX = "^\\([0-9]{2,2}\\)-\\([0-9]{10,10}\\)$";
    public PhoneNumber() {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
