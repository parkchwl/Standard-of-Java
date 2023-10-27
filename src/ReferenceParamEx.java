class Data1 { int x;}
class ReferenceParamEx{
    public static void main(String args []){
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change (d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data d){ //참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}

// 참조형 매개변수로 값을 변경하였다.