package javareview;

public class Student {
    //--- accss specifier  / access modifier
    //--- ตัวระบุตัวแปรและเมทอด มี 4 ระดับ private, public, package(default), protected

    //1.field ,attribute ,instance variable---
    private int id;
    private String name;
    private double midtermScore,finalScore;

    //-----  2. constructor
    //--- ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    //--- method
    public double getTotalScore(){

        return midtermScore + finalScore;
    }

    public String showStudent(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    //toString method

    @Override
    public java.lang.String toString() {
        return "id : " + id +
                ", name : '" + name + '\'' +
                ", midtermScore :" + midtermScore +
                ", finalScore :" + finalScore +
                ", TotalScore : " + getTotalScore();
    }
}
