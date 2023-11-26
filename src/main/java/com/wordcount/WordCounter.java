package com.wordcount;

import java.io.IOException;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WordCounter {
	
	@RequestMapping("/word")
	public ModelAndView service(ServletRequest req)throws IOException{
		
		ModelAndView mav=new ModelAndView("wordcount.jsp");
		String s=req.getParameter("s");
		char []ch=s.toCharArray();
		int count=0;int word=1;
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(c !=' ') {
				count++;
			}
			else word++;
		}
		return mav.addObject("result", word+" words "+count+" characters");
	}
	
	
	
}
