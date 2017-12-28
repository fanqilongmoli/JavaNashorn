var test2 = Java.type('Test2');
var result = test2.fun('樊启龙');
print('\n' + result);

test2.fun2(123);
test2.fun2(49.99);
test2.fun2(true);
test2.fun2("hi there");
test2.fun2(String("bam"));
test2.fun2(new Number(23));
test2.fun2(new Date());
test2.fun2(new RegExp());
test2.fun2({foo: 'bar'});

print('passing object hash:');
test2.fun3({
    key1: 'bar',
    key2: 'foo'
});

function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.getFullName = function() {
        return this.firstName + " " + this.lastName;
    }
}
var person1 = new Person("Peter", "Parker");
test2.fun3(person1);
test2.fun4(person1);