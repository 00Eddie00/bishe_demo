# encoding=utf-8
import jieba
import openpyxl as op

with open("C:\\Users\\DELL.DESKTOP-L90URJM\\Desktop\\jieba.txt", encoding='utf-8') as f:
    t = f.read()
    cut = jieba.cut(t)
    l = list(cut)
    print(l)

    wb = op.Workbook()
    ws = wb['Sheet']
    ws.append(['序号'])
    stopW = ['\n', '/', '【', '】', '、', '（', '）', '—', '|', '{', '}', '，', '《', '》', '·', '--', '「', '」', '(', ')', '★',
             '🏆', '🚌', '🏖', '-', '［', '］', '｜', '🛁', '🏡', '🌊', '～', '🌲', '+', '*', '！', '.', '゜', '[', ']', '🏅',
             '〔', '〕']
    for i in l:
        if i not in stopW:
            ws.append([i])  # 每次写入一行
    wb.save("test.xlsx")
