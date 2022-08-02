package dsa.list;

public interface List<T> {
    public void insert(T data);

    public void remove(T data);

    void traverse();

    public int size();
}
