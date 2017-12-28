import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;

public class Test3 {
    public static void main(String[] args) throws Exception {
        String relativelyPath = System.getProperty("user.dir");
        System.out.println(relativelyPath);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader(new File(relativelyPath + "/src/js/test3.js")));
    }
}
