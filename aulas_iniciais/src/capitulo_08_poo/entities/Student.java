package capitulo_08_poo.entities;

public class Student {

    public String name;
    public double grade01;
    public double grade02;
    public double grade03;

    public double finalGrade(){
        return ((grade01 * 30) + (grade02 * 35) + (grade03 * 35)) / 100;
    }

    public double missingPoints(){
        double finalGrade = finalGrade();
        if(finalGrade <= 60){
            return 60 - finalGrade;
        }
        return 0.00;
    }
}
