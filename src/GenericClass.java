public class GenericClass <T, V>{
    private T t;
    private V v;

    public GenericClass(T t, V v) {
        this.t = t;
        this.v = v;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t +
                ", v=" + v +
                '}';
    }
}
