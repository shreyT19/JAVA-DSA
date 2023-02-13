package Lect37OOPS;

public class Student {
    private String name1 ="Shreyansh";
    private int age1 =20;

    public Student(String name, int age){
        this.age1=age1;
        this.name1=name1;
    }
//First Method ExceptionHandling

//    public void setAge1(int age1) throws Exception {
//        if(age1<0){
//            throw new Exception("Sun be pagal hai kya agE -ve nhi hota");
//        }
//        this.age1 = age1;
//    }

    //Second Method Exception Handling

    public void setAge1(int age1) {
        try {
            if (age1 < 0) {
                throw new Exception("Sun be pagal hai kya agE -ve nhi hota");
            }
        }
        catch (Exception e){
            System.out.println(e);
          //  e.printStackTrace();
        }
        finally {
            System.out.println("phack u");
        }
        this.age1 = age1;
    }


    public int getAge1() {
        return age1;
    }
    public void setName1(String name1){
        this.name1=name1;
    }

    public String getName1() {
        return name1;
    }
}
