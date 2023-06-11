public class newObjects {
    int digit;
    String string;

    public newObjects(int digit, String string) {
        this.digit = digit;
        this.string = string;
    }


    public void setDigit(int digit) {
        this.digit = digit;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getDigit() {
        return digit;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return digit + "\t" + string;
    }
}
