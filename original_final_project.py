import re # 5+6*2-9*3  Ans：-10

def multiply_divide(val):
    while re.findall(r'[\-]?\d+\.?\d*[*/][\-]?\d+\.?\d*', val):
        val=re.search(r'[\-]?\d+\.?\d*[*/][\-]?\d+\.?\d*', val).group(0)
        return val

if __name__=='__main__':
    while True:
        x=input('請輸入欲計算表達式(輸入exit結束)：')
        if x=='exit':
            exit()

        elif (x):
            print('計算結果：',eval(x))
            answer=multiply_divide(x)
            x=x.replace(x, answer)