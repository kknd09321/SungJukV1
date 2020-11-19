package Quest;

public class Q79_Movie_comp {
    String compname;
    String addr;
    String compmov;


    // 기본생성자
    public Q79_Movie_comp() {
        compname = "20 Centre Fox";
        addr = "LA";
        compmov = "Interstella";

    }

    // 매개변수 생성자
    public Q79_Movie_comp(String compname, String addr, String compmov) {
        this.compname = compname;
        this.addr = addr;
        this.compmov = compmov;

    }
}