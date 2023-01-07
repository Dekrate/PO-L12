#include <iostream>
#include "FakeFootBallGame.h"
#include <sstream>

int main() {
    char buffer[100];
    FakeFootballGame game(1,2);

    std::stringstream s;
    s << game.resultOfATeam() << " " << game.resultOfBTeam();
    std::string str = s.str();

    int compareResult = str.compare(game.result());
    if (compareResult != 0) { // comparing two strings
        std::cout << "An error occurred.";
    }
}
