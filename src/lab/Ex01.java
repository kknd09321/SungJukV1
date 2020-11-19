package lab;

public class Ex01 {
    public static void main(String[] args){
        // 학생 클래스를 이용해서 객체 생성
        Student std = new Student();
        // 학과 클래스를 이용해서 객체 생성
        Department dept = new Department();
        // 과목 클래스를 이용해서 객체 생성
        Subject subj = new Subject();
        // 교수 클래스를 이용해서 객체 생성
        Professor prof = new Professor();

        // 기본생성자로 만든 객체 내용 출력
        System.out.println(std.name);
        System.out.println(dept.dname);
        System.out.println(subj.no);
        System.out.println(prof.no);

        // 각 객체의 변수에 값 대입

        // 학생
        std.stdno = 201350050;
        std.name = "김태희";
        std.addr = "경기도 고양시";
        std.birth = "1985.3.22";
        std.dept = "컴퓨터";
        std.prof = "504";

        // 학과
        dept.dname = "컴퓨터공학";
        dept.phone = "123-4567-8901";
        dept.office = "E동 2층";
        dept.chief = "504";

        //과목
        subj.no ="0205";
        subj.subname ="프로그래밍";
        subj.subjdesc = "자바프로그래밍";
        subj.prof = "301";

        //교수
        prof.no = "301";
        prof.name = "이순신";
        prof.mjfield = "프로그래밍";

        // 매개변수를 사용하는 생성자로 객체 생성
        Student yoo = new Student(201252110, "전지현", "경기도의정부시",
                "1986.4.30", "의상디자인", "445");

        // 객체에 저장된 값 출력력
        // 학생
        System.out.println(std.stdno);
        System.out.println(std.name);
        System.out.println(std.addr);
        System.out.println(std.birth);
        System.out.println(std.dept);
        System.out.println(std.prof);

        // 학과
        System.out.println(dept.dname);
        System.out.println(dept.phone);
        System.out.println(dept.office);
        System.out.println(dept.chief);
        // 과목
        // 교수

    }
}

