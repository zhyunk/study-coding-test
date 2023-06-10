import java.util.LinkedList;

public class LinkedListt {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // linkedList 정보 조회
        list.print();

        System.out.println("add : " + list.add(1));
        list.print();

        System.out.println("add : " + list.add(2));
        list.print();

        System.out.println("add : index 0 , value " + list.add(0, 0));
        list.print();

        System.out.println("add : index 4 , value " + list.add(4, 4));
        list.print();

        System.out.println("add : index 3 , value " + list.add(3, 3));
        list.print();

        System.out.println("isEmpty : "+ list.isEmpty());

        System.out.println("size : "+ list.size());
        System.out.println("contains 2 : "+ list.contains(2));
        System.out.println("contains 4 : "+ list.contains(4));

        System.out.println();
        System.out.println("clear");
        list.clear();
        list.print();

        System.out.println("isEmpty : "+ list.isEmpty());
        System.out.println();

        System.out.println("add : index 3 , value " + list.add(3, 2));
        list.print();

        System.out.println("add : index 0 , value " + list.add(0, 11));
        list.print();

        System.out.println("add : " + list.add(1));
        list.print();

        System.out.println("add : " + list.add(2));
        list.print();

        System.out.println("add : index 0 , value " + list.add(0, 0));
        list.print();

        System.out.println("add : " + list.add(3));
        list.print();

        System.out.println("add : " + list.add(4));
        list.print();

        System.out.println("isEmpty : " + list.isEmpty());
        System.out.println("remove : " + list.remove(4));
        list.print();

        System.out.println("remove : " + list.remove(2));
        list.print();

        System.out.println("remove : " + list.remove(0));
        list.print();

        System.out.println("remove last : " + list.remove());
        list.print();

        System.out.println("add : index 0 , value " + list.add(0, 4));
        list.print();

        System.out.println("remove last : " + list.remove());
        list.print();

        System.out.println("remove last : " + list.remove());
        list.print();

        System.out.println("remove : " + list.remove(11));
        list.print();

        System.out.println("clear");
        list.clear();
        list.print();

        System.out.println("remove : " + list.remove(11));
        list.print();
    }

}

class MyLinkedList<T> {
    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public T add(T value) {

        if (head == null) {
            head = new Node<>(value, null );

        } else {
            Node<T> current = head;

            while (current.next != null)
                current = current.next;

            current.next = new Node<>(value, null);
        }

        size++;
        return value;
    }
    public T add(int index, T value) {
        if (index == 0)
            head = new Node<>(value, head);

        else if (head == null) {
            System.out.printf(
                    "[ add 실패 : index %d , value %s] 리스트가 비어있음\n",
                    index,
                    value
            );

            return null;
        } else if (index > size) {
            System.out.printf(
                    "[ add 실패 : index %d , value %s] index가 list 크기를 벗어남\n",
                    index,
                    value
            );

            return null;
        } else {
            int idx = 0;
            Node<T> prevNode, nextNode;
            Node<T> current = head;

            while (current != null) {
                if (idx + 1 == index) {
                    prevNode = current;
                    nextNode = current.next;

                    prevNode.next = new Node<>(value, nextNode);

                    break;
                }

                current = current.next;
                idx++;
            }
        }

        size++;
        return value;
    }

    public T remove() {

        if (head == null) {
            System.out.println("[ remove ] 리스트가 이미 비어있음");
            return null;

        } else {
            Node<T> prevNode = head;
            Node<T> current = head;

            while (current.next != null) {
                prevNode = current;
                current = prevNode.next;
            }

            T value = current.data;

            if (current == head)
                head = null;
            else
                prevNode.next = null;

            size--;
            return value;
        }
    }
    public T remove(T value) {

        if (head == null) {
            System.out.println("[ remove : " + value + " 실패 ] 리스트가 비어있음");
            return null;

        } else if (!contains(value)) {
            System.out.println("[ remove : " + value + " 실패 ] " + value + " 없음");
            return null;

        } else {
            Node<T> prevNode = head;
            Node<T> current = head;

            while (current != null) {
                if (current.data.equals(value)) {
                    if (current == head)
                        head = current.next;
                    else
                        prevNode.next = current.next;

                    size--;
                    break;
                }

                prevNode = current;
                current = prevNode.next;
            }

            return value;
        }
    }

    public boolean contains(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(value))
                return true;

            current = current.next;
        }

        return false;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        return size;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("LinkedListt : [ ");

        if (head == null) {
            sb.append("]");

        } else {
            Node<T> current = head;
            do {
                sb.append(current.data).append(", ");

                current = current.next;
            } while (current != null);

            sb.deleteCharAt(sb.lastIndexOf(", ")).append("]");
        }
        sb.append("\n");
        sb.append("       size : ").append(size);
        sb.append("\n");

        return sb.toString();
    }
}
