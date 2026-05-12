package src.main.java;
public class BadCode {

    public static void main(String[] args) {

        String password = "admin123";

        int x = 10;
        int y = 20;
        int z = x + y;

        if(z > 0){
            if(z > 5){
                if(z > 10){
                    System.out.println("Very big");
                }
            }
        }

        try{
            int a = 10/0;
        }catch(Exception e){

        }

        unusedMethod();
    }

    public static void unusedMethod(){
        System.out.println("unused");
    }

    public static void duplicate1(){
        int sum = 0;
        for(int i=0;i<100;i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void duplicate2(){
        int sum = 0;
        for(int i=0;i<100;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}