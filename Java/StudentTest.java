

/**
 * StudentTest
 */
public class StudentTest {
    public static void main(String[] args) {
        Student S1=new Student("Tom", "123456");
        S1.setSex("male");
        System.out.println(S1.toString());
    }
}

/**
 * Student
 */
class Student {
    private String sex="";
    private String birthday="";
    private String speciality="";
    private String address="";
    private String name="";
    private String number="";

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
        
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
       String information="姓名:"+name+" 学号:"+number;
       if (!address.equals("")) {
           information+=" 住址:"+address;
       }
       if (!birthday.equals("")) {
           information+=" 生日:"+birthday;
       }
       if (!speciality.equals("")) {
           information+=" 专业:"+speciality;
       }
       if (!sex.equals("")) {
           information+=" 性别:"+sex;
       }
       return information;
    }
    
   
    
}