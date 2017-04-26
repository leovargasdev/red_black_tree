class node{
    private int key;
    private String color;
    private node father;
    private node sonLeft;
    private node sonRight;

    public node(int k){
        this.sonLeft = null;
        this.sonRight = null;
        this.father = null;
        this.key = k;
        this.color = "red";
    }
    /*           Getters          */
    public int getKey(){
        return this.key;
    }
    public String getColor(){
        return this.color;
    }
    public node getFather(){
        return this.father;
    }
    public node getSonRight(){
        return this.sonRight;
    }
    public node getSonLeft(){
        return this.sonLeft;
    }
    public node getGrandma(){
        return this.getFather().getFather();
    }
    public node getUncle(){
        if(this.getGrandma() != null){
            if(this.getFather() == this.getGrandma().sonLeft)
                return this.getGrandma().sonRight;
            else
                return this.getGrandma().sonLeft;
        }
        return null;
    }
    /*           Setters          */
    public void setColor(String c){
        this.color = c;
    }
    public void setFather(node f){
        this.father = f;
    }
    public void setSonLeft(node s){
        this.sonLeft = s;
    }
    public void setSonRight(node s){
        this.sonRight = s;
    }
}
