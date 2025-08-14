package E_A.OEI.SVQ.MPC.fhmm.E;

import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.time.TimeCheck;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PillowsSet {
    public long index;
    public boolean entry = false;
    public Object object;
    public PillowsSet smallOrder;
    public PillowsSet largeOrder;
    public PillowsSet preSmallOrder;
    public PillowsSet preLargeOrder;

    public void arrangePillow(long index, Object object, int pillows, int depth
        , int currentDepth) {
        if (null == this.object) {
            this.index = index;
            this.object = object;
            return;
        }
        if (index < this.index) {
            if (null == smallOrder) {
                smallOrder = new PillowsSet();
                smallOrder.preLargeOrder = this;
            }
            smallOrder.arrangePillow(index, object
                , pillows, depth, currentDepth + S_Pos.INT_ONE);
        }
        if (index > this.index) {
            if (null == largeOrder) {
                largeOrder = new PillowsSet();
                largeOrder.preSmallOrder = this;
            }
            largeOrder.arrangePillow(index, object
                , pillows, depth, currentDepth + S_Pos.INT_ONE);
        }
    }

    public Object getPillow(long index) {
        if (index == this.index) {
            return object;
        }
        if (index < this.index) {
            return smallOrder.getPillow(index);
        }
        if (index > this.index) {
            return largeOrder.getPillow(index);
        }
        return null;
    }

    public void superBalance() {
    }

    public void show() {
        entry = true;
        if (smallOrder != null && !smallOrder.entry) {
            smallOrder.show();
        }

        if (largeOrder != null && !largeOrder.entry) {
            largeOrder.show();
        }
    }

    public static void main(String[] argv) {
        int pillows = S_Pos.INT_ZERO;
        int depth = pillows >> S_Pos.INT_ONE;
        int currentDepth = S_Pos.INT_ZERO;
        PillowsSet pillowsMap = new PillowsSet();

        for (int i = S_Pos.INT_ZERO; i < 5000; i++) {
            pillowsMap.arrangePillow(i, i, pillows++, depth, currentDepth);
        }
        pillowsMap.fixEntry();
        pillowsMap.show();
        //		TimeCheck timecheck= new TimeCheck();
        //		timecheck.begin();
        //		for(int i=0;i<100000;i++) {
        ////			pillowsMap.getPillow(100);
        //		}
        //		timecheck.end();
        //		timecheck.duration();
        //20230106-System.out.println(pillowsMap.getPillow(100));
        Map<Long, Object> map = new IMV_SIQ();
        for (long i = 0; i < 5000000; i++) {
            map.put(i, i);
        }
        long v = 1000;
        TimeCheck timecheck = new TimeCheck();
        timecheck.begin();
        for (int i = 0; i < 5000000; i++) {
            map.get(v);
        }
        timecheck.end();
        timecheck.duration();
        //20230106-System.out.println(map.get(v));
        //c

        map = new IMV_SIQ();
        for (long i = 0; i < 5000000; i++) {
            map.put(i, i);
        }
        v = 1000;
        timecheck = new TimeCheck();
        timecheck.begin();
        for (int i = 0; i < 5000000; i++) {
            map.get(v);
        }
        timecheck.end();
        timecheck.duration();
        //20230106-System.out.println(map.get(v));

        //map compare
        map = new LinkedHashMap<>();
        for (long i = 0; i < 5000000; i++) {
            map.put(i, i);
        }
        v = 1000;
        timecheck.begin();
        for (int i = 0; i < 5000000; i++) {
            map.get(v);
        }
        timecheck.end();
        timecheck.duration();
        //20230106-System.out.println(map.get(v));

        //
        Hashtable<Long, Object> table = new Hashtable<>();
        for (long i = 0; i < 5000000; i++) {
            table.put(i, i);
        }
        v = 1000;
        timecheck.begin();
        for (int i = 0; i < 5000000; i++) {
            table.get(v);
        }
        timecheck.end();
        timecheck.duration();
        //20230106-System.out.println(table.get(v));
        //
        TreeMap<Long, Object> tree = new TreeMap<>();
        for (long i = 0; i < 5000000; i++) {
            tree.put(i, i);
        }
        v = 1000;
        timecheck.begin();
        for (int i = 0; i < 5000000; i++) {
            tree.get(v);
        }
        timecheck.end();
        timecheck.duration();
        //20230106-System.out.println(tree.get(v));
    }

    private void fixEntry() {
        int small = 0;
        int large = 0;
        if (largeOrder == null && preLargeOrder != null) {
            largeOrder = preLargeOrder;
            if (largeOrder.preLargeOrder != null) {
                preLargeOrder = largeOrder.preLargeOrder;
                preLargeOrder.smallOrder = this;
            } else if (largeOrder.preSmallOrder != null) {
                preSmallOrder = largeOrder.preSmallOrder;
                preSmallOrder.largeOrder = this;
            }
            largeOrder.smallOrder = null;
            large = 1;
        }
        if (smallOrder == null && preSmallOrder != null) {
            smallOrder = preSmallOrder;
            if (smallOrder.preSmallOrder != null) {
                preSmallOrder = smallOrder.preSmallOrder;
                preSmallOrder.largeOrder = this;
            } else if (smallOrder.preLargeOrder != null) {
                preLargeOrder = smallOrder.preLargeOrder;
                preLargeOrder.smallOrder = this;
            }
            smallOrder.largeOrder = null;
            small = 1;
        }
        if (smallOrder != null && small == 0) {
            smallOrder.fixEntry();
        }
        if (largeOrder != null && large == 0) {
            largeOrder.fixEntry();
        }
    }
}
