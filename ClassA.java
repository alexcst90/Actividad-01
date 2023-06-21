public class ClassA{
    private String foo;
    private String bar;
    private String loremIpsum = "is simply dummy text of the printing and typesetting industry.";

    static void concat(String foo, String bar){
        System.out.println(foo + bar);
    }

    public static void main(String[] arg){
        concat("Hola", "Mundo");
    }
}