package com.cghsir.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	
	/**
	 * 文件类型与文件名的变量命名为 File变量名+ContentType File变量名+FileName
	 */
	
	//文件的类型
	private String uploadContentType;
	//上传的文件流
	private File upload;
	//文件名
	private String uploadFileName;
	//文件描述
	private String caption;

	private static final long serialVersionUID = 9151567291099750603L;

	public String index() {
		return SUCCESS;
	}
	
	public InputStream getDownloadFile(){
        return ServletActionContext.getServletContext().getResourceAsStream("upload/"+uploadFileName);
    }
	
	public String dddd(){
		return SUCCESS;
	}

	public String doUpload() throws Exception{
		// 上传文件根目录
		String root = ServletActionContext.getServletContext().getRealPath(
				"/upload");
		File mk = new File(root);
		if (!mk.exists()) {
			mk.mkdirs();
		}
		InputStream in = new FileInputStream(upload);
		OutputStream out = new FileOutputStream(new File(root, uploadFileName));

		System.out.println(uploadFileName);

		byte[] buffer = new byte[1024];
		int length = 0;

		while (-1 != (length = in.read(buffer, 0, buffer.length))) {
			out.write(buffer);
		}
		out.close();
		in.close();
		return "upload_success";
	}

	
	// getter & setter
	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

}
