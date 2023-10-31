class BlockTest{
    static {
        System.out.println("static { }");   // 클래스 초기화 블럭
    }
    {
        System.out.println("{ }");          // 인스턴스 초기화 블럭
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String args[]){
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}
/*BlockTest가 메모리에 로딩될 때, 클래스 초기화 블럭이 가장먼저 수행되어 'static {}'이 화면에 출력된다.
그 다음에 main 메서드가 수행되어 BlockTest인스턴스가 생성되면서 인스턴스 초기화 블럭이 먼저 수행되고, 끝으로 생성자가 수행된다.
클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되었지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행되었다.
 */