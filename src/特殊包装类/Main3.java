package 特殊包装类;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main3 {
    public static void main(String[] args) {
         /*我们接着来看第二种，前面我们说了，
    浮点类型精度有限，对于需要精确计算的场景，
    就没办法了，而BigDecimal可以实现小数的精确计算*/

        BigDecimal i =BigDecimal.valueOf(10);
        i = i.divide(BigDecimal.valueOf(3), 100, RoundingMode.HALF_UP);
        //计算10/3的结果，精确到小数点后100位
        //RoundingMode是舍入模式，就是精确到最后一位时，该怎么处理，这里CEILING表示向上取整
        //FLOOR是向下取整,HALF_UP是四舍五入

    }
}
