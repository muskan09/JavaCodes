public class stack {
   private int max_size;
   private int[] arr;
   private int top;

   public stack(int n) {
      max_size=n;
      arr=new int[max_size];
      top=-1;
   }
   public void push(int j) {
      arr[++top] = j;
   }
   public int pop() {
      return arr[top--];
   }
   public int peek() {
      return arr[top];
   }

   public static void main(String[] args) {
      stack o1 = new stack(10);
      int n;
      System.out.println("1 for push,2 for pop,3 for peep");
      do{
        switch(n)
      }while(n!=0)
      o1.push(10);
      o1.push(20);
      o1.push(30);
      o1.push(40);
      o1.push(50);
      o1.print();
      o1.pop();
      o1.print();

   }
}
