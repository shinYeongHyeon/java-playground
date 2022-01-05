package chapter2.ch03;

public class FunctionTest {
    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum()
    {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        sayHello("Hello, Java");
        System.out.println(addNum(1, 2));
        System.out.println(calcSum());
    }
}

/**
 * 함수 호출과 스택 메모리
 *
 * 스택 : 함수가 호출될 때 지역변수들이 사용하는 메모리
 * 함수의 수행이 끝나면 자동으로 반환되는 메모리
 */
