public class RandomMath {
    public static void main(String[] args) {
        int num = 0;
            //괄호{} 안에 내용을 20번 반복한다.
        for (int i =1; i <= 20; i++){
            //System.out.println(Math.random()); //0.0<=x<1.0
            //System.out.println((int)(Math.random()*3)); //형변한을통한 소숫점 제거
            System.out.println((int)(Math.random()*3)+1); //1<=x<4 1~3
        }
    }
}
