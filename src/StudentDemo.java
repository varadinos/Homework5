public class StudentDemo {
    public static void main(String[] args) {
        Student stoyan = new Student("Stoyan Varadinov", "Software Testing", 29);
        stoyan.upYear();
        stoyan.upYear();
        stoyan.upYear();
        stoyan.upYear();
        stoyan.grade = 5;
        stoyan.receiveScholarship(3, 200);
        System.out.println(stoyan.name + " have " + stoyan.money +" BGN.");

    }
}
