package kknd;

//메서드 재정의 override
//객체지향 중요 3대개념중 다형성에 해당
//상속관계에 있는 상위클래스의 메서드를
//하위클래스에서 같은 이름의 메서드로 다시 작성하는 것을 의미
//즉, 상속받은 메서드를 새로 정의해서 사용하는 것을 말함
public class Overriding {
    public static void main(String[] args) {
        Cat crycat = new Cat();
        Dog crydog = new Dog();
        Animal a = new Animal();//부모클래스 객체화
        System.out.println(crycat.cry());
        System.out.println(crydog.cry());
        System.out.println(a.cry());
    }
}

class Animal {
    protected String cry() { return "동물이 웁니다"; } //<< 상속할거라면 protected
}

class Cat extends Animal {
    @Override
    protected String cry() { return "야옹 야옹"; }
}

class Dog extends Animal {
    @Override
    protected String cry() { return "멍 멍"; }
}