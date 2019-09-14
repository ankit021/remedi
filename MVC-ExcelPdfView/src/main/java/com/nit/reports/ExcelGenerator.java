package com.nit.reports;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nit.model.Suzuki;

public class ExcelGenerator extends AbstractXlsView {

	public ExcelGenerator() {
		System.out.println("excelGenerator loaded..!!");
		
	}
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List<Suzuki> list=(List<Suzuki>) model.get("car");
		
		Sheet sheet=workbook.createSheet("Suzuki Cars");
			
			Row headerRow=sheet.createRow(0);
				headerRow.createCell(0).setCellValue("Car Name");
				headerRow.createCell(1).setCellValue("Color");
				headerRow.createCell(2).setCellValue("price");
				
			int	rowCount=1;
			
			for(Suzuki s:list) {
				
				Row row=sheet.createRow(rowCount);
				row.createCell(0).setCellValue(s.getCarName());
				row.createCell(1).setCellValue(s.getColor());
				row.createCell(2).setCellValue(s.getPrice());
				
				rowCount++;
			}
		
	}
	

}
