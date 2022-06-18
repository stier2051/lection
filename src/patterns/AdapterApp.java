package patterns;

import java.io.FileNotFoundException;

public class AdapterApp {
    public static void main(String[] args) throws FileNotFoundException {
        //испльзуем наследование
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        //используем композицию
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster2();
        g2.drawLine();
        g2.drawSquare();
    }
}

interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}

class RasterGraphics{
    void drawRasterLine() {
        System.out.println("Drawing line");
    }
    void drawRasterSquare() {
        System.out.println("Drawing square");
    }
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    RasterGraphics raster = new RasterGraphics();
    @Override
    public void drawLine() {
        raster.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        raster.drawRasterSquare();
    }
}