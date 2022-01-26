package com.hillel.classwork.lesson14.Html;

public class HtmlGenerator {

    public static void main(String[] args) {

        HtmlTag div = new HtmlTag("html", "Hello!");
        HtmlTag div1 = new HtmlTag("div", div);
        HtmlTag body = new HtmlTag("body", div1);
        HtmlTag html = new HtmlTag("html", body);

        System.out.println(generateHtml(html));


    }

    public static String generateHtml(HtmlTag htmlTag) {
        return "<" + htmlTag.name + ">" + htmlTag.text + "</" + htmlTag.name + ">";
    }

}
