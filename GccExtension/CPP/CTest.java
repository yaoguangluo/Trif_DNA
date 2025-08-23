package CPP;

import java.io.File;
import java.io.IOException;

public class CTest {
    public static void main(String[] args) {
        String projectPath = "PythonExtension/CPP/";
        File sFile = new File(projectPath + "Hello.so");
        try {
            String cStringPath = sFile.getCanonicalPath()
                    .replace(sFile.getPath(), "" + sFile.getPath());
            System.out.println(cStringPath);
            System.load(cStringPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Hello hello = new Hello();
        hello.helloFromC();
    }
}