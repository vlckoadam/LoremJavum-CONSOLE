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
import com.github.vlckoadam.loremjavum.core.JavaGeneratorBuilder;

import java.io.File;
import java.util.Scanner;
import java.util.UUID;

public class LoremJavum {
    public static Lang lang;
    //public static boolean hasSession = false;


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
        boolean cont = true;
        while (cont){
            JavaGeneratorBuilder jgb = new JavaGeneratorBuilder();
            UUID id = UUID.randomUUID();
            System.out.println(LoremJavum.lang.generatorSessionStarted() + id);
            System.out.println(LoremJavum.lang.requiredInfo());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String rawLevel = "";
            while (!isNumber(rawLevel) || Integer.parseInt(rawLevel) <= 0){
                System.out.println("\n[" + id.toString() + "] " + LoremJavum.lang.setLevelOfMassivity()+"\n");
                rawLevel = scan.nextLine();
            }
            int level = Integer.parseInt(rawLevel);
            System.out.println("\n[" + id.toString() + "] " + LoremJavum.lang.setRootDirectory()+"\n");
            String dir = scan.nextLine();
            System.out.println("\n[" + id.toString() + "] " + LoremJavum.lang.setPackage()+"\n");
            String _package = scan.nextLine();
            System.out.println("\n[" + id.toString() + "] " + LoremJavum.lang.genParams()+"\n");
            String gp = scan.nextLine();
            boolean genParams = (gp.equalsIgnoreCase("a") && LoremJavum.lang instanceof SK)
                                    || (gp.equalsIgnoreCase("y") && LoremJavum.lang instanceof EN);
            System.out.println("\n[" + id.toString() + "] " + LoremJavum.lang.genMethodsAndInnerClass()+"\n");
            String gmaic = scan.nextLine();
            boolean genMethodsAndInnerClass = (gmaic.equalsIgnoreCase("a") && LoremJavum.lang instanceof SK)
                    || (gmaic.equalsIgnoreCase("y") && LoremJavum.lang instanceof EN);
            System.out.println("\n[" + id.toString() + "] " + LoremJavum.lang.jdGuiAntiDecompiler()+"\n");
            String ad = scan.nextLine();
            boolean antidecompiler = (ad.equalsIgnoreCase("a") && LoremJavum.lang instanceof SK)
                    || (ad.equalsIgnoreCase("y") && LoremJavum.lang instanceof EN);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 64; i++) System.out.println();
            System.out.println("[" + id.toString() + "] " + LoremJavum.lang.generating()+"\n");
            jgb.level(level).dir(dir)
                    .generateParams(genParams)
                    .generateMethodsAndInnerClass(genMethodsAndInnerClass)
                    .jdGuiAntidecompiler(antidecompiler);
            if (!_package.contains("-"))
                jgb.classPackage(_package);
            jgb.build().generate();
            System.out.println("[" + id.toString() + "] " + LoremJavum.lang.finished()+"\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(LoremJavum.lang.stats(jgb,id));
            System.out.println(LoremJavum.lang.wannaContinue());
            String rCont = scan.nextLine();
            cont = !rCont.equalsIgnoreCase("n");
        }
        System.out.println(LoremJavum.lang.thanks());
        try {
            Thread.sleep(5500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 256; i++) System.out.println();
        System.out.println(LoremJavum.lang.dg());
    }

    private static boolean isNumber(String s){
        try{
            Integer.parseInt(s);
        }catch (Exception ex){
            return false;
        }
        return true;
    }
}
