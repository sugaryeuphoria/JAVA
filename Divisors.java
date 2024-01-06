/*
Which integer between 1 and 10000 has the largest number of divisors, and how many
divisors does it have? Write a program to find the answers and print out the results. It is
possible that several integers in this range have the same, maximum number of divisors.
Your program only has to print out one of them.

You might need some hints about how to find a maximum value. The basic idea is
to go through all the integers, keeping track of the largest number of divisors that you’ve
seen so far. Also, keep track of the integer that had that number of divisors
 remainder ==0? 
*/
class Divisors {
    public static void main(String[] args) {
        int maxDivisors; 
        int numWithMax;
        maxDivisors = 1;
        numWithMax = 1;
        for(int i=2; i<=10000; i++){
            int divisorsCount = 0; 

            for(int d=1; d<=i; d++){
                if(i % d == 0){
                    divisorsCount++;
                }
            }

            if(divisorsCount > maxDivisors) {
                maxDivisors = divisorsCount;
                numWithMax = i;
            }
        }

        System.out.println("Among integers between 1 and 10000");
        System.out.println("The max number of divisors is "+ maxDivisors);
        System.out.println("A number with "+ maxDivisors + " divisors is "+ numWithMax);
    }
}