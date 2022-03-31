package aula_tres;

public class PrintF {
    public static void main(String[] args) throws Exception {
        int v1 = 6;
        int v2 = 6;

        System.out.println(v1 + " >  " + v2 + "?  :: " + (v1 >  v2));
        System.out.println(v1 + " >= " + v2 + "?  :: " + (v1 >= v2));
        System.out.println(v1 + " <  " + v2 + "?  :: " + (v1 <  v2));
        System.out.println(v1 + " <= " + v2 + "?  :: " + (v1 <= v2));
        System.out.println(v1 + " == " + v2 + "?  :: " + (v1 == v2));
        System.out.println(v1 + " != " + v2 + "?  :: " + (v1 != v2));
        System.out.println();
        System.out.format("%d >  %d? :: %b\n", v1, v2, v1>v2);
        System.out.format("%d >= %d? :: %b\n", v1, v2, v1>=v2);
        System.out.format("%d <  %d? :: %b\n", v1, v2, v1<v2);
        System.out.format("%d <= %d? :: %b\n", v1, v2, v1<=v2);
        System.out.format("%d == %d? :: %b\n", v1, v2, v1==v2);
        System.out.format("%d != %d? :: %b\n", v1, v2, v1!=v2);
        
    }
}
 