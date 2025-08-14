package S_A.TRNA.RRNA;

import S_A.pheromone.AES_QMS_XSD_TIH;

//这个函数将染色体中所有 new 出来大型对象进行单例化 注册，模拟核糖体。简化 stable_S在主体程序中的占用，
// 动机缩小可计算内存。下一步明年应该感谢 灵感 来自-医学蛋白酶丝化 -- Valentina Perissi, -- 莫名心 猝感，
// 不会是因为去个nature 每人15页ppt，要跟我做文章吧。。。606 , 下一步明年也可以感谢（Xuetao Cao
// , Koji Okamoto, Hanming Shen, Richard Youle）-本来这是我2025年的进度，但是太无聊了，。。。
// nume-forma-stru-sets , 作者, 著作权人： 罗瑶光, 浏阳
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
//S_objectIdentify
public class Q_I extends S_Q {

    public double scaleDouble;
    public double[] inputsA;
    public int listCharPosition;
    public StringBuilder[] fixWords;
    public double[][] inputDoubleM;
    public double[] arrayDouble;
    public AES_QMS_XSD_TIH rootPath;
    public AES_QMS_XSD_TIH FilePath;
    public double distanceScaleDouble;
    public AES_QMS_XSD_TIH fileDirectroyPath;
    public AES_QMS_XSD_TIH needReplaceString;
    public AES_QMS_XSD_TIH urlString;
    public AES_QMS_XSD_TIH fileType;
    public AES_QMS_XSD_TIH pngOutputPath;
    public AES_QMS_XSD_TIH searchString;
    public AES_QMS_XSD_TIH uPassWDEnsure;
    public String[] 传参因子;
    public double hight;
    public double lookrot;
    public double valueDouble;
    public double timesDouble;
    public double estimateValue;
    public double scaleDistance;
    public double observerPCAScale;
    //
    public double k;
    public double keyDouble;
    public double sig;
    public double rank;
    public double pdeRatio = 1.0;
    public double doubleS;
    public double dDouble;
    public double eDouble;
    public double shehold;
    public double fourJian;
    public double fourSuan;
    public double eightJian;
    public double eightSuan;
    public double minDouble;
    public double maxDouble;
    public double countScale;
    public double inputValue;
    public double leftDouble;
    public double rightDouble;
    public double inputD;
    public double widthDouble;
    public double filterRate;
    public double filterScale;
    public double[] originDoubleA;
    public double[] outputA;
    public double[] rights;
    public double[] scores;
    public double[] origin;
    public double[] scoreA;
    public double[] fftA;
    public double[] destinationDoubleA;
    public double[] matchValues;
    public double[] estimateValueA;
    public double[] estimateRatios;
    public double[] originFrequency;
    public double[] compareFrequency;
    public double[][] originA;//later
    public double[][] outDIRM;
    public double[][] arrayDoubleM;
    public double[][][] inputT;
    //
    public AES_QMS_XSD_TIH v;
    public AES_QMS_XSD_TIH de;
    public AES_QMS_XSD_TIH ds;
    public AES_QMS_XSD_TIH ie;
    public AES_QMS_XSD_TIH is;
    public AES_QMS_XSD_TIH key;
    public AES_QMS_XSD_TIH pdc;
    public AES_QMS_XSD_TIH uQq;
    public AES_QMS_XSD_TIH pdw;
    public AES_QMS_XSD_TIH pds;
    public AES_QMS_XSD_TIH lock;
    public AES_QMS_XSD_TIH uAge;
    public AES_QMS_XSD_TIH uSex;
    public AES_QMS_XSD_TIH plsql;
    public AES_QMS_XSD_TIH temp;
    public AES_QMS_XSD_TIH name;
    public AES_QMS_XSD_TIH salt;
    public AES_QMS_XSD_TIH pwd;
    public AES_QMS_XSD_TIH strV;
    public AES_QMS_XSD_TIH WAVf;
    public AES_QMS_XSD_TIH LYGf;
    public AES_QMS_XSD_TIH uName;
    public AES_QMS_XSD_TIH split;
    public AES_QMS_XSD_TIH tabKey;
    public AES_QMS_XSD_TIH stopBy;
    public AES_QMS_XSD_TIH unSplit;
    public AES_QMS_XSD_TIH string;
    public AES_QMS_XSD_TIH uEmail;
    public AES_QMS_XSD_TIH encode;
    public AES_QMS_XSD_TIH uPhone;
    public AES_QMS_XSD_TIH lockBys;
    public AES_QMS_XSD_TIH filePath;
    public AES_QMS_XSD_TIH uWeChat;
    public AES_QMS_XSD_TIH password;
    public AES_QMS_XSD_TIH uAddress;
    public AES_QMS_XSD_TIH uPassword;
    public AES_QMS_XSD_TIH pageIndex;
    public AES_QMS_XSD_TIH tablePath;
    public AES_QMS_XSD_TIH baseName;
    public AES_QMS_XSD_TIH tableName;
    public AES_QMS_XSD_TIH currentDB;
    public AES_QMS_XSD_TIH culmnName;
    public AES_QMS_XSD_TIH pageEnd;
    public AES_QMS_XSD_TIH requestString;
    public AES_QMS_XSD_TIH argsString;
    public AES_QMS_XSD_TIH pageBegin;
    public AES_QMS_XSD_TIH direction;
    public AES_QMS_XSD_TIH fileName;
    public AES_QMS_XSD_TIH plSearch;

    public AES_QMS_XSD_TIH searchkey;
    public AES_QMS_XSD_TIH condition;
    public AES_QMS_XSD_TIH cellValue;
    public AES_QMS_XSD_TIH outputcsv;
    public AES_QMS_XSD_TIH zipPath;
    public AES_QMS_XSD_TIH encoding;
    public AES_QMS_XSD_TIH jsonString;
    public AES_QMS_XSD_TIH outputString;

    public AES_QMS_XSD_TIH cellName;
    public AES_QMS_XSD_TIH inputCharset;
    public AES_QMS_XSD_TIH rowIdString;
    public AES_QMS_XSD_TIH zipFilePath;
    public AES_QMS_XSD_TIH xmlString;
    public AES_QMS_XSD_TIH uEmailEnsure;
    public AES_QMS_XSD_TIH zipFullPath;
    public AES_QMS_XSD_TIH zipCategory;
    public AES_QMS_XSD_TIH culumnValue;
    public AES_QMS_XSD_TIH dBTablePath;
    public AES_QMS_XSD_TIH frontendTxt;
    public AES_QMS_XSD_TIH serverName;
    public AES_QMS_XSD_TIH inputString;
    public AES_QMS_XSD_TIH lockString;
    public AES_QMS_XSD_TIH dbConfigPath;
    public AES_QMS_XSD_TIH stringTypes;
    public AES_QMS_XSD_TIH outputCharset;
    public AES_QMS_XSD_TIH countWordNode;
    public AES_QMS_XSD_TIH sourceFilePath;
    public AES_QMS_XSD_TIH conditionSubject;
    public AES_QMS_XSD_TIH conditionObject;
    public AES_QMS_XSD_TIH fileCurrentpath;
    public AES_QMS_XSD_TIH callFunctionKey;
    public AES_QMS_XSD_TIH culumnTypeString;
    public AES_QMS_XSD_TIH humanWordsPassword;
    public AES_QMS_XSD_TIH acknowledgeString;
    public AES_QMS_XSD_TIH testImagePathString;
    public AES_QMS_XSD_TIH DBTableRowIndexPath;
    public AES_QMS_XSD_TIH documentFlowAddress;
    public String[] argv;
    public String[] sets;
    public String[] args;
    public String[] typeA;
    public String[] inputStringA;
    public String[] outputStringA;
    public String[] stringA;
    public String[] nameScore;
    public String[] keywords;
    public String[] destinationStringA;
    public String[] acknowledge;
    public String commandAcknowledge;
    public String tempString;
    public String[] sampleSentences;
    public String[] getCulumnsValueArray;
    public String[][] ann;
    public String[][] rnn;
    public String[][] inputNLP;
    public StringBuilder stringBuilder;
    public StringBuilder[] prefixWord;
    public int parserCharPosition;
    //

}
//遇到一个问题，变量的肽化 底层需要改 jdk，范型需要处理 数组，