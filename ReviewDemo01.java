import java.util.Scanner;

public class ReviewDemo01 {
   public static void main(String[] args) {
       // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       boolean isPrime = true;

//        for (int k=2; k<number; k++) {
//            if(number % k == 0) { // 입력된 수를 k로 나누었을 때 나머지가 0인 경우
//                isPrime = false;
//                break;  // 첫 번째 약수가 발견되면 for문 탈출
//            }
//            System.out.println(k);
//        }

       int k=2;
       while(k<number) {
           if(number % k == 0) { // 입력된 수를 k로 나누었을 때 나머지가 0인 경우
               isPrime = false;
               break;  // 첫 번째 약수가 발견되면 for문 탈출
           }
           k++;
       }

       if(isPrime)    // isPrime 변수 값이 true면
           System.out.println(number + "은(는) 소수!");
       else
           System.out.println(number + "은(는) 소수가 아닙니다.");
   }
}