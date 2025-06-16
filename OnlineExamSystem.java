public class OnlineExamSystem {
    static void startExam(String password, int timeLeft) throws Exception{
        if(!(password.equals("admin123"))){
            throw new InvalidLoginException();
        }
        else if(timeLeft<0){
            throw new TimeOverException();
        }
    }
    public static void main(String[] args) {
        try{
            startExam("admin123", 23);
            startExam("wrongpass", 30);
            
        }
        catch(InvalidLoginException e){
            System.out.println("InvalidLoginException Handleded");
        }
        catch(Exception e2){
            System.out.println("Exception Handleded");
        }
        try{
            startExam("admin123",-33);
        }
        catch(TimeOverException e1){
            System.out.println("TimeOverException Handled");
        }
        catch(Exception e2){
            System.out.println("Exception Handleded");
        }
        finally{
            System.out.println("Exam session ended");
        }
    }
}
