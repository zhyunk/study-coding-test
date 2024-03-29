import java.util.Arrays;
import java.util.stream.IntStream;

public class Stackk {

    static final int STACK_SIZE = 10;

    public static void main(String[] args) {

        MyStack<Integer> s = new MyStack<>(STACK_SIZE);

        // stack 구경
        s.print();

        // 1~10 입력
        IntStream.range(1, 11).forEach(s::push);
        s.print();

        // stack 가득찼을 때 값 추가 시도
        s.push(11);

        // 방금 추가 시도한 값 들어갔는지 확인
        System.out.println();
        System.out.println("contains 11 : " + s.contains(11));

        // 값 1개 pop
        System.out.println();
        System.out.println("pop : " + s.pop());
        s.print();

        // stack 초기화
        s.clear();

        // stack 상태 조회
        s.print();

        // stack 비어있을 때 pop 시도
        s.pop();
    }

}
class MyStack<T> {
    private T[] stack;
    private int maxSize;
    private int top;

    private MyStack() {}
    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stack = (T[]) new Object[maxSize];
        topInit();
    }

    private void topInit() {
        top = -1;
    }

    public boolean isFull() {
        return (top + 1) == maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T data) {
        if (isFull()) {
            System.out.println("[ push 실패 : " + data + " ] Stackk이 가득 찼습니다.");
            return;
        }

        stack[++top] = data;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("[ pop 실패 ] Stackk이 비어있습니다.");
            return null;
        }

        T value = stack[top];
        stack[top--] = null;

        return value;
    }

    public T peek() {
        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean contains(T data) {
        for (Object t: stack)
            if (t.equals(data))
                return true;

        return false;
    }

    public void clear() {
        for (int i = 0; i <= top; i++)
            stack[i] = null;

        topInit();
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Stackk : " + Arrays.toString(stack) + "\n" +
                "  Size : " + size() + "\n" +
                "   top : " + top + "\n";
    }
}
