package home_work4;

public class Box {
    private final int width;
    private final int height;
    private String colour;
    private boolean isOpen;
    String object;

    public void throwOutObject() {
        if (isOpen && isEmptyBox()) {
            this.object = "";
            System.out.println("throw object from box");
        } else System.out.println("Box is closed or box is empty");
    }

    public void putObject(String object) {
        if (isEmptyBox()) {
            this.object = object;
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
    public Box(int weith, int hight, String colour, boolean isOpen, String object) {
        this.width = weith;
        this.height = hight;
        this.colour = colour;
        this.isOpen = isOpen;
        this.object = object;
    }

    /* Constructor with default isOpen - false */
    public Box(int weith, int hight, String colour, String object) {
        this.width = weith;
        this.height = hight;
        this.colour = colour;
        this.isOpen = false;
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", colour='" + colour + '\'' +
                ", isOpen=" + isOpen +
                ", object='" + object + '\'' +
                '}';
    }

    //Hate NullPointerException
    public boolean isEmptyBox() {
        return object != null && !object.isEmpty();
    }

}
