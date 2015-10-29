//package cn.springmvc.tool;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.apache.commons.fileupload.ProgressListener;
//
//import cn.springmvc.model.fileUploadStatus;
//
//public class myProgressListener implements ProgressListener {
//	private HttpSession session;
//
//	public myProgressListener(HttpServletRequest req) {
//		session=req.getSession();
//		fileUploadStatus status = new fileUploadStatus();
//		session.setAttribute("status", status);
//	}
//
//	public void update(long pBytesRead, long pContentLength, int pItems) {
//		// TODO Auto-generated method stub
//		fileUploadStatus status = (fileUploadStatus) session.getAttribute("status");
//		status.setPBytesRead(pBytesRead);
//		status.setPContentLength(pContentLength);
//		status.setPItems(pItems);
//	}
//
//}
