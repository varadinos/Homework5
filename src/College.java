public class College {
    public static void main(String[] args) {
        StudentGroup qaGroup = new StudentGroup("Software Testing");

        Student stoyan = new Student("Stoyan Varadinov", "Software Testing", 29);
        Student ivan = new Student("ivan ivanov", "Software Testing", 29);
        Student petkan = new Student("Petkan Petkanov", "Software Testing", 29);
        Student dragan = new Student("Dragan Draganov", "Software Testing", 29);
        Student maria  = new Student("Maria Ivanova", "Software Testing", 29);
        Student ivana = new Student("Ivana Ivanova", "Software Testing", 29);
        stoyan.grade = 0;
        ivan.grade = 1;
        petkan.grade = 2;
        dragan.grade = 3;
        maria.grade = 4;

        qaGroup.addStudent(stoyan);
        qaGroup.addStudent(ivan);
        qaGroup.addStudent(petkan);
        qaGroup.addStudent(dragan);
        qaGroup.addStudent(maria);
        qaGroup.addStudent(ivana);

        System.out.println(qaGroup.findBestStudent());
        qaGroup.printStudentsInGroup();


    }
}
