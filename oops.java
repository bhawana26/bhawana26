public class oops {
    
    public static void main(String args[]){
     
    Pen p1 = x.new Pen(); // created a pen object called p1
       p1.setcolor("pink");
       System.out.println(p1.color);
       p1.settip(4);
       System.out.println(p1.tip);
   }
     class Pen{
        String color;
        int tip;
        void setcolor(String newColor){
            color = newColor;
        }
        void settip(int newtip){
              tip = newtip;
        }
     }

    
}
