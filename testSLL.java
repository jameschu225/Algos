public class testSLL {
    
    public static void main(String[] args){

        SLL sll1 = new SLL();
        // sll1.addFront(18);
        // sll1.addFront(131);
        // // sll1.removeFront();
        // System.out.println(sll1.readFront());
        // System.out.println(sll1.contain(3));
        // System.out.println(sll1.length());

        sll1.addFront(76);
        sll1.addFront(2);
        System.out.println(sll1.display());
        sll1.addFront(11);
        System.out.println(sll1.display());
        System.out.println(sll1.max());
        System.out.println(sll1.min());
        System.out.println(sll1.avg());

    }
}
