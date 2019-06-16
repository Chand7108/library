import java.util.*;

class DetectLoop
{
	private static Node head;
	public static void main(String[] args)
	{
		Random rand = new Random();
		System.out.println("Using Hashing");
		DetectLoop ll = new DetectLoop();
		for(int i = 0;i < 5; i++)
			ll.addList(rand.nextInt(100));

	}
	static void addList(int item)
	{
		if(head == null)
		{
			head = new Node(item);
			return;
		}
		else
		{
			Node temp = head;
			while(temp.next!= null)
				temp = temp.next;
			temp.next = new Node(item);
		}
	}
	static boolean detectLoop(Node n)
	{
		HashSet<Node> set = new HashSet<Node>();
		while(n!= null)
		{
			if(n.contains(h))
				return true;
			s.add(h);
			h = h.next;
		}
		return false;
	}
}
/*class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		next = null;
	}
} */