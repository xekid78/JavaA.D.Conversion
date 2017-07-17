class Main {
  public static void main(String[] args) throws Exception {
    for(int seireki = 1926; seireki <= 1935; seireki++) {
      System.out.print("西暦" + seireki + "年は");
      int syowa = seireki - 1925;
      System.out.println("昭和" + syowa + "年です");
    }
  }
}
