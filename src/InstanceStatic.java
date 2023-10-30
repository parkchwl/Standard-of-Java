class Method{
    long a, b;

    //인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add() {return a + b;}  //a 와 b 는 인스턴스 변수
    long subtract(){return a - b;}
    long multiply(){return a * b;}
    double divide(){return (double)a / b;}

    //인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a , long b){return a + b;} //a, b 는 지역변수
    static long subtract(long a, long b){return a - b;}
    static long multiply(long a, long b){return a * b;}
    static double divide(double a , double b){return a / b;}
}

class InstanceStatic {
    public static void main(String args[]) {
        //클래스 메서드 호출. 인스턴스 생성없이 호출가능
        System.out.println(Method.add(200L, 100L));
        System.out.println(Method.subtract(200L, 100L));
        System.out.println(Method.multiply(200L, 100L));
        System.out.println(Method.divide(200.0, 100.0));

        Method mod = new Method();  //인스턴스를 생성
        mod.a = 200L;
        mod.b = 100L;

        //인스턴스 메서드는 객체 생성 후에만 호출이 가능하다.
        System.out.println(mod.add());
        System.out.println(mod.subtract());
        System.out.println(mod.multiply());
        System.out.println(mod.divide());
    }
}

/*
인스턴스 메서드인 add()~divide()는 인스턴스 변수인 a와 b만으로도 충분히 작업이 가능하기 때문에, 매개변수를 필요로 하지 않으므로
괄호()에 매개변수를 선언하지 않았다.
반면에 add(long a, long b), subtract(long a, long b)등은 인스턴스 변수 없이 매개변수만으로 작업을 수행하기 때문에
static을 붙여서 클래스 메서드로 선언하였다.

!! 그래서 main 메서드를 보면, 클래스 메서드는 객체 생성없이 바로 호출이 가능했고,
인스턴스 메서드는 Method클래스의 인스턴스를 생성한 후에야 호출이 가능했다.
 */