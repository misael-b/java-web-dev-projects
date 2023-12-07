public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student myInfo = new Student();
        myInfo.setName("Misael");
        myInfo.setGpa(4.0);
        myInfo.setStudentID(75673);
        myInfo.setNumberOfCredits(1);

        System.out.println(myInfo.getName());
        System.out.println(myInfo.getGpa());
        System.out.println(myInfo.getStudentID());
        System.out.println(myInfo.getNumberOfCredits());

    }
}
