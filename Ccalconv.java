/**
 *
 * @author xekid78
 *
 */
public class Ccalconv {
	public static void main(String[] args) {
		int seireki, syowa;
		for(seireki = 1926; seireki <= 1935; seireki++) {
			System.out.print("西暦" + seireki + "年は");
			syowa = seireki - 1925;
			System.out.println("昭和" + syowa + "年です");
		}
	}
}
