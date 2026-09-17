package Liste_chainée;

public class SingleListClass {

    private static class Node {
        private Integer element;
        private Node next;

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Integer getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;

    public SingleListClass() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Integer first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

  
    public Integer last() {
        if (isEmpty()) {
            return null;
        }
        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext(); 
        }
        return tmp.getElement();
    }

    public void addFirst(Integer e) {
        head = new Node(e, head);
    }

    public void addLast(Integer element) {
        Node newNode = new Node(element, null); 
        if (head == null) {
            head = newNode; 
            return;
        }
        Node tmpHeader = head;
        while (tmpHeader.getNext() != null) {
            tmpHeader = tmpHeader.getNext(); 
        }
        tmpHeader.setNext(newNode);
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Integer remove = head.getElement();
        head = head.getNext();
        return remove;
    }

    
    
    
    public static void main(String[] args) {
        SingleListClass maListe = new SingleListClass(); 

        maListe.addFirst(10);
        maListe.addLast(20);
        maListe.addLast(30);

       
        System.out.println("Premier élément : " + maListe.first());
        System.out.println("Dernier élément : " + maListe.last());   
      
        
        Integer elementSupprime = maListe.removeFirst();
        System.out.println("Élément supprimé : " + elementSupprime);

        
        System.out.println("Nouveau premier élément : " + maListe.first()); 
    }
}
