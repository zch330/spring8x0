package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

public class FileUpload extends ActionSupport{
    private File file;
    private File fileFileName;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(File fileFileName) {
        this.fileFileName = fileFileName;
    }
    public String upload(){
        try {
            InputStream is = new FileInputStream(file);
            OutputStream os = new FileOutputStream("e:\\"+fileFileName);
            byte[] buffer = new byte[1024];
            int length=0;
            while ((length=is.read(buffer))!=-1){
                os.write(buffer,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

}
