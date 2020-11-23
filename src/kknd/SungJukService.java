package kknd;
/**
 * 파일명 : SungJukService
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v5
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 *
 * 단, 평균은 소수점 첫째 자리까지 출력 하고
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 *
 * 만점은 100점, 100~90 , 89~80,
 * 79~90, 69~60, 59~0 기준으로 학점부여
 * name, kor, eng, mat, sum, mean, grd
 *
 */
import java.util.Scanner;

public class SungJukService {

    /*성적 데이터 입력 메서드
    @return 키보드로 입력받는 성적데이터 SungJukVO*/
    public SungJukVO readSungJuk() {
        String name;
        int kor, eng, mat, sum;
        double mean;
        char grd;
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name =sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor =sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng =sc.nextInt();
        System.out.print("수학를 입력하세요 : ");
        mat =sc.nextInt();

        return new SungJukVO(name, kor, eng, mat,0,
                0,' ');  // << grd 문제 해결

    }// resungjuk

    /*입력받은 성적에 대해
    총점, 평균, 학점을 계산하는 메서드*/

    public void computeSungJuk(SungJukVO sj) {
        sj.setSum( sj.getKor() + sj.getEng() + sj.getMat());
        sj.setMean((double)sj.getSum() / 3);

        //학점계산은 switch문으로 처리
        switch ((int)(sj.getMean()/10)) {   /*<<<나누기 10을 하면 뒷숫자가 없어도 되고 앞에만*/
            case 10 :
            case 9 : sj.setGrd('수'); break;
            case 8 : sj.setGrd('우'); break;
            case 7 : sj.setGrd('미'); break;
            case 6 : sj.setGrd('양'); break;
            default: sj.setGrd('가');
        }//switch
    }//computesungjuk

    /*입력한 이름,국어,영어,수학과
    계산된 총점 평균,학점등을 출력하는 메서드*/

    public void printSungJuk(SungJukVO sj) {
        String fmt ="이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %s\n학점 : %c";
        String result = String.format(fmt,
                sj.getName(), sj.getKor(), sj.getEng(),
                sj.getMat(), sj.getSum(), sj.getMean(),
                sj.getGrd());

        System.out.println(result);

    }
}
