class PrintSubset {
  static void print(String op, String ip) {
    if(ip.length() == 0) {
      System.out.println(op);
      return;
    }
    String op1 = op;
    String op2 = op + ip.charAt(0);
    ip = ip.substring(1);
    print(op1, ip);
    print(op2, ip);
    return;
  }
  public static void main(String[] args) {
    System.out.println("Printing subsets");
    String s = "ab";
    String op = "";
    print(op, s);
  }
}
