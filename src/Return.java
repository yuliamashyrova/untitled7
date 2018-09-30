public class Return {
    int a;

    Return(int i) {
        a = i;
    }

    Return incrByTen() {
        Return temp = new Return(a + 10);
        return temp;
    }
}
class RetOb {
    public static void main(String[] args){
        Return ob1 = new Return(2);
        Return ob2;
        ob2=ob1.incrByTen();
        System.out.println("ob1.a:"+ob1.a);
        System.out.println("ob2.a:"+ob2.a);
        ob2=ob2.incrByTen();
        System.out.println("ob2.a: after second increase: " +ob2.a);
    }
}
