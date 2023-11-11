class Node {
    int data;
    Node rhs, lhs;
    public Node(int data) {
        this.data = data;
        rhs = lhs = null;
    }
}

class BinaryTree {
    Node root;
    public BinaryTree() { root = null; }
    public BinaryTree(int data) { root = new Node(data);};

    public void InOrder(Node root) {
        Node curr = root;
        
        //遞迴到Leaf Node就停止。return讓Leaf Node做接下的Operation
        if(curr == null) { return; }

        //不斷往左節點遞迴
        InOrder(curr.lhs);

        //遞迴到Leaf Node(Inorder()接收到return，停止遞迴)後，print出來
        System.out.println(curr.data + " ");
        
        //處理完左節點和自節點後，遞迴右節點
        InOrder(curr.rhs);
    }

    public void PreOrder(Node root) {
        Node curr = root;
        if(curr == null) { return; }
        System.out.println(curr.data);
        PreOrder(curr.lhs);
        PreOrder(curr.rhs);
    }

    public void PostOrder(Node root) {
        Node curr = root;
        if(curr == null) {
            return;
        }
        System.out.println(curr.data);
        PostOrder(curr.lhs);
        PostOrder(curr.rhs);
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        Node curr = root;
        if(root == null) { 
            root = newNode; 
            return;
        }
        while(true) {
            if(isPerfect(curr)) {
                
            }
        }
    }

    public boolean isPerfect(Node node) {
        if(node.rhs == null && node.lhs == null || node.rhs != null && node.lhs != null) {
            return true;
        }else { return false; }
    }
}

class Main {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = new Node(1);
        bTree.root.lhs = new Node(2);
        bTree.root.rhs = new Node(3);
        bTree.root.lhs.lhs = new Node(4);
        bTree.root.lhs.rhs = new Node(5);
        bTree.root.rhs.lhs = new Node(6);
        bTree.root.rhs.rhs = new Node(7);

        //bTree.InOrder(bTree.root);
        bTree.PreOrder(bTree.root);
        //bTree.PostOrder(bTree.root);
    }
}
