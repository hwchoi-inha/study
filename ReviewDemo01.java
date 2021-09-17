import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt = 0;
 
        for (int k=2; k<number; k++) { // 반복 횟수 2회 감소
            if(number % k == 0)
                cnt++;
        }
 
        if(cnt == 0)    // 카운트가 0이 유지되면 true
            System.out.println(number + "은(는) 소수!");
        else
            System.out.println(number + "은(는) 소수가 아닙니다.");
    }
 }
 