//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jack Sparrow","HST","4572741");
        Teacher t2 = new Teacher("Lionel Messi","PHY","4784117");
        Teacher t3 = new Teacher("Ronaldo","BIO","1234754");

        Course history = new Course("History","101","HST",25,t1);
        Course physics = new Course("Physics","102","PHY",37,t2);
        Course biology = new Course("Biology","103","BIO",32,t3);

        history.addTeacher(t1);
        physics.addTeacher(t2);
        biology.addTeacher(t3);

        Student s1 = new Student("Monica Geller","2445","3",history,physics,biology);
        Student s2 = new Student("Dexter Morgan","9328","4",history,physics,biology);
        s1.addBulkExamNote(85,84,50);
        s1.addBulkPractiseScore(20,83,13);
        s1.printGrade();



    }
}