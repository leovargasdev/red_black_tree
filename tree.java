class tree{
    public node root;

    public tree(){
        this.root = null;
    }
    public void prynt(node n){
        if(n.getSonLeft() != null)
            prynt(n.getSonLeft());
        System.out.println(n.getKey());
        if(n.getSonRight() != null)
            prynt(n.getSonRight());
    }
    public node findNode(node n, int key){
        for(node k = n; k != null; k = k.getSonLeft()){
            if(k.getSonLeft() == null)
                for(node a = k; a != null; a = a.getSonRight())
                    if(a.getKey() == key)
                        return a;
            else
                if(k.getKey() == key)
                    return k;
        }
        return null;
    }
    public void insert(node a, int k){ //Na primeira interação "a" é a root;
        node n = new node(k);
        if(this.root ==  null){
            this.root = n;
            n.setFather(n);
            case1(n);
        } else if(k == a.getKey()){
            return;
        } else if(k > a.getKey()){ // se a chave for maior que o elemento testado, a inserção é na direita
            if(a.getSonRight() == null){ // se o "a" não tiver filho da direita, então "n" será seu novo filho.
                a.setSonRight(n); //
                n.setFather(a);
                case1(n);
            } else { // chama mais uma vez o metodo só que com o filho da direita.
                insert(a.getSonRight(), k);
            }
        } else { // k < a.getKey(), se a chave for maior que o elemento testado, a inserção é na esquerda
            if(a.getSonLeft() == null){ // se o "a" não tiver filho da direita, então "n" será seu novo filho.
                a.setSonLeft(n);
                n.setFather(a);
                case1(n);
            } else { // chama mais uma vez o metodo só que com o filho da esquerda.
                insert(a.getSonLeft(), k);
            }
        }
    }
    public void case1(node n) { // testa se o nodo é raiz, se for deve ser preto
        if(n == this.root)
            n.setColor("black");
        else
            case2(n);
    }
    public void case2(node n) { // testa se o pai do nodo é preto
        if(n.getFather().getColor() == "black")
            return;
        else
            case3(n);
    }
    public void case3(node n){
        node grandPa = n.getGrandma();
        node uncle = n.getUncle();
    }
    public void case4(node n){

    }
    public void case5(node n){

    }
}