public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student myInfo = new Student("Misael",8576,1,4.0);
        myInfo.setStudentID(98);


        System.out.println(myInfo.getName());
        System.out.println(myInfo.getGpa());
        System.out.println(myInfo.getStudentID());
        System.out.println(myInfo.getNumberOfCredits());

    }
}
