package onlinejudge.file.util;

public class MyFileUtil {
	public static String getExtentionOfFIle(String fileName){
		return fileName.substring(fileName.lastIndexOf('.')+1);
	}
}
