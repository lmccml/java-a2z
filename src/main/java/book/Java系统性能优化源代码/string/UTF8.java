package book.Java系统性能优化源代码.string;

/**
 * 一个UTF8
 */
public class UTF8 {
  public static void main(String[] args) throws Exception{
    String a = "汉";
    byte[] cs = a.getBytes("UTF-8");
    for(byte b:cs){
      System.out.println(Integer.toHexString(b));
    }
    System.out.println(cs.length);
  }
}
