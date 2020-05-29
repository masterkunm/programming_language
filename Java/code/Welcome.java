/**
 * This is the first Java program
 * by "西行修真的伍师弟"
 * @ 28/05/2020
 */
public class Welcome
{
  public static void main(final String[] args) {
    final String[] greeting = new String[3];
    greeting[0] = "Welcom to Core Java";
    greeting[1] = "by '西行修真伍师弟'";
    greeting[2] = "@28/05/2020";

    // output
    for (final String g : greeting) {
      System.out.println(g);
    }
  }
}
