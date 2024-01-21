package yvc.ex2;

public class Grades {
    public String getGrade(int grade) {
        String res;

        if(grade >= 1 && grade <= 49) {
            res = "F";
        } else if (grade <= 59) {
            res = "E";
        } else if (grade <= 69) {
            res = "D";
        } else if (grade <= 79) {
            res = "C";
        } else if (grade <= 89) {
            res = "B";
        } else if (grade <= 100) {
            res = "A";
        }
        else {
            res = "Error";
        }

        return res;
    }
}
