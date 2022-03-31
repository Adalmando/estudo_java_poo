package aula_sete;

public class StringBuilder {
    public static void main(String[] args) {
       
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        a.append("Java");
        b.append("Java");
        a.append(" fim.");
        b.append(" fim.");
        a.insert(0,"Vamos aprender ");
        b.insert(0,"Vamos aprender ");
        String c = "   casa   ";

        //metodo trim retira os espaços no inicio e fim da String!
        System.out.println(c.toUpperCase().trim());

        System.out.println(a);
        System.out.println(b);
    }
}
