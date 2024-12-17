/**
 * Node for a tree, holds a number and
 * two other nodes
 */
public class Node
{
    private int data;   //data added to list
    private Node left, right;   //child nodes

    public Node(int data)
    {
        this.data = data;
        //automatically set children to null
        left = null;
        right = null;
    }

    public int getData()
    {
        return data;
    }

    public Node getLeft()
    {
        return left;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight(Node newRight)
    {
        right = newRight;
    }

    public void setLeft(Node newLeft)
    {
        left = newLeft;
    }
}
