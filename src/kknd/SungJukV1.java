package kknd;



/**
 * 파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학점수를 설정하면
 * 총점, 평균, 학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 단, 학점기준은 수우미양가로 함
 * 만점은 100점, 100~90 , 89~80, 79~90, 69~60, 59~0 기준으로 학점부여
 *
 * 삼항연산자 : (조건식) ? 참일때 처리 : 거짓일때 처리
 */
public class SungJukV1 {
    public static void main(String[] args) {
        //변수선언
        String name = "지현"; /*<<초기화*/
        int kor = 99;
        int eng = 98;
        int mat = 99;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';

        //처리
        sum = kor + eng + mat;
        mean = (double)sum / 3;  /*<< int를 int로 나눠서 결과는 int*/
        //mean = kor + eng + mat / 3;

        //삼항연산자
//      grd = (mean >= 90 & mean <=100)
        grd = (mean >= 90) ? '수':
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';

        //결과출력
        System.out.println("이름 :" + name);
        System.out.println("국어 :" + kor);
        System.out.println("영어 :" + eng);
        System.out.println("수학 :" + mat);
        System.out.println("--------------");
        System.out.println("총점 :" + sum);
        System.out.println("평균 :" + mean);
        System.out.println("학점 :" + grd);
    }
}


/*
public class SungJukV1 {
    public static void main(String[] args) {
        int kor =99;
        int eng=30;
        int mat=60;
        int sum=296;
        double mean=98.7;




        System.out.printf("이름 : 혜교");
        System.out.println("");
        System.out.printf("국어 : %2d",kor);
        System.out.println("");
        System.out.printf("영어 : %2d",eng);
        System.out.println("");
        System.out.printf("수학 : %2d",mat);
        System.out.println("------------");
        System.out.printf("총점 : %2d",sum);
        System.out.println("");
        System.out.printf("평균 : %2d",mean);


    }
}*/
