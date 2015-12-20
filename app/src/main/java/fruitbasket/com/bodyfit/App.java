package fruitbasket.com.bodyfit;

import android.app.Application;
import android.util.Log;

import java.io.File;

import fruitbasket.com.bodyfit.processor.DataProcessor;


public class App extends Application {
    private static final String TAG="APP";

    /*static{
        System.loadLibrary("NativeHelper");
    }*/

    @Override
    public void onCreate(){
        super.onCreate();
        Log.i(TAG, "onCreate()");

        File appDir=new File(Conditions.APP_FILE_DIR);
        appDir.mkdirs();

        DataProcessor.setContext(getBaseContext());
    }


}
