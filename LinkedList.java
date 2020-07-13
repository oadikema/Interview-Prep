    public static int getLength(ListNode node) {
        if (node == null){
            return 0;
        }
        int length = 1;
        ListNode cur = node;
        while (cur.next != null){
            length++;
            cur = cur.next;
        }

        return length;
    }
}

class ListNode {
          public int data;
          public ListNode next;
      
          public ListNode(int nodeData) {
              this.data = nodeData;
              this.next = null;
          }
     }