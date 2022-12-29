package Telusko_Java_tutorials;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QRCodeGenerator {
    public static void main(String[] args) throws Exception{
        String details = "Navin Reddy - Channel Name : Telusko Learnings....";

        ByteArrayOutputStream out= QRCode.from(details).to(ImageType.JPG).stream();

        File f=new File("D:\\Sorted\\Study materials\\Started\\Telusko_Tutorials\\MyChannel.jpg");
        FileOutputStream fos=new FileOutputStream(f);

        fos.write(out.toByteArray());
        fos.flush();


    }
}
