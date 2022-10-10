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
    int calculate(int operation) {
        return operation;
    }
};


int main()
{
    Child child;
    Math math;
    int op = child.calculate(math.add(5,4));
    cout << op;
    return 0;
}
