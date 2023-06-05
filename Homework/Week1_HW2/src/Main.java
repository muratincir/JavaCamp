public class Main {
    public static void main(String[] args) {

        User user = new User(1,"Murat","İNCİR");
        StudentManager studentManager = new StudentManager();
        studentManager.addUser(user);
        Instructor instructor = new Instructor(1,"Engin","Demiroğ","Developer");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addBranch(instructor);
    }
}