public int sizeCircular() {
    if (head == null) return 0;
    int count = 0;
    Node current = head;
    do {
        count++;
        current = current.next;
    } while (current != head);
    return count;
}


@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof DoubleListClass)) return false;
    DoubleListClass other = (DoubleListClass) obj;
    
    Node curr1 = this.head;
    Node curr2 = other.head;
    
    while (curr1 != null && curr2 != null) {
        if (!curr1.item.equals(curr2.item)) return false;
        curr1 = curr1.next;
        curr2 = curr2.next;
    }
    return curr1 == null && curr2 == null;
}
