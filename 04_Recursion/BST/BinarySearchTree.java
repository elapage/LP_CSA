public class BinarySearchTree
{
    private Node root;

    public BinarySearchTree()
    {
        root = null;
    }

    /**
     * Dummy method called by driver
     * @param data
     */
    public void add(int data)
    {
        Node newNode = new Node(data);
        //is my tree empty?
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            //recursive add
            add(newNode, root);
        }
    }


    private void add(Node newNode, Node currNode)
    {
        //compare the new data to the current data
        //to determine the direction
        if (newNode.getData() < currNode.getData())
        {
            //data is smaller, so check if left node is occupied
            if (currNode.getLeft() == null)  //empty
            {
                currNode.setLeft(newNode);
            }
            else
            {
                add(newNode, currNode.getLeft());
            }
        }
        else if(newNode.getData() > currNode.getData())
        {
            //data is larger, check if right node is occupied
            if(currNode.getRight() == null)
            {
                currNode.setRight(newNode);
            }
            else
            {
                add(newNode, currNode.getRight());
            }
        }
    }


    /**
     * Dummy method called by driver/client
     */
    public void print()
    {
        if(root != null)
        {
            print(root);
        }
    }

    /**
     * Recurisve method
     * @param current
     */
    private void print(Node current)
    {
        if(current.getLeft() != null)
        {
            print(current.getLeft());
        }

        //print this node
        System.out.print(current.getData() + " ");

        if(current.getRight() != null)
        {
            print(current.getRight());
        }

    }

}
