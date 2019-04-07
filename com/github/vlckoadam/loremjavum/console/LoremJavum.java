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
package com.github.vlckoadam.loremjavum.console;

import com.github.vlckoadam.loremjavum.console.lang.EN;
import com.github.vlckoadam.loremjavum.console.lang.Lang;
import com.github.vlckoadam.loremjavum.console.lang.SK;

import java.util.Scanner;

public class LoremJavum {
    public static Lang lang;

    public static void main(String[] args) {
        System.out.println("LoremJavum Console Interface Copyright (C) 2019 Adam Vlčko\n" +
                "    This program comes with ABSOLUTELY NO WARRANTY\n" +
                "    This is free software, and you are welcome to redistribute it\n" +
                "    under certain conditions.");
        System.out.println("More info at https://github.com/vlckoadam/LoremJavum-CONSOLE/blob/master/LICENSE");
        System.out.println("\nBy using this program you also agree, the author is not responsible for any damage that may be caused by \ninappropriate use of it or using it at computers with low performance\n" +
                "\n\n\"Inappropriate use\" can be declared as setting a very high level of generation massivity or other performance-related actions");
        System.out.println("\n\n~~ Program will start in 15 seconds ~~");
        try {
            Thread.sleep(15000);
            for (int i = 0; i < 32; i++) System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scan = new Scanner(System.in);
        String lang = "";
        while (!lang.equalsIgnoreCase("EN") && !lang.equalsIgnoreCase("SK")) {
            System.out.println("\n\n[EN/SK] \n\n");
            lang = scan.nextLine();
        }
        LoremJavum.lang = lang.equalsIgnoreCase("EN") ? new EN() : new SK();
        for (int i = 0; i < 128; i++) System.out.println();
        System.out.println(LoremJavum.lang.intro());
        try {
            Thread.sleep(10000);
            for (int i = 0; i < 32; i++) System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
