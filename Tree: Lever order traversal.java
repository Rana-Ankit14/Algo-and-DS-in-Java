public static void levelOrder(Node root) {
        if(root == null){
            return;
        }
        
        Queue<Node> nodes=new LinkedList<>();
        Node curr=root;
        nodes.add(curr);
        while(!nodes.isEmpty()){
            curr=nodes.remove();
            if(curr.left!=null){
                nodes.add(curr.left);
            }
            if(curr.right!=null){
                nodes.add(curr.right);
            }

            System.out.print(curr.data+" ");
        }

      
    }
