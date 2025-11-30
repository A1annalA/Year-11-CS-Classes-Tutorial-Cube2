public class Cube {
    //side elbght
    private int side;

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        //The other will take a single integer argument that is used to initialize the side property.
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        } else {
            this.side = side;
        }
    }

    //a method that returns the surface area of the cube called calculateSurfaceArea()
    public int calculateSurfaceArea() {
        return this.getSide() * this.getSide() * 6;
    }

    //a method that returns the volume of the cube called calculateVolume()
    public int calculateVolume() {
        return this.getSide() * this.getSide() * this.getSide();
    }
    // toString methd that returns a Strig in the folowing format (see example):
    public String toString() {
        return "Cube{side=" + this.getSide()+ "}" + getSide();
    }

    public Cube(){
        //One takes no arguments (has no parameters) and sets side to 1
        this.setSide(1);
    }

    public Cube(int side){
        this.setSide(side);
    }
}