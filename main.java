import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        tree t = new tree();
        t.insert(t.root, 15);
        t.insert(t.root, 16);
        t.insert(t.root, 10);
        t.insert(t.root, 1);
        t.insert(t.root, 5);
        t.insert(t.root, 14);
        t.insert(t.root, 20);
        int findKey = s.nextInt();
        t.findNode(t.root, findKey);
        if(t.find != null)
            System.out.println("achou: " + t.find.getKey() + ", cor: " + t.find.getColor());
        node uncle = t.find.getUncle();
        if(uncle == null)
            System.out.println("não existe tio");
        else
            System.out.println("seu tio eh: " + uncle.getKey());
    }
}
