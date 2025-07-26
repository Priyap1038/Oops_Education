
public class Course implements Storable{
    private static int courseIdCounter = 101;

    int courseId; // e.g., "CS101"
    String courseName;

    
    public Course(String courseName){
       this.courseId = courseIdCounter++ ;
       this.courseName= courseName;
    }

    public String getCourseName(){ return courseName;};
public int getCourseId(){ return courseId;};
    // public void setDetails(int id, String cName) {
    //     this.courseId = id;
    //     this.courseName = cName;
    // }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }

    public String toDataString(){
        return courseId+","+ courseName;
    }
}
