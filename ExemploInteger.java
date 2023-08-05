public class ExemploInteger {
    public static void main(String[] args){
        String s1 = "10";
        System.out.println("s1 vale: " + s1);
        //Converter de String para Int 
        int i1 = Integer.parseInt(s1);
        System.out.println("i1 vale: " + i1);

        //Converter de Int para String
        Integer i2 = 2;
        s1 = i2.toString();
        String s2 = Integer.toString(i2);
        System.out.println(i1);
        System.out.println(s2);

        //Converter para Float 
        float f1 = i2.floatValue() / 3;
        System.out.println("f1 vale: " + f1);
        System.out.println("f1 formatado: " +  String.format("%.02f", f1));
    }
    
}
