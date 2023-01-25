package bstbinarysearchtree;
class BinarySearchTree {
    private Node root;
    // 搜尋要刪除節點
    public Node search(int val) {
        if(root==null) return null;
        else return root.search(val);
    }
    // 搜尋父節點
    public Node searchParent(int val) {
        if(root==null) return null;
        else return root.searchParent(val);
    }
    // 刪除節點
    public void deleteNode(int val) {
        if(root==null) return;
        else {
            // 找到要刪除的節點
            Node targetNode=search(val);
            if(targetNode==null) return;
            if(root.left==null && root.right == null) {
                root=null;
                return;
            }
            // 找到要刪除節點的父節點
            Node parent=searchParent(val);
            // 葉節點
            if(targetNode.left==null&&targetNode.right==null) {
                // 判斷左、右節點
                if(parent.left!=null&&parent.left.val==val) {
                    parent.left=null;
                } else if(parent.right!=null&&parent.right.val==val) {
                    parent.right=null;
                }
            }
        }
    }

    // 添加節點
    public void add(Node node) {
        if(root==null) {
            root=node;
        } else {
            root.add(node);
        }
    }
    
    // 前序
    public void preOrder() {
        if(root!=null) root.preOrder();
    }

    // 中序
    public void inOrder() {
        if(root!=null) root.inOrder();
    }
    
    // 後序
    public void postOrder() {
        if(root!=null) root.postOrder();
    }
 }
// 創建節點
class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val=val;
    }

    public Node search(int val) {
        if(val==this.val) {
            return this;
        } else if(val<this.val) { // 小於，向左遞迴搜尋
            if(this.left==null) return null;
            return this.left.search(val);
        } else {
            if(this.right==null) return null;
            return this.right.search(val);
        }
    }

    public Node searchParent(int val) {
        if((this.left!=null&&this.left.val==val) || (this.right!=null&&this.right.val==val)) {
            return this;
        } else {
            if(val<this.val&&this.left!=null) {
                return this.left.searchParent(val); // 向左遞迴搜尋
            } else if(val>=this.val&&this.right!=null) {
                return this.right.searchParent(val); // 向右遞迴搜尋
            } else {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return "["+val+"]";
    }

    public void add(Node node) {
        if(node==null) return;
        if(node.val<this.val) {
            if(this.left==null) {
                this.left=node;
            } else { // 小於，遞迴向左添加
                this.left.add(node);
            }
        } else {
            if(this.right==null) {
                this.right=node;
            } else { // 大於，遞迴向右添加
                this.right.add(node);
            }
        }
    }

    // 前序
    public void preOrder() {
        System.out.print(this);
        if(this.left!=null) {
            this.left.preOrder();
        }
        if(this.right!=null) {
            this.right.preOrder();
        }
    }
    
    // 中序
    public void inOrder() {
        if(this.left!=null) {
            this.left.inOrder();
        }
        System.out.print(this);
        if(this.right!=null) {
            this.right.inOrder();
        }
    }
    
    // 後序
    public void postOrder() {
        if(this.left!=null) {
            this.left.postOrder();
        }
        if(this.right!=null) {
            this.right.postOrder();
        }
        System.out.print(this);
    }
}

public class BSTBinarySearchTree {
    public static void main(String[] args) {
        int arr[] = {6,3,4,7,5,1,9,2,8,10};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for(int i=0;i<arr.length;i++) {
            binarySearchTree.add(new Node(arr[i]));
        }

        System.out.println("中序：");
        binarySearchTree.inOrder();
        System.out.println("\n中序，刪除節點10：");
        binarySearchTree.deleteNode(10);
        binarySearchTree.inOrder();
        System.out.println("");
        
        System.out.println("\n前序，刪除節點10：");
        binarySearchTree.preOrder();
        System.out.println("");
        
        System.out.println("\n後序，刪除節點10：");
        binarySearchTree.postOrder();
    }
}