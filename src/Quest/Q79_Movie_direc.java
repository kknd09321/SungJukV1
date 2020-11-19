package Quest;

public class Q79_Movie_direc {
    // 멤버변수
    String dirname;
    String birth;
    String dirmov;
    String what;

    // 기본생성자
    public Q79_Movie_direc() {
        dirname = "봉준호";
        birth = "1977.07.07";
        dirmov = "기생충";
        what = "(출연 X)";
    }

    // 매개변수 생성자
    public Q79_Movie_direc(String dirname,String birth,String dirnmov,String what){
        this.dirname = dirname;
        this.birth = birth;
        this.dirmov = dirmov;
        this.what = what;
    }
}

