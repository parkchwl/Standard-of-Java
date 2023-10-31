class Car{
    String color;       //색상
    String gearType;    //변속기 - auto, manual
    int door;           //문의 개수

    Car(){
        this("white","auto",4);
    }

    Car(String color){
        this(color,"auto",4);
    }
    Car(String color, String gearType, int door){   //this는 참조변수로 인스턴스 자신을 가리킨다.
        this.color = color;                         //this를 사용할 수 있는 것은 인스턴스 멤버뿐이다.
        this.gearType = gearType;                   //static메서드에서는 인스턴스 멤버들을 사용할 수 없는 것처럼
        this.door = door;                           //this 역시 사용할 수 없다.
    }
}

class CarTest2 {
    public static void main(String args[]){
        Car c1 = new Car(); // Car c1 = new Car();와 같이 생성자 Car()를 사용하여 Car 인스턴스를 생성함.
        Car c2 = new Car("Blue");

        System.out.println("c1의 color=" + c1.color + ", gearType"+c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType"+c2.gearType+ ", door="+c2.door);

    }
}
// **중요한 것은 this가 인스턴스 자신을 가리키는 참조변수로, 인스턴스의 주소가 저장되어 있고
// **모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다는 것이다.
// this(), this(매개변수) : 생성자로, 같은 클래스의 다른 생성자를 호출할 때 사용한다.