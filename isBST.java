

static boolean isBST(Node root, int min, int max){
        
        if(root == null)    return true;
        
        if(root.data < min || root.data >= max) return false;   // root.data > max if BST can have duplicate values 
        
        return isBST(root.left,min,root.data) && isBST(root.right,root.data+1,max);
        
    }
    boolean checkBST(Node root) {
        
        return isBST(root,Integer.MIN_VALUE(),Integer.MAX_VALUE());
    }
