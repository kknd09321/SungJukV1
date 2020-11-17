package kknd;


import java.util.Scanner;

/**
 * 파일명 : SungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v2
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
 *
 */
public class SungJukV2 {
    public static void main(String[] args) {
        //변수선언
        Scanner scan = new Scanner(System.in);
        String name = "지현"; /*<<초기화*/
        int kor = 99;
        int eng = 98;
        int mat = 99;
        int sum = kor + eng + mat;
        double mean = 0.0;
        char grd = '가';

        //처리
        System.out.print("점수를 입력해 주세요: ");
        sum = scan.nextInt();
        mean = (double)sum / 3;


        switch (sum) {
            case 1 :
                if (mean <= 90){
                    System.out.println("수");
                }
            case 2 :
                if (mean >= 80) {
                    System.out.println("우");
                }
            case 3 :
                if (mean >= 70) {
                    System.out.println("미");
                }
            case 4 :
                if (mean >= 60) {
                    System.out.println("양 , 가");
                }
            default:
                System.out.println("없는 점수입니다.");
                break;
        }


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
