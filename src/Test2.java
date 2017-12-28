import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/**
 * js调用Java方法
 */
public class Test2 {


    public static void main(String[] args) throws Exception {
        String relativelyPath = System.getProperty("user.dir");
        System.out.println(relativelyPath);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader(new File(relativelyPath + "/src/js/test2.js")));
    }

    public static String fun(String name) {
        System.out.format("我是java, %s", name);
        return "从java获取的值";
    }

    public static void fun2(Object object) {
        System.out.println(object.getClass());
        System.out.println("===============================");
    }
    public static void fun3(ScriptObjectMirror mirror) {
        System.out.println(mirror.getClassName() + ": " + Arrays.toString(mirror.getOwnKeys(true)));
        String foo = (String) mirror.get("key1");
        String bar = (String) mirror.get("key2");

        System.out.println("===============================");
    }

    public static void fun4(ScriptObjectMirror person) {
        System.out.println("Full Name is: " + person.callMember("getFullName"));
    }
}
