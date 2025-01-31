class Class {
    int a, b;
}

class Lab{
    public static void main(String args[]) {
        int x = 128;
        byte b = (byte)x;
        System.out.println(b);
        System.out.println(x);
        Class ob = new Class();
        boolean bb = ob instanceof Class;
        System.out.println(bb);
        int longvar = 5;
        switch (longvar) {
            case 'a':
                System.out.println("hi");
                break;
        
            default:
                break;
        }
    }
    // instanceof
    // ob.getclass()

}