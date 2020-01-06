public class Test {
    public static void main(String[] args) {
        Hi test = new Hi() {
            public void test() {

            }
        };
        ((Hello)test).test();
    }
}
class Hi {

}
interface Hello{
    public abstract void test();
}
