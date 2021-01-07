package org.zerock.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@GetMapping("/ex01")
	public void ex01(SampleDTO dto) {
		log.info(dto);
	}

	@GetMapping("/exUpload")
	public void exUpload() {
		log.info("exUpload....");
	}

	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
	
		files.forEach(file -> {
			log.info(file.getOriginalFilename());
			log.info(""+file.getSize());
			log.info(file.getContentType());
			
		});
	}
}
