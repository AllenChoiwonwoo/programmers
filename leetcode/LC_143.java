package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_143 {

    List<ListNode> listAll = new ArrayList<>();
    int length = 1;

    public void reorderList(ListNode head) {

        listAll.add(head);
        getListLength(head);
        int harfFrontLen = length / 2;
        int rest = 0;
        if (length % 2 == 1 ){
            rest = 1;
        }
        List<ListNode> harfFrontList = listAll.subList(0, harfFrontLen);
        List<ListNode> harfBackList = listAll.subList(harfFrontLen + rest, length);


        try {
            int backIdx = (length / 2);
            ListNode frontNd = null;
            ListNode backNd = null;
            for (int i = 0; i < harfFrontLen; i++) {
                backIdx -= 1;
                frontNd = harfFrontList.get(i);
                backNd = harfBackList.get(backIdx);
                frontNd.next = backNd;
                backNd.next = harfFrontLen > i+1 ? harfFrontList.get(i+1) : null;
            }
            if (rest == 1){
                ListNode lastOne = listAll.get(harfFrontLen);
                backNd.next = lastOne;
                lastOne.next = null;
            }
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void getListLength(ListNode head){
        if (head.next == null){
            return;
        }
        listAll.add(head.next);
        length++;
        getListLength(head.next);
    }

    public static void main(String[] args) {
        ListNode ln7 = new ListNode(7,null);
        ListNode ln6 = new ListNode(6,ln7);
        ListNode ln5 = new ListNode(5,ln6);
        ListNode ln4 = new ListNode(4,ln5);
        ListNode ln3 = new ListNode(3,ln4);
        ListNode ln2 = new ListNode(2,ln3);
        ListNode ln1 = new ListNode(1,ln2);

        new LC_143().reorderList(ln1);


    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//Definition for singly-linked list.


