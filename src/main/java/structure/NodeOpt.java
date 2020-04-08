package structure;

class ListNode {
    int val;
    ListNode next;
}

public class NodeOpt {
    private void traverse(ListNode listNode) {
        for (int i = 0; listNode.next != null; i++) {
            System.out.println(listNode.val);
        }
    }

    private void traverse1(ListNode listNode) {
        for (ListNode node = listNode; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }

    private void traverse2(ListNode listNode) {
        System.out.println(listNode.val);
        if(listNode.next != null){
            traverse(listNode.next);
        }
    }

}


