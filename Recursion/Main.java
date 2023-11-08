class Main {
    public static void main(String[] args) {
        Recursion recur = new Recursion();
        System.out.println(recur.sum(1, 10));
    }
}

class Recursion {

    /*
    public int sum(int num) {
        if(num > 0) {
            return num + sum(num - 1);
        }else {
            return 0;
        }
    }
    */

    public int sum(int start, int end) {
        if(end > start) {
            return end + sum(start, end - 1);
        }else {
            return end;
        }
    }
}