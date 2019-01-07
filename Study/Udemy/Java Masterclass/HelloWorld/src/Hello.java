public class Hello {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myNewTotal = 1000 - myTotal;

        System.out.println("My First Number = " + myFirstNumber);
        System.out.println("My Second Number = " + mySecondNumber);
        System.out.println("My Third Number = " + myThirdNumber);
        System.out.println("Hello World! Buddy");
        System.out.println("My Total = first + second + third = " + myTotal);
        System.out.println("My New Total = 1000 - My Total = " + myNewTotal);
    }
}