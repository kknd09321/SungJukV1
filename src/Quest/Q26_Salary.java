/*사용자가 연봉과 결혼 여부를 입력하면 다음의 세금율에 의해 납부해야
     할 세금을 계산하는 프로그램을 작성하세요 (Tax)

     가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%
     나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%*/

package Quest;

import java.util.Scanner;

public class Q26_Salary {
    public static void main(String[] args){

        int tax;
        int income;
        String sal;

        Scanner sc = new Scanner(System.in);

        System.out.println("결혼 여부를 입력하세요");
        sal = sc.nextLine();
        System.out.println("금액을 입력하세요");
        income = sc.nextInt();

        if (income <= 1000) {

            tax = (int) (income * 0.09);

        } else if (income <= 4000) {

            tax = (int) (income * 0.18);

        } else if (income <= 8000) {

            tax = (int) (income * 0.27);

        } else {

            tax = (int) (income * 0.36);

        }

        System.out.println("소득세는 " +tax+ " 원 입니다");

    }
}

