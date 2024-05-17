public class StudentManager {
    Student[] students;
    Grade[] grades;
    int studentCount;
    int gradeCount;

    public StudentManager(int maxStudents, int maxGrades) {
        students = new Student[maxStudents];
        grades = new Grade[maxGrades];
        studentCount = 0;
        gradeCount = 0;
    }



    public void addStudent(Student addStudent) {
        if (studentCount < students.length) {
            students[studentCount] = addStudent;
            studentCount ++ ;
            System.out.println("We add this student: " + addStudent);
        }else {
            System.out.println("We can`t add this student: " + addStudent);
        }
    }
    public void addGrage (Student student, String subject, double grade){
        if (gradeCount < grades.length){
            grades[gradeCount] = new Grade(student, subject, grade);
            gradeCount ++ ;
        } else {
            System.out.println("Cannot add more grades, array is full.");
        }
    }
    public double getAverageGrade(Student student) {
        double totalGrade = 0;
        int subjectCount = 0;

        // Ітеруємося по всім оцінкам
        for (int i = 0; i < grades.length; i++) {
            Grade grade = grades[i];
            if (grade != null) {
                if (grade.student.equals(student)) {
                    totalGrade += grade.grade;
                    subjectCount++;
                }
            }
        }

        if (subjectCount > 0) {
            return totalGrade / subjectCount;
        } else {
            return 0;
        }
    }
}
