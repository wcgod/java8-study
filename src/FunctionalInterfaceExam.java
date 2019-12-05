@FunctionalInterface
interface FunctionTest {
    public int min(int a, int b);
}

public class FunctionalInterfaceExam {
    public static void main(String[] args) {
        FunctionTest FTest = (x,y)-> x<y?x:y;

        System.out.println(FTest.min(1,6));
    }
}
