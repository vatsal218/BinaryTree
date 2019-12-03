package Tree;

public class BinaryTree {
    private class AVLNode
    {
        private int height;
        private int value;
        private AVLNode leftchild;
        private AVLNode rightchild;

        public AVLNode(int value) {
            this.value=value;

        }

    }
    private AVLNode root;

    public void insert(int value) {
        root = insert(root,value);
    }
    private AVLNode insert(AVLNode root, int value) {
        if (root==null)
            return new AVLNode(value);

        if (value < root.value)
            root.leftchild = insert(root.leftchild, value);
        else
            root.rightchild = insert(root.rightchild, value);
        root.height= Math.max(height(root.leftchild), height(root.rightchild))+1;

        return root;
    }


    private int height(AVLNode node){
        return (node==null)? -1 : node.height;
    }


    public static void main(String[]args) {
        var tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
    }
}


