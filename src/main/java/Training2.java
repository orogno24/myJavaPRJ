public class Training2 {
    public static void main(String[] args){
        int x,y,z=0;
        for(y=0;y<7;y++){
            if(y<4){
                z++;
            }else{
                z--;
            }
            for(x=0;x<z;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
