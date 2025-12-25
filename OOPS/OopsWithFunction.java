public class OopsWithFunction {
    public static class Student{       //Student is name of class
        String name;
        int age;
        float percentage;
    }
    public static void function_name(Student s){
         System.out.println("Name: "+s.name+"\nAge: "+s.age+"\nPercentage: "+s.percentage);
    }
    public static void main(String [] args){           // classname objectname=new classname();
        Student s1=new Student();                    //we make class like we make user defined datatype of class name and by this line
        s1.name="Ruchika";
        s1.age=19;
        s1.percentage=91.5f;
        
        						// s1 and s2 are objects of class
        Student s2=new Student();                       
        s2.name="Prerika";
        s2.age=19;
        s2.percentage=89.0f;

        function_name(s1);
        function_name(s2);
    }
}


//jh mai eh class function main de andar lani aw tah v shi chlda bs public static nhi lande hunde tad but eh problem odo krda sirf jad functions ch apply krni hon values 
//functions ch apply aise krte hai values jaise uppr code hai
//classes are passed by refrence in functions so eh actual value ch change krda like below code

public class OopsWithFunction {
    public static class Student{       //Student is name of class
        String name;
    }
    public static void function_name(Student s){
         s.name="Changed Name";
    }
    public static void main(String [] args){          
        Student s1=new Student();                    
        s1.name="Ruchika";
        System.out.println("Before Function Call: "+s1.name);
        
        function_name(s1);
        System.out.println("After Function Call: "+s1.name);

    }
}
