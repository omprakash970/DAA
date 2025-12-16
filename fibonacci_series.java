class fibonacci_series {

    public void printFibonacci_usingloops(int n){
        int a=0, b=1;
        System.out.println("Fibonacci Series using loops:");
        for(int i =0;i<n;i++){
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    
    }
    public void printFibonacci_usingrecursion(int n, int a, int b){
        if(n==0){
            return;
        }
        System.out.println(a);
        printFibonacci_usingrecursion(n-1, b, a+b);
    }

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        int n = 10; 
        fs.printFibonacci_usingloops(n);
        System.out.println("Fibonacci Series using recursion:");
        fs.printFibonacci_usingrecursion(n, 0, 1);
    }
}
    
