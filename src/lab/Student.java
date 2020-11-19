package lab;

public class Student {
    int stdno;
    String name;
    String addr;
    String birth;
    String dept;
    String prof;

    // 기본생성자
    public Student() {
        stdno = 20125006;
        name = "송혜교";
        addr = "서울영등포구";
        birth = "1977.9.17";
        dept = "컴퓨터";
        prof = "301";
    }

    //같은 이름의 여러개의 메소드 쓰려면
    // 리턴값 , 매개변수 스튜던트 안에 튜플이 다르고 , 내용이 다르거나
    // 매개변수를 포함하는 생성자
    public Student(int stdno, String name, String addr,
                   String birth, String dept, String prof) {
        this.stdno = stdno;
        this.name = name;
        this.addr = addr;
        this.birth = birth;
        this.dept = dept;
        this.prof = prof;

    }
}
