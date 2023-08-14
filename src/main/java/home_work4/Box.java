package home_work4;

public class Box {
    private final int width;
    private final int height;
    private String colour;
    private boolean isOpen;
    private String item;

    public void throwOutObject() {
        if (isOpen && isEmptyBox()) {
            this.item = null;
            System.out.println("throw object from box");
        } else System.out.println("Box is closed or box is empty");
    }

    public void putObject(String object) {
        if (isEmptyBox()) {
            this.item = object;
            System.out.println("Put object in box");
        } else System.out.println("Thx box is closed");

    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    /* Constructor with set isOpen */
    public Box(int width, int hight, String colour, boolean isOpen, String item) {
        this.width = width;
        this.height = hight;
        this.colour = colour;
        this.isOpen = isOpen;
        this.item = item;
    }

    /* Constructor with default isOpen - false */
    public Box(int weith, int hight, String colour, String item) {
        this.width = weith;
        this.height = hight;
        this.colour = colour;
        this.isOpen = false;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", colour='" + colour + '\'' +
                ", isOpen=" + isOpen +
                ", object='" + item + '\'' +
                '}';
    }

    //Hate NullPointerException
    public boolean isEmptyBox() {
        return item != null && !item.isEmpty();
    }

}
