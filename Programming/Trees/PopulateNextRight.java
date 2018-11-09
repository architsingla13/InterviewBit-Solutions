package Trees;

/**
 * Author - archit.s
 * Date - 09/11/18
 * Time - 4:13 PM
 */
public class PopulateNextRight {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }

    public TreeLinkNode getNext(TreeLinkNode p){

        TreeLinkNode temp = p.next;

        while(temp!=null){
            if(temp.left!=null){
                return temp.left;
            }
            else if(temp.right!=null){
                return temp.right;
            }
            temp = temp.next;
        }

        return null;
    }

    public void connect(TreeLinkNode A) {

        TreeLinkNode p = A;

        if(p == null){
            return;
        }
        p.next = null;

        while(p!=null){

            TreeLinkNode q = p;

            while(q!=null){

                if(q.left!=null){
                    if(q.right!=null){
                        q.left.next = q.right;
                    }
                    else{
                        q.left.next = getNext(q);
                    }
                }

                if(q.right!=null){
                    q.right.next = getNext(q);
                }

                q = q.next;
            }

            if(p.left!=null){
                p = p.left;
            }
            else if(p.right!=null){
                p = p.right;
            }
            else{
                p = getNext(p);
            }
        }
    }
}
