public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(){

    }
    public Animal(String name ){
        this.name=name;
    }
    public Animal( String family, String name, int age, boolean isMammal){
    this.family=family;
    this.name=name;
    this.age=age;
    this.isMammal=isMammal;
    }
    @Override
    public String toString(){
        String s="";
        s+="family"+family;
        s+="name"+name;
        return s;
    }


}
