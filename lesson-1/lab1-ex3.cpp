#include <iostream>

using namespace std;

class Math {
    public:
        int add(int a, int b) {
            return a + b;
        }
};

class Child {
    public:
    Math learnMath(Math math) {
        return math;
    }
};


int main()
{
    Child child;
    Math math;
    Math childMath = child.learnMath(math);
    cout << childMath.add(3,5);
    return 0;
}
