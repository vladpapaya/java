public class Table {
    String color;
    String size;
    String material;

    Table (String color, String size, String material){
        this.color = color;
        this.material = material;
        this.size = size;
    }

    void changingSize (String newSize){
        this.size = size;
    }
    void changingColor (String newColoring){
    this.color = color;
    }
    void changingMaterial (String newMaterial){
        this.material = material;
    }
}
