import java.util.*;
class Queue
{
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	Queue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	
