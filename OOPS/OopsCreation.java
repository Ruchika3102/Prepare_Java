public class OopsCreation {
    public static class Student{       //Student is name of class
        String name;
        int age;
        float percentage;
    }
    public static void main(String [] args){           // classname objectname=new classname();
        Student s1=new Student();                    //we make cobject like we make user defined datatype of class name and by this line
        s1.name="Ruchika";
        s1.age=19;
        s1.percentage=91.5f;
        System.out.println("Name: "+s1.name+"\nAge: "+s1.age+"\nPercentage: "+s1.percentage);
        System.out.println();
        						// s1 and s2 are objects of class
        Student s2=new Student();                       
        s2.name="Prerika";
        s2.age=19;
        s2.percentage=89.0f;

        System.out.println("Name: "+s2.name+"\nAge: "+s2.age+"\nPercentage: "+s2.percentage);
    }
}


