public class Runner {
    public static void main(String[] args){
        Mouse mouse = new Mouse(40,40,"horizontal");
        Box box = new Box(300,300,mouse);
        new Control(500,500,box,mouse);
      mouse.move();
    }
}
