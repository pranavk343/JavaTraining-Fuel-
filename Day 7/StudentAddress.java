class Address{
    private int houseNum;
    private String areaName;
    private String city;

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class Student{
    private int id;
    private String name;
    private Address adr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdr() {
        return adr;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
 
   }
   
}


public class StudentAddress {
    public static void main(String[] args){
        Address ad = new Address();
        ad.setHouseNum(1);
        ad.setAreaName("ShivajiNagar");
        ad.setCity("Aurangabad");
        Student st =new Student();
        int x = 1001;
        st.setId(x);
        st.setName("Pranav");
        st.setAdr(ad);
        int id1 = st.getId();
        String n = st.getName();
        Address adr1 = st.getAdr();
        int n1  = adr1.getHouseNum();
        String ar = adr1.getAreaName();
        String c = adr1.getCity();
        System.out.println("Name : "+n);
        System.out.println("Id : "+id1);
        System.out.println("Address " + n1 + " "+ ar + " "+ c);
    }
}
