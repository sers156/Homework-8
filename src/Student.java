public class Student {

    Student(int studentId2, String name2, String surname2, int course2, float averageGradeInMathematics2, float averageGradeInEconomics2, float averageGradeInForeignLanguages2) {

        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        averageGradeInMathematics = averageGradeInMathematics2;
        averageGradeInEconomics = averageGradeInEconomics2;
        averageGradeInForeignLanguages = averageGradeInForeignLanguages2;

    }

    Student(int studentId3, String name3, String surname3, int course3) {
        this(studentId3, name3, surname3, course3, 0, 0, 0);
    }

    Student() {
    }
    int studentId;
    String name;
    String surname;
    int course;
    float averageGradeInMathematics;
    float averageGradeInEconomics;
    float averageGradeInForeignLanguages;
}

class StudentTest {

    double sreadArifmeticheskayOcenka(Student st) {
        double srednOcenka = (st.averageGradeInMathematics + st.averageGradeInEconomics + st.averageGradeInForeignLanguages) / 3;
        System.out.println("Средняя арифметическая оценка студента" + " " + st.surname + " " + st.name + "=" + srednOcenka);
        return srednOcenka;

    }

    public static void main(String[] args) {

        Student st1 = new Student();

        st1.studentId = 1;
        st1.name = "Вова";
        st1.surname = "Попов";
        st1.course = 4;
        st1.averageGradeInMathematics = 15;
        st1.averageGradeInEconomics = 10;
        st1.averageGradeInForeignLanguages = 21;

        Student st2 = new Student(2,"Вадим", "Смирнов",4);

        st2.averageGradeInMathematics = 5;
        st2.averageGradeInEconomics = 15;
        st2.averageGradeInForeignLanguages = 11;

        Student st3 = new Student(2,"Сергей", "Макаров",1 ,10,15,10);

        StudentTest test=new StudentTest();
        test.sreadArifmeticheskayOcenka(st1);
        test.sreadArifmeticheskayOcenka(st2);
        test.sreadArifmeticheskayOcenka(st3);


    }
}

