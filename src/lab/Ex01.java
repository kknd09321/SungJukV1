package lab;

import com.sun.org.apache.xpath.internal.operations.String;

public class Ex01 {
    public static void main(String[] args){
        Students kim = new Students();
        Students song = new Students();
        Students jeon = new Students();
        Students su = new Students();
        Students i = new Students();

        kim.num = 201350050;
        kim.name = "김태희";
        kim.adr = "경기도고양시";
        kim.major = "컴퓨터";
        kim.pronum = 504;



        // 학생 클래스를 이용해서 객체 생성
        // 학과 클래스를 이용해서 객체 생성
        // 과목 클래스를 이용해서 객체 생성
        // 교수 클래스를 이용해서 객체 생성

        // 각 객체의 변수에 값 대입

        // 객체에 저장된 값 출력력

    }
}
class Students {
    int num;
    java.lang.String name;
    java.lang.String adr;
    int birth;
    java.lang.String major;
    int pronum;
}

class Major{
    String majorname;
    int callnum;
    java.lang.String location;
    java.lang.String classnum;
}
