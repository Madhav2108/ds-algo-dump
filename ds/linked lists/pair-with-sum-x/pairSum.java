/**
 * Complexity: O(n^2)
 * Very Slow Algorithm
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class count_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            Integer arr1[] = new Integer[n1];
            for (int i = 0; i < n1; i++)
                arr1[i] = sc.nextInt();
            int n2 = sc.nextInt();
            Integer arr2[] = new Integer[n2];
            for (int i = 0; i < n2; i++)
                arr2[i] = sc.nextInt();
            LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
            LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));
            int x = sc.nextInt();
            System.out.println(Count.countPairs(head1, head2, x));
        }
        sc.close();
    }
}

class Count {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        int c=0;
        for(int i:head1){
            Iterator<Integer> itr2 = head2.iterator();
            while(itr2.hasNext()){
                if(i==(x-(Integer)itr2.next()))
                    c++;
            }
        }
        return c;
    }
}