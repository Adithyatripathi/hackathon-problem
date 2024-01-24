class division{
public static void main(String[] args)
{
int[] n = {85 ,25 ,65, 21 ,83};
int newNumber = adithyatri(n);
if(newNumber%10==0)
System.out.println("yes");
else
System.out.println("no");
}
public static int adithyatri(int[] arr) {
int newNumber = 0;
for(int n : arr){
int lastdigit = n % 10;
 newNumber = newNumber * 10 + lastdigit;
}
return newNumber;
}
}
