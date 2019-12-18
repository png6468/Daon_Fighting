package com.min.edu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 * 객관식 문제 채점, 서/포문제 채점 갈게요 그거 어렵지 않아요 할만해요
 * 출제에 비하면...
 */
@Controller
public class WanController {
	
	private static final Logger logger = LoggerFactory.getLogger(WanController.class);
	
	@RequestMapping(value = "/pointing.do", method = RequestMethod.GET)
	public String pointing(String cur_code) {
		return "pointdp";
	}
}