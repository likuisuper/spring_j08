package tech.aistar.entity;
import java.util.Date;

public class Pet {

  private Integer id;
  private String name;
  private Integer age;
  private Date birthday;
  private String imgUrl;
  private Integer petTypeId;


  public long getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public long getPetTypeId() {
    return petTypeId;
  }

  public void setPetTypeId(Integer petTypeId) {
    this.petTypeId = petTypeId;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Pet{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", age=").append(age);
    sb.append(", birthday=").append(birthday);
    sb.append(", imgUrl='").append(imgUrl).append('\'');
    sb.append(", petTypeId=").append(petTypeId);
    sb.append('}');
    return sb.toString();
  }
}
