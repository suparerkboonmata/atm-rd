package javareview;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Spiderman");
        Student s2 = new Student(2,"Batman");
        s1.setMidtermScore(10);
        s1.setFinalScore(50);
        s2.setMidtermScore(20);
        s2.setFinalScore(20);
//        System.out.println("Student : "+s1.getId()+" : "+s1.getName()+" Score : "+s1.getTotalScore());
//        System.out.println("Student : "+s2.getId()+" : "+s2.getName()+" Score : "+s2.getTotalScore());
//
//        Student s = s1;
//        s.id = 20;
//        System.out.println(s1.id);
        System.out.println(s1.toString());
    }
}
