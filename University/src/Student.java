public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private Course[] courses;

    public Student(int studentId, String firstName, String lastName, int numberOfCourses) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new Course[numberOfCourses];
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void getCourses() {
        System.out.print("Courses: ");
        for (Course course : courses) {
            if (course != null) {
                System.out.print(course.getCourseName());
                System.out.print("\ntaught by: "+course.getInstructorName()+"\n");
            } else {
                break;
            }
        }
    }

    public void enroll(Course course) {
        for (Course cours : courses) {
            if ((cours != null) && (cours.getCourseId() == course.getCourseId())) {
                throw new IllegalArgumentException("Course already exists");
            }
        }
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                return;
            }
        }
        throw new IllegalArgumentException("Course limit exceeded");
    }
}
