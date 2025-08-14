package O_V.OM.config;
//准备设计配置文件, 养疗经启动配置都走这里的参数
//罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Config{
	//数据库配置
	public static final int detaVPCSBackEndPort= 8080; 
	//前端配置
	public static final int detaVPCSFrontEndPort= 80; 
	//后端配置
	public static final int detaVPCSDBPort= 8000; 
	//字符集配置
	public static final String detaMainCharset= "UTF8";
	public static final String detaReferCharset= "UTF8";
	//缓存配置
	
	//时钟配置
	public static final String timeETC= "G8+";
	//本地路径配置

	//2 缓存配置        
	public static final int CACHE_KEY_LENGTH= 32;
	public static final int CACHE_PIPE_NODE_LENGTH= 1500;
	
	//3 多线程配置        
	public static final int POOL_RANGE= 50;
	
	//4 VPCS 配置        
	public static final int SLEEPER_HALL_SIZE= 200;
	//5 分词配置        
	public static final int INDEX_LEVEL= 5;
	//6 initonComputing配置        
	public static final int PDE_LEVEL= 2;
	//10 ETL配置        
	
	//11 系统运营环境配置        
	public static final String LOG_MODEL= "bin";
	//12 日志信息配置   
	
	//系统硬件信息适配
	
	//热备记录和第三方接口日志上传功能
}
