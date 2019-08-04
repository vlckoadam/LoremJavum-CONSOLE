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

import com.github.vlckoadam.loremjavum.core.JavaGeneratorBuilder;

import java.util.UUID;

public class EN implements Lang {
    @Override
    public String intro() {
        return "~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n" +
                "LoremJavum - Random Java Code Generator App\n" +
                "                 by Adam Vlcko             \n" +
                "~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n\n\n" +
                "Starting in 10 seconds... Please wait!";
    }

    @Override
    public String generatorSessionStarted() {
        return "New generation session started with id ";
    }

    @Override
    public String requiredInfo() {
        return "Informations marked with [*] are required.";
    }

    @Override
    public String setLevelOfMassivity() {
        return "[*] Please set the level of massivity (how massive will be the generated code) [between 1 and 2^31]:";
    }

    @Override
    public String setRootDirectory() {
        return "[*] Please set root output directory: ";
    }

    @Override
    public String setPackage() {
        return "    Please set package for generated Java classes: (For skip use \"-\")";
    }

    @Override
    public String genParams() {
        return "    Generate parameters? [y/N]";
    }

    @Override
    public String genMethodsAndInnerClass() {
        return "    Generate methods and inner class? [y/N]";
    }

    @Override
    public String jdGuiAntiDecompiler() {
        return "    Add antidecompiling method for jd-gui version 1.4.0? [y/N]";
    }

    @Override
    public String generating() {
        return "The code is now being generated, please wait! (Higher the level of massivity is and/or more generated things are activated the more time it will take.)  ";
    }

    @Override
    public String finished() {
        return "Generator finished his job! Stats will appear soon: ";
    }

    @Override
    public String stats(JavaGeneratorBuilder javaGeneratorBuilder, UUID uuid) {
        return "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n"
             + "                                      ~   S T A T S   ~                 \n\n"
             + "  - UID: " + uuid.toString() + "\n"
             + "  - LEVEL: " + javaGeneratorBuilder.level()+"\n\n"
             + "  - Output directory: " + javaGeneratorBuilder.dir()+"\n"
             + "  - Package: " + (javaGeneratorBuilder.classPackage().equals("") ? "None" : javaGeneratorBuilder.classPackage())+"\n"
             + "  - Contains parameters: " + (javaGeneratorBuilder.generateParams()? "YES" : "NO") + "\n"
             + "  - Contains methods and inner class: "  + (javaGeneratorBuilder.generateMethodsAndInnerClass()? "YES" : "NO") + "\n"
             + "  - Contains JD GUI version 1.4.0 antidecompiling method: " + (javaGeneratorBuilder.jdGuiAntidecompiler()? "YES" : "NO")+ "\n"
             + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n\n\n\n";

    }

    @Override
    public String wannaContinue() {
        return "That's all. Do you want to continue? :) [Y/n]";
    }

    @Override
    public String thanks() {
        return "Thanks for using this app. See you soon again. Goodbye!";
    }

    @Override
    public String dg() {
        return "//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//\n\n"
                + "          Copyright.     (c)           A d a m   V l c k o                                   \n"
                + "                                            2 0 1 9                                          \n\n"
                + "/x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//";
    }
}
