public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side, String color) {
        this(side);
        this.color = color;
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public int getSide(){ return basicCube.getSide();}
    public void setSide (int side) {basicCube.setSide(side);}
    public String getColor() {return color;}

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { return basicCube.calculateVolume(); }
    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }
    public Cube2 add(Cube2 otherCube) {
        int a2 = this.getSide() * this.getSide();
        int b2 = otherCube.getSide()  * otherCube.getSide();
        int c2 = a2 +b2;
        int c = (int) Math.round(Math.sqrt(c2));
        if (c * c == c2) {
            return new Cube2(c, this.color);
        } else {
            throw new IllegalArgumentException("Sides do not form a Pythagorean triple");
        }
    }

    public Cube2 minus(Cube2 otherCube) {
        int a2 = this.getSide() * this.getSide();
        int b2 = otherCube.getSide() * otherCube.getSide();
        int c2 = a2 -b2;
        if (c2 <= 0) {
            throw new IllegalArgumentException("Resulting surface area must be positive.");
        }
        int c = (int) Math.round(Math.sqrt(c2));
        if (c * c == c2) {
            return new Cube2(c, this.color);
        } else {
            throw new IllegalArgumentException("Sides do not form a Pythagorean triple.");
        }
    }
    public boolean equals(Cube2 otherCube) {
        if (this.getSide() == otherCube.getSide()) {
            return this.color.equals(otherCube.getColor());
        }
        return false;
    }

    public String toString() {
        return "Cube{side=" + getSide() + ", color=\"" + color + "\"}";
    }
}

