/*
 *
 * 05/23/2020
 * by maxzhong
 * cpp primer 第八章8.1.2节练习
 * 编写函数，测试函数
 * 
 */
#include <iostream>
#include <vector>

using namespace std;

/* 
 *
 * 练习8.1
 * 从给定流中读取数据，直到遇到文件结束标识
 * 输出到标准输入
 * 返回流之前，进行复位
 *
 */
istream& readTillEnd(istream& s) {
    vector<int> vals;
    
    int val;
    // while(cin >> val)相当于!cin.fail()检测了整个流的总体状态，s.eof()和s.bad()都是检测特定位的状态
    // while (cin >> val && !s.eof() && !s.bad()) {
    //     vals.push_back(val);
    // }
    while (cin >> val) {
        vals.push_back(val);
    }
    // 输出
    for (vector<int>::size_type i = 0; i < vals.size(); ++i) {
        cout << vals[i] << ' ';
    }
    cout << endl;
    
    // 全部特定位复位，使流有效
    s.clear();

    return s;
}

/* 练习8.2 */
int main() {
    /* this is a testing */
    readTillEnd(cin);

    return 0;
}

/* 
 * 练习8.3 
 * 当badbit，eofbit，failbit任意一个给置位
 */
