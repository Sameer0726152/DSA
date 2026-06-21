class Node
{
    constructor(data)
    {
        this.data = data;
        this.next = null;
    }
}

let Node1 = new Node(10);
let Node2 = new Node(20);
let Node3 = new Node(30);

Node1.next = Node2;
Node2.next = Node3;

let current = Node1;
while(current !== null)
{
    console.log(current.data);
    current = current.next;
}
