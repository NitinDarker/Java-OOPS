class Classic {
    int a, b;
}

class Lab{
    public static void main(String args[]) {

        int x = 128;
        byte b = (byte)x;
        System.out.println(b);
        System.out.println(x);

        Classic ob = new Classic();
        boolean bb = ob instanceof Classic;
        System.out.println(bb);
        System.out.println(ob.getClass());
    }
    // instanceof
    // ob.getclass()
}