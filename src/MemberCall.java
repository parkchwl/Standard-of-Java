class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//  static int cv2 = iv ;   * 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없다.
    static int cv2 = new MemberCall().iv;   // 이처럼 객체를 생성해야 클래스 변수가 인스턴스 변수를 사용할 수 있다.

    static void staticMethod1(){
        System.out.println(cv);
    //  System.out.println(iv); //에러. 클래스 메서드에서 인스턴스 변수를 사용할 수 없다.
        MemberCall c = new MemberCall();
        System.out.println(c.iv);   //객체를 생성한 후에야 인스턴스 변수의 참조가능
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); //인스턴스 변수에서는 인스턴스 변수를 바로 사용할 수 있다.
    }

    static void staticMethod2(){
        staticMethod1();
    //  instanceMethod1();  *에러. 클래스메서드에서는 인스턴스 메서드를 호출할 수 없다.
        MemberCall c = new MemberCall();
        c.instanceMethod1();    //인스턴스를 생성한 후에야 호출할 수 있다.
    }

    void instanceMethod2(){     // 인스턴스 메서드에서는 인스턴스 메서드와 클래스 메서드
        staticMethod1();        // 모두 인스턴스 생성없이 바로 호출이 가능하다.
        instanceMethod1();
    }
}
/*
클래스 멤버(클래스 변수와 클래스 메서드)는 언제나 참조 또는 호출이 가능하기 때문에 인스턴스 멤버가 클래스 멤버를 사용하는 것은
아무런 문제가 되지 않는다. 클래스 멤버간의 참조 또는 호출 역시 아무런 문제가 없다.
그러나, 인스턴스멤버(인스턴스 변수와 인스턴스 메서드)는 반드시 객체를 생성한 후에만 참조 또는 호출이 가능하기 때문에
클래스 멤버가 인스턴스 멤버를 참조, 호출하기 위해서는 객체를 생성하여야 한다.

하지만, 인스턴스 멤버간의 호출에는 아무런 문제가 없다. 하나의 인스턴스 멤버가 존재한다는 것은 인스턴스가 이미 생성되었다는 것을 의미하며,
즉 다른 인스턴스 멤버들도 모두 존재하기 때문이다.
 */