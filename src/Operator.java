public class Operator {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++; //후위형
        System.out.println("j=i++; 실행후, i=" + i +", j="+ j);

        i=5;
        j=0;

        j = ++i; //전위형
        System.out.println("j=++i; 실행후, i=" + i +", j="+ j);

        double pi = 3.141592;

        System.out.println(pi);
        System.out.println(pi*1000);
        System.out.println(Math.round(pi*1000)); //Math.round(): 소수점 첫째 자리에서 반올림해서 정수(long)를 반환
        System.out.println(Math.round(pi*1000)/1000);
        System.out.println("반올림 " + (Math.round(pi*1000)/1000.0));

        //형변환을 통한 소수점 절삭과정 실무에서는
        //BigDecimal 숫자를 문자로 취급하여 정확한 계산
        System.out.println(pi*1000);
        System.out.println((int)(pi*1000));
        System.out.println((int)(pi*1000)/1000.0);
    }
}
