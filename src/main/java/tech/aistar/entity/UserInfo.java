package tech.aistar.entity;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/27 13:56
 */
public class UserInfo {
    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserInfo{");
        sb.append("info='").append(info).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
