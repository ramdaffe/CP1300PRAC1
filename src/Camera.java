/*Practical 3 CP1030
 * Ramda Yanurzha 12644700
 * James Cook University Singapore
 */

public class Camera {

        String brand;
        int fLength;
        boolean shutterPressed;

        public void setBrand(String B){
            brand = B;
        }
        
        public void setfLength(int F){
            fLength = F;
        }
        
        public void setshutterPressed(boolean S){
            shutterPressed = S;
        }
        
        public String getBrand(){
            return brand;
        }
        
        public int getfLength(){
            return fLength;
        }
        
        public boolean getshutterPressed(){
            return shutterPressed;
        }
        
        public static void main(String[] args) {

            Camera[] cameraArray = {
                new Camera(),new Camera(),new Camera()
            };
               
            for (int i = 0; i < cameraArray.length; i++) {
            int j = 3*i;
            cameraArray[i].setBrand(args[j]);
            cameraArray[i].setfLength(Integer.parseInt(args[j+1]));
            cameraArray[i].setshutterPressed(Boolean.valueOf(args[j+2]).booleanValue());
            }
        
            for (int i = 0; i < cameraArray.length; ++i) {
                System.out.println(" Camera" + i + " Brand is: " + cameraArray[i].getBrand()+ " Focal Length is: " + cameraArray[i].getfLength() + " Shutter pressed is: " + cameraArray[i].getfLength());
            }

            if (cameraArray[0].getBrand().equals(cameraArray[1].getBrand())) {
                System.out.println("Camera " + 0 + " and Camera " + (1) + " have the same brand!");
            } else {
                System.out.println("Camera " + 0 + " and Camera " + (1) + " have different brand!");
            }
           
            if (cameraArray[1].getBrand().equals(cameraArray[2].getBrand())) {
                System.out.println("Camera " + 1 + " and Camera " + (2) + " have the same brand!");
            } else {
                System.out.println("Camera " + 1 + " and Camera " + (2) + " have different brand!");
            }
            
            if (cameraArray[0].getBrand().equals(cameraArray[2].getBrand())) {
                System.out.println("Camera " + 0 + " and Camera " + (2) + " have the same brand!");
            } else {
                System.out.println("Camera " + 0 + " and Camera " + (2) + " have different brand!");
            }
        
    }
}