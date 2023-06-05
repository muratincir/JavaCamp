public class InstructorManager extends UserManager{

    public void addBranch(Instructor instructor){
        System.out.println(instructor.getBranch()+" branchı "+instructor.getFirstName()+" "+instructor.getLastName()+" kişisine eklendi !!!");
    }
}
