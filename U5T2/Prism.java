public class Prism {
    // instance variables
    private int length;
    private int width;
    private int height;

    // constructors
    public Prism() {
        length = (int) (Math.random() * 91) + 10;
        width = (int) (Math.random() * 91) + 10;
        height = (int) (Math.random() * 91) + 10;
    }

    public Prism(int sideLen) {
        length = sideLen;
        width = sideLen;
        height = sideLen;
    }

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // setter methods

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    // public methods
    public void printInfo() {
        System.out.println("Length = " + length + "\nWidth = " + width + "\nHeight = " + height);
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return 2*(length * width) + 2*(length * height) + 2*(width * height);
    }

}
