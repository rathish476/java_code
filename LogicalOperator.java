class LogicalOperator{
public static void main (String[] args){
int x = 10 , y = 20;

System.out.println("(x==y) && (x < y):"+((x==y)&&(x++<y)));
System.out.println("x:"+x);
System.out.println("(x==y)||(x < y):"+((x==y)||(x++< y)));
System.out.println("x :"+ x);
}

}