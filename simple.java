public class Main{
    private String name;
    private int age;

    public Main(String na,int ag){
        this.name=na;
        this.age=ag;
    }
    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : " +age);
    }
    
    
    public static void main (String[] args) {
        Main obj1=new Main("Mugesh",19);
        System.out.println("Initial Information:");
        System.out.println("\nName: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
        obj1.display();
        System.out.println("\nUpdated Information:");
        
        obj1.setName("Kannan");
        obj1.setAge(20);
        obj1.display();
    }
}