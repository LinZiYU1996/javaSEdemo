package BlogForJDK8;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 手机类（作为模型）
 * @Date: Create in 10:15 2019/4/28
 */
public class Phone {

    private final String version; //手机型号

    private final String manufacturer; //制造厂商

    private final int price; //价格

    private final boolean isSupport5G; //是否支持5G

    private final Type type;  //手机目标人群

    public Phone(String version, String manufacturer, int price, boolean isSupport5G, Type type) {
        this.version = version;
        this.manufacturer = manufacturer;
        this.price = price;
        this.isSupport5G = isSupport5G;
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSupport5G() {
        return isSupport5G;
    }

    public Type getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    //手机适合的人群类型
    public enum Type{
        BUSINESSMAN, //商务人士

        TEENAGES,  //青年

        OLDPEOPLE,  //老年人

        PUBLICPEOPLE,  //大众
    }

}
