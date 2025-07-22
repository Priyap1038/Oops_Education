public class Student {
    private static int nextStudentIdCounter = 1; 

    int studentId;
    String name;

    public Student(String name){
this.studentId = nextStudentIdCounter++;
this.name= name;
    }

    
    // public void setDetails(int id, String studentName) {
    //     this.studentId = id; // using 'this' for clarity
    //     this.name = studentName;
    // }

public String getStudentName(){ return name;};
    public int getStudentId(){ return studentId;};

    
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
