class opt{
public int top;
public static final int max=6;
public int[] arr=new int[max];

public boolean push(int d){
if(top>=max-1){
System.out.println("We cannot add data to stack");
return false;
}else{
arr[top]=d;
System.out.println("Data added:"+d);
top=top+1;
return true;
}
}
public boolean pop(){
if(top<0){
System.out.println("We cannot add data to stack");
return false;
}else{
arr[top]=0;
top=top-1;
return true;
}
}
public boolean isempty(){
if(top==-1){
System.out.println("Stack is empty");
return true;
}else{
System.out.println("Stack is not empty");
return false;
}
}
public boolean isfull(){
if(top==max){
System.out.println("Stack is full");
return true;
}else{
System.out.println("Stack is not full");
return false;
}
}
public void display(){
for(int i=top-1;i>-1;i--){
System.out.println(arr[i]);
}
}
public boolean peek(){
if(top<0){
System.out.println("Stack underflow");
return false;
}else{
System.out.println("Top element is:"+arr[top]);
return true;
}
}
}
public class Main
{
public static void main(String[] args) {
opt s1= new opt();
s1.push(4);
s1.push(5);
s1.push(8);
s1.push(12);
s1.push(25);
s1.display();
s1.pop();
s1.peek();
s1.display();
s1.isempty();
s1.isfull();
s1.push(30);
s1.isfull();
s1.display();
}
}
