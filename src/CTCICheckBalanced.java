public class CTCICheckBalanced {
    public static void main(String[] args) {
        try{
            CTCICheckBalanced obj = new CTCICheckBalanced();
            obj.run(args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(String[] args){
        //Creating dataset(Tree)
        Node node = new Node(14);
        node.leftNode = new Node(6);
        node.leftNode.leftNode = new Node(3);
        node.leftNode.leftNode.leftNode = new Node(1);
        node.leftNode.leftNode.rightNode = new Node(5);
        node.leftNode.rightNode = new Node(8);
        node.leftNode.rightNode.leftNode = new Node(7);
        node.leftNode.rightNode.rightNode = new Node(11);
        node.rightNode = new Node(21);
        node.rightNode.leftNode = new Node(18);
        node.rightNode.rightNode = new Node(25);
        node.rightNode.leftNode.leftNode = new Node(15);
        node.rightNode.leftNode.rightNode = new Node(19);
        node.rightNode.rightNode.leftNode = new Node(24);
        node.rightNode.rightNode.rightNode = new Node(27);
        //Gets Value
        boolean val = isBalancedBoolean(node);
        //Prints value
        System.out.println(val);
    }
    //Converts the result of isBalanced() to a boolean
    public boolean isBalancedBoolean(Node curr){
        if(isBalanced(curr) == -1){
            return false;
        }
        return true;
    }
    //Calculates if a tree is balanced,return -1 if it is unbalanced
    public int isBalanced(Node curr){
        int leftSideNodes = 0;
        int rightSideNodes = 0;
        if(curr.leftNode == null && curr.rightNode == null){
            return 1;
        }
        if(curr.leftNode != null){
            leftSideNodes = isBalanced(curr.leftNode);
        }
        if(curr.rightNode != null){
            rightSideNodes = isBalanced(curr.rightNode);
        }
        if(leftSideNodes != rightSideNodes){
            return -1;
        }
        return leftSideNodes+rightSideNodes+1;
    }
}
class Node {
    public int num;
    public Node leftNode;
    public Node rightNode;
    public Node(){}
    public Node(int num){
        this.num = num;
    }
    public Node(int num,Node leftNode,Node rightNode){
        this.num = num;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}