public class Department extends OrganizationComponent{

  public Department(String name, String des) {
    super(name, des);
  }

  @Override
  public String getDes() {
    return super.getDes();
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void print() {
    System.out.println(getName()+"的简介:"+getDes());
  }
}
