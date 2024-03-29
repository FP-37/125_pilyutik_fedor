public class Tools implements Comparable<Tools> {
    private int size;
    private String name;

    public Tools() {
        this.size = 1;
        this.name = "Screwdriver";
    }

    public Tools( int size,String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Tools o) {
        return this.getSize()-o.size;
    }
}
