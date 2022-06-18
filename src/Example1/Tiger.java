package Example1;

class Tiger extends Cat implements HasName {
    @Override
    public int getWeight() {
        return 200;
    }
}

//в классе Tiger есть унаследованный от Cat метод getName, который и
// будет считаться реализацией метода getName для интерфейса HasName
