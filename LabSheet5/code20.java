package LabSheet5;

// 20. Use an interface to achieve multiple inheritance in Java
interface X{
    void methodX();
}
interface Y{
    void methodY();
}
class MultipleInheritanceImpl implements X, Y{
    public void methodX(){
        System.out.println("Method from interface X");
    }
    public void methodY(){
        System.out.println("Method from interface Y");
    }
}

public class code20 {
    public static void main(String[] args) {
        MultipleInheritanceImpl obj = new MultipleInheritanceImpl();
        obj.methodX();
        obj.methodY();
    }
}

