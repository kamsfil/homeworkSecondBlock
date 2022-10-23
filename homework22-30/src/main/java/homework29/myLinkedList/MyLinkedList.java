package homework29.myLinkedList;

public class MyLinkedList<N> {

    private Node<N> head;
    private Node<N> tail;
    private int size = 0;

    private static class Node<N> {
        Node<N> prev;
        N value;
        Node<N> next;

        Node(Node<N> a, N value, Node<N> b) {
            this.prev = a;
            this.value = value;
            this.next = b;
        }
    }

    public void addAtFirst(N val) {
        Node<N> temp = new Node(this.head, val, null);

        if (head != null) {
            head.next = temp;
        }
        head = temp;

        if (tail == null) {
            tail = temp;
        }
        size++;
    }

    public void addAtLast(N val) {
        Node<N> temp = new Node<>(null, val, this.tail);
        if (tail != null) {
            tail.prev = temp;
        }
        tail = temp;

        if (head == null) {
            head = temp;
        }
        size++;
    }

    public N getObject(int index) {
        if (index >= 0 && index <= size) {

            Node<N> nNode = this.tail;

            for (int i = 1; i <= size; i++) {
                if (i == index) {
                    return nNode.value;
                }
                nNode = nNode.next;
            }
        }
        return null;
    }

    public void deleteObject(int index) {

        if (index >= 1 && index <= size) {

            if (index == 1) {
                tail.next.prev = null;
                tail = tail.next;
                size = size - 1;
                return;
            }

            if (index == size) {
                head.prev.next = null;
                head = head.prev;
                size = size - 1;
                return;
            }

            Node<N> nNode = this.tail;

            for (int i = 1; i <= size; i++) {
                if (i == index) {
                    nNode.prev.next = nNode.next;
                    nNode.next.prev = nNode.prev;
                    size = size - 1;
                }
                nNode = nNode.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}