class Test<T> {
    T obj;

    public Test(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void printObj() {
        System.out.println(obj);
    }
}



public class Generics {
    public static void main(String[] args) {
        Test<Integer> test1 = new Test<Integer>(15);
        Test<String> test2 = new Test<String>("Hello");
        
        test1.printObj();
        test2.printObj();
    }
}