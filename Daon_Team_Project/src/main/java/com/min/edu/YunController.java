package com.min.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.MidiDevice.Info;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.google.gson.JsonObject;
import com.min.edu.dtos.CurExa_Dto;
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
		map2.put("startList", 1);
		map2.put("endList", 10);
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
		model.addAttribute("sub", sub);
		return "selmun";
	}
	
	@RequestMapping(value = "/createmun.do", method = RequestMethod.GET)
	public String createmun(String sub_code, String cur_code, Model model) {
		logger.info("문제 생성 화면");
		model.addAttribute(sub_code, "sub_code");
		model.addAttribute(cur_code, "cur_code");
		return "createmun";
	}
	
	@RequestMapping(value = "/imgUp.do", method = RequestMethod.POST)
	 public void imgUp(HttpServletRequest req, HttpServletResponse resp, @RequestParam MultipartFile upload) {
		 logger.info("ck에디터 실행합니다!");
		 resp.setCharacterEncoding("UTF-8");
		 resp.setContentType("text/html;charset=UTF-8");
		 OutputStream out = null;
		 PrintWriter printWriter = null;
		 JsonObject json = new JsonObject();
		 
		 String extension = FilenameUtils.getExtension(upload.getOriginalFilename());
		 String fileName = service.filename()+"."+extension;
		 System.out.println(extension);
//		 int pos = fileName.lastIndexOf(".");
//		 String _fileName = fileName.substring(0, pos);
//		 System.out.println("파일 확장자만 줘바"+_fileName);
		 
		 try {
			byte[] bytes = upload.getBytes();
			String path = WebUtils.getRealPath(req.getSession().getServletContext(), "/image/");
			
			String uploadPath = path.replace("/", "\\")+fileName;
			
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
	
	
	@RequestMapping(value = "/upload.do", method = RequestMethod.POST)
	public String joinUs(MultipartFile picFile, HttpServletRequest request) throws IOException {
		System.out.println("왜 여기도 못오니 ㅠㅠ");
		logger.info("upload 실행 제발!");
		String path = request.getSession().getServletContext().getRealPath("/image/");
		String filename = picFile.getOriginalFilename();
		String extension = FilenameUtils.getExtension(picFile.getOriginalFilename()); //확장자명만 받는거임
		/* dto.setFilename(filename); */

		File saveFile = new File(path + filename);
		picFile.transferTo(saveFile);
		/* boolean isc = service.insertUser(dto); */
		
		return /* isc?"redirect:/loginForm.do":"redirect:/joinUsForm.do" */"";
	}
	
	@RequestMapping(value = "/download.do", method = RequestMethod.POST)
	@ResponseBody
	public byte[] download(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		logger.info("download is {}");
//		StudentDto sdto = (StudentDto) session.getAttribute("sdto");
		Map<String, String> map = new HashMap<String, String>();
//		map.put("id", sdto.getId());
//		StudentDto dto = service.getUserInfo(map);
		String path;
		byte[] bytes = null;
		try {
			path = WebUtils.getRealPath(request.getSession().getServletContext(), "/upload");
			System.out.println(path+"=======");
//			System.out.println("Dto 경로 + 파일 명 :   "+path+"/"+dto.getFilename());
//			File file = new File(path+"/"+dto.getFilename());
//			bytes = FileCopyUtils.copyToByteArray(file);
//			String fn = new String(file.getName().getBytes(),"8859_1");
//			response.setHeader("Content-Disposition", "attachment; filename=\""+fn+"\"");
			response.setContentLength(bytes.length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return bytes;
	}
	
	@RequestMapping(value = "/makeMun1.do", method = RequestMethod.POST)
	public String makeMun1(ExamSelect_Dto seldto, CurExa_Dto curdto, String sub_code, MultipartFile file, HttpServletRequest request) throws Exception, IOException {
		logger.info("여기 잘 나오나요, {}, {}", seldto, curdto);
		String path = request.getSession().getServletContext().getRealPath("/image/");
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
			if(extension.equalsIgnoreCase("")) {
				seldto.setFilename(" ");
			}else {				
				String filename = service.filename()+"."+extension;
				File saveFile = new File(path + filename);
				file.transferTo(saveFile);
				seldto.setFilename(filename);
			}
			service.addselect(seldto, curdto);
			
		
		return "redirect:./test_domain.do";
	}
	
	@RequestMapping(value = "/makeMun2.do", method = RequestMethod.POST)
	public String makeMun2(ExamDesc_Dto desdto, CurExa_Dto curdto, String sub_code, MultipartFile file, HttpServletRequest request) throws Exception, IOException {
		logger.info("여기 잘 나오나요, {}", desdto);
		String path = request.getSession().getServletContext().getRealPath("/image/");
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		if(extension.equalsIgnoreCase("")) {
			desdto.setFilename(" ");
		}else {
			String filename = service.filename()+"."+extension;
			File saveFile = new File(path + filename);
			file.transferTo(saveFile);
			desdto.setFilename(filename);
		}
		service.adddesc(desdto, curdto);
		return "redirect:./test_domain.do";
	}
	@RequestMapping(value = "/makeMun3.do", method = RequestMethod.POST)
	public String makeMun3(ExamDesc_Dto desdto, CurExa_Dto curdto, String sub_code, MultipartFile file, HttpServletRequest request) throws Exception, IOException {
		logger.info("여기 잘 나오나요, {}", desdto);
		String path = request.getSession().getServletContext().getRealPath("/image/");
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		if(extension.equalsIgnoreCase("")) {
			desdto.setFilename(" ");
		}else {
			String filename = service.filename()+"."+extension;
			File saveFile = new File(path + filename);
			file.transferTo(saveFile);
			desdto.setFilename(filename);
		}
		service.addport(desdto, curdto);
		return "redirect:./test_domain.do";
	}
	
	
	@RequestMapping(value = "/meanCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public String meanCheck(String mean) {
		logger.info("Welcome meanCheck : \t{}", mean);
		return mean;
	}
	
	
}