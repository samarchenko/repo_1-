#легкій калькулятор.
a =float(input("Ведіть перше число:"))
w = input("що робимо?(+,-,*,/):")
b =float(input("Ведіть друге число:"))
if w =="+":
    c = a + b
    print("результат:",str(c))
elif w =="-":
    c = a - b
    print("результат:",str(c))
elif w =="*":
    c = a*b
    print("результат:",str(c))
elif w =="/":
    c = a/b
    print("резуьтат:",str(c))
else:
    print("Вибрана операція неправильна!")
