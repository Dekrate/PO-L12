//
// Created by Acer on 07.01.2023.
//

#ifndef OOP___FAKE_FAKEFOOTBALLGAME_H
#define OOP___FAKE_FAKEFOOTBALLGAME_H


#include "Game.h"

class FakeFootballGame: public Game {
public:
    FakeFootballGame(const int resultA, const int resultB) : resultA(resultA), resultB(resultB) {
    }
    std::string result() override {
        return "3 0";
    }

    const int resultOfATeam() const {
        return resultA;
    }

    const int resultOfBTeam() const {
        return resultB;
    }

private:
    const int resultA;
    const int resultB;

};


#endif //OOP___FAKE_FAKEFOOTBALLGAME_H
