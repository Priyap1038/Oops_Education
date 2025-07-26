public class Student extends Person {
    // private static int nextStudentIdCounter = 1;

    // int studentId;
    // String name;
    private String gradeLevel;

    public Student(String name,String gradeLevel) {
        // this.studentId = nextStudentIdCounter++;
        // this.name = name;
        super(name);
        this.gradeLevel= gradeLevel;
    }

    // public void setDetails(int id, String studentName) {
    // this.studentId = id; // using 'this' for clarity
    // this.name = studentName;
    // }

    // public String getStudentName() {
    //     return name;
    // };

    // public int getStudentId() {
    //     return studentId;
    // };

    public String getGradeLevel(){
        return gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); //call persen//
        System.out.println(", Grade Level: " + this.gradeLevel + "(Role: Student)");
    }
}
