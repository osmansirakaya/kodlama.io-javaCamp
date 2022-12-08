public interface IEntityRepository<T extends IEntity > { // generikte extends kullanulır.
    void add(T entity);
    void delete(T entity);
    void update(T entity);
    // bu interface yukarıdaki tiplerin tamamı için çalışacaktır.
}
