import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int score = 0;  // 점수저장 지역변수
        char grade = ' '; // 학점저장 지역변수 char는 2바이트로 가장가벼움 대신 ' ' 을 필수로사용하고 한글자만 저장가능

        System.out.println("점수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); // 유저입력값 Int를 불러와 sc에저장

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학접은 " + grade +"입니다.");
    }
}
