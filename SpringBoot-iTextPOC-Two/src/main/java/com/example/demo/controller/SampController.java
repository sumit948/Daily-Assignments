package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@RestController
public class SampController {
//	private static void addEmptyLine(Document document, Paragraph paragraph, int number) throws DocumentException {
//		paragraph = new Paragraph();
//		for (int i = 0; i < number; i++) {
//			paragraph.add(new Paragraph(" "));
//		}
//		document.add(paragraph);
//	}
	
	@RequestMapping("/pagetwo")
	public void pagTwo() {
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("D:\\PDFpagetwo.pdf"));
			Font smallfont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
			Font smallBold = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
			Font fontSize  = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
			document.setMargins(10, 53, 70, 50);
			document.open();
			Paragraph para1 = new Paragraph();
			para1.setIndentationLeft(8);
			para1.setAlignment(Element.ALIGN_CENTER);
			Chunk chunk = new Chunk("GHMC",fontSize); 
			para1.add(chunk);
			chunk = new Chunk(" GREATER HYDERABAD MUNICIPAL CORPORATION", smallfont);
			//chunk.setUnderline(0.5f, -2f);
			para1.add(chunk);
			document.add(para1);
			Paragraph para2 = new Paragraph();
			para2.setAlignment(Element.ALIGN_CENTER);
			chunk = new Chunk("ALWAL CIRCLE", smallfont);
			//chunk.setUnderline(0.1f, -2f);
			para2.add(chunk);
			document.add(para2);
			Paragraph para3 = new Paragraph();
			para3.setAlignment(Element.ALIGN_CENTER);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("APPLICATION FORM FOR EXEMPTION OF PROPERTY TAX", smallfont);
			//chunk.setUnderline(0.1f, -2f);
			para3.add("\n");
			para3.add(chunk);
			document.add(para3);
			
			Paragraph para4 = new Paragraph();
			para4.setAlignment(Element.ALIGN_CENTER);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("EXEMPTION OF PROPERTY TAX TO THE EX-SERVICEMEN/WIDOW OF", smallfont);
			//chunk.setUnderline(0.1f, -2f);
			para4.add("\n");
			para4.add(chunk);
			document.add(para4);
			
			Paragraph para5 = new Paragraph();
			para5.setAlignment(Element.ALIGN_CENTER);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("EXSERVMAN/SERVING ARMY PERSONNEL, AS PER G.O.MS.NO.83,", smallfont);
			//chunk.setUnderline(0.1f, -2f);
			para5.add(chunk);
			document.add(para5);
			
			Paragraph para6 = new Paragraph();
			para6.setAlignment(Element.ALIGN_CENTER);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("DATED 15.03.1997 OF THE M.A & U.D(TC)DEPT,GOVERNMENT OF A.P\n\n", smallfont);
			//chunk.setUnderline(0.1f, -2f);
			para6.add(chunk);
			document.add(para6);
			
			// --------------------Table--------------------//
			PdfPTable table = new PdfPTable(3);
			PdfPCell cell1 = new PdfPCell(new Paragraph("1",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			PdfPCell cell2 = new PdfPCell(new Paragraph("Name of the applicant ",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			PdfPCell cell3 = new PdfPCell(new Paragraph("\t\t\t",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("2",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("Father's/Husbands name of the applicant",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("\t\t\t",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("3",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("Whether the applicant is",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("Ex-Serviceman/widow of Ex-Serviceman/Serving Army personnel",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("4",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("Number and Rank of the Ex-Serviceman/serving army personnel",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("\t\t\t",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("5",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("Identify Card No.",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("\t\t\t",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("6",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("Details of the property which applied for Exemption from the "
					+ "payment of property tax",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("House No. Assessment No. Location & Revenue ward",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("7",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("The premises is used for",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("Residential/Non Residential purpose",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("8",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("The Premices is Occupied by",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("Owners/Tenants",smallBold));
			table.addCell(cell3);
			
			cell1 = new PdfPCell(new Paragraph("9",smallBold));
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell1);
			cell2 = new PdfPCell(new Paragraph("Communication Address",smallBold));
			cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell2);
			cell3 = new PdfPCell(new Paragraph("\t\t\t",smallBold));
			table.addCell(cell3);
			
		
			document.add(table);
			PdfPTable table2 = new PdfPTable(1);
			PdfPCell cell10 = 
			 new PdfPCell(new Paragraph(" Applicant Undertaking\n"+" I hereby declare that all information mentioned above is true to my knowledge. "
					+ "In case of any discrepancies if arises I will be held responsible. Hence I request you to issue me "
					+ "Exemption Certificate\n\n",smallBold));
			cell10.setHorizontalAlignment(Element.ALIGN_CENTER);
			//cell10.ALIGN_LEFT
			table2.addCell(cell10);
			
			cell10 = new PdfPCell(new Paragraph("\t    \tDate:\n"+"\r\t   \t Place:"
					+ "\t                                                                                 \t Applicant"));
			cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
			table2.addCell(cell10);
		
			document.add(table2);
		
			
			// ---------------------List------------------------------------
			
			Paragraph para7 = new Paragraph();
			para7.setIndentationLeft(8);
			para7.setAlignment(Element.ALIGN_LEFT);
			Chunk chunk2 = new Chunk("\n \n \nList of Enclosures:",fontSize); 
			para7.add(chunk2);
			document.add(para7);
			
			Paragraph para8 = new Paragraph();
			para8.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\t \t 1.   Attested Copy of Discharge Certificate of service Certificate", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para8.add("\n");
			para8.add(chunk);
			document.add(para8);
			
			Paragraph para9 = new Paragraph();
			para9.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\t \t 2.   Attested Copy of Title deeds", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para9.add("\n");
			para9.add(chunk);
			document.add(para9);
			
			Paragraph para10 = new Paragraph();
			para10.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\t \t 3.   Notarized affidavit ON 50/- Stamp Paper duly stating the facts regarding \t       "
					+ " \t the self- occupation and entitlement Of exemtion on only one house.", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para8.add("\n");
			para10.add(chunk);
			document.add(para10);
			
			Paragraph para11 = new Paragraph();
			para11.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\t \t 4.   Attested Copy of property assessment", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para11.add("\n");
			para11.add(chunk);
			document.add(para11);
			
			Paragraph para12 = new Paragraph();
			para12.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\t \t 5.   Copy of the property tax receipt and water tax receipt", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para12.add("\n");
			para12.add(chunk);
			document.add(para12);
			
			Paragraph para13 = new Paragraph();
			para13.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\t \t 6.   Attested Copy of identity card", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para13.add("\n");
			para13.add(chunk);
			document.add(para13);
			
			Paragraph para14 = new Paragraph();
			para14.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\t \t 7.   Attested Copy of death certificate in case widow.", smallBold);
			chunk.setUnderline(0.1f, -0.1f);
			//para14.add("\n");
			para14.add(chunk);
			document.add(para14);
			
			Paragraph para15 = new Paragraph();
			para15.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\n \t \t Office Use Only", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para14.add("\n");
			para15.add(chunk);
			document.add(para15);
			
			Paragraph para16 = new Paragraph();
			para16.setAlignment(Element.ALIGN_LEFT);
			//para3.setIndentationLeft(190);
			chunk = new Chunk("\n \t \t Note: This application to be routed through Zilla Sainika Welfare Office.", smallBold);
			//chunk.setUnderline(0.1f, -2f);
			//para14.add("\n");
			para16.add(chunk);
			document.add(para16);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			
//			// ---------------------Heading -------------//
//			Paragraph preface = new Paragraph();
//			addEmptyLine(document, preface, 4);
//			float[] columnWidths = new float[] {180f, 20f, 20f};
//			//PdfPTable table = new PdfPTable(columnWidths);
//			//PdfPCell column = new PdfPCell();
//			//column = new PdfPCell(new Phrase(":"));
//			//column.getPhrase().setFont(smallfont);
//			//column.setBorder(Rectangle.NO_BORDER);
//			Phrase p = new Phrase();
//			p.setFont(smallBold);
//			PdfPCell cell = new PdfPCell(p);
//			cell.setBorder(Rectangle.NO_BORDER);
//			p.add("1.\t \t Name of the awardee \r\n" + "\t \t \t \t (in block letters)");
//			addEmptyLine(document, preface, 4);
//			//cell.setPhrase(p);
//			//table.addCell(cell);
//			//table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 1 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add("\n\n");
//			p.add("2.\t \t Nature of award presented\r\n " + "\t \t \t \tby President of India");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			//table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 2 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add("3.\t \t Name of the Unit/Regiment");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			//table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 3 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add("4.\t \t The present address of the incumbent");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 4 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add("5.\t \t Permanent Address");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 5 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add(
//				"6.\t \t Whether incumbent is a native \r\n " + "\t \t \t \tof Andhra Pradesh(If so give details \r\n "
//					+ "\t \t \t \tabout his studies,immovable properties\r\n"
//					+ "\t \t \t \t in his native place.Certified copies to \r\n" + "\t \t \t \t be enclosed)");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 6 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add("7.\t \t Details of award \r\n" + "\t \t \t \t (a copy of the Gazettee notification of\r\n"
//				+ "\t \t \t \t Government of India to be enclosed");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 7 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add("8.\t \t Recommendation of the Commanding \r\n" + "\t \t \t \t Officer of Unit/Regiment");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			// -------------------------Line 8 end-----------------//
//			p = new Phrase();
//			p.setFont(smallBold);
//			p.add("9.\t \t Certified that the individual is not in receipt\r\n"
//				+ "\t \t \t \t Of any cash award by Government of \r\n"
//				+ "\t \t \t \t Andhra Pradesh previously on the above \r\n" + "\t \t \t \t Gallantry award");
//			cell.setPhrase(p);
//			table.addCell(cell);
//			table.addCell(column);
//			p = new Phrase();
//			p.setFont(smallfont);
//			// p.add(reg.getUserData().getName());
//			cell.setPhrase(p);
//			table.addCell(cell);
//			document.add(table);
//			// -------------------------Line 9 end-----------------//
//			addEmptyLine(document, preface, 1);
//			addEmptyLine(document, preface, 1);
//			Paragraph paragraph = new Paragraph();
//			paragraph.setAlignment(Element.ALIGN_RIGHT);
//			chunk = new Chunk("Signature with seal", smallfont);
//			paragraph.add(chunk);
//			document.add(paragraph);
//			// -------------------------Line 10 end-----------------//
//			addEmptyLine(document, preface, 1);
//			addEmptyLine(document, preface, 1);
//			Paragraph para = new Paragraph();
//			para.setIndentationLeft(50);
//			chunk = new Chunk("NOTE: The nativity/domicile certificate in original issused by Mandal Revenue \r\n"
//				+ "\t \t \t \t \t \t \t \t \t \t \t  Officer should be sent along with the letter.");
//			para.add(chunk);
//			document.add(para);
			document.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
