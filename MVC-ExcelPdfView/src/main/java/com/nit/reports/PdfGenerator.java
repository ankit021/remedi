package com.nit.reports;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nit.model.Suzuki;

public class PdfGenerator extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Suzuki> slist=	(List<Suzuki>) model.get("car");
		
		Paragraph p = new Paragraph("Suzuki details");
		p.setAlignment("center");
		
		Table t= new Table(3);
			t.setAlignment("center");
			t.addCell("car name");
			t.addCell("color");
			t.addCell("price");
			
			if(!slist.isEmpty()) {
					
					for(Suzuki s:slist) {
					
				t.addCell(s.getCarName()+" ");
				t.addCell(s.getColor()+" ");
				t.addCell(s.getPrice()+" ");
			}
			}
			document.add((Element) p);
			document.add(t);
			
	}

}
