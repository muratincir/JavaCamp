public class Instructor extends User {

    String branch;

    public Instructor(int id, String firstName, String lastName,String branch) {
        super(id, firstName, lastName);
        this.branch=branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
