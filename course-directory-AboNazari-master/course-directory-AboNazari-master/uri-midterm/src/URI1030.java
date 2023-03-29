import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class URI1030 {
    public static int josephus(int n, int k) {
        // Create circular linked list
        Node head = new Node(1);
        Node curr = head;
        for (int i = 2; i <= n; i++) {
            curr.next = new Node(i);
            curr = curr.next;
        }
        curr.next = head;

        // Iterate through list, removing every k-th node
        curr = head;
        Node prev = null;
        while (curr.next != curr) {
            for (int i = 0; i < k-1; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            curr = prev.next;
        }

        // Return survivor's value
        return curr.value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = josephus(n, k);
            System.out.printf("Case %d: %d%n", i, m);
        }
        sc.close();
    }
}
