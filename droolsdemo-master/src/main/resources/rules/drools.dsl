
[when]如果数据是double类型 = $d : Double()

[when]如果用户名字叫"{name}" = User(name=="{name}")
[when]年龄是{age} = User(age=={age})
[when]性别是"{sex}" = User(sex=="{sex}")
[when]并且=and
[when]或者=or
[then]"{result}" = System.out.println("{result}")
[then]输出这个数据 = System.out.println("该数据"+$d)