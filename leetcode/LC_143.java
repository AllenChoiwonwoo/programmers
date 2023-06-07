package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_143 {

    List<ListNode> listAll = new ArrayList<>();
    int length = 1;

    List<ListNode> resultTest = new ArrayList<>();
    public void reorderList(ListNode head) {

        listAll.add(head);
        getListLength(head);
//        listAll.forEach(System.out::println);
        int harfFrontLen = length / 2;
//        System.out.println("harfFrontLen = " + harfFrontLen);
        int rest = 0;
        if (length % 2 == 1 ){
            rest = 1;
        }
        List<ListNode> harfFrontList = listAll.subList(0, harfFrontLen);
        harfFrontList.forEach(System.out::println);
//        System.out.println("-------------------------------");
        List<ListNode> harfBackList = listAll.subList(harfFrontLen + rest, length);
        harfBackList.forEach(System.out::println);
//        System.out.println("-------------------------------");


        try {
            int backIdx = (length / 2);
            ListNode frontNd = null;
            ListNode backNd = null;
            for (int i = 0; i < harfFrontLen; i++) {
                backIdx -= 1;
                frontNd = harfFrontList.get(i);
                backNd = harfBackList.get(backIdx);
                frontNd.next = backNd;
                System.out.println("frontNd = " + frontNd.toString());
                backNd.next = harfFrontLen > i+1 ? harfFrontList.get(i+1) : null;
                System.out.println("backNd = " + backNd.toString());
                System.out.println();
//                frontNd.next = frontNd;
                resultTest.add(frontNd);// 작은 리스트 앞에서 에서 하나
                resultTest.add(backNd); // 큰 리스트 뒤에서 하나
            }
            if (rest == 1){
                ListNode lastOne = listAll.get(harfFrontLen);
                System.out.println("last : backNd ND "+backNd);
                backNd.next = lastOne;
                lastOne.next = null;
                resultTest.add(lastOne);
            }

//            resultTest.forEach(i -> {
//                System.out.println("i.val = " + i.val+" , next = "+(i.next == null ? "NO next" : i.next.val)) ;
//            });

        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }


    }
    /*
    1단계 힌트:
    이 문제를 해결하기 위해 다음과 같은 접근 방식을 사용할 수 있습니다.

    연결 리스트를 두 부분으로 분할합니다. (앞쪽 절반과 뒤쪽 절반)
    뒤쪽 절반을 뒤집습니다.
    앞쪽 절반과 뒤집힌 뒤쪽 절반을 번갈아가며 병합합니다.

     */
    public void getListLength(ListNode head){
        System.out.println("head.val = " + head.val);
        if (head.next == null){
            System.out.println("length = " + length);
            return;
        }
        System.out.println("head.next.val = " + head.next.val);
        listAll.add(head.next);
        length++;
        getListLength(head.next);
    }

    public static void main(String[] args) {
//        System.out.println("args = " + args);
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

    @Override
    public String toString() {
        String nextVal = "";
        if (next == null){
            nextVal = "null";
        }else{
            nextVal = next.val+"";
        }
        return "ListNode{" +
                "val=" + val +
                ", next=" + nextVal +
                '}';
    }
}

//Definition for singly-linked list.


