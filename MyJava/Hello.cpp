#include<iostream>
using namespace std;


class Demo
{
    public:

    // characteristics  // variables
    int a;          // 4
    int c;
    static int b;   // 4

    // Behaviours  // Functions
    void fun()
    {

    }


    

};

int main()
{
    // size of class = summation of its all non-static characteristics size.
    cout << sizeof(Demo);

    return 0;
}