#include <iostream>

using namespace std;

int main() {


    int first;
    int second;
    int third;
    int fourth;
    for(;;) {
        cin >> first >> second >> third >> fourth;
        if ((first || second || third || fourth) == 0) {
            return 0;
        }

        int ans = 0;
        ans += 720;
        ans += (((first + 40) - second) % 40) * 9;
        ans += 360;
        ans += (((third + 40) - second) % 40) * 9;
        ans += (((third + 40) - fourth) % 40) * 9;


        cout<<ans<<endl;
    }
    return 0;
}

