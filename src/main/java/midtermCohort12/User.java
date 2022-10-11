package midtermCohort12;

public abstract class User implements IPrint {

    private String username,passowrd;

    public User(String username, String passowrd) {
        this.username = username;
        this.passowrd = passowrd;
    }
}
