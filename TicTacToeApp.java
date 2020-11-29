// Copyright (C) 2020 Jarmo Hurri

// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

public class TicTacToeApp
{
  public static void main (String[] args)
  {
    TicTacToe ttt = new TicTacToe ();
    ttt.marks [0][0] = Mark.Cross;
    ttt.marks [1][0] = Mark.Nought;
    ttt.marks [2][0] = Mark.Cross;
    ttt.marks [1][1] = Mark.Nought;
    ttt.marks [0][2] = Mark.Cross;
    ttt.marks [1][2] = Mark.Nought;
    System.out.println (ttt.gameOver ());
  }
}
