import java.util.Arrays; // Alt+Enter 으로 import문 추가

public class Array_2 {
    public static void main(String[] args) {
//        int[] iArr = {100, 95, 80 ,70 ,60};
//        for (int i=0;i<iArr.length;i++){
//            System.out.println(iArr[i]);
//        }
//
//        System.out.println(Arrays.toString(iArr));

        int [] ball = new int[45]; //45개의 정수값을 저장

        int tmp = 0; //두값을 바꾸는 임시변수
        int j = 0;  // 값을 저장할 변수

        // 배열의 각 요소에 1~45의값을 저장
        for (int i=0; i < ball.length; i++)
            ball[i] = i+1; //ball[0]에 1이 저장된다

        //이중 반복문으로 5회 실행
        for (int k=0; k<5; k++){

            for(int i=0; i < 6; i++){
                j = (int) (Math.random() * 45);
                tmp     =ball[i];
                ball[i] =ball[j];
                ball[j] =tmp;
            }

            // 배열 ball의 숫자를앞에서부터 6개 출력
            for (int i=0; i<6; i++){
                System.out.printf("%d%s" ,ball[i], (i == 5 ? "": ", "));
            }
            System.out.println();
        }

    }
}
