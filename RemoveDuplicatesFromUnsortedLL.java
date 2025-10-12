/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    // public Node removeDuplicates(Node head) {
    //     if(head==null)
    //      return head;
    //   HashMap<Integer,Integer> hs = new HashMap<>();
    //   Node temp  = head;
    //   while(temp!=null)
    //   {
    //       hs.put(temp.data,hs.getOrDefault(temp.data,0)+1);
    //       temp = temp.next;
    //   }
    //   temp = head;
    //   Node prev = null;
    //   while(temp!=null)
    //   {
    //       if(hs.get(temp.data)>=2)
    //       {
    //           prev.next = temp.next;
    //           hs.put(temp.data,hs.getOrDefault(temp.data,0)-1);
    //       }
    //       else
    //       {
    //       prev = temp;
    //       }
    //       temp = temp.next;
       
    //   }
    //   return head;
    // }
    if(head==null)
     return head;
    HashSet<Integer> hashSet = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {
          
            if (hashSet.contains(curr.data)) {

                prev.next = curr.next;
            } else {
              
             
                hashSet.add(curr.data);
                prev = curr;
            }
			curr = curr.next;
        }
        return head;
    }
}
