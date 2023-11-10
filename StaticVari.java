class StaticVari {
    int x = 10;
    void show() {
        System.out.println("show method...");
    }
    public static void main(String[] args) {
        StaticVari sv = new StaticVari();
        System.out.println("main method..."+sv.x);
        sv.show();
    }    
}
