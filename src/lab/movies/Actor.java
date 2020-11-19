package lab.movies;

public class Actor {
    // 멤버변수
    private String name;
    private String birth;
    private String[] joinmovie ; // 한개이상이라고 써있으면 배열
    private String[] casting;

    // 기본생성자

    public Actor() { }


    // 매게변수 생성자
    public Actor(String name, String birth, String[] joinmovie, String[] casting) {
        this.name = name;
        this.birth = birth;
        this.joinmovie = joinmovie;
        this.casting = casting;
    }

    //set get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String[] getJoinmovie() {
        return joinmovie;
    }

    public void setJoinmovie(String[] joinmovie) {
        this.joinmovie = joinmovie;
    }

    public String[] getCasting() {
        return casting;
    }

    public void setCasting(String[] casting) {
        this.casting = casting;
    }
}
