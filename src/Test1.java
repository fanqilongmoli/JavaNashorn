import javax.script.AbstractScriptEngine;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * java 调用javascript
 */
public class Test1 {

    public static void main(String[] args) throws Exception {


        String relativelyPath = System.getProperty("user.dir");
        System.out.println(relativelyPath);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader(new File(relativelyPath+"/src/js/test1.js")));

        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("fun1", "樊启龙");
        System.out.println(result);
        System.out.println(result.getClass());

        invocable.invokeFunction("fun2", new Date());
        invocable.invokeFunction("fun2", LocalDateTime.now());
        invocable.invokeFunction("fun2", new Person());

    }
}
