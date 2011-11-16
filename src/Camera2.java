/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Ramda
 */
public class Camera2 {
          
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

            ArrayList<Camera2> CamList = new ArrayList();
               
            for (int i = 0; i < (args.length / 3); i++) {
            int j = 3*i;
                Camera2 C = new Camera2();
                C.setBrand(args[j]);
                C.setfLength(Integer.parseInt(args[j+1]));
                C.setshutterPressed(Boolean.valueOf(args[j+2]).booleanValue());
                CamList.add(i,C);
            }

            for (int i = 0; i < CamList.size(); ++i) {
                System.out.println(" Camera" + i + " Brand is: " + CamList.get(i).getBrand() + " Focal Length is: " + CamList.get(i).getfLength() + " Shutter pressed is: " + CamList.get(i).getshutterPressed());
            }

            //int currcam = 0;
            //int nextcam = currcam + 1;
            for (int i = 0; i < CamList.size(); i ++){
                int TEMP = CamList.size() - i;
                for (int j = 0; j < TEMP; j++){
                    if (CamList.get(i).getBrand().equals(CamList.get(j).getBrand())) {
                        System.out.println("Camera " + i + " and Camera " + j + " have the same brand!");
                    } else {
                        System.out.println("Camera " + i + " and Camera " + j + " have different brand!");
                    }
                }
                
                //currcam = nextcam;
                //nextcam = currcam + 1;
            }
    }        
}
