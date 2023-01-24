def x_stack(x): # 5+6*2-9*3  Ans：-10
    answer=[]
    stack=[]
    item_lists=x
    for i in item_lists:
        if i.isdigit() or '.' in i:
            answer.append(i)
        elif i in '*/':
                stack.append(i)
        else:
            if len(stack)==0:
                stack.append(i)
            elif i in '+-' and stack[-1] in '*/':
                while stack:
                    answer.append(stack.pop())
                stack.append(i)
            else:
                stack.append(i)
    while stack:
        answer.append(stack.pop())
    return answer

def get_x(x):
    num=[]
    symbol=['+','-','*','/']
    for j in x:
        if j.isdigit() or '.' in j:
            num.append(float(j))
        if j in symbol:
            num2=num.pop()
            num1=num.pop()
            res=calculate(num1,num2,j)
            num.append(res)
    return num[0]

def calculate(num1,num2,j):
    if j=='+':
        cal=num1+num2
    elif j=='-':
        cal=num1-num2
    elif j=='*':
        cal=num1*num2
    else:
        cal=num1/num2
    return cal

if __name__=='__main__':
    while True:
        x=input('請輸入欲計算表達式(輸入exit結束)：')
        if x=='exit':
            exit()
        else:
            answer=x_stack(x)
            print(get_x(answer))