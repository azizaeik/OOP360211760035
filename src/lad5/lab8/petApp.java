package lab8;

public class petApp {
    public static void main(String[] ags){

        Dog d1 = new Dog();
        d1.setName("Safe");
        d1.setAgs(5);

        System.out.println(d1.toString()+" "+d1.getClass().getSimpleName());

    }

}
