package test;

public class SeqList<T> extends Object {
    public Object[] element;    //下标元素
    public int n;    //n当前容器有多少元素

    public SeqList(int length) {
        this.element = new Object[length];
        this.n = 0;
    }

    /**
     * 如果不传参数，默认长度是64
     */
    public SeqList() {
        this(64);
    }

    /**
     * 复制，传一个数组，令这个列表存储数组
     * @param values
     */
    public SeqList(T[] values) {
        this(values.length);
        for (int i = 0; i < values.length; i++)
            this.element[i] = (Object) values[i];
        this.n = element.length;

    }

    /**
     * 判断列表是否为空
     * @return
     */
    public boolean isEmpty() {
        return this.n == 0;

    }

    /**
     * 返回元素有值的个数
     * @return
     */

    public int size() {
        return this.n;
    }

    /**
     * 按照索引返回元素
     * @param i
     * @return
     */
    public T get(int i) {
        if (i >= 0 && i < this.n)
            return (T) this.element[i];
        return null;
    }
    public void set(int i,T x){
        if (x==null)
            throw new NullPointerException("x==null");
        if (i>=0 && i<this.n)
            this.element[i] = x;
        else throw new java.lang.IndexOutOfBoundsException(i+"");
    }
    /**
     * 转化成字符串输出
     * @return
     */
    public String toString() {
        String str = this.getClass().getName() + "(";
        if (this.n > 0)
            str += this.element[0].toString();
        for (int i = 1; i < this.n; i++)
            str += "," + this.element[i].toString();
        return str + ")";

    }


    //返回线性表所有元素的描述字符串（元素次序从后到前）
    public String toPreviousString() {
        return "";
    }

    /**
     *
     * @param i
     * @param x
     * @return
     */
    //顺序表的插入操作
    public int insert(int i, T x) {
        if (x == null)
            throw new NullPointerException("x==null");
        if (i < 0)
            i = 0;
        if (i > this.n)
            i = this.n;
        Object[] source = this.element;
        if (this.n == element.length) {
            this.element = new Object[source.length * 2];
            for (int j = 0; j < i; j++) {
                this.element[j] = source[j];
            }
        }

        for (int j = this.n - 1; j >= i; j--)
            this.element[j + 1] = source[j];
        this.element[i] = x;
        this.n++;
        return i;
    }

    /**
     *  调用了两个参数的insert(this.n,x)
     *  并将列表中的元素的个数和用户传入的参数传过去
     * @param x 用户传入的参数
     * @return
     */
    public int insert(T x) {
        return this.insert(this.n, x);
    }

    public T remove(int i){
        if (this.n>0 && i>=0 && i<this.n){
            T old = (T) this.element[i];
            for (int j=1;j<this.n-1;j++){
                this.element[j] = this.element[j+1];
            }
            this.element[this.n-1] = null;
            this.n--;
            return old;
        }
        return null;
    }
    public void clear(){
        this.n=0;
    }
    //顺序查找，传元素获得其下标
    public int search(T key) {
        for (int i = 0; i < this.n; i++) {
            if (key.equals(this.element[i]))
                return i;
        }
        return -1;
    }

    //判断是否包含关键字
    public boolean contains(T key) {
        return this.search(key) != -1;
    }


}