package fruitbasket.com.bodyfit.utilities;

import android.hardware.Sensor;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class ExcelProcessor {
	private static final ExcelProcessor mExcelProcesser=new ExcelProcessor();
	
	private ExcelProcessor(){}
	
	public ExcelProcessor getInstance(){
		return mExcelProcesser;
	}

	public synchronized static boolean appendDataQuickly(File excelFile,String[] time,ArrayList<double[]> SensorDatas)
			throws IOException{
		RandomAccessFile randomAccessFile=new RandomAccessFile(excelFile,"rw");
		randomAccessFile.seek(excelFile.length());

		for(int num=0;num<time.length;++num) {
			randomAccessFile.writeBytes(time[num] + "	");
			double [] SensorData = SensorDatas.get(num);
			for (int i = 0; i < SensorData.length; ++i) {
				randomAccessFile.writeBytes(SensorData[i] + "");
				randomAccessFile.writeBytes("	");
			}
			randomAccessFile.write('\n');
		}
		randomAccessFile.close();
		return true;
	}

	public static boolean createFileWithHeader(String[] header)
			throws IOException{
			String APP_FILE_DIR= Environment.getExternalStorageDirectory()+"/SensorData";

			File excelFile = new File(APP_FILE_DIR);
			if(!excelFile.exists())
				excelFile.mkdirs() ;
			File file = new File(APP_FILE_DIR+"/sixAixs.xlsx");
			if(file.exists())
				file.delete();
			file.createNewFile();
			RandomAccessFile raf=new RandomAccessFile(file,"rw");
			raf.setLength(0);
			for(int list=0;list<header.length;++list){
				raf.writeBytes(header[list]);
				raf.writeBytes("	");
			}
			raf.write('\n');
			raf.close();
			return true;
	}

}