package fruitbasket.com.bodyfit;

import android.os.Environment;

public class Conditions {
    private static final Conditions conditions=new Conditions();

    public static final String APP_FILE_DIR= Environment.getExternalStorageDirectory()+"/BodyFit";

    public static final int MAX_SAMPLE_NUMBER=5;
    public static final int MID_SPAN=MAX_SAMPLE_NUMBER/2+1;

    public static final int NUM_PRE_EXERCISE=15;    //规定每组动作的最大次数
    public static final double VALUE_OF_VARTHRESHOLD=0.002;   //判断切割时方差的阈值
    public static final double VALUE_OF_AVRTHRESHOLD=0.15+0.8;   //判断切割时平均值的阈值
    public static final int MAX_SAMPLES_OF_ACTIONS=500; //单个动作中最大的samples数
    public static final int MIN_SAMPLES_OF_ACTIONS=70; //单个动作中最小的samples数

    //Massage.what
    public static final int MESSAGE_BLUETOOTH_TEST =0x100;
    public static final int MESSAGE_ERROR_JSON =0x101;
    public static final int MESSAGE_EXERCISE_TYPE=0x102;
    public static final int MESSAGE_EXERCESE_STATUS=0x103;

    //Bundle keys
    public static final String JSON_KEY_ITEMS_PRE_SECOND ="items_pre_second";
    public static final String JSON_KEY_JOSNERROR ="error_json_string";
    public static final String JSON_KEY_EXERCISE_TYPE="exercise_type";
    public static final String REPETITION_SCORE="repetition_score";
    public static final String SET_SCORE="set_score";
    public static final String ACTION_NUM="action_num"; //动作次数

    //json keys
    public static final String TIME="time";
    public static final String AX="ax";
    public static final String AY="ay";
    public static final String AZ="az";
    public static final String GX="gx";
    public static final String GY="gy";
    public static final String GZ="gz";
    public static final String MX="mx";
    public static final String MY="my";
    public static final String MZ="mz";
    public static final String P1="p1";
    public static final String P2="p2";
    public static final String P3="p3";

    //All Action Chinese Name
    public final static String exercise_1="交替哑铃弯举_1";
    public final static String exercise_2="器械飞鸟_2";
    public final static String exercise_3="锤式弯举_3";
    public final static String exercise_4="Data_4";
    public final static String exercise_5="平台杠铃推举_5";
    public final static String exercise_6="平板哑铃_6";
    public final static String exercise_7="俯身飞鸟_7";
    public final static String exercise_8="杠铃划船_8";
    public final static String exercise_9="杠铃颈后弯举_9";
    public final static String exercise_10="机械弯曲_10";
    public final static String exercise_11="反向飞鸟运动_11";
    public final static String exercise_12="器械推胸机动作_12";
    public final static String exercise_13="反握下拉_13";
    public final static String exercise_14="哑铃划船_14";
    public final static String exercise_15="哑铃提肩_15";
    public final static String exercise_16="站姿飞鸟_16";
    public final static String exercise_17="坐姿推肩_17";

    //requestCode
    public final static int SOCIETY_R_CODE=1;  //运动圈请求码
    public final static int EXERCISE_R_CODE=2; //运动界面请求码
    public final static int PERSON_R_CODE=3;   //个人信息界面请求码

    //模板数（动作数）
    public final static int EXERCISE_NUM=17;


    private Conditions(){}

    public static Conditions getInstance(){
        return conditions;
    }
}
