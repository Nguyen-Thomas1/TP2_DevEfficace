public class MyLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;
        Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
    
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element, tail, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    
    public int size() { return size; }
    public T get(int index) {
        Node<T> curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.data;
    }
}
