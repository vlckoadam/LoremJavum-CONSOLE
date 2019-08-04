//*
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

public class SK implements Lang {
    @Override
    public String intro() {
        return "~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~  \n" +
                "   LoremJavum - Náhodný generátor Java kódu    \n" +
                "              Autor: Adam Vlčko                \n" +
                "~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~  \n\n\n" +
                "Aplikácia bude spustená o 10 sekúnd";
    }

    @Override
    public String generatorSessionStarted() {
        return "Relácia generátora začala, id: ";
    }

    @Override
    public String requiredInfo() {
        return "\"Pole\" označené [*] je povinné vyplniť";
    }


    @Override
    public String setLevelOfMassivity() {
        return "[*] Nastavte level masivity (ako masívne bude vygenerovaný kod) [1 az 2^31]:   ";
    }

    @Override
    public String setRootDirectory() {
        return "[*] Nastavte zdrojový výstupný priečinok: ";
    }

    @Override
        public String setPackage() {
        return "    Nastavte package vygenerovaných Java tried: (Ak nechcete package, zadajte \"-\")";
    }

    @Override
    public String genParams() {
        return "    Generovať parametre? [a/N]";
    }

    @Override
    public String genMethodsAndInnerClass() {
        return "    Generovať metódy a vložene triedy? [a/N]";
    }

    @Override
    public String jdGuiAntiDecompiler() {
        return "    Pridať ochrannú metódu proti dekompilovaniu pomocou jd-gui verzie 1.4.0? [a/N]";
    }

    @Override
    public String generating() {
        return "Generujem kód, prosím čakajte. (Čím vyšší level masivity a/alebo viac aktivovaných generátorov, tým viac času to bude trvať!)";

    }

    @Override
    public String finished() {
        return "Dogenerované! Štatistiky sa objavia čoskoro. ";
    }

    @Override
    public String stats(JavaGeneratorBuilder javaGeneratorBuilder, UUID uuid) {
        return "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n"
                + "                                  ~   Š T A T I S T I K Y   ~                                    \n\n"
                + "  - Jedinečné ID: " + uuid.toString() +"\n"
                + "  - LEVEL: " + javaGeneratorBuilder.level()+"\n\n"
                + "  - Výstupný priečinok: " + javaGeneratorBuilder.dir()+"\n"
                + "  - Package: " + (javaGeneratorBuilder.classPackage().equals("") ? "Žiaden" : javaGeneratorBuilder.classPackage())+"\n"
                + "  - Vygenerované parametre: " + (javaGeneratorBuilder.generateParams()? "ÁNO" : "NIE") + "\n"
                + "  - Vygenerované metódy a vložené triedy: "  + (javaGeneratorBuilder.generateMethodsAndInnerClass()? "ÁNO" : "NIE") + "\n"
                + "  - Ochrana proti dekompilovaniu pomocou JD-GUI ver. 1.4.0: " + (javaGeneratorBuilder.jdGuiAntidecompiler()? "ÁNO" : "NIE")+ "\n"
                + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n\n\n\n";

    }

    @Override
    public String wannaContinue() {
        return "To je všetko. Chcete pokračovať? :) [A/n]";
    }

    @Override
    public String thanks() {
        return "Ďakujem za používanie tejto aplikácie! Dovidenia. ";
    }

    @Override
    public String dg() {
        return "//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//\n\n"
                + "          Copyright.     (c)           A d a m   V l č k o                                   \n"
                + "                                            2 0 1 9                                          \n\n"
                + "/x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//x//";
    }

}
