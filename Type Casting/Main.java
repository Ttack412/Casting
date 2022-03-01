class Main {
  public static void main(String[] args) {
    // 1. See what happens with Mary.
    // Mary had 6 dollars 50 cents. She puts them all into a bank. But the bank only understands numbers as integers! What happens to the extra 50 cents?

    float deposit = 6.50f;

    int balance = 0;

    // We need to cast the float value to an int because the float value is a larger type than integer. Thus we need to manually convert it.
    balance = balance + (int) deposit;

    System.out.println("Mary started with: " + deposit + ". \nThis is the amount the bank registered: " + balance);

    // The extra 50 cents have disappeared because of downcasting! This is called data loss.

    // 2. Now try adding an integer value to a float value. You don't need to do the casting yourself because the float value is larger and the conversion from int to float happens automatically!

    
    //Use an integer of 10 and a float of 3.755. Add them and print the result. See how the float value assimilates the integer one?
    int myInt = 10;
    float myFloat = 3.755f;

    System.out.println(myFloat + myInt);
  
  }
}