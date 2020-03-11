package lambdaExpressions;
    interface Drawable{  
        public void draw();  
    }  
    public class Lab_01_WithoutLambdaExpressions {  
        public static void main(String[] args) {  
            int width=10;  
      
            //without lambda, Drawable implementation using anonymous class  
            Drawable d=new Drawable(){  
                public void draw(){System.out.println("Drawing "+width);}  
            };  
            d.draw();  
        }  
  
}
