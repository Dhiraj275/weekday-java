class DataType {
    public static void main(String args[]) {

        char a = 'G';
        int i = 89;
        double d = 4.355453532;
        float f = 4.7333434f;
        long l = 12121;
        boolean val1, val2;
        System.out.println("Boolean Type in Java");
        val1 = true;
        if (val1)
            System.out.println("This is true and will get displayed!");
        val2 = false;
        if (val2)
            System.out.println("This is false and won't get displayed!");

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}