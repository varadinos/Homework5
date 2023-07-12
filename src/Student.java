public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student () {
        this.grade = 4;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    Student (String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }


    void upYear () {
        if (!isDegree) {
            this.yearInCollege++;
            if (yearInCollege == 4) {
                isDegree = true;
            }
        } else {
            System.out.println("The student has a degree!");
        }
    }

    double receiveScholarship(double min, double amount) {
        if (grade >= min && this.age < 30) {
            this.money += amount;
            System.out.println("Congratulations, you won a Scholarship!");
        }
        return this.money;
    }

}
