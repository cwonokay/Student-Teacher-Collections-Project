    import java.util.*;

    import static java.time.chrono.JapaneseEra.values;
    import static javax.swing.UIManager.put;

    public class Main {

        public static void main(String[] args){

            ArrayList<Student> student = new ArrayList<>();


            Student newStudent1 = new Student("Lola", "Brown", 1, 1);
            student.add(newStudent1);
            Student newStudent2 = new Student("Leo", "Spoon", 2, 1);
            student.add(newStudent2);
            Student newStudent3 = new Student("Teddy", "Yallah", 3, 1);
            student.add(newStudent3);
            Student newStudent4 = new Student("Mya", "davis", 4, 1);
            student.add(newStudent4);
            Student newStudent5 = new Student("Miah", "Massey", 5, 1);
            student.add(newStudent5);
            Student newStudent6 = new Student("Diana", "Mingo", 6, 1);
            student.add(newStudent6);
            Student newStudent7 = new Student("Tyson", "Leads", 7, 1);
            student.add(newStudent7);
            Student newStudent8 = new Student("Carla", "Ray", 8, 1);
            student.add(newStudent8);
            Student newStudent9 = new Student("Chris", "Stone", 9, 1);
            student.add(newStudent9);
            Student newStudent10 = new Student("Demetrice", "White", 10, 1);
            student.add(newStudent10);
            Student newStudent11 = new Student("Devon", "Hill", 11, 1);
            student.add(newStudent11);
            Student newStudent12 = new Student("London", "kong", 12, 1);
            student.add(newStudent12);
            Student newStudent13 = new Student("Kimmy", "Choo", 13, 1);
            student.add(newStudent13);
            Student newStudent14 = new Student("Sean", "Harris", 14, 1);
            student.add(newStudent14);
            Student newStudent15 = new Student("Ryan", "Kearse", 15, 1);
            student.add(newStudent15);

            ArrayList<Teacher> teacher = new ArrayList<>();
            Teacher newTeacher = new Teacher("Cornelia", "Wonokay", 1, 1);
            teacher.add(newTeacher);
            Teacher newTeacher2 = new Teacher("Arnesha", "Stephen", 2, 1);
            teacher.add(newTeacher2);
            Teacher newTeacher3 = new Teacher("Brittney", "Tennant", 3, 1);
            teacher.add(newTeacher3);


            Map<Teacher, Set<Student>> firstGrade = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                Set<Student> classRoom = new HashSet<>();
                for (int j = 0; j < 5; j++) {
                    classRoom.add(student.get((i*5)+j));
                }
                firstGrade.put(teacher.get(i), classRoom);

            }

            System.out.println("key set");
            for (Teacher teacherSet : firstGrade.keySet()) {
                System.out.println(teacherSet);
            }

            System.out.println("values");

            for (Set studentSet: firstGrade.values()) {
                System.out.println(studentSet);
            }

            System.out.println("keys & values!!");

            for (Map.Entry<Teacher, Set<Student>> schoolClasses: firstGrade.entrySet() ) {
                System.out.println(schoolClasses);

            }
        }
    }

