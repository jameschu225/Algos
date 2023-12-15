
public class SLL {
    
    private Node head;
    
    public SLL(){
        this.head =null;
    }
    
    public class Node {
        
        private Integer data;
        private Node next;
        
        public Node(Integer value){
            this.data = value;
            this.next = null;
        } 
    }
        
    public SLL addFront( Integer value){
        Node new_node = new Node(value);
        if (this.head==null){
            this.head = new_node;
            return this;
        } else {
            new_node.next = this.head;
            head = new_node;
            return this;
        }
    } 
    
    public SLL removeFront(){
        if (this.head==null){
            return null;
        } else {
            this.head = this.head.next;
            return this;
        }
    }

    public Integer readFront(){
        if (this.head==null){
            System.out.println("No SLL to check");
            return null;
        } else {
            return this.head.data;
        }
    }
    
    public boolean contain(Integer checkValue){
        Node pointer=this.head;
        if (this.head==null){
            System.out.println("No SLL to check");
            return false;
        } else {
            while (pointer!=null){
                if (pointer.data.equals(checkValue)){
                    return true;
                } else {
                    pointer = pointer.next;
                }
            }
            return false;
        }
    }

    public Integer length(){
        Node pointer=this.head;
        Integer length =0;
        if (this.head==null){
            System.out.println("No SLL to check");
            return null;
        } else {
            while (pointer!=null){
                pointer = pointer.next;
                length ++;
                }
            return length;
        }
    }

    public String display(){
        Node pointer=this.head;
        String sll="";
        if (this.head==null){
            System.out.println("No SLL to check");
            return null;
        } else {
            while (pointer!=null){
                sll += Integer.toString(pointer.data) + ", ";
                pointer = pointer.next;
            }
            return sll;
        }
    }

    public Integer max(){
        Node pointer=this.head;
        Integer max = this.head.data;
        if (this.head==null){
            System.out.println("No SLL to check");
            return null;
        } else {
            while (pointer!=null){
                if (pointer.data >= max){
                    max = pointer.data;
                    pointer = pointer.next;
                } else {
                pointer = pointer.next;
                }
            }
            return max;
        }
    }

    public Integer min(){
        Node pointer=this.head;
        Integer min = this.head.data;
        if (this.head==null){
            System.out.println("No SLL to check");
            return null;
        } else {
            while (pointer!=null){
                if (pointer.data <= min){
                    min = pointer.data;
                    pointer = pointer.next;
                } else {
                pointer = pointer.next;
                }
            }
            return min;
        }
    }

    public Double avg(){
        Node pointer=this.head;
        Double count=(double) 0;
        Double sum=(double) 0;
        Double avg = (double) 0;
        if (this.head==null){
            System.out.println("No SLL to check");
            return null;
        } else {
            while (pointer!=null){
                    sum += pointer.data;
                    count++;
                    pointer = pointer.next;
                }
            }
            avg = sum/count;
            return avg.doubleValue();
        }
}
