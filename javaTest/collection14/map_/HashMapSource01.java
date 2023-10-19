package com.javaTest.collection14.map_;

import java.util.HashMap;

public class HashMapSource01 {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("java", 10);
        hashMap.put("php", 10);
        hashMap.put("java", 20);//替换了java的值
        System.out.println("hashMap=" + hashMap);

        /*
        1、执行构造器 new HashMap()，初始化加载因子 loadfactor = 0.75
            HashMap$Node == null
        2.执行put（），调用hash（）计算key的哈希值：key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16)
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }
            static final int hash(Object key) {
                int h;
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            }
        3.执行putVal(hash(key), key, value, false, true)
             final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                       boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i; //辅助变量
            //如果底层的table数组是null，或者length=0，就扩容到16
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
            //取出hash值对应的table的索引位置node，如果为null，就直接把加入的k-v，
            //创建一个node，插入到这个位置即可。

            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
            else {
                Node<K,V> e; K k;
                //如果table的索引位置的key的hash和新的key的hash值相同，
                //并满足（table现有的节点的key和准备添加的key是同一个对象，或者equals 返回真）
                //就认为不能加入新的k-v
                if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                //如果当前的table的已有的Node是红黑树，就按照红黑树添加
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else {
                    //如果找到的节点，后面是链表，就循环比较
                    for (int binCount = 0; ; ++binCount) {//死循环
                        //如果整个链表，没有和他相同的值，就加到该链表的最后
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            //加入后，判断当前列表的个数，是否已经到了8个，到了8个后，
                            //就调用 treeifyBin（） 方法进行红黑树的转换
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        //如果在循环比较过程中，发现有相同，就break，就只替换key对应的value
                        if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value; //替换key对应的value
                    afterNodeAccess(e);
                    return oldValue;
                }
            }
            ++modCount;//每增加一个node，就size++
            if (++size > threshold)//如果size > 临界值，就扩容
                resize();
            afterNodeInsertion(evict);
            return null;
            }


           4.关于红黑树化
           final void treeifyBin(Node<K,V>[] tab, int hash) {
            int n, index; Node<K,V> e;
            //如果底层的table数组为null，或者大小还没有到64，暂时不树化，而是进行扩容
            //否则才会真正的树化 ->剪枝
            if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                resize();
            else if ((e = tab[index = (n - 1) & hash]) != null) {
                TreeNode<K,V> hd = null, tl = null;
                do {
                    TreeNode<K,V> p = replacementTreeNode(e, null);
                    if (tl == null)
                        hd = p;
                    else {
                        p.prev = tl;
                        tl.next = p;
                    }
                    tl = p;
                } while ((e = e.next) != null);
                if ((tab[index] = hd) != null)
                    hd.treeify(tab);
            }
    }

        * */
    }
}
