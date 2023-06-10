import java.util.Arrays;

public class Queuee {

    private static final int QUEUE_SIZE = 8;

    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>(QUEUE_SIZE);

        q.print(); // 큐 정보 조회

        System.out.println("add : " + q.add(1));
        q.print();

        System.out.println("add : " + q.add(2));
        q.print();

        System.out.println("add : " + q.add(3));
        q.print();

        System.out.println("add : " + q.add(4));
        q.print();

        System.out.println("add : " + q.add(5));
        q.print();

        System.out.println("poll : " + q.poll());
        q.print();

        System.out.println("poll : " + q.poll());
        q.print();

        System.out.println("poll : " + q.poll());
        q.print();

        System.out.println("add : " + q.add(6));
        q.print();

        System.out.println("add : " + q.add(7));
        q.print();

        System.out.println("peek : " + q.peek());
        System.out.println();

        System.out.println("add : " + q.add(8));
        q.print();

        System.out.println("add : " + q.add(9));
        q.print();

        System.out.println("add : " + q.add(10));
        q.print();

        System.out.println("contains 7 : " + q.contains(7));
        System.out.println("contains 2 : " + q.contains(2));
        System.out.println();

        System.out.println("clear");
        q.clear();
        q.print();
    }
}

// RingBuffer 를 이용한 큐 자료구조 이해하기
class MyQueue<T> {
    T[] q;

    private int front;
    private int rear;

    private int dataCount;
    private int size;

    private MyQueue(){}
    public MyQueue(int size) {
        this.front = 0;
        this.rear = 0;
        this.dataCount = 0;
        this.size = size;

        q = (T[]) new Object[size];
    }

    public T add(T data) {
        if (dataCount < size) {
            dataCount++;

            q[rear] = data;

            rear = (rear + 1) % size;

            return data;
        }

        System.out.println(" [ add 실패 : " + data + " ] 큐가 가득 찼습니다. ");
        return null;
    }

    public T poll() {
        if (dataCount > 0) {
            dataCount--;

            T data = q[front];
            q[front] = null;

            front = (front + 1) % size;

            return data;
        }

        System.out.println(" [ poll 실패 ] 큐가 비었습니다. ");
        return null;
    }

    public T peek() {
        return q[front];
    }

    public boolean contains(T data) {
        for (int i = 0; i < dataCount; i++) {
            int idx = (front + i) % size;
            if (data.equals(q[idx]))
                return true;
        }

        return false;
    }

    public void clear() {
        while (dataCount > 0) {
            poll();
        }

        front = 0;
        rear = 0;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  "  MyQueue : " + Arrays.toString(q) + "\n" +
                "    front : " + front + "\n" +
                "     rear : " + rear + "\n" +
                "dataCount : " + dataCount + "\n" ;
    }
}
