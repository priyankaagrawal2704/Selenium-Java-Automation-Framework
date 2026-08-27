package JavaPractice;

public class Encapsulation {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

public static void main(String[] args)
{
    Encapsulation e=new Encapsulation();
    e.setId(102);
    e.setName("Priya");
    System.out.print("Id: " +e.getId());
    System.out.print("Name: "+ e.getName());

}

}
