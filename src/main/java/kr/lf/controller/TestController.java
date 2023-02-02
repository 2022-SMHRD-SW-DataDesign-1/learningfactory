package kr.lf.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import kr.lf.mapper.Test_infoMapper;

@CrossOrigin
@RestController
@RequestMapping(value = "/video")
public class TestController {
	
	@Autowired
	private Test_infoMapper test_info;
	
	@PostMapping("/file")
	public ResponseEntity<StreamingResponseBody> videoList(@RequestBody String name) {
		System.out.println("들어왓다");
		String file_name = name.split("=")[0];
		System.out.println("이름"+file_name);
		 //FileInputStream fis = null;
		 //Resource res = new FileSystemResource("C:/eGovFrame-4.0.0/workspace.edu/LF/src/saveFolder/"+name);
		String path = "C:/eGovFrame-4.0.0/workspace.edu/LF/src/saveFolder/"+file_name; 
		File file = new File("C:/eGovFrame-4.0.0/workspace.edu/LF/src/saveFolder/"+file_name);
//        if (!file.isFile()) {
//            return ResponseEntity.notFound().build();
//        }


        StreamingResponseBody streamingResponseBody = outputStream -> FileCopyUtils.copy(new FileInputStream(file), outputStream);

        final HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "video/mp4");
        responseHeaders.add("Content-Length", Long.toString(file.length()));

        return ResponseEntity.ok().headers(responseHeaders).body(streamingResponseBody);
		//		try{
//            fis = new FileInputStream(path);
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//		System.out.println("파일"+fis);
//		
//		return fis;
	}
	
}
