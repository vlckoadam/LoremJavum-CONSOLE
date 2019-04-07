/*
    LoremJavum - Random Java Code Generator App Console Interface
    Copyright (C) 2019 Adam Vlčko

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

    Webpage: https://github.com/vlckoadam/LoremJavum-CONSOLE
 */
package com.github.vlckoadam.loremjavum.console.lang;

public class EN implements Lang {
    @Override
    public String intro() {
        return "~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n" +
                "LoremJavum - Random Java Code Generator App\n" +
                "                 by Adam Vlcko             \n" +
                "~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n\n\n" +
                "Starting in 10 seconds... Please wait!";
    }
}
