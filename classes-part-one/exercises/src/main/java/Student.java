public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public String getName(){
                return this.name;
        }

        public void setName(String anInput){
                this.name = anInput;
        }

        public int getStudentID(){
                return studentId;
        }

        public void setNumberOfCredits(int aCredits){
                this.numberOfCredits = aCredits;
        }

        public  int getNumberOfCredits(){
                return numberOfCredits;
        }

        public void setStudentID(int anID){
                this.studentId = anID;
        }

        public double getGpa() {
                return gpa;
        }

        public void setGpa(double aGPA) {
                this.gpa = aGPA;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
