package com.min.edu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.MidiDevice.Info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.JsonObject;
import com.min.edu.dtos.ExamDesc_Dto;
import com.min.edu.dtos.ExamSelect_Dto;
import com.min.edu.model.YunDaon_IDao;
import com.min.edu.model.YunDaon_IService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class YunController {
	
	private static final Logger logger = LoggerFactory.getLogger(YunController.class);
	
	@Autowired
	private YunDaon_IService service;
	
	
	@RequestMapping(value = "/test_domain.do", method = RequestMethod.GET)
	public String td(){
		logger.info("문제 보기 화면");
		System.out.println("아직 문제화면 구성 전이야");
		
		return "munsel";
	}
	@RequestMapping(value = "/munlist.do", method = RequestMethod.GET)
	public String munlist(String sub, String mean, Model model) {
		logger.info("이 페이지가 어떻게 나오는 걸까 munlist.do  sub={}",sub);
		System.out.println(mean);
		System.out.println(sub);
		Map<Object, Object> map = new HashMap<Object, Object>();
		Map<Object, Object> map2 = new HashMap<Object, Object>();
		String[] ss = null;
		map2.put("start", 1);
		map2.put("end", 10);
		map.put("sub_code", sub);
		if(mean.equalsIgnoreCase("S")) {
			List<String> list = service.subGaekallsel(map);
			ss = new String[list.size()];
			for (int i = 0; i < list.size(); i++) {
				ss[i] = list.get(i);
				System.out.println(ss[i]);
			}
			map2.put("exa_code_", ss);
			List<ExamSelect_Dto> lists = service.gaekListsel(map2);
			model.addAttribute("lists", lists);
			
		}else{
			System.out.println("여기 찍히는거니? 안찍히니? 제발");
			if(mean.equalsIgnoreCase("D")) {
				List<String> list = service.subSesulallsel(map);
				ss = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {
					ss[i] = list.get(i);
					System.out.println(ss[i]);
				}
				map2.put("exa_code_", ss);
				List<ExamDesc_Dto> lists = service.sesulListsel(map2);
				model.addAttribute("lists", lists);
				
				
			}else if(mean.equalsIgnoreCase("P")) {
				List<String> list = service.subPoexaallsel(map);
				ss = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {
					ss[i] = list.get(i);
					System.out.println(ss[i]);
				}
				map2.put("exa_code_", ss);
				List<ExamDesc_Dto> lists = service.popolListsel(map2);
				model.addAttribute("lists", lists);
				
			}
			
		}
		
		
		model.addAttribute("mean", mean);
		
		return "selmun";
	}
	
	@RequestMapping(value = "/createmun.do", method = RequestMethod.GET)
	public String createmun(String sub) {
		logger.info("문제 생성 화면");
		return "createmun";
	}
	
	@RequestMapping(value = "/imgUp.do", method = RequestMethod.POST)
	 public void imgUp(HttpServletRequest req, HttpServletResponse resp, @RequestParam MultipartFile upload) {
		 logger.info("여기조차 못오네 ㅠㅠ");
		 resp.setCharacterEncoding("UTF-8");
		 resp.setContentType("text/html;charset=UTF-8");
		 OutputStream out = null;
		 PrintWriter printWriter = null;
		 JsonObject json = new JsonObject();
		 String fileName = upload.getOriginalFilename();
		 
		 try {
			byte[] bytes = upload.getBytes();
			String attachPath = "C:\\workspace_dorin\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Daon_Team_Project\\image\\";
			String uploadPath = attachPath.replace("/", "\\")+fileName;
			
			out = new FileOutputStream(new File(uploadPath));
			out.write(bytes);
			
			printWriter = resp.getWriter();
			String fileUrl = "http://localhost:8099/Daon_Team_Project/image/"+fileName;
			
			json.addProperty("uploaded", 1);
			json.addProperty("fileName", fileName);
			json.addProperty("url", fileUrl);
			
			printWriter.println(json);
			req.setAttribute("fileUrl", fileUrl);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(printWriter != null) {
				printWriter.close();
			}
		}		 
	 }
	
	
	
	
	
	@RequestMapping(value = "/makeMun.do", method = RequestMethod.POST)
	public String makeMun(ExamSelect_Dto dto) {
		logger.info("여기 잘 나오나요, {}", dto);
		return "redirect:./test_domain.do";
	}
	
	
}