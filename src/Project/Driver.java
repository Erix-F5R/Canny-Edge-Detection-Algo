package Project;

import java.io.IOException;


class Driver {

    public static void main(String[] args) throws IOException {
       
    	//SPECIFY THE NAME OF THE IMAGE IN DIRECTORY HERE
	     ColourMat imageMatrix = new ColourMat("INPUT/aruba.jpeg");
	     
	     //The following images will be written to the project directory
	     imageMatrix.gaussianBlur();
	     imageMatrix.saveImg("OUTPUT/1_GaussianBlur.png");
	     Matrix theta = imageMatrix.sobelFilter();
	     imageMatrix.saveImg("OUTPUT/2_Gradient.png");
	     
	     imageMatrix.nonMaxSuppresion(theta);
	     imageMatrix.saveImg("OUTPUT/3_NonMaxSup.png");
	    
	     imageMatrix.doubleThreshold();
	     imageMatrix.saveImg("OUTPUT/4_DoubleThres.png");
	     
	     imageMatrix.hysteresis();
	     imageMatrix.saveImg("OUTPUT/5_Hysteresis.png");
	     
	     
    }
}


