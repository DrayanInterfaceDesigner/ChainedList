public class ChainedList {
    private Node Head;
    public ChainedList() {
        this.Head = null;
    }

    public void Insert(int a) {
        Node x = new Node();
        x.setInformation(a);
        if(this.Head == null) {
            System.out.println("Set Head");
            this.Head = x;
        }
        else {
            Node last = this.findLast(this.Head);
            last.setNext(x);
        }
    }

    private Node findLast(Node n) {
        if(n.getNext() != null) {
            return findLast(n.getNext());
        }
        else {
            return n;
        }
    }

    public void printAll() {
        this._printAll(this.Head);
    }

    private void _printAll(Node n) {
        if(n == null) return;
        System.out.println(n.getInformation());
        if(n.getNext() != null) {
            _printAll(n.getNext());
        }
        else {
            System.out.println("--end--");
        }
    }

}
