class main{
    public static void main(String [] args){
        tree t = new tree();
        t.insert(t.root, 15);
        t.insert(t.root, 16);
        t.insert(t.root, 10);
        t.insert(t.root, 1);
        t.insert(t.root, 5);
        t.prynt(t.root);
        //node as = t.findNode(t.root, 10);
    }
}
