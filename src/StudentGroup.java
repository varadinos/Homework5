public class StudentGroup {
    String subject;
    Student[] students;
    int freePlaces;

    StudentGroup () {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup (String subject) {
        this();
        this.subject = subject;
    }
    void addStudent(Student s) {
        if(!s.subject.equals(this.subject)) {
            System.out.println(s.name +" has different subject!");
            return;
        }
        if(freePlaces == 0) {
            System.out.println("Sorry, there is not free place");
            return;
        }

        students[students.length - freePlaces] = s;
        freePlaces --;
    }

    void emptyGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    String findBestStudent(){
        Student bestStudent = students[0];
        for (int i = 0; i < students.length - freePlaces; i++) {
            if (bestStudent.grade < students[i].grade) {
                bestStudent = students[i];
            }
        }

        return bestStudent.name;
    }

    void printStudentsInGroup() {
        for (int i = 0; i < students.length - freePlaces; i++) {
            System.out.println("Name:" + students[i].name + " age: " + students[i].age );
        }
    }
}
