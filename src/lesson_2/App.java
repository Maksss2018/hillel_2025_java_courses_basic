void main(){
    long l = 259;
    short s = (short)l;
    byte b = (byte)l;
    System.out.println("long: "+l);
    System.out.println("short: "+s);
    System.out.println("byte: "+b);

    //float
    float f = 1.45f;
    double d = 1656565464.4566565656565;
    System.out.println("float: "+f);
    System.out.println("double: "+b);
    //char
    char c = '!';
    char newLine = '\n';
    System.out.print("char: "+newLine+c);
    System.out.print(newLine+c);
    System.out.print(String.valueOf(newLine)+c);
}