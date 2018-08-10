package com.walnut.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PoopickerController {
	
	@RequestMapping("/index")
	public String pagesDispatcher(HttpServletResponse response, HttpServletRequest request){
		//跳转到服务器内部的一个页面
        try {
			request.getRequestDispatcher("/psges/app/index.html").forward(request,response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        return null;
	}
}
