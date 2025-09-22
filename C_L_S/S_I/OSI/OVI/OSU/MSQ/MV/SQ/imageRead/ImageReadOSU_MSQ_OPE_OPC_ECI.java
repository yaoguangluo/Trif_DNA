package S_I.OSI.OVI.OSU.MSQ.MV.SQ.imageRead;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.movie.LYGFileIO;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReadOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {
    
    public int value = 0;
    public String filepath;

    public ImageReadOSU_MSQ_OPE_OPC_ECI() {
    }

    public void run(final ImageReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) {
        //20230106-System.out.println("runed"+value);
        _SQ__OVQ_OSQ_VSQ.path = new String(filepath);
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(filepath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //image= new Strech().P(image, 0.1, 0.9);
        //image= new Median().P(image, 0.1, 0.9);
        //guassian filter
        //image= new Guassian().P(image, 3, 3, 1.6);
        //lygimage to jpeg
        //String pathBin= filepath;//output path
        //File outputBin= new File(pathBin);
        //mageIO.write(image, "jpg", outputBin);
        _SQ__OVQ_OSQ_VSQ.lygout = new LYGFileIO();
        _SQ__OVQ_OSQ_VSQ.lygout.image = image;
        //_SQ__OVQ_OSQ_VSQ.gout=topgin;
    }
}
