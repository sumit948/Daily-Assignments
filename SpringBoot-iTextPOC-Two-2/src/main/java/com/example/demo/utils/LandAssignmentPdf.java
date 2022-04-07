package com.example.demo.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Land;
//import com.epa.sainik.pojo.RegisterMasterData;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("all")
@RestController
public class LandAssignmentPdf {

	public static ByteArrayInputStream sampleReport(List<Land> samplebig) {
//		private void addEmptyLine(Document document, Paragraph preface, int number) throws DocumentException {
//			Paragraph paragraph = new Paragraph();
//			for (int i = 0; i < number; i++) {
//				paragraph.add(new Paragraph(" "));
//			}
//			document.add(paragraph);
//			
//		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
			try {
				Document document = new Document();

				PdfWriter.getInstance(document, new FileOutputStream("D:\\kalyani2.pdf"));
				Font smallfont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
				Font smallBold = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
				document.open();
				Paragraph paragraph = new Paragraph();
				paragraph.setAlignment(Element.ALIGN_RIGHT);
				Chunk chunk = new Chunk("APPENDIX ''A''", smallfont);
				chunk.setUnderline(1.0f, -2f);
				paragraph.add(chunk);
				document.add(paragraph);
				Paragraph para1 = new Paragraph();
				para1.setIndentationLeft(15);
				para1.setAlignment(Element.ALIGN_CENTER);
				chunk = new Chunk("APPLICATION FORM FOR ALLOTMENT OF GOVERNEMENT WASTE LAND.", smallfont);
				chunk.setUnderline(1.0f, -2f);
				para1.add(chunk);
				document.add(para1);
				
				Paragraph preface = null;
				addEmptyLine(document, preface, 1);
				float[] columnWidths = new float[] {200f, 50f, 160f};
				PdfPTable table = new PdfPTable(columnWidths);
				PdfPCell column = new PdfPCell();
				// ---------------------Heading -------------//
				for (Land sample:samplebig){
					
					column = new PdfPCell(new Phrase(":"));
					column.getPhrase().setFont(smallfont);
					column.setBorder(Rectangle.NO_BORDER);
					Phrase p = new Phrase();
					p.setFont(smallBold);
					PdfPCell cell = new PdfPCell(p);
					cell.setBorder(Rectangle.NO_BORDER);
					p.add("1.\t Name of Applicant \r\n" + "\t \t \t \t (No,Rank,& Name)");
					//p.add("\n");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					//Paragraph para = new Paragraph();
					//para.setAlignment(Element.ALIGN_LEFT);
					p.add(sample.getName());
					p.setFont(smallfont);
					cell.setPhrase(p);
					table.addCell(cell);
					//para.add(p);		
					
					
					// -------------------------Line 1 end-----------------//
					
					p = new Phrase();
					p.setFont(smallBold);
					p.add("2.\t Date of Birth & Age");
					p.add("\n \n");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 2 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("3.\t Date of Enrollment");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 3 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("4.\t Date of Discharge");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 4 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("5.\t Regt / Crops");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 5 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("6.\t Name of Father/Husband");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 6 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("7.\t Cause of Discharge");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 7 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("8.\t Permanent Home Address");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 8 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("9.\t Present Home Address for");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 9 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("10.\t Details of land applied for");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line a end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("\t \t \t \t \t (a) Survey Number");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line b end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("\t \t \t \t \t (b) Extent available");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line c end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("\t \t \t \t \t (c) Name of Village");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line d end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("\t \t \t \t \t (d) Name of Mandal");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line e end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("\t \t \t \t \t (e) Classification of land");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 11 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("11.\t Total service");
					p.add("\n \n ");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 12 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("12.\t Details of Family of the \r \n" + "\t \t Applicant");
					p.add("\n \n \n");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					// -------------------------Line 13 end-----------------//
					p = new Phrase();
					p.setFont(smallBold);
					p.add("13.\t Identity Card No.");
					p.add("\n \n \n");
					cell.setPhrase(p);
					table.addCell(cell);
					table.addCell(column);
					p = new Phrase();
					p.add(sample.getName());  //change
					p.setFont(smallfont);
					//p.add(reg.getUserData().getName());
					cell.setPhrase(p);
					table.addCell(cell);
					document.add(table);



				}
					PdfWriter.getInstance(document, out);
		            document.open();
		            document.add(table);
		            document.close();
					} catch (DocumentException e) {
					e.printStackTrace();
					} catch (FileNotFoundException a) {
					a.printStackTrace();
					}
				
				
		return new ByteArrayInputStream(out.toByteArray());
	}

	private static void addEmptyLine(Document document, Paragraph preface, int number) throws DocumentException {
		Paragraph paragraph = new Paragraph();
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
		document.add(paragraph);
	}
	
}
