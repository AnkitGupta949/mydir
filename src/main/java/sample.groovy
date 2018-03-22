class sample {
    private int x
    private String name


    int getX(){
        return x
    }
}

class result{
    public static void main(String[] args) {
        def s=new sample(x:10,name: "ankit")
        printf " ${s.name}  ${s.x}"
    }
}
