package bignumber;

public interface BigNumber {

    int length(int number);
    void shiftLeft(int noOfShifts);
    void shiftRight(int noOfShifts);
    void addDigit(int digit);
    int getDigitAt(int position);
    BigNumber copy(int number);
    BigNumber add(BigNumber number);
    void compare(BigNumber number1, BigNumber number2);
}
