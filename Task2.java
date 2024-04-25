class Task2{
public static void main(String[]args){

int n=10;

int a = 0;
int b = 0;
for(int i=1;i<=n;i++){

a=0;
b=0;
for(int j=1;j<=n;j++){
if(j<=5){
a=j;
}
else{

if(i+j>=11&&i-j<=0)
{
a =++b;
}

}
if(j==1||i+j==11||j==10||i-j==0){
  System.out.printf("%c",64+a);

}
else{
 System.out.print(" ");

}


}
System.out.println();
}
}
}