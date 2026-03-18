import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();  //입력된 내용을 tmp에 저장?
        num = Integer.parseInt(tmp); // 입력받은 문자열tmp를  int값으로 변경

        while(num != 0){
            sum += num%10; //나누기 10을통해 나머지값을 더해서 저장
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수의 합:"+sum);
    }
}
