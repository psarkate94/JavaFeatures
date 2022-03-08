package naveenvideos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingPDF {
	
	// when i have to read pdf from local machine

	public static void main(String[] args) throws InvalidPasswordException, IOException 
	{
		
		FileInputStream fis= new FileInputStream("./msrtc1.pdf");
		
		
		BufferedInputStream bs= new BufferedInputStream(fis);
		PDDocument document =null;
		document=PDDocument.load(bs);
		String PDFContent=new PDFTextStripper().getText(document);
		System.out.println(PDFContent);
		
		

	}

}
