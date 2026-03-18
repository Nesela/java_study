import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        final int score = 200; //상수 선언

        boolean power = true; // 논리값 저장

        byte b = 127;  //byte 값의 최대값 127 // 128을 넣으면 에러발생

        int oct = 010; // 8진수는 숫자 앞에 0으로 표현
        int hex = 0x10;// 16진수는 숫자앞에 0x를 넣어 표현

        long l = 10_000_000_000L;  // 큰숫자에 언더바로 가독성 상향 // 뒤에L을 붙여 숫자가 int가 아닌 long이라는것을 선언

        float f = 3.14f;  // 실수는 double이 기분이기에 float에 담으려면 반드시 뒤에 f를 붙여야함
        double d = 3.14;  // 실수를 다루는 기본적인 타입

        String str = "3";

        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' + 1);
        System.out.println(3 + 1);
        System.out.println("3" + "1");
        System.out.println((char)(3 + '0'));  // '0' 은 숫자로 48
    }
}

