package Quest;

public class Q79_Movie_actor {

    // 멤버변수
    String acname;
    String birth;
    String joinmov;
    String what;

    // 기본생성자
    public Q79_Movie_actor() {
        acname = "김태희";
        birth = "1982.08.07";
        joinmov = "중천";
        what = "주연";
    }

    // 매개변수 생성자
    public Q79_Movie_actor(String acname,String birth,String joinmov,String what){
        this.acname = acname;
        this.birth = birth;
        this.joinmov = joinmov;
        this.what = what;
    }
}
