public class Report5{
    public static void main(String[] arg) {
        try{
        String str = null;
        System.out.println(str.length());
    }catch(NullPointerException e){
        System.out.println("NullPointerExceptionが発生した");
        System.out.println(e.getMessage());
    }
    }
}
