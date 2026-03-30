class objet {
    public static void main(String[] args) {
        Tv t; //tv인스턴스를 참조하기 위한 변수 t 선언
        t= new Tv(); // tv인스턴스를 생성
        t.channel = 7; //tv인스턴스의 멤버변수 channel의 값을 7로 지정
        t.channelDown(); // tv인스턴스 메서드 channelDown()호출
        System.out.println("현재 채널은" + t.channel + " 입니다.");
    }
}

class Tv{
    // tv의 속성(멤버변수)
    String color; //색상
    boolean power; //전원상태
    int channel; // 채널

    //tv의 기능(메서드)
    void power() { power = !power; } // tv 불리언값으로 끄고 키기
    void channelUp() { ++channel; } // tv의 채널을 높히는 기능
    void channelDown() { --channel; } // 반대로 채널 다운
}