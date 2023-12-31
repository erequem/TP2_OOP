public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(1, "Morched", "Zribi");
        Instructor instructor2 = new Instructor(1, "lillia", "Sfaxi");
        Course course = new Course(1, "optique geometrique", instructor);
        Course course2 = new Course(2, "Systemes d'exploitation", instructor2);
        Student student = new Student(1, "Rami", "Gharbi", 2);
        student.enroll(course);
        student.enroll(course2);
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Enrolled Courses: ");
        student.getCourses();

    }
}
