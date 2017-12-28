print('==========Nashron允许你在JavaScript中使用Java的类型数组：=================');
print("IntArray:");

var intArray = Java.type('int[]');//定义为int型的数组

var array = new intArray(5);
array[0] = 5;
array[1] = 4;
array[2] = 3;
array[3] = 2;
array[4] = 1;

try {
    array[5] = 23;
} catch (e) {
    print(e.message);
}

array[0] = "17";
print(array[0]);

array[0] = "wrong type";
print(array[0]);

array[0] = "17.3";
print(array[0]);  // 17

print('------------------');

for (var i in array) print(i);

print('------------------');

for each(var val
in
array
)
print(val);

print('---------集合和范围遍历---------');
var ArrayList = Java.type('java.util.ArrayList');
var list = new ArrayList();
list.add('a');
list.add('b');
list.add('c');

for each(var el
in
list
)
print(el);  // a, b, c

var map = new java.util.HashMap();
map.put('foo', 'val1');
map.put('bar', 'val2');

for each(var e
in
map.keySet()
)
print(e);  // foo, bar

for each(var e
in
map.values()
)
print(e);  // val1, val2


print("============Lambda表达式和数据流==================");
var list2 = new java.util.ArrayList();
list2.add("ddd2");
list2.add("aaa2");
list2.add("bbb1");
list2.add("aaa1");
list2.add("bbb3");
list2.add("ccc");
list2.add("bbb2");
list2.add("ddd1");

list2.stream().filter(function (t) {
    return t.startsWith("aaa")
})
    .sorted()
    .forEach(function (t) {
        print(t);
    });
// aaa1, aaa2
