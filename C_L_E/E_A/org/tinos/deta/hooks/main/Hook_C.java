package E_A.org.tinos.deta.hooks.main;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//时间: 20220623
//描述: 这个函数主要用于Exception的传入进行登记. 通过序列号区分, 时间记录,
//文件记录和异常描述的4个维度进行异常登记。
//输出结果如下, 注意下 间隔符号为‘：’
//归纳序列号：时间：文件名：异常描述
//稍后处理异常循环准备用map, 避免内存递增。
public interface Hook_C {
    //public List<String> exceptionList= new CopyOnWriteArrayList<>();
    //处理异常循环准备用map, 避免内存递增。
    //public Map<String, ExceptInformation> exceptionMap= new IMV_SIQ();
    //这个函数用于异常描述
    public String getCurrentEnvironment(String session);

    public String getCurrentFrequentEnvironment(String session, String timeMillis);

    public String getCurrentFrequentEnvironment(String session, Long timeMillis);

    //用于登记异常
    public void hookException(Exception exception);

    //用于显示异常
    public void showException(Exception exception);

    //这里出现一个问题, 便是session的随机循环异常无法有效的命名,
    //于是准备将session提取出来到接口外定义, 这样map价值就出来了。于是内容为捕捉的times记录。
    public void hookFrequentException(String uniqueSessionKey, Long timeMillis
        , Exception exception);

    //这个函数用于异常描述
    public void hookThrowable(Throwable throwable);

    public void hookThrowable(String throwableString);
}