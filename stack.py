stack =[]
def push():
    element=input("Enter thr element")
    stack.append(element)
    print(stack)

def pop():
    if stack==0:
        print("stack is full")
    else:
        stack.pop()
        print(stack)

while True:
    option=int(input("1.push 2.pop 3.quit"))
    if option==1:
        push()
    elif option==2:
        pop()
    elif option==3:
        break
    else:
        print("enter correct option")
        
