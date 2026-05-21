import java.util.ArrayList;

public class Account {

    private String fullName;
    private String username;
    private String email;
    private String mobile;
    private String address;
    private String birthdate;
    private String password;

    private static ArrayList<Account> users = new ArrayList<>();

    public Account(String fullName, String username, String email,
                   String mobile, String address,
                   String birthdate, String password) {

        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.birthdate = birthdate;
        this.password = password;
    }

    // ✅ REGISTER ACCOUNT
    public static void register(String fullName, String username,
                                String email, String mobile,
                                String address, String birthdate,
                                String password) {

        users.add(new Account(fullName, username, email, mobile, address, birthdate, password));

        System.out.println("Registered User: " + username);
    }

    // ✅ LOGIN CHECK
    public static boolean login(String username, String password) {

        for (Account acc : users) {
            if (acc.username.equals(username) && acc.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Optional getters (if you need later)
    public String getFullName() { return fullName; }
    public String getUsername() { return username; }
}