import java.util.Scanner;

public class stackUsingLinkedList {

    public class link{
        int value;
        link next;
        link prevMax;
        link(int n){
            this.value=n;
            this.next=null;
            this.prevMax=null;
        }
        private void display(){
            System.out.println(this.value+"     "+this.next);
        }
    }

    link firstLink=null;
    link max=null;

    private void push(int n){

        link newNode=new link(n);
        if(firstLink==null){
            firstLink=newNode;
            max=firstLink;
        }

        else{
            newNode.next=firstLink;

            if(newNode.value>max.value){
                newNode.prevMax=max;
                max=newNode;
            }
            firstLink=newNode;
        }

    }

    private void display(){
        link current=firstLink;
        while(current!=null){
            current.display();
            current=current.next;
        }

    }


    private int peak(){
        return firstLink.value;
    }

    private int pop(){
        int x=firstLink.value;
        if(firstLink==max){
            max=max.prevMax;
        }
        firstLink=firstLink.next;
        return x;
    }

    private int maximum(){
        return max.value;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter n");
        //int n=sc.nextInt();
        stackUsingLinkedList stack=new stackUsingLinkedList();
        stack.push(5);
        stack.push(7);
        stack.push(84);
        stack.push(35);
        stack.push(91);
        stack.display();
        System.out.println("max=    "+stack.maximum());
        System.out.println("peak=    "+stack.peak());
        System.out.println("pop=    "+stack.pop());
        System.out.println("max=    "+stack.maximum());
        System.out.println("pop=    "+stack.pop());
        System.out.println("max=    "+stack.maximum());
        stack.display();
    }

}
