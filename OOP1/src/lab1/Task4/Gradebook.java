package lab1.Task4;

import practice2.Student;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Gradebook {

    private List<Student> students;
    private Map<Student, Double> grades;
    private Course course;

    public Gradebook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new HashMap<>();
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course + "!");
        System.out.println("\nPlease, input grades for students:\n");
    }

    public void setGrade(Student student, double grade) {
        grades.put(student, grade);
    }

    public double determineClassAverage() {
        if (grades.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (double g : grades.values()) {
            sum += g;
        }

        return sum / grades.size();
    }

    public Student getBestStudent() {
        Student best = null;
        double max = -1;

        for (Student s : grades.keySet()) {
            double g = grades.get(s);
            if (g > max) {
                max = g;
                best = s;
            }
        }
        return best;
    }

    public Student getWorstStudent() {
        Student worst = null;
        double min = 101;

        for (Student s : grades.keySet()) {
            double g = grades.get(s);
            if (g < min) {
                min = g;
                worst = s;
            }
        }
        return worst;
    }

    public double getGrade(Student s) {
        return grades.getOrDefault(s, 0.0);
    }

    public void outputBarChart() {
        int[] ranges = new int[11];

        for (double g : grades.values()) {
            int index = (int) g / 10;
            if (index > 10) index = 10;
            ranges[index]++;
        }

        System.out.println("\nGrades distribution:");

        for (int i = 0; i < ranges.length; i++) {
            if (i < 10) {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            } else {
                System.out.print("100: ");
            }

            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void displayGradeReport() {

        double avg = determineClassAverage();
        Student best = getBestStudent();
        Student worst = getWorstStudent();

        System.out.printf("\nClass average is %.2f\n", avg);

        if (worst != null) {
            System.out.printf("Lowest grade is %.2f. Student: %s (id=%d)\n",
                    getGrade(worst), worst, worst.getId());
        }

        if (best != null) {
            System.out.printf("Highest grade is %.2f. Student: %s (id=%d)\n",
                    getGrade(best), best, best.getId());
        }

        outputBarChart();
    }
}
