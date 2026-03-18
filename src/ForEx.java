public class ForEx {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            if (i % 2 == 0){
                System.out.println("짝수");
            }else if (i % 3 == 0){
                System.out.println("박수");
            } else
            System.out.println(i);
        }

        Forsum();
    }

    public static void Forsum() {
        int sum = 0;

        for(int i=1; i <= 5; i++) sum += i ; //sum = sum + i;
        System.out.printf("1부터 5까지의 합 : %d%n", sum);
    }
}
