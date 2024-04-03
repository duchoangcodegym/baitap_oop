import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm chuyên cần: ");
        double attendanceScore = scanner.nextDouble();
        System.out.print("Nhập điểm kiểm tra: ");
        double testScore = scanner.nextDouble();
        System.out.print("Nhập điểm thi học kỳ: ");
        double examScore = scanner.nextDouble();
        double finalScore = calculateFinalScore(attendanceScore, testScore, examScore);
        String grade = calculateGrade(finalScore);
        System.out.println("Điểm cuối cùng: " + finalScore);
        System.out.println("Xếp loại: " + grade);
        scanner.close();
    }
    public static double calculateFinalScore(double attendance, double test, double exam) {
        return attendance * 0.2 + test * 0.3 + exam * 0.5;
    }
    public static String calculateGrade(double score) {
        if (score >= 8.5) {
            return "A";
        } else if (score >= 7.0) {
            return "B";
        } else if (score >= 5.5) {
            return "C";
        } else if (score >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}