class Solution {
    public Node copyRandomList(Node head) {
        Node a = head, b = null, c= null;
        HashMap<Node, Node> copy = new HashMap<>();
        copy.put(null, null);
        while(a != null){
            Node list = new Node(a.val);
            if(b == null){
                b = list;
                c = list;
            } 
            else{
                c.next = list;
                c = list;
            }
            copy.put(a,c);
            a = a.next;
        }
        a = head;
        while(a != null){
            copy.get(a).random = copy.get(a.random);
            a = a.next;
        }
        return b;
    }
}