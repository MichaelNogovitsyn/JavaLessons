package ComporatorT;

public class Bookm implements Comparable<Bookm>{
    String name;
    int pages;

    public Bookm(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
    @Override
    public int compareTo(Bookm o) {
        if (this.pages > o.pages)
            return 1;
        else if (this.pages < o.pages)
            return -1;
        else
            return 0;
    }
}
