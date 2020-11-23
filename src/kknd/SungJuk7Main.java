package kknd;

import java.util.Scanner;

/**
 * 파일명 : SungJukV7main
 * 작성일 : 2020.11.23
 *
 * 프로그램설명 : 성적처리프로그램 V7
 * 중간고사와 기말고사 성적처리프로그램를 만들려고 함
 * SungJukV6Main을 토대로 중간고사와
 * 기말고사 성적 클래스를 인터페이스를 이용해서 작성하세요
 *
 * 부모클래스 SungJukV7
 * 인터페이스 ISungJukV6
 * 중간고사 MidSungJuk2 : 국어,영어,수학
 * 기말고사 FinalSungJuk2 : 국어,영어,수학,미술art,과학sci
 * 성적입력 : readSungjuk
 * 성적처리 : computeSungJuk
 * 결과출력 : printSungJuk
 */

public class SungJuk7Main {
    public static void main(String[] args) {
/*      MidSungJuk2 msj2 = new MidSungJuk2();

      msj2.readSungJuk();
      msj2.computeSungJuk();
      msj2.printSungJuk();*/

      FinalSungJuk2 fsj2 = new FinalSungJuk2();

      fsj2.readSungJuk();
      fsj2.computeSungJuk();
      fsj2.printSungJuk();

    }
}

abstract class SungJukV7 {
    protected String name;
    protected int kor;
    protected int eng ;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    public SungJukV7() {}

    public SungJukV7(String name, int kor, int eng, int mat) { }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    class MidSungJuk2 extends SungJukV7 {

    }

}

interface ISungJukV7 {
    void readSungJuk();
    void computeSungJuk();
    void printSungJuk();
}

class MidSungJuk2 extends SungJukV7
        implements ISungJukV7{



    @Override
    public void readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name =sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor =sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng =sc.nextInt();
        System.out.print("수학를 입력하세요 : ");
        mat =sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        grd = (mean >= 90) ? '수' :
              (mean >= 80) ? '우' :
              (mean >= 70) ? '미' :
              (mean >= 60) ? '양' : '가';
    }

    @Override
    public void printSungJuk() {
        String fmt ="이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %s\n학점 : %c";
        String result = String.format(fmt,
                name, kor, eng, mat, sum, mean, grd);
        System.out.println(result);
    }
}
class FinalSungJuk2 extends SungJukV7
        implements ISungJukV7 {
    protected int sci;
    protected int art;

    public FinalSungJuk2() { }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public FinalSungJuk2(String name, int kor, int eng, int mat, int sci, int art) {
        super(name, kor, eng, mat);
        this.sci = sci;
        this.art = art;


    }

    @Override
    public void readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name =sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor =sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng =sc.nextInt();
        System.out.print("수학를 입력하세요 : ");
        mat =sc.nextInt();
        System.out.print("과학를 입력하세요 : ");
        sci =sc.nextInt();
        System.out.print("미술를 입력하세요 : ");
        art =sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        sum = kor + eng + mat + sci + art;
        mean = (double) sum / 5;
        //mean = kor + eng + mat / 3;

        //삼항연산자
//      grd = (mean >= 90 & mean <=100)
        grd = (mean >= 90) ? '수' :
                (mean >= 80) ? '우' :
                        (mean >= 70) ? '미' :
                                (mean >= 60) ? '양' : '가';
    }

    @Override
    public void printSungJuk() {
        String fmt ="이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n과학 : %d\n미술 : %d\n총점 : %d\n평균 : %s\n학점 : %c";
        String result = String.format(fmt,
                name, kor, eng, mat, sci, art, sum, mean, grd);
        System.out.println(result);
    }
}
