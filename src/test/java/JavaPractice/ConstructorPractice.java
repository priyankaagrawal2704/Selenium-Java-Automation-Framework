package JavaPractice;


class employee{
    int id;
    String name;
    employee(int i,String n)
    {

        id=i;
        name=n;
    }
    public static void main(String[] args)
    {
        employee e=new employee(101,"priyanka");
        System.out.print(e.id);
        System.out.println(e.name);

    }

}

