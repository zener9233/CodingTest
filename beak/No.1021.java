import java.util.*;

public class Main{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = 0; // 연산 수
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int target = targets[i];

            while (true) {
                int idx = queue.indexOf(target);
                if (idx == 0) {
                    queue.remove(idx);
                    break;
                }

                else if (idx <= queue.size() / 2) {
                    queue.addLast(queue.removeFirst());
                    count++;
                }
                else {
                    queue.addFirst(queue.removeLast());
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
