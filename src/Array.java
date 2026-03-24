public class Array {
    public static void main(String[] args) {
//        int[] score = new int[5]; //배열 score를 선언)참조변수 배열의 생성
//        score[3] = 100;
//
//        System.out.println("score[0]=" + score[0]);
//        System.out.println("score[1]=" + score[1]);
//        System.out.println("score[2]=" + score[2]);
//        System.out.println("score[3]=" + score[3]);
//        System.out.println("score[4]=" + score[4]);
//
//        int value = score[3];
//        System.out.println("value="+value);

        int[] arr = new int[10]; // 길이가 n인 int배열 arr을 생성
        System.out.println("arr.length="+arr.length);

        for(int i=0;i<arr.length;i++) { //index 범위를 범어나면 에러
            System.out.println("arr["+i+"]="+ arr[i]);
        }
    }
}
