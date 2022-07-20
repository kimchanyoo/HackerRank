#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#define MAX 100000
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int num;
    cin >> num;
    int numList[MAX];
    for (int i = 0; i < num; i++) {
        cin >> numList[i];
    }
    for (int i = 0; i < num; i++) {
        cout << numList[num - i - 1] << " ";
    }
    return 0;
}
