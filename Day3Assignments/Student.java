package Day3Assignments;

class Student {
    private int studentId;
    private String name;
    private String contactNo;
    private String course;
    private double fees;
 
    // Constructor to populate the objects
    public Student(int studentId, String name, String contactNo, String course, double fees) {
        this.studentId = studentId;
        this.name = name;
        this.contactNo = contactNo;
        this.course = course;
        this.fees = fees;
    }
 
    // Method to display the details of the student
    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Course: " + course);
        System.out.println("Fees: " + fees);
    }
 
    // Method to return the course fees
    public double getFees() {
        return fees;
    }
 
    // Method to get the course name
    public String getCourse() {
        return course;
    }
}


