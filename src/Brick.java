public class Brick {
  private int x ;
  private int y;
  private int z;
  private int count = 0;

    Brick(int x, int y, int z){
     this.x=x;
     this.y=y;
     this.z = z;
       }
       public int getX(){
       return  x;
       }
       public void setX(int x){
           this.x = x;
       }
    public int getY(){
        return  y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }
    public String solution(int x, int y, int z, int d) {
        double xy = Math.sqrt(x * x + y * y);
        double xz = Math.sqrt(x * x + z * z);
        double yz = Math.sqrt(y * y + z * z);

        if (xy < d) {
            count++;
        }
        if (xz < d) {
            count++;
        }
        if (yz < d) {
            count++;
        }
        if (!(xy < d) && !(xz < d) && !(yz < d)) {
            return "Brick doesn't path the hole.";
        }

        return "Brick path hole with " + count + " edges.";
    }
}


