class instancevarible{
    int a = 10;
    int b = 20;
    void add(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        instancevarible t = new instancevarible();
        System.out.println(t.a+t.b);
        t.add();
    }
}