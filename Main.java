 class threddemo extends Thread{
    
      public void run() 
      {
            System.out.println("run method");
      }
}
class Main{
      public static void main(String[] args) {
            Thread tr=new Thread();
            tr.start();
      }
}
