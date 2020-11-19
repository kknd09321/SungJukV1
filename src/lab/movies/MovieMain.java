package lab.movies;

public class MovieMain {
    public static void main(String[] args) {
        String[] genre = {"드라마"};
        String[] dirtor = {"스콧 프랭크"};
        String[] actor = {"애니아 테일러조이", "토머스 브로디생터스", "해리 멜링"};
        String summary = "950년대 한 보육원, 체스에 천재적인 재능을 보이는 소녀. 점점 더 넓은 세계로 향하며, 체스 스타의 여정을 이어간다. 하지만 더 이기고 싶다면 중독부터 극복해야 한다.";
        String desc = "950년대 한 보육원, 체스에 천재적인 재능을 보이는 소녀. 점점 더 넓은 세계로 향하며, 체스 스타의 여정을 이어간다. 하지만 더 이기고 싶다면 중독부터 극복해야 한다.";
        Movie queensgamebit = new Movie(
                "퀸스겜빗", "2020", 350, "넷플릭스", genre,
                dirtor, actor, summary, desc);

        System.out.println(queensgamebit.getTitle()); //getTitle 드래그 하고 crtl+b 누르면 만든곳으로 이동
        System.out.println(queensgamebit.getYear());
        System.out.println(queensgamebit.getRuntime());
        System.out.println(queensgamebit.getPrdtin());
        // 참조형 변수이므로 배열의 내용대신 내용의 위치가 출력
        // 내용이 저장된 위치가 출력 : 반복문으로 이용해서 처리

        for (int i = 0; i < genre.length; ++i)
        System.out.println(queensgamebit.getGenre()[i]); /*드라마라고 출력이 안되서 for문으로*/
        System.out.println(summary);
    }
}
