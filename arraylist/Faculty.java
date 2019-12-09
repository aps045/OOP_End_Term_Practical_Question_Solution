package arraylist;

public class Faculty {
    private int id;
    private String name;
    private String email;
    private long mobile;

    public Faculty(int id, String name, String email, long mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "--------------------------------------------------\nID : " + id +
                "\nName : " + name + "\nEmail ID : " + email +
                "\nContact Number : " + mobile + "\n--------------------------------------------------";
    }
}
