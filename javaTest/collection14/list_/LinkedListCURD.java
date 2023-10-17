package com.javaTest.collection14.list_;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCURD {

    /** 添加新节点
     * 1.LinkedList linkedList = new LinkedList();
     * public LinkedList() {
     * 2.这时 linkedList 的属性 first = null；last = null；
     * 3. 添加
     * public boolean add(E e) {
     *         linkLast(e);
     *         return true;
     *     }
     * 4.将新节点，加入到双向链表的最后
     * void linkLast(E e) {
     *         final Node<E> l = last;
     *         final Node<E> newNode = new Node<>(l, e, null);
     *         last = newNode;
     *         if (l == null)
     *             first = newNode;
     *         else
     *             l.next = newNode;
     *         size++;
     *         modCount++;
     *     }
    }*/

    /**删除节点
     * 1.执行 removeFirst();
     * public E remove() {
     *         return removeFirst();
     *     }
     * 2.执行 removeFirst()
     * public E removeFirst() {
     *         final Node<E> f = first;
     *         if (f == null)
     *             throw new NoSuchElementException();
     *         return unlinkFirst(f);
     *     }
     * 3. 执行 unlinkFirst(f);
     * private E unlinkFirst(Node<E> f) {
     *         // assert f == first && f != null;
     *         final E element = f.item;
     *         final Node<E> next = f.next;
     *         f.item = null;
     *         f.next = null; // help GC
     *         first = next;
     *         if (next == null)
     *             last = null;
     *         else
     *             next.prev = null;
     *         size--;
     *         modCount++;
     *         return element;
     *     }
     * */

    /** ArrayList 和 LinkeList 的比较
      *             底层结构        增删的效率          改查的效率
     *  ArrayList   可变的数组      较低，数组扩容      较高
     *  LinkeList   双向链表        较高，通过链表追加   较低
     *
     *  1.如果我们改查的操作多，选择 ArrayList
     *  2.如果我们增删的操作多，选择 LinkeList
     *  3.一般情况，在程序当中，80--90%都是查询，因此大部分情况下会选择 ArrayList
     *  4.在一个项目中，根据业务灵活选择，也可能是这样，一个模块使用的ArrayList，另一模块使用的是 LinkeList，
     *      也就是说，要根据业务来进行选择
     * **/

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        //添加元素值
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        //修改默认为第一个元素值
        linkedList.remove();
        //linkedList.remove(2);
        System.out.println(linkedList);

        //修改某个节点对象
        linkedList.set(1, 888);
        System.out.println(linkedList);

        //得到某个节点对象, 得到双向链表的第二个元素值。
        Object obj = linkedList.get(1);
        System.out.println(obj);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("while (iterator.hasNext())" + next);
        }

        for (Object o : linkedList){
            System.out.println("for (Object o : linkedList)" + o);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("for (int i) " + linkedList.get(i));
        }
    }
    /**删除节点
     * 1.执行 removeFirst();
     * public E remove() {
     *         return removeFirst();
     *     }
     * 2.执行 removeFirst()
     * public E removeFirst() {
     *         final Node<E> f = first;
     *         if (f == null)
     *             throw new NoSuchElementException();
     *         return unlinkFirst(f);
     *     }
     * 3. 执行 unlinkFirst(f);
     * private E unlinkFirst(Node<E> f) {
     *         // assert f == first && f != null;
     *         final E element = f.item;
     *         final Node<E> next = f.next;
     *         f.item = null;
     *         f.next = null; // help GC
     *         first = next;
     *         if (next == null)
     *             last = null;
     *         else
     *             next.prev = null;
     *         size--;
     *         modCount++;
     *         return element;
     *     }
     * */

    /** ArrayList 和 LinkeList 的比较
     *             底层结构        增删的效率          改查的效率
     *  ArrayList   可变的数组      较低，数组扩容      较高
     *  LinkeList   双向链表        较高，通过链表追加   较低
     *
     *  1.如果我们改查的操作多，选择 ArrayList
     *  2.如果我们增删的操作多，选择 LinkeList
     *  3.一般情况，在程序当中，80--90%都是查询，因此大部分情况下会选择 ArrayList
     *  4.在一个项目中，根据业务灵活选择，也可能是这样，一个模块使用的ArrayList，另一模块使用的是 LinkeList，
     *      也就是说，要根据业务来进行选择
     * **/
}
