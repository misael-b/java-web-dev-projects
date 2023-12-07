public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public String getName(){
                return this.name;
        }

        void setName(String anInput){
                this.name = anInput;
        }

        public int getStudentID(){
                return studentId;
        }

        void setNumberOfCredits(int aCredits){
                this.numberOfCredits = aCredits;
        }

        public  int getNumberOfCredits(){
                return numberOfCredits;
        }

        void setStudentID(int anID){
                this.studentId = anID;
        }

        public double getGpa() {
                return gpa;
        }

        void setGpa(double aGPA) {
                this.gpa = aGPA;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }
}
