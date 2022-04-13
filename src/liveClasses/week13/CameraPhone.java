package liveClasses.week13;

public class CameraPhone extends Phone {
    int imageSize; //this one is in MegaBytes
    int memorySize;//this is in gigabytes

   /* public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }*/

    public CameraPhone(int x, int y) {
        //super();
        //super(); this(); ikisi ayni zamanda kullanilmaz
        imageSize = x;
        memorySize = y;
        //super(); compiler error , it has to be at the first line
    }
    public CameraPhone(){}

    public int numPictures(){
        return memorySize*1000/imageSize;
    }
}
