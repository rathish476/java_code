class ReturnStatementDemo{

 public static void main(String args[]){

 System.out.println("main started...!");
   
 int result = add(2,3);
     //add(2,4);

 System.out.println("main ended...");

}
 
 static int add(int a , int b){
     int c = a+b;
     System.out.println(c);
     return c;
}

}