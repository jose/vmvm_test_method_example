package uw.edu;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestEnumXY {

  private EnumXY xy;

  public TestEnumXY(EnumXY xy) {
    this.xy = xy;
  }

  @Parameters
  public static Collection<Object[]> data() {
    final EnumXY[] enums = EnumXY.values();
    final Object[][] data = new EnumXY[enums.length][1];
    for (int i = 0; i < enums.length; i++) {
      data[i][0] = enums[i];
    }
    return Arrays.asList(data);
  }

  @Test
  public void test() {
    if (this.xy == EnumXY.X) {
      System.out.println("x == x");
    } else if (this.xy == EnumXY.Y) {
      System.out.println("y == y");
    } else {
      throw new RuntimeException("");
    }
  }
}
