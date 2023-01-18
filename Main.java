// Copyright (C) 2020-2023 Jarmo Hurri

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

public class Main
{
  public static void main (String[] args)
  {
    TicTacToe ttt = new TicTacToe ();
    ttt.marks = new Mark[][] {{Mark.Cross, Mark.Nought, Mark.Cross},
                              {Mark.Nought, Mark.Cross, Mark.Nought},
                              {Mark.Nought, Mark.Nought, Mark.Cross}};
    System.out.println (ttt.gameOver ());
  }
}
