

public class palindromSayiBul { //iki taraftan okuyunca da aynı sayı. 1,4,99,101,363,4114,9889.

    static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(11011));

    }
}
