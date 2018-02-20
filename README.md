# JavaChristianCalendarConversion
西暦から和暦を割り出す

## 処理
昭和元年から10年までの西暦和暦変換を行います

## コード
```
public class sample3 {
  public static void main(String[] args) {
    for(int seireki = 1926; seireki <= 1935; seireki++) {
      System.out.print("西暦" + seireki + "年は");
      int syowa = seireki - 1925;
      System.out.println("昭和" + syowa + "年です");
    }
  }
}
```

## 出力結果
西暦1926年は昭和1年です  
西暦1927年は昭和2年です  
西暦1928年は昭和3年です  
西暦1929年は昭和4年です  
西暦1930年は昭和5年です  
西暦1931年は昭和6年です  
西暦1932年は昭和7年です  
西暦1933年は昭和8年です  
西暦1934年は昭和9年です  
西暦1935年は昭和10年です

## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE)： | Eclipse 4.7.0 Oxygen |
| 開発言語： | Java8 |
