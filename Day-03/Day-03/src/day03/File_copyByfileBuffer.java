package day03;
//ʹ�û���������myfile.txt�ļ�Ϊmyfile_cp2.txt
import java.io.*;
public class File_copyByfileBuffer {
	public static void copyFile(String src,String dest) throws IOException{
		FileInputStream in=new FileInputStream(src);
		File file=new File(dest);
		if(!file.exists())
		file.createNewFile();
		FileOutputStream out=new FileOutputStream(file);
		int c;
		byte buffer[]=new byte[1024];
		while((c=in.read(buffer))!=-1){
		for(int i=0;i<c;i++)
		out.write(buffer[i]); 
		}
		in.close();
		out.close();
		}
	public static void main(String[] args) throws IOException {
		String fileSrc="E:/JMPX/myfile.txt";
		String fileDes="E:/JMPX/Copy/myfile_cp2.txt";
		copyFile(fileSrc,fileDes);//�����ļ����Ʒ���
		System.out.println("C:/JMPX/Copy�ļ����ļ����Ƴɹ�");
		}
}