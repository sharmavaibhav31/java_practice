

class Factorial{
    int fact(int n){
        int result;
        if(n==1 || n==0){
            return 1;
        }
        result = n*fact(n-1);
        return result;
    }
}


class recursion {
    public static void main(String[] args){
        Factorial f = new Factorial();
        System.out.println("Factorial of 5 is: "+ f.fact(5));
        System.out.println("Factorial of 5 is: "+ f.fact(9));
    }
}
