/*사용자로부터 소문자를 입력 받아 대문자로 출력하는 프로그램을 작성해보세요.
단, 소문자 이외의 숫자나 문자를 입력 받으면 “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (UpperCase)*/

package Quest;

import java.io.IOException;
import java.util.Scanner;

public class Q29_low2upr {
    public static void main(String []args) throws IOException {
        String input = "";
        String output = "";
        char tmp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("입력값을 입력해주세요");
        input = scanner.nextLine(); // 입력받은 문자열을 input에 저장

        for (int i=0; i<input.length(); i++){

            tmp = input.charAt(i); // 문자열은 아스키코드로 저장되기 때문에 int로 변환

            if ((65 <= tmp)&&(tmp <= 90)){

                    output += input.valueOf(tmp).toLowerCase();


                }else if((97 <= tmp) && (tmp <= 122)) {

                    output += input.valueOf(tmp).toUpperCase();


            }else{
                output += (char)tmp;
            }

        }
            System.out.println("변환된 문자열 : " + output);
    }
}
