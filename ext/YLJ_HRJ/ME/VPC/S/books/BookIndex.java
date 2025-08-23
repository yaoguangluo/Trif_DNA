package YLJ_HRJ.ME.VPC.S.books;

import S_A.SVQ.stable.S_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

//创造一个索引文件
//著作权人+作者 罗瑶光, 浏阳
public class BookIndex {
    public InputStream bcqj_txt;

    public BookIndex() {
    }

    public InputStream BookIndex(String string) {
        if (string.equalsIgnoreCase(S_File.bcqj_txt)) {
            try {
                bcqj_txt = new FileInputStream(S_File.bcqj_txt);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return bcqj_txt;
    }

    public void closeAll() {
        //shaohou..
    }
}
