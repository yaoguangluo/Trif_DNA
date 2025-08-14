package S_A.pheromone;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * * 作者的家庭是父亲 罗荣武，母亲 刘瑞珍，女儿 christina.yaja.luo/罗雅佳, 前妻ringli/李妙环。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class IMV_SIQ_ extends IMV_SIQ{
    public String getTrimString(String key){
        if(this.containsKey(key)) {
            return this.get(key).toString().replaceAll("\\s*", "");
        }
        return "";
    }
}