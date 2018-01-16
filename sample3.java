/**
 *
 * @author xekid78
 *
 */
public class sample3 {
  
  public static void main(String[] args) {
    for(int seireki = 1926; seireki <= 1935; seireki++) {
      System.out.print("西暦" + seireki + "年は");
      int syowa = seireki - 1925;
      System.out.println("昭和" + syowa + "年です");
    }
  }
}
