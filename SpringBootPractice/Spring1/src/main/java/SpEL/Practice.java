package SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Practice {

    @Value("#{22+11}")
    private int x;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private int y;
    @Value("#{4>5?4:5}")
    private int z;

    @Value("#{new java.lang.String('Zulfiqar')}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
