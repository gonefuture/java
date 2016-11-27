package 遍历文件夹;

import java.io.*;
import java.util.*;

class Tool
{
	/*
	 *递归遍历文件夹
	 *@path 路径
	 *@type 按文件类型过滤
	 */
	static List<File> list =new LinkedList<File>();
	public static List<File> getFiles1(String path, String type)
	{

		File file=new File(path);
		File[] fs=file.listFiles();
		for (File f:fs)
		{
			if (f.isFile())
			{
				if ((f.getName().toLowerCase()).endsWith(type))
					list.add(f);
			}
			else
			{
				getFiles1(f.getAbsolutePath(), type);
			}
		}
		return list;

	}

	/*
	 *非递归遍历文件夹
	 * @path 路径
	 * @type 按文件类型过滤
	 */
	public static List<File> getFiles2(String path, String type)
	{
		// TODO: Implement this method
		List<File> files=new LinkedList<File>();
		LinkedList<File> stack=new LinkedList<File>();
		File file=new File(path);
		for (File f:file.listFiles())
		{
			if (f.isFile())
			{
				if ((f.getName().toLowerCase()).endsWith(type))
					files.add(f);
			}
			else
			{
				stack.push(f);
			}

		}
		//不为空则继续循环
		while (stack.size() != 0)
		{
			file = stack.pop();
			for (File f:file.listFiles())
			{
				if (f.isFile())
				{
					if ((f.getName().toLowerCase()).endsWith(type))
						files.add(f);
				}
				else
					stack.push(f);
			}
		}
		return files;
	}
}

public class Main
{

	public static void main(String[] args)
	{

		final String path="D:\\Users\\Administrator";
		System.out.println(">>>遍历：" + path);


		long  time = System.currentTimeMillis();
		List<File> fs2=Tool.getFiles2(path, "dll");
		System.out.println("文件数量：" + fs2.size());
		System.out.println("非递归耗时：" + (double)(System.currentTimeMillis() - time)/1000+"s");

        System.out.println();	
		
		time=System.currentTimeMillis();
		List<File> fs1=Tool.getFiles1(path, "dll");
		System.out.println("文件数量：" + fs1.size());
		System.out.println("递归耗时：" + (double)(System.currentTimeMillis() - time)/1000+"s");


		
		
	}


}
	


