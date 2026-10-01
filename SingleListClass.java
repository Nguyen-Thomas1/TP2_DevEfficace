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
    
    public Integer avantdernier() {
        if (head == null || head.getNext() == null) {
            return null;
        }
        Node curr = head;
        while (curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }
        return curr.getElement();
    }
    
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.getNext(); 
            curr.setNext(prev);    
            prev = curr;           
            curr = next;      
        head = prev; }
    }
    
    
    public void swapNodes(Node x, Node y) {
        if (x == y || x == null || y == null || head == null) {
            return;
        }

   
        Node prevX = null, currX = head;
        while (currX != null && currX != x) {
            prevX = currX;
            currX = currX.getNext();
        }

        Node prevY = null, currY = head;
        while (currY != null && currY != y) {
            prevY = currY;
            currY = currY.getNext();
        }

   
        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.setNext(y);
        } else {
            head = y;
        }

      
        if (prevY != null) {
            prevY.setNext(x);
        } else {
            head = x;
        }

   
        Node tempNext = x.getNext();
        x.setNext(y.getNext());
        y.setNext(tempNext);
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
