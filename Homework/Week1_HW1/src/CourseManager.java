public class CourseManager {
    public void addCourse(Course course , Student student){
        System.out.println("Course added : "+ course.courseName+ "Student added : "+student.firstName+student.lastName);
    }
    public void deletedCourse(Course course , Student student){
        System.out.println("Course deleted : "+ course.courseName+ "Student deleted : "+student.firstName+student.lastName);
    }
}
