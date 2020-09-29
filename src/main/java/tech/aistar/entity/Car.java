package tech.aistar.entity;

/**
 * 本类用来演示:
 *
 * @author: cxylk
 * @date: 2020/9/27 11:14 上午
 */
public class Car {
    private Integer id;

    private String carName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", carName='").append(carName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
