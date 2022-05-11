package DoubleNode;

/**
 * @author Gremmie102
 * @date 2022/5/11 15:02
 * @purpose :
 */
public interface LinearTable<T> {
//    我们先来定义一个线性表的接口，
//    然后再去在双链表中去实现这个接口

    /**
     * 向线性表中添加元素
     * @param data 要储存的元素
     */
    void add(T data);

    /**
     * 在线性表中删除元素
     * @param index 要删除的元素下标
     */
    void removeIndex(int index);

    /**
     * 在线性表中删除元素
     * @param key 要删除的数据值
     */
    void removeKey(T key);

    /**
     * 删除线性表中对应的所有元素
     * @param key 要删除的数据值
     */
    void removeAll(T key);

    /**
     * 在线性表中查找指定下标的元素
     * @param index 要查找的索引(下标)
     * @return 返回这个元素
     */
    Object get(int index);

    /**
     * 判断线性表中是否含有指定元素
     * @param data 要查找的元素
     * @return 是否含有该元素
     */
    boolean contains(T data);

    /**
     * 修改线性表中指定索引的内容
     * @param index 要修改的元素下标
     * @param newData 修改之后的值
     * @return 返回该元素
     */
    Object set(int index,T newData);

    /**
     * 返回当前线性表的元素个数
     * @return 元素个数
     */
    int size();

    /**
     * 直接清空线性表中的内容
     */
    void clear();

    /**
     * 将线性表转化为数组
     * @return 返回数组
     */
     T[] toArray();

}
