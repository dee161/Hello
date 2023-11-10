class StaticBlock {
    static {
        System.out.println("static block...");
    }
    static {
        System.out.println("static block 2...");
    }
    void show() {
        System.out.println("show method...");
    }
    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.show();
    }
     static {
        System.out.println("static block main...");
    }
}


