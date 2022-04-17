class planet{
    String name;
    double dist;
    double relativeG;
    void setInfo(String x,double y,double z){
        name=x;
        dist=y;
        relativeG=z;

    }
    void getInfo(){
        System.out.println(name);
        System.out.println(dist);
        System.out.println(relativeG);
    }

}

public class PlanetClass {
    public static void main(String[] args){
        planet p1=new planet();
        planet p2=new planet();
        p1.setInfo("earth",78346768724.76647 , 9.8);
        p1.getInfo();
        p2.setInfo( "mars", 76476357969536.764587 , 3.675);
        p2.getInfo();
    }
}
