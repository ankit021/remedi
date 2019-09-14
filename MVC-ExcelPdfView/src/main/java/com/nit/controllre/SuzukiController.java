package com.nit.controllre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Suzuki;
import com.nit.service.SuzukiServiceImpl;

@Controller
public class SuzukiController {

	public SuzukiController() {
		System.out.println("controller calss loaded...!!");
	}
	
	@Autowired(required=true)
	private SuzukiServiceImpl suzukiservice;
	
	@RequestMapping("excel.ds")
	public String loadData(Model model) {
		
		List<Suzuki> slist=suzukiservice.getCarData();
		model.addAttribute("car", slist);
				
		return "viewExcel";
	}
	
	@RequestMapping("pdf.ds")
	public String loadDataPdf(Model model) {
		
		List<Suzuki> slist=suzukiservice.getCarData();
		model.addAttribute("car", slist);
				
		return "viewPdf";
	}
}