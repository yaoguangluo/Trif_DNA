package S_A.SixActionMap;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

import java.lang.reflect.Field;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StudyVerbaMap {
    public IMV_SIQ _SMV = new IMV_SIQ();
    public IMV_SIQ _SMQ = new IMV_SIQ();
    public IMV_SIQ _SMI = new IMV_SIQ();
    public static IMV_SIQ initonDelegate = new IMV_SIQ();

    //先归纳汉语 归纳方式 DNA十六元基语义解码规范。 AOPM VECS IDUQ TXHF
    @SuppressWarnings("unchecked")
	public static void initInitonDelegate() {
        // A
        initonDelegate.put("分析", "A");
        initonDelegate.put("细化", "A");
        initonDelegate.put("理解", "A");
        initonDelegate.put("吸收", "A");
        initonDelegate.put("吃透", "A");
        initonDelegate.put("消化", "A");
        initonDelegate.put("归纳", "A");
        initonDelegate.put("定义", "A");
        initonDelegate.put("采集", "A");
        initonDelegate.put("分类", "A");
        initonDelegate.put("统计", "A");
        initonDelegate.put("计算", "A");
        initonDelegate.put("了解", "A");
        initonDelegate.put("观望", "A");
        initonDelegate.put("统筹", "A");
        initonDelegate.put("挖掘", "A");
        initonDelegate.put("联系", "A");
        initonDelegate.put("关联", "A");
        initonDelegate.put("梳理", "A");
        // O
        initonDelegate.put("操作", "O");
        initonDelegate.put("运作", "O");
        initonDelegate.put("摆设", "O");
        initonDelegate.put("摆布", "O");
        initonDelegate.put("主持", "O");
        initonDelegate.put("操心", "O");
        initonDelegate.put("作业", "O");
        initonDelegate.put("熟悉", "O");
        initonDelegate.put("操劳", "O");
        initonDelegate.put("接触", "O");
        initonDelegate.put("摸透", "O");
        initonDelegate.put("触碰", "O");
        initonDelegate.put("练习", "O");
        initonDelegate.put("操练", "O");
        initonDelegate.put("标记", "O");
        /*
         * 人类的动词单字不多，但是词组很多，于是更近思考，是否有必要进行单字化。
         * 否定论的思维，我就否定单字的价值，让多字词用contains条件来熵化单字计算结果。
         * 增加准确度。这些年很多狗仔队和同行不知道我在干什么，总想窥探我的思维本源，其实
         * 我就是一个凡人而已，既然家里穷躲不掉这些社会关系，我就用继续用文字来描述下的我
         * 的意识。十六元基编码在索引动词的范式上面，比较全面，这样S元基就被释放出来缓存
         * 未知和名词，S作为吸收机制，X来驱动关系， 其他元基作为消化机制，T作为驱动逻辑。
         * 这些关系和逻辑在千百年的人类进化中动词相对比较稳定。方便我下一步编码。
         * 比如标记颜色 的花语驱动就可以增加 --O+颜色-- 这个指令，之后古拉丁文编码，颜色，
         * 彩色在元基编码后都有V和Q元基相似片段，就可以减少指令集的扩充逻辑。大幅缩进花语
         * 元基编码函数集。 
         * 
         * --罗瑶光
         * 
         * */
        // P
        initonDelegate.put("处理", "P");
        initonDelegate.put("处置", "P");
        initonDelegate.put("解决", "P");
        initonDelegate.put("运行", "P");
        initonDelegate.put("下达", "P");
        initonDelegate.put("收纳", "P");
        initonDelegate.put("容纳", "P");
        initonDelegate.put("执行", "P");
        initonDelegate.put("结果", "P");
        initonDelegate.put("处理", "P");
        initonDelegate.put("落实", "P");
        initonDelegate.put("成果", "P");
        initonDelegate.put("贡献", "P");
        initonDelegate.put("结论", "P");
        initonDelegate.put("观点", "P");
        initonDelegate.put("论文", "P");
        initonDelegate.put("命令", "P");
        initonDelegate.put("指示", "P");
        initonDelegate.put("指令", "P");
        initonDelegate.put("报应", "P");
        initonDelegate.put("处决", "P");
        // M
        initonDelegate.put("管理", "M");
        initonDelegate.put("支配", "M");
        initonDelegate.put("调剂", "M");
        initonDelegate.put("整理", "M");
        initonDelegate.put("排列", "M");
        initonDelegate.put("序列", "M");
        initonDelegate.put("区间", "M");
        initonDelegate.put("归一", "M");
        initonDelegate.put("调理", "M");
        initonDelegate.put("整顿", "M");
        initonDelegate.put("文档", "M");//动词用
        initonDelegate.put("档案", "M");
        initonDelegate.put("分管", "M");
        initonDelegate.put("运维", "M");
        initonDelegate.put("维护", "M");
        initonDelegate.put("保养", "M");
        initonDelegate.put("协调", "M");
        // V
        initonDelegate.put("感知", "V");
        initonDelegate.put("感觉", "V");
        initonDelegate.put("感应", "V");
        initonDelegate.put("敏感", "V");
        initonDelegate.put("过敏", "V");
        initonDelegate.put("直觉", "V");
        initonDelegate.put("知觉", "V");
        initonDelegate.put("察觉", "V");
        initonDelegate.put("应激", "V");
        initonDelegate.put("观察", "V");
        initonDelegate.put("视觉", "V");
        initonDelegate.put("接触", "V");
        initonDelegate.put("听觉", "V");
        initonDelegate.put("味觉", "V");
        initonDelegate.put("嗅觉", "V");
        initonDelegate.put("触觉", "V");
        initonDelegate.put("感受", "V");
        initonDelegate.put("存在", "V");
        // E
        initonDelegate.put("执行", "E");
        initonDelegate.put("运行", "E");//later 去重
        initonDelegate.put("做", "E");
        initonDelegate.put("动", "E");
        initonDelegate.put("走", "E");
        //initonDelegate.put("～", "E");//各类动词～
        initonDelegate.put("进行", "E");
        initonDelegate.put("执行", "E");
        initonDelegate.put("提", "E");
        initonDelegate.put("操", "E");
        initonDelegate.put("跟进", "E");
        initonDelegate.put("更近", "E");
        initonDelegate.put("更进", "E");
        initonDelegate.put("数据", "E");
        initonDelegate.put("智慧", "E");
        initonDelegate.put("逻辑", "E");
        initonDelegate.put("选择", "E");
        initonDelegate.put("操作", "E");
        initonDelegate.put("点击", "E");
        initonDelegate.put("点", "E");
        initonDelegate.put("确认", "E");
        initonDelegate.put("做", "E");
        initonDelegate.put("将", "E");
        initonDelegate.put("获取", "E");
        initonDelegate.put("获", "E");
        initonDelegate.put("获得", "E");
        initonDelegate.put("取得", "E");
        initonDelegate.put("取", "E");
        initonDelegate.put("授权", "E");
        initonDelegate.put("授", "E");
        initonDelegate.put("选", "E");
        initonDelegate.put("确定", "E");
        initonDelegate.put("确保", "E");
        initonDelegate.put("认准", "E");
        initonDelegate.put("认", "E");
        initonDelegate.put("认定", "E");
        initonDelegate.put("定", "E");
        initonDelegate.put("标记", "E");
        initonDelegate.put("标出", "E");
        initonDelegate.put("标", "E");
        initonDelegate.put("拿出", "E");
        initonDelegate.put("拿到", "E");
        initonDelegate.put("拿来", "E");
        initonDelegate.put("拿", "E");
        initonDelegate.put("锁定", "E");//later去重 C
        initonDelegate.put("锁存", "E");
        initonDelegate.put("锁", "E");
        initonDelegate.put("存", "E");
        // C
        initonDelegate.put("控制", "C");
        initonDelegate.put("把控", "C");
        initonDelegate.put("锁定", "C");
        initonDelegate.put("登记", "C");
        initonDelegate.put("制约", "C");
        initonDelegate.put("管控", "C");
        initonDelegate.put("抓取", "C");
        initonDelegate.put("盯紧", "C");
        initonDelegate.put("控", "C");
//。。。
        // S-Noun
//        initonDelegate.put("静态", "N");
//        initonDelegate.put("表", "N");
//        initonDelegate.put("表格", "N");
//        initonDelegate.put("表单", "N");
//        initonDelegate.put("东西", "N");
//        initonDelegate.put("物", "N");
//        initonDelegate.put("表库", "N");
//        initonDelegate.put("矩阵", "N");
//        initonDelegate.put("文档", "N");
//        initonDelegate.put("文件", "N");
//        initonDelegate.put("对象", "N");
//        initonDelegate.put("单子", "N");
//        initonDelegate.put("数据库", "N");
//        initonDelegate.put("数据", "N");
//        initonDelegate.put("文章", "N");
//        initonDelegate.put("内存", "N");
//        initonDelegate.put("变量", "N");
//        initonDelegate.put("图片", "N");
//        initonDelegate.put("声音", "N");
//        initonDelegate.put("媒体", "N");
//        initonDelegate.put("电影", "N");
//        initonDelegate.put("网页", "N");
//        initonDelegate.put("程序", "N");
//        initonDelegate.put("文件夹", "N");
//        initonDelegate.put("字符", "N");
//        initonDelegate.put("数字", "N");
//        initonDelegate.put("数组", "N");
//        initonDelegate.put("对象", "N");
//        initonDelegate.put("链表", "N");
//        initonDelegate.put("树", "N");
//        initonDelegate.put("插件", "N");
//        initonDelegate.put("函数", "N");
//        initonDelegate.put("类", "N");
//        initonDelegate.put("map", "N");
//        initonDelegate.put("list", "N");
//        initonDelegate.put("vector", "N");
        // I
        initonDelegate.put("增加", "I");
        initonDelegate.put("增", "I");
        initonDelegate.put("加", "I");
        initonDelegate.put("生", "I");
        initonDelegate.put("添加", "I");
        initonDelegate.put("创造", "I");
        initonDelegate.put("new", "I");
        initonDelegate.put("添", "I");
        initonDelegate.put("得到", "I");
        initonDelegate.put("开启", "I");
        initonDelegate.put("初始", "I");
        initonDelegate.put("打开", "I");
        initonDelegate.put("启动", "I");
        initonDelegate.put("收纳", "I");//later duplicate
        initonDelegate.put("获得", "I");//。。
        initonDelegate.put("获取", "I");
        initonDelegate.put("收留", "I");
        initonDelegate.put("酸", "I");
        initonDelegate.put("收容", "I");
        initonDelegate.put("收取", "I");
        initonDelegate.put("取得", "I");
        initonDelegate.put("采纳", "I");
        initonDelegate.put("收购", "I");
        initonDelegate.put("购买", "I");
        initonDelegate.put("采购", "I");
        initonDelegate.put("迎接", "I");
        initonDelegate.put("纳畜", "I");
        initonDelegate.put("添丁", "I");
        initonDelegate.put("中奖", "I");
        initonDelegate.put("接受", "I");
        initonDelegate.put("接纳", "I");
        initonDelegate.put("收纳", "I");
        initonDelegate.put("受贿", "I");
        initonDelegate.put("纳娶", "I");
        initonDelegate.put("增加", "I");
        // D //危险词汇
        initonDelegate.put("删除", "D");
        initonDelegate.put("减少", "D");
        initonDelegate.put("剔除", "D");
        initonDelegate.put("开除", "D");
        initonDelegate.put("删除", "D");
        initonDelegate.put("去除", "D");
        initonDelegate.put("删", "D");
        initonDelegate.put("减", "D");
        initonDelegate.put("省略", "D");
        initonDelegate.put("碱", "D");
        initonDelegate.put("掉", "D");
        initonDelegate.put("死", "D");
        initonDelegate.put("去", "D");
        initonDelegate.put("开掉", "D");
        initonDelegate.put("完", "D");
        initonDelegate.put("滚", "D");
        initonDelegate.put("消失", "D");
        initonDelegate.put("消除", "D");
        initonDelegate.put("消掉", "D");
        initonDelegate.put("失去", "D");
        initonDelegate.put("失散", "D");
        initonDelegate.put("散", "D");
        initonDelegate.put("亡", "D");
        // U
        initonDelegate.put("改变", "U");
        initonDelegate.put("变通", "U");
        initonDelegate.put("修改", "U");
        initonDelegate.put("修整", "U");
        initonDelegate.put("变动", "U");
        initonDelegate.put("变化", "U");
        initonDelegate.put("整改", "U");
        initonDelegate.put("改动", "U");
        initonDelegate.put("改", "U");
        initonDelegate.put("变", "U");
        initonDelegate.put("更改", "U");
        initonDelegate.put("更新", "U");
        initonDelegate.put("出入", "U");
        initonDelegate.put("变样", "U");
        initonDelegate.put("猫腻", "U");
        // Q
        initonDelegate.put("查看", "Q");
        initonDelegate.put("查阅", "Q");
        initonDelegate.put("反馈", "Q");
        initonDelegate.put("反应", "Q");
        initonDelegate.put("等于", "Q");
        initonDelegate.put("提交", "Q");
        initonDelegate.put("公布", "Q");
        initonDelegate.put("照应", "Q");
        initonDelegate.put("报告", "Q");
        initonDelegate.put("回答", "Q");
        initonDelegate.put("回应", "Q");
        initonDelegate.put("返回", "Q");
        initonDelegate.put("回执", "Q");
        initonDelegate.put("检查", "Q");
        initonDelegate.put("检阅", "Q");
        // T
        initonDelegate.put("触发", "T");
        initonDelegate.put("反应", "T");
        initonDelegate.put("纠缠", "T");
        initonDelegate.put("爆发", "T");
        initonDelegate.put("制动", "T");
        // X
        initonDelegate.put("探索", "X");
        initonDelegate.put("寻找", "X");
        initonDelegate.put("索引", "X");
        initonDelegate.put("搜索", "X");
        initonDelegate.put("探寻", "X");
        initonDelegate.put("查询", "X");
        initonDelegate.put("查找", "X");
        initonDelegate.put("搜寻", "X");
        initonDelegate.put("发现", "X");
        // H
        initonDelegate.put("主观", "H");
        initonDelegate.put("主体", "H");
        initonDelegate.put("主导", "H");
        initonDelegate.put("能动", "H");
        // F
        initonDelegate.put("客观", "F");
        initonDelegate.put("综合", "F");
        initonDelegate.put("全面", "F");
        initonDelegate.put("替代", "F");
    }
    /*
     * 关于SMV的使用方式，首先我的主要动机是用于做缓存使用。因为NE不够灵动。我想把NE作为数据库使用，
     * 每次结束工作，会txt文件记录NE，系统工作的过程是NE在map中的计算，读取NE的txt文件。这个txt文件
     * 可以方便我每次的优化变量中的数据，了解NE变量集合在计算中的波动过程，为下一步做铺垫。 --罗瑶光
     * 因为用java，我也产生了很多疑惑，首先是我不能清楚地得到变量出现的地方所对应的函数所在的具体的包名。
     * getPackage是当前的class对应的函数所在的具体的包名。缺了一个级，所以我在思考当年我在印度学C语言的
     * 时候为什么会买本java来看，因为2008年不碰java，我就会一直搞C和汇编。这十年的出现的问题等于0. 所以
     * 当初是什么动机让我买java，因为我印度基督大学当时没有java课程。
     * */
    @SuppressWarnings("unchecked")
	public void init_SMV(App NE) throws NoSuchFieldException
        , InstantiationException, IllegalAccessException, ClassNotFoundException {
        Field[] fields = NE.app_S.getClass().getFields();
        for (int i = 0; i < fields.length; i++) {
            if (null != fields[i]) {
                String string = fields[i].getName();
                System.out.println(string);
                Class<?> type = fields[i].getType();
                String typeNanme = type.getClass().getPackage().getName();
                System.out.println(typeNanme);
                _SMV.put(string, new Object());
                _SMQ.put(string, typeNanme);
            }
        }
    }

    public Object getObject(String key) {
        if (_SMV.containsKey(key)) {
            return _SMV.get(key);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
	public void putObject(String key, Object object) {
        _SMV.put(key, object);
    }
    //later
}