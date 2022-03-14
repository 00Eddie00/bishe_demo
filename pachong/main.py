import requests  # 导入requests包
import re
from bs4 import BeautifulSoup
import pandas as pd
import openpyxl as op


def getData(url, filename):
    list1 = []
    list2 = []
    list3 = []
    strhtml = requests.get(url)
    strhtml.encoding="utf-8"
    soup = BeautifulSoup(strhtml.text, 'lxml')
    data = soup.find_all('div', class_='right_pic')
    a_bf = BeautifulSoup(str(data))
    a = a_bf.find_all('a')
    # a = a_bf.find_all('div', class_='tit')
    # b = a_bf.find_all('div', class_='_2v4jmx4')
    # c = a_bf.find_all('span', class_='_185kh56')
    for item in a:
        result = {
            'text': item.get_text(),
        }
        list1.append(item.get_text())
        print(result)
    # for item in b:
    #     result = {
    #         'text': item.get_text(),
    #     }
    #     list2.append(item.get_text())
    #     print(result)
    # for item in c:
    #     result = {
    #         'text': item.get_text(),
    #     }
    #     list3.append(item.get_text())
    #     print(result)
    # test = [list1, list2, list3]
    # creatrFile(test, filename)


def creatrFile(data, filename):
    wb = op.Workbook()
    ws = wb['Sheet']
    ws.append(['序号', '项目', '数据'])
    for i in range(len(data[0])):
        d = data[0][i], data[1][i], data[2][i]
        ws.append(d)  # 每次写入一行
    wb.save(filename)


if __name__ == "__main__":
    # url1 = 'https://www.airbnb.cn/s/%E5%8E%A6%E9%97%A8/homes?refinement_paths%5B%5D=%2Fhomes&current_tab_id=home_tab&selected_tab_id=home_tab&screen_size=large&hide_dates_and_guests_filters=false&s_tag=3PVgKN6Q&checkin=2021-07-09&checkout=2021-07-10&place_id=ChIJgwhrGF2bFDQRrPhqeBA_E-4&poi_tab=district&poi_group=0&parent_city_place_id=ChIJJ-u_5XmDFDQRVtBolgpnoCg&last_search_session_id=8e2ed9fa-f93c-4e56-a735-edec14deb7a2'
    url='http://www2017.tyut.edu.cn/xyxw/lgyw.htm'
    filename1 = '测试.xlsx'
    getData(url, filename1)
