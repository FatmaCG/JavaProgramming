package day35_PracticeTasks.PracticeTasks_2;

public class Credentials {
    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
       setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public boolean isStrongPassWord() {
        boolean size = password.length() >= 8 && !password.contains(" ");
        boolean hUpper = false;
        boolean hLower = false;
        boolean hDigit = false;
        boolean hSpecial = false;

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hUpper = true;
            } else if (Character.isLowerCase(each)) {
                hLower = true;
            } else if (Character.isDigit(each)) {
                hDigit = true;
            } else {
                hSpecial = true;
            }
        }
        return size && hUpper && hLower && hDigit && hSpecial;

    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + isStrongPassWord()+ '\'' +
                '}';
    }
}

